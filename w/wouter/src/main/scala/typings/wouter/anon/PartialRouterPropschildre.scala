package typings.wouter.anon

import typings.react.mod.ReactNode
import typings.wouter.matcherMod.DefaultParams
import typings.wouter.matcherMod.Match
import typings.wouter.matcherMod.MatcherFn
import typings.wouter.wouterUseLocationMod.BaseLocationHook
import typings.wouter.wouterUseLocationMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<wouter.wouter.RouterProps> & {  children :react.react.ReactNode} */
@js.native
trait PartialRouterPropschildre extends js.Object {
  var base: js.UndefOr[Path] = js.native
  var children: ReactNode = js.native
  var hook: js.UndefOr[BaseLocationHook] = js.native
  var matcher: js.UndefOr[MatcherFn] = js.native
}

object PartialRouterPropschildre {
  @scala.inline
  def apply(): PartialRouterPropschildre = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRouterPropschildre]
  }
  @scala.inline
  implicit class PartialRouterPropschildreOps[Self <: PartialRouterPropschildre] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
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

