package typings.xmldsigjs

import typings.std.Node
import typings.std.XPathEvaluator
import typings.xmldsigjs.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xpathMod {
  
  @JSImport("xmldsigjs/build/types/xml/transforms/xpath", "XmlDsigXPathTransform")
  @js.native
  open class XmlDsigXPathTransform () extends Transform {
    def this(properties: js.Object) = this()
    
    /* protected */ def Evaluate(node: Node, xpath: String): Boolean = js.native
    
    /* protected */ def Filter(node: Node, xpath: String): Unit = js.native
    
    /* protected */ def GetEvaluator(node: Node): XPathEvaluator = js.native
  }
}
