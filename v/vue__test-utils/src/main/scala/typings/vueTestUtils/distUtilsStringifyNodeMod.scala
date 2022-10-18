package typings.vueTestUtils

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsStringifyNodeMod {
  
  @JSImport("@vue/test-utils/dist/utils/stringifyNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringifyNode(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyNode")(node.asInstanceOf[js.Any]).asInstanceOf[String]
}
