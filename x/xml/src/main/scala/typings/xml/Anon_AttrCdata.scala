package typings.xml

import typings.xml.xmlMod.XmlAttrs
import typings.xml.xmlMod._XmlDesc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttrCdata extends _XmlDesc {
  var _attr: XmlAttrs
  var _cdata: String
}

object Anon_AttrCdata {
  @scala.inline
  def apply(_attr: XmlAttrs, _cdata: String): Anon_AttrCdata = {
    val __obj = js.Dynamic.literal(_attr = _attr, _cdata = _cdata)
  
    __obj.asInstanceOf[Anon_AttrCdata]
  }
}

