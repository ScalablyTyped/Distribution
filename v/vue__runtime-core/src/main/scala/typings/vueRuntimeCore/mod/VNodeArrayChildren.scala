package typings.vueRuntimeCore.mod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type VNodeArrayChildren = std.Array<@vue/runtime-core.@vue/runtime-core.VNodeArrayChildren | @vue/runtime-core.@vue/runtime-core.VNodeChildAtom>
}}}
to avoid circular code involving: 
- @vue/runtime-core.@vue/runtime-core.RawChildren
- @vue/runtime-core.@vue/runtime-core.VNodeArrayChildren
*/
@js.native
trait VNodeArrayChildren
  extends StObject
     with Array[VNodeArrayChildren | VNodeChildAtom]
