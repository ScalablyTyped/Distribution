package typings.xml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _XmlDesc extends js.Object

object _XmlDesc {
  @scala.inline
  def Attr(_attr: XmlAttrs): _XmlDesc = {
    val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any])
    __obj.asInstanceOf[_XmlDesc]
  }
  @scala.inline
  def Cdata(_cdata: String): _XmlDesc = {
    val __obj = js.Dynamic.literal(_cdata = _cdata.asInstanceOf[js.Any])
    __obj.asInstanceOf[_XmlDesc]
  }
  @scala.inline
  def AttrCdata(_attr: XmlAttrs, _cdata: String): _XmlDesc = {
    val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any], _cdata = _cdata.asInstanceOf[js.Any])
    __obj.asInstanceOf[_XmlDesc]
  }
  @scala.inline
  def XmlDescArray(): _XmlDesc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_XmlDesc]
  }
}

