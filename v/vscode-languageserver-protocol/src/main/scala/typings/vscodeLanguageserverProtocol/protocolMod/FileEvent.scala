package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileEvent extends js.Object {
  /**
    * The change type.
    */
  var `type`: FileChangeType = js.native
  /**
    * The file's uri.
    */
  var uri: DocumentUri = js.native
}

object FileEvent {
  @scala.inline
  def apply(`type`: FileChangeType, uri: DocumentUri): FileEvent = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileEvent]
  }
  @scala.inline
  implicit class FileEventOps[Self <: FileEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: FileChangeType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: DocumentUri): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

