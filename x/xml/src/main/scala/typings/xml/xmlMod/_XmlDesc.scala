package typings.xml.xmlMod

import org.scalablytyped.runtime.NumberDictionary
import typings.xml.Anon_Attr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _XmlDesc extends js.Object

object _XmlDesc {
  @scala.inline
  def Anon_Attr(_attr: XmlAttrs): _XmlDesc = {
    val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_XmlDesc]
  }
  @scala.inline
  def Anon_Cdata(_cdata: String): _XmlDesc = {
    val __obj = js.Dynamic.literal(_cdata = _cdata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_XmlDesc]
  }
  @scala.inline
  def Anon_AttrCdata(_attr: XmlAttrs, _cdata: String): _XmlDesc = {
    val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any], _cdata = _cdata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_XmlDesc]
  }
  @scala.inline
  def XmlDescArray(NumberDictionary: /* index */ NumberDictionary[Anon_Attr | XmlObject] = null): _XmlDesc = {
    val __obj = js.Dynamic.literal()
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[_XmlDesc]
  }
}

