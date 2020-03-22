package typings.wouter

import typings.react.mod.ReactNode
import typings.wouter.mod.DefaultParams
import typings.wouter.mod.LocationHook
import typings.wouter.mod.LocationHookOptions
import typings.wouter.mod.LocationTuple
import typings.wouter.mod.Match
import typings.wouter.mod.MatcherFn
import typings.wouter.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<wouter.wouter.RouterProps> & {  children  :react.react.ReactNode} */
trait PartialRouterPropschildre extends js.Object {
  var base: js.UndefOr[Path] = js.undefined
  var children: ReactNode
  var hook: js.UndefOr[LocationHook] = js.undefined
  var matcher: js.UndefOr[MatcherFn] = js.undefined
}

object PartialRouterPropschildre {
  @scala.inline
  def apply(
    base: Path = null,
    children: ReactNode = null,
    hook: /* options */ js.UndefOr[LocationHookOptions] => LocationTuple = null,
    matcher: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams] = null
  ): PartialRouterPropschildre = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(js.Any.fromFunction1(hook))
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction2(matcher))
    __obj.asInstanceOf[PartialRouterPropschildre]
  }
}

