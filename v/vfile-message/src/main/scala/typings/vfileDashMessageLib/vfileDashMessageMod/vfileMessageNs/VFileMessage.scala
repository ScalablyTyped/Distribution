package typings
package vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a virtual message.
  */
@js.native
trait VFileMessage
  extends stdLib.Error
     with /**
  * It’s OK to store custom data directly on the VMessage, some of those are handled by utilities.
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Starting column of error.
    */
  var column: scala.Double | scala.Null = js.native
  /**
    * If true, marks associated file as no longer processable.
    */
  var fatal: js.UndefOr[scala.Boolean | scala.Null] = js.native
  /**
    * You may add a file property with a path of a file (used throughout the VFile ecosystem).
    */
  var file: js.UndefOr[java.lang.String] = js.native
  /**
    * Starting line of error.
    */
  var line: scala.Double | scala.Null = js.native
  /**
    * Full range information, when available.
    * Has start and end properties, both set to an object with line and column, set to number?.
    */
  var location: unistLib.unistMod.Position = js.native
  /**
    * You may add a note property with a long form description of the message (supported by vfile-reporter).
    */
  var note: js.UndefOr[java.lang.String] = js.native
  /**
    * Reason for message.
    */
  var reason: java.lang.String = js.native
  /**
    * Category of message.
    */
  var ruleId: java.lang.String | scala.Null = js.native
  /**
    * Namespace of warning.
    */
  var source: java.lang.String | scala.Null = js.native
  /**
    * You may add a url property with a link to documentation for the message.
    */
  var url: js.UndefOr[java.lang.String] = js.native
  /**
    * Constructor of a message for `reason` at `position` from `origin`.
    * When an error is passed in as `reason`, copies the `stack`.
    *
    * @param reason Reason for message (`string` or `Error`). Uses the stack and message of the error if given.
    * @param position Place at which the message occurred in a file (`Node`, `Position`, or `Point`, optional).
    * @param origin Place in code the message originates from (`string`, optional).
    */
  def apply(reason: java.lang.String): VFileMessage = js.native
  def apply(reason: java.lang.String, position: unistLib.unistMod.Node): VFileMessage = js.native
  def apply(reason: java.lang.String, position: unistLib.unistMod.Node, origin: java.lang.String): VFileMessage = js.native
  def apply(reason: java.lang.String, position: unistLib.unistMod.Point): VFileMessage = js.native
  def apply(reason: java.lang.String, position: unistLib.unistMod.Point, origin: java.lang.String): VFileMessage = js.native
  def apply(reason: java.lang.String, position: unistLib.unistMod.Position): VFileMessage = js.native
  def apply(reason: java.lang.String, position: unistLib.unistMod.Position, origin: java.lang.String): VFileMessage = js.native
  def apply(reason: stdLib.Error): VFileMessage = js.native
  def apply(reason: stdLib.Error, position: unistLib.unistMod.Node): VFileMessage = js.native
  def apply(reason: stdLib.Error, position: unistLib.unistMod.Node, origin: java.lang.String): VFileMessage = js.native
  def apply(reason: stdLib.Error, position: unistLib.unistMod.Point): VFileMessage = js.native
  def apply(reason: stdLib.Error, position: unistLib.unistMod.Point, origin: java.lang.String): VFileMessage = js.native
  def apply(reason: stdLib.Error, position: unistLib.unistMod.Position): VFileMessage = js.native
  def apply(reason: stdLib.Error, position: unistLib.unistMod.Position, origin: java.lang.String): VFileMessage = js.native
}

