package typings.xmlserializer

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xmlserializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializeToString(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeToString")(node.asInstanceOf[js.Any]).asInstanceOf[String]
}
