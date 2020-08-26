package typings.typedoc.serializationEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializeEventData extends js.Object {
  var outputDirectory: js.UndefOr[String] = js.native
  var outputFile: js.UndefOr[String] = js.native
}

object SerializeEventData {
  @scala.inline
  def apply(): SerializeEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeEventData]
  }
  @scala.inline
  implicit class SerializeEventDataOps[Self <: SerializeEventData] (val x: Self) extends AnyVal {
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
    def setOutputDirectory(value: String): Self = this.set("outputDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputDirectory: Self = this.set("outputDirectory", js.undefined)
    @scala.inline
    def setOutputFile(value: String): Self = this.set("outputFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputFile: Self = this.set("outputFile", js.undefined)
  }
  
}

