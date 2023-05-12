package typings.vfileMessage

import typings.vfileMessage.libMod.Node
import typings.vfileMessage.libMod.NodeLike
import typings.vfileMessage.libMod.Point
import typings.vfileMessage.libMod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vfile-message", "VFileMessage")
  @js.native
  open class VFileMessage protected ()
    extends typings.vfileMessage.libMod.VFileMessage {
    /**
      * Create a message for `reason` at `place` from `origin`.
      *
      * When an error is passed in as `reason`, the `stack` is copied.
      *
      * @param {string | Error | VFileMessage} reason
      *   Reason for message, uses the stack and message of the error if given.
      *
      *   > 👉 **Note**: you should use markdown.
      * @param {Node | NodeLike | Position | Point | null | undefined} [place]
      *   Place in file where the message occurred.
      * @param {string | null | undefined} [origin]
      *   Place in code where the message originates (example:
      *   `'my-package:my-rule'` or `'my-rule'`).
      * @returns
      *   Instance of `VFileMessage`.
      */
    def this(
      reason: String | js.Error | typings.vfileMessage.libMod.VFileMessage,
      place: js.UndefOr[Node | NodeLike | Position | Point | Null],
      origin: js.UndefOr[String | Null]
    ) = this()
  }
}
