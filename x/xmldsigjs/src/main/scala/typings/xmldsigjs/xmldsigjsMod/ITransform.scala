package typings.xmldsigjs.xmldsigjsMod

import typings.std.Node
import typings.xmlDashCore.xmlDashCoreMod.IXmlSerializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransform extends IXmlSerializable {
  var Algorithm: String = js.native
  def GetInnerXml(): Node | Null = js.native
  def GetOutput(): js.Any = js.native
  def LoadInnerXml(node: Node): Unit = js.native
}

