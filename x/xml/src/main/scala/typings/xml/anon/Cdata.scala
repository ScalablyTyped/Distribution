package typings.xml.anon

import typings.xml.mod._XmlDesc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cdata extends _XmlDesc {
  var _cdata: String = js.native
}

object Cdata {
  @scala.inline
  def apply(_cdata: String): Cdata = {
    val __obj = js.Dynamic.literal(_cdata = _cdata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cdata]
  }
  @scala.inline
  implicit class CdataOps[Self <: Cdata] (val x: Self) extends AnyVal {
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
    def set_cdata(value: String): Self = this.set("_cdata", value.asInstanceOf[js.Any])
  }
  
}

