package typings
package xmldocLib.xmldocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlTag extends js.Object {
  var attributes: XmlAttributes
  var name: java.lang.String
}

object XmlTag {
  @scala.inline
  def apply(attributes: XmlAttributes, name: java.lang.String): XmlTag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[XmlTag]
  }
}

