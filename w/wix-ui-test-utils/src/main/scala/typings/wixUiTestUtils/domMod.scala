package typings.wixUiTestUtils

import typings.std.Element
import typings.std.NodeListOf
import typings.std.ParentNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("wix-ui-test-utils/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def queryHook[E /* <: Element */](baseElement: ParentNode, hook: String): E | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("queryHook")(baseElement.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[E | Null]
  
  inline def queryHookAll[E /* <: Element */](baseElement: ParentNode, hook: String): NodeListOf[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("queryHookAll")(baseElement.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[NodeListOf[E]]
}
