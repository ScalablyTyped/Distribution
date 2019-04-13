package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransform
  extends xmlDashCoreLib.xmlDashCoreMod.IXmlSerializable {
  var Algorithm: java.lang.String = js.native
  def GetInnerXml(): stdLib.Node | scala.Null = js.native
  def GetOutput(): js.Any = js.native
  def LoadInnerXml(node: stdLib.Node): scala.Unit = js.native
}

