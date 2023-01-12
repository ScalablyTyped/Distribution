package typings.vueRouter.mod

import typings.vueReactivity.mod.Ref_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vue-router.vue-router.VueUseOptions<vue-router.vue-router.RouterLinkOptions> */
trait UseLinkOptions extends StObject {
  
  var replace: js.UndefOr[Ref_[js.UndefOr[Boolean]] | Boolean] = js.undefined
  
  var to: Ref_[RouteLocationRaw] | RouteLocationRaw
}
object UseLinkOptions {
  
  inline def apply(to: Ref_[RouteLocationRaw] | RouteLocationRaw): UseLinkOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseLinkOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseLinkOptions] (val x: Self) extends AnyVal {
    
    inline def setReplace(value: Ref_[js.UndefOr[Boolean]] | Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setTo(value: Ref_[RouteLocationRaw] | RouteLocationRaw): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
