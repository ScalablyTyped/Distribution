package typings.xml

import typings.xml.mod.XmlAttrs
import typings.xml.mod._XmlDesc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttrCdata extends _XmlDesc {
  var _attr: XmlAttrs
  var _cdata: String
}

object AnonAttrCdata {
  @scala.inline
  def apply(_attr: XmlAttrs, _cdata: String): AnonAttrCdata = {
    val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any], _cdata = _cdata.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttrCdata]
  }
}

