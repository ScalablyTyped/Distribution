package typings.wouter.preactMod

import typings.wouter.preactMatcherMod.DefaultParams
import typings.wouter.preactMatcherMod.Match
import typings.wouter.preactMatcherMod.MatcherFn
import typings.wouter.useLocationMod.BaseLocationHook
import typings.wouter.useLocationMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

