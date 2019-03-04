package typings
package xmldomLib.xmldomMod.xmldomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLSerializer extends js.Object {
  def serializeToString(node: stdLib.Node): java.lang.String
}

object XMLSerializer {
  @scala.inline
  def apply(serializeToString: js.Function1[stdLib.Node, java.lang.String]): XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = serializeToString)
  
    __obj.asInstanceOf[XMLSerializer]
  }
}

