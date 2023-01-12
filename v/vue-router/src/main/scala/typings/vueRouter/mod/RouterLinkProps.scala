package typings.vueRouter.mod

import typings.vueRouter.vueRouterStrings.`false`
import typings.vueRouter.vueRouterStrings.`true`
import typings.vueRouter.vueRouterStrings.date
import typings.vueRouter.vueRouterStrings.location
import typings.vueRouter.vueRouterStrings.page
import typings.vueRouter.vueRouterStrings.step
import typings.vueRouter.vueRouterStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterLinkProps
  extends StObject
     with RouterLinkOptions {
  
  /**
    * Class to apply when the link is active
    */
  var activeClass: js.UndefOr[String] = js.undefined
  
  /**
    * Value passed to the attribute `aria-current` when the link is exact active.
    *
    * @defaultValue `'page'`
    */
  var ariaCurrentValue: js.UndefOr[page | step | location | date | time | `true` | `false`] = js.undefined
  
  /**
    * Whether RouterLink should not wrap its content in an `a` tag. Useful when
    * using `v-slot` to create a custom RouterLink
    */
  var custom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Class to apply when the link is exact active
    */
  var exactActiveClass: js.UndefOr[String] = js.undefined
}
object RouterLinkProps {
  
  inline def apply(to: RouteLocationRaw): RouterLinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterLinkProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouterLinkProps] (val x: Self) extends AnyVal {
    
    inline def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
    
    inline def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
    
    inline def setAriaCurrentValue(value: page | step | location | date | time | `true` | `false`): Self = StObject.set(x, "ariaCurrentValue", value.asInstanceOf[js.Any])
    
    inline def setAriaCurrentValueUndefined: Self = StObject.set(x, "ariaCurrentValue", js.undefined)
    
    inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setExactActiveClass(value: String): Self = StObject.set(x, "exactActiveClass", value.asInstanceOf[js.Any])
    
    inline def setExactActiveClassUndefined: Self = StObject.set(x, "exactActiveClass", js.undefined)
  }
}
