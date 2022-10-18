package typings.vueTestUtils

import org.scalablytyped.runtime.StringDictionary
import typings.vueRuntimeCore.mod.ComponentInternalInstance
import typings.vueRuntimeCore.mod.RendererElement
import typings.vueRuntimeCore.mod.RendererNode
import typings.vueRuntimeCore.mod.VNode
import typings.vueTestUtils.distTypesMod.FindAllComponentsSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsFindMod {
  
  @JSImport("@vue/test-utils/dist/utils/find", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(
    root: VNode[RendererNode, RendererElement, StringDictionary[Any]],
    selector: FindAllComponentsSelector
  ): js.Array[ComponentInternalInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentInternalInstance]]
  
  inline def matches(
    node: VNode[RendererNode, RendererElement, StringDictionary[Any]],
    rawSelector: FindAllComponentsSelector
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(node.asInstanceOf[js.Any], rawSelector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
