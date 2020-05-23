package typings.xml.anon

import typings.xml.mod.XmlAttrs
import typings.xml.mod._XmlDesc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attr extends _XmlDesc {
  var _attr: XmlAttrs
}

object Attr {
  @scala.inline
  def apply(_attr: XmlAttrs): Attr = {
    val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attr]
  }
}

