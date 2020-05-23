package typings.winrt.anon

import typings.winrt.Windows.Data.Xml.Dom.IXmlNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends js.Object {
  var items: js.Array[IXmlNode]
  var returnValue: Double
}

object `2` {
  @scala.inline
  def apply(items: js.Array[IXmlNode], returnValue: Double): `2` = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
}

