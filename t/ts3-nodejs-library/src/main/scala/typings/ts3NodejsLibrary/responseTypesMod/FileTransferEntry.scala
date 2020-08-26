package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTransferEntry extends ResponseEntry {
  var averageSpeed: Double = js.native
  var clid: String = js.native
  var clientftfid: Double = js.native
  var currentSpeed: Double = js.native
  var name: String = js.native
  var path: String = js.native
  var runtime: Double = js.native
  var sender: Double = js.native
  var serverftfid: Double = js.native
  var size: Double = js.native
  var sizedone: Double = js.native
  var status: Double = js.native
}

object FileTransferEntry {
  @scala.inline
  def apply(
    averageSpeed: Double,
    clid: String,
    clientftfid: Double,
    currentSpeed: Double,
    name: String,
    path: String,
    runtime: Double,
    sender: Double,
    serverftfid: Double,
    size: Double,
    sizedone: Double,
    status: Double
  ): FileTransferEntry = {
    val __obj = js.Dynamic.literal(averageSpeed = averageSpeed.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any], clientftfid = clientftfid.asInstanceOf[js.Any], currentSpeed = currentSpeed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], serverftfid = serverftfid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sizedone = sizedone.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTransferEntry]
  }
  @scala.inline
  implicit class FileTransferEntryOps[Self <: FileTransferEntry] (val x: Self) extends AnyVal {
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
    def setAverageSpeed(value: Double): Self = this.set("averageSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def setClid(value: String): Self = this.set("clid", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientftfid(value: Double): Self = this.set("clientftfid", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentSpeed(value: Double): Self = this.set("currentSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntime(value: Double): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSender(value: Double): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerftfid(value: Double): Self = this.set("serverftfid", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizedone(value: Double): Self = this.set("sizedone", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

