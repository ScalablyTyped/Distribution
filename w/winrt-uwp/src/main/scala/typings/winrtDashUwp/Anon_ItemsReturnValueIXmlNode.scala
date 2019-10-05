package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Data.Xml.Dom.IXmlNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueIXmlNode extends js.Object {
  /** The items in the vector view that start at startIndex. */ var items: IXmlNode
  /** The number of items returned. */ var returnValue: Double
}

object Anon_ItemsReturnValueIXmlNode {
  @scala.inline
  def apply(items: IXmlNode, returnValue: Double): Anon_ItemsReturnValueIXmlNode = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueIXmlNode]
  }
}

