package typings.xml

import typings.xml.mod.XmlAttrs
import typings.xml.mod._XmlDesc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttr extends _XmlDesc {
  var _attr: XmlAttrs
}

object AnonAttr {
  @scala.inline
  def apply(_attr: XmlAttrs): AnonAttr = {
    val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttr]
  }
}

