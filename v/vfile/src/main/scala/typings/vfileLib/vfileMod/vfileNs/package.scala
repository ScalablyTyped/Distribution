package typings
package vfileLib.vfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vfileNs {
  /**
       * Associates a fatal message with the file, then immediately throws it.
       * Note: fatal errors mean a file is no longer processable.
       * Calls `message()` internally.
       * @param reason Reason for message. Uses the stack and message of the error if given.
       * @param position Place at which the message occurred in `vfile`.
       * @param ruleId Category of message.
       */
  type Fail = js.Function3[
    /* reason */ java.lang.String, 
    /* position */ js.UndefOr[unistLib.unistMod.Point | unistLib.unistMod.Position | NodeWithPosition], 
    /* ruleId */ js.UndefOr[java.lang.String], 
    scala.Nothing
  ]
  /**
       * Associates an informational message with the file, where `fatal` is set to `null`.
       * Calls `message()` internally.
       * @param reason Reason for message. Uses the stack and message of the error if given.
       * @param position Place at which the message occurred in `vfile`.
       * @param ruleId Category of message.
       */
  type Info = js.Function3[
    /* reason */ java.lang.String, 
    /* position */ js.UndefOr[unistLib.unistMod.Point | unistLib.unistMod.Position | NodeWithPosition], 
    /* ruleId */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  /**
       * Associates a message with the file for `reason` at `position`.
       * When an error is passed in as `reason`, copies the stack.
       * Each message has a `fatal` property which by default is set to `false` (ie. `warning`).
       * @param reason Reason for message. Uses the stack and message of the error if given.
       * @param position Place at which the message occurred in `vfile`.
       * @param ruleId Category of message.
       */
  type Message = js.Function3[
    /* reason */ java.lang.String, 
    /* position */ js.UndefOr[unistLib.unistMod.Point | unistLib.unistMod.Position | NodeWithPosition], 
    /* ruleId */ js.UndefOr[java.lang.String], 
    VFileMessage
  ]
  /**
       * Convert contents of `vfile` to string.
       * @param encoding If `contents` is a buffer, `encoding` is used to stringify buffers (default: `'utf8'`).
       */
  type ToString = js.Function1[/* encoding */ js.UndefOr[nodeLib.BufferEncoding], java.lang.String]
  type VFileContents = java.lang.String | nodeLib.Buffer
}
