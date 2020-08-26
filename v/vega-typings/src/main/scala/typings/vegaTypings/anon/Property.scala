package typings.vegaTypings.anon

import typings.vegaTypings.vegaTypingsStrings.topojson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Property extends js.Object {
  var property: js.UndefOr[String] = js.native
  var `type`: topojson = js.native
}

object Property {
  @scala.inline
  def apply(`type`: topojson): Property = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  @scala.inline
  implicit class PropertyOps[Self <: Property] (val x: Self) extends AnyVal {
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
    def setType(value: topojson): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
  }
  
}

