package typings.xmldsigjs

import org.scalablytyped.runtime.Instantiable0
import typings.std.Node
import typings.xmlCore.typesMod.IXmlSerializable
import typings.xmldsigjs.xmlObjectMod.XmlSignatureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("xmldsigjs/build/types/xml/transform", "Transform")
  @js.native
  class Transform ()
    extends XmlSignatureObject
       with ITransform {
    def this(properties: js.Object) = this()
    
    /**
      * XPath of the transformation
      */
    var XPath: String = js.native
    
    var innerXml: Node | Null = js.native
  }
  
  @js.native
  trait ITransform extends IXmlSerializable {
    
    var Algorithm: String = js.native
    
    def GetInnerXml(): Node | Null = js.native
    
    def GetOutput(): js.Any = js.native
    
    def LoadInnerXml(node: Node): Unit = js.native
  }
  
  type ITransformConstructable = Instantiable0[Transform]
}
