package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueIXmlNode extends js.Object {
  /** The items in the vector view that start at startIndex. */ var items: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.IXmlNode
  /** The number of items returned. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueIXmlNode {
  @scala.inline
  def apply(items: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.IXmlNode, returnValue: scala.Double): Anon_ItemsReturnValueIXmlNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueIXmlNode]
  }
}

