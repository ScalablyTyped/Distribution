package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.DefaultFactory
import typings.vueRuntimeCore.mod.PropType
import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @vue/runtime-core.@vue/runtime-core.PropOptions<any, any> & {[BooleanFlags.shouldCast] : boolean | undefined, [BooleanFlags.shouldCastTrue] : boolean | undefined} */
@js.native
trait PropOptionsanyanyshouldCa extends StObject {
  
  var default: js.UndefOr[Any | DefaultFactory[Any] | Null | js.Object] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[PropType[Any] | `true` | Null] = js.native
  
  var validator: js.UndefOr[js.Function1[/* value */ Any, Boolean]] = js.native
}
