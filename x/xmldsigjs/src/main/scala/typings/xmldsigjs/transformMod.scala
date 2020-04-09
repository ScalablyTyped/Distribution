package typings.xmldsigjs

import org.scalablytyped.runtime.Instantiable0
import typings.std.Node
import typings.xmlCore.mod.XmlObject
import typings.xmlCore.typesMod.IXmlSerializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/transform", JSImport.Namespace)
@js.native
object transformMod extends js.Object {
  @js.native
  trait ITransform extends IXmlSerializable {
    var Algorithm: String = js.native
    def GetInnerXml(): Node | Null = js.native
    def GetOutput(): js.Any = js.native
    def LoadInnerXml(node: Node): Unit = js.native
  }
  
  @js.native
  class Transform ()
    extends XmlObject
       with ITransform {
    /**
      * XPath of the transformation
      */
    var XPath: String = js.native
    var innerXml: Node | Null = js.native
  }
  
  type ITransformConstructable = Instantiable0[Transform]
}

