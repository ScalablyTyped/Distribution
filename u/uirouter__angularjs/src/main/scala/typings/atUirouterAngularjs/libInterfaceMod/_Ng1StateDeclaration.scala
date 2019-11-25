package typings.atUirouterAngularjs.libInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atUirouterCore.libCommonCommonMod.IInjectable
import typings.atUirouterCore.libParamsInterfaceMod.ParamDeclaration
import typings.atUirouterCore.libResolveInterfaceMod.ResolvePolicy
import typings.atUirouterCore.libStateInterfaceMod.LazyLoadResult
import typings.atUirouterCore.libStateInterfaceMod.RedirectToResult
import typings.atUirouterCore.libStateInterfaceMod.ResolveTypes
import typings.atUirouterCore.libStateInterfaceMod.StateDeclaration
import typings.atUirouterCore.libStateStateObjectMod.StateObject
import typings.atUirouterCore.libTransitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Ng1StateDeclaration extends StateDeclaration {
  @JSName("onEnter")
  var onEnter__Ng1StateDeclaration: js.UndefOr[js.Any] = js.undefined
  @JSName("onExit")
  var onExit__Ng1StateDeclaration: js.UndefOr[js.Any] = js.undefined
  @JSName("onRetain")
  var onRetain__Ng1StateDeclaration: js.UndefOr[js.Any] = js.undefined
  @JSName("views")
  var views__Ng1StateDeclaration: js.UndefOr[js.Any] = js.undefined
}

object _Ng1StateDeclaration {
  @scala.inline
  def apply(
    $$state: () => StateObject = null,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    dynamic: js.UndefOr[Boolean] = js.undefined,
    lazyLoad: (/* transition */ Transition, /* state */ StateDeclaration) => js.Promise[LazyLoadResult] = null,
    name: String = null,
    onEnter: js.Any = null,
    onExit: js.Any = null,
    onRetain: js.Any = null,
    params: StringDictionary[ParamDeclaration | js.Any] = null,
    parent: String | StateDeclaration = null,
    redirectTo: RedirectToResult | (js.Function1[/* transition */ Transition, js.Promise[RedirectToResult] | RedirectToResult]) = null,
    reloadOnSearch: js.UndefOr[Boolean] = js.undefined,
    resolve: js.Array[ResolveTypes] | StringDictionary[IInjectable] = null,
    resolvePolicy: ResolvePolicy = null,
    url: String = null,
    views: js.Any = null
  ): _Ng1StateDeclaration = {
    val __obj = js.Dynamic.literal()
    if ($$state != null) __obj.updateDynamic("$$state")(js.Any.fromFunction0($$state))
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic.asInstanceOf[js.Any])
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(js.Any.fromFunction2(lazyLoad))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (onRetain != null) __obj.updateDynamic("onRetain")(onRetain.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadOnSearch)) __obj.updateDynamic("reloadOnSearch")(reloadOnSearch.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (resolvePolicy != null) __obj.updateDynamic("resolvePolicy")(resolvePolicy.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Ng1StateDeclaration]
  }
}

