package typings.xmldom.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLSerializer extends js.Object {
  def serializeToString(node: Node): String
}

@JSImport("xmldom", "XMLSerializer")
@js.native
object XMLSerializer extends TopLevel[XMLSerializerStatic]

