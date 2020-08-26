package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionEvent extends js.Object {
  /**
    * Id which identifies each data point uniquely
    */
  var id: Double = js.native
  var properties: js.Any = js.native
  /**
    * Timestamp of when the event occurred
    */
  var statisticDate: Date = js.native
  /**
    * Version of the extension
    */
  var version: String = js.native
}

object ExtensionEvent {
  @scala.inline
  def apply(id: Double, properties: js.Any, statisticDate: Date, version: String): ExtensionEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], statisticDate = statisticDate.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEvent]
  }
  @scala.inline
  implicit class ExtensionEventOps[Self <: ExtensionEvent] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatisticDate(value: Date): Self = this.set("statisticDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

