package typings.xml.anon

import typings.xml.mod.XmlAttrs
import typings.xml.mod._XmlDesc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrCdata extends _XmlDesc {
  
  var _attr: XmlAttrs = js.native
  
  var _cdata: String = js.native
}
object AttrCdata {
  
  @scala.inline
  def apply(_attr: XmlAttrs, _cdata: String): AttrCdata = {
    val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any], _cdata = _cdata.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrCdata]
  }
  
  @scala.inline
  implicit class AttrCdataOps[Self <: AttrCdata] (val x: Self) extends AnyVal {
    
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
    def set_attr(value: XmlAttrs): Self = this.set("_attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_cdata(value: String): Self = this.set("_cdata", value.asInstanceOf[js.Any])
  }
}
