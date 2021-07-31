package typings.wouter.anon

import typings.react.mod.ReactNode
import typings.wouter.matcherMod.DefaultParams
import typings.wouter.matcherMod.Match
import typings.wouter.matcherMod.MatcherFn
import typings.wouter.wouterUseLocationMod.BaseLocationHook
import typings.wouter.wouterUseLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wouter.wouter.RouterProps> & {  children :react.react.ReactNode} */
trait PartialRouterPropschildre extends StObject {
  
  var base: js.UndefOr[Path] = js.undefined
  
  var children: ReactNode
  
  var hook: js.UndefOr[BaseLocationHook] = js.undefined
  
  var matcher: js.UndefOr[MatcherFn] = js.undefined
}
object PartialRouterPropschildre {
  
  @scala.inline
  def apply(): PartialRouterPropschildre = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRouterPropschildre]
  }
  
  @scala.inline
  implicit class PartialRouterPropschildreMutableBuilder[Self <: PartialRouterPropschildre] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Path): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setHook(value: BaseLocationHook): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
    
    @scala.inline
    def setMatcher(value: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]): Self = StObject.set(x, "matcher", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
  }
}
