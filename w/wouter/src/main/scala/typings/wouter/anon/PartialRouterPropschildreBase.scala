package typings.wouter.anon

import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import typings.wouter.preactMatcherMod.DefaultParams
import typings.wouter.preactMatcherMod.Match
import typings.wouter.preactMatcherMod.MatcherFn
import typings.wouter.useLocationMod.BaseLocationHook
import typings.wouter.useLocationMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wouter.wouter/preact.RouterProps> & {  children :preact.preact.ComponentChildren} */
@js.native
trait PartialRouterPropschildreBase extends js.Object {
  
  var base: js.UndefOr[Path] = js.native
  
  var children: ComponentChildren = js.native
  
  var hook: js.UndefOr[BaseLocationHook] = js.native
  
  var matcher: js.UndefOr[MatcherFn] = js.native
}
object PartialRouterPropschildreBase {
  
  @scala.inline
  def apply(): PartialRouterPropschildreBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRouterPropschildreBase]
  }
  
  @scala.inline
  implicit class PartialRouterPropschildreBaseOps[Self <: PartialRouterPropschildreBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBase(value: Path): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ComponentChild*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: ComponentChildren): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    
    @scala.inline
    def setHook(
      value: /* repeated */ js.Any => js.Tuple2[Path, js.Function2[/* path */ Path, /* repeated */ js.Any, js.Any]]
    ): Self = this.set("hook", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHook: Self = this.set("hook", js.undefined)
    
    @scala.inline
    def setMatcher(value: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]): Self = this.set("matcher", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMatcher: Self = this.set("matcher", js.undefined)
  }
}
