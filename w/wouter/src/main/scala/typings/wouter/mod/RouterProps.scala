package typings.wouter.mod

import typings.wouter.matcherMod.DefaultParams
import typings.wouter.matcherMod.Match
import typings.wouter.matcherMod.MatcherFn
import typings.wouter.wouterUseLocationMod.BaseLocationHook
import typings.wouter.wouterUseLocationMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterProps extends js.Object {
  
  var base: Path = js.native
  
  var hook: BaseLocationHook = js.native
  
  var matcher: MatcherFn = js.native
}
object RouterProps {
  
  @scala.inline
  def apply(
    base: Path,
    hook: /* repeated */ js.Any => js.Tuple2[Path, js.Function2[/* path */ Path, /* repeated */ js.Any, js.Any]],
    matcher: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]
  ): RouterProps = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], hook = js.Any.fromFunction1(hook), matcher = js.Any.fromFunction2(matcher))
    __obj.asInstanceOf[RouterProps]
  }
  
  @scala.inline
  implicit class RouterPropsOps[Self <: RouterProps] (val x: Self) extends AnyVal {
    
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
    def setHook(
      value: /* repeated */ js.Any => js.Tuple2[Path, js.Function2[/* path */ Path, /* repeated */ js.Any, js.Any]]
    ): Self = this.set("hook", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatcher(value: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]): Self = this.set("matcher", js.Any.fromFunction2(value))
  }
}
