package typings.xmldom.xmldomMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLSerializer extends js.Object {
  def serializeToString(node: Node): String
}

@JSImport("xmldom", "XMLSerializer")
@js.native
class XMLSerializerCls () extends XMLSerializer {
  /* CompleteClass */
  override def serializeToString(node: Node): String = js.native
}

object XMLSerializer {
  @scala.inline
  def apply(serializeToString: Node => String): XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
  
    __obj.asInstanceOf[XMLSerializer]
  }
}

