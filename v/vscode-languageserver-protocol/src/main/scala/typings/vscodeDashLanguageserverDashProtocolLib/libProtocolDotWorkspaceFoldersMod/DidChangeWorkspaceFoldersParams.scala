package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidChangeWorkspaceFoldersParams extends js.Object {
  /**
    * The actual workspace folder change event.
    */
  var event: WorkspaceFoldersChangeEvent
}

object DidChangeWorkspaceFoldersParams {
  @scala.inline
  def apply(event: WorkspaceFoldersChangeEvent): DidChangeWorkspaceFoldersParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[DidChangeWorkspaceFoldersParams]
  }
}

