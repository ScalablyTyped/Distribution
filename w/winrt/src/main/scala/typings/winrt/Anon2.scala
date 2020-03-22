package typings.winrt

import typings.winrt.Windows.Data.Xml.Dom.IXmlNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var items: js.Array[IXmlNode]
  var returnValue: Double
}

object Anon2 {
  @scala.inline
  def apply(items: js.Array[IXmlNode], returnValue: Double): Anon2 = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon2]
  }
}

