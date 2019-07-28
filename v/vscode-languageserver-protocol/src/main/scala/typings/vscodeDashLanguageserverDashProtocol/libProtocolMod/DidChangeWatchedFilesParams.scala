package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidChangeWatchedFilesParams extends js.Object {
  /**
    * The actual file events.
    */
  var changes: js.Array[FileEvent]
}

object DidChangeWatchedFilesParams {
  @scala.inline
  def apply(changes: js.Array[FileEvent]): DidChangeWatchedFilesParams = {
    val __obj = js.Dynamic.literal(changes = changes)
  
    __obj.asInstanceOf[DidChangeWatchedFilesParams]
  }
}

