package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type RenderFunction = (): @vue/runtime-core.@vue/runtime-core.VNodeChild
}}}
to avoid circular code involving: 
- @vue/runtime-core.@vue/runtime-core.RenderFunction
- @vue/runtime-core.@vue/runtime-core.VNodeArrayChildren
- @vue/runtime-core.@vue/runtime-core.VNodeChild
*/
@js.native
trait RenderFunction extends StObject {
  
  def apply(): VNodeChild = js.native
}
