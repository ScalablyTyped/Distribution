package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Data.Xml.Dom.IXmlNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsIXmlNode extends js.Object {
  /** The items in the vector view that start at startIndex. */ var items: IXmlNode
  /** The number of items returned. */ var returnValue: Double
}

object ItemsIXmlNode {
  @scala.inline
  def apply(items: IXmlNode, returnValue: Double): ItemsIXmlNode = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIXmlNode]
  }
}

