package typings
package atUirouterAngularjsLib.libInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Ng1StateDeclaration
  extends atUirouterCoreLib.libStateInterfaceMod.StateDeclaration {
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
    $$state: () => atUirouterCoreLib.libStateStateObjectMod.StateObject = null,
    `abstract`: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    dynamic: js.UndefOr[scala.Boolean] = js.undefined,
    lazyLoad: (/* transition */ atUirouterCoreLib.libTransitionTransitionMod.Transition, /* state */ atUirouterCoreLib.libStateInterfaceMod.StateDeclaration) => js.Promise[atUirouterCoreLib.libStateInterfaceMod.LazyLoadResult] = null,
    name: java.lang.String = null,
    onEnter: js.Any = null,
    onExit: js.Any = null,
    onRetain: js.Any = null,
    params: org.scalablytyped.runtime.StringDictionary[atUirouterCoreLib.libParamsInterfaceMod.ParamDeclaration | js.Any] = null,
    parent: java.lang.String | atUirouterCoreLib.libStateInterfaceMod.StateDeclaration = null,
    redirectTo: atUirouterCoreLib.libStateInterfaceMod.RedirectToResult | (js.Function1[
      /* transition */ atUirouterCoreLib.libTransitionTransitionMod.Transition, 
      atUirouterCoreLib.libStateInterfaceMod.RedirectToResult
    ]) | (js.Function1[
      /* transition */ atUirouterCoreLib.libTransitionTransitionMod.Transition, 
      js.Promise[atUirouterCoreLib.libStateInterfaceMod.RedirectToResult]
    ]) = null,
    reloadOnSearch: js.UndefOr[scala.Boolean] = js.undefined,
    resolve: js.Array[atUirouterCoreLib.libStateInterfaceMod.ResolveTypes] | org.scalablytyped.runtime.StringDictionary[atUirouterCoreLib.libCommonCommonMod.IInjectable] = null,
    resolvePolicy: atUirouterCoreLib.libResolveInterfaceMod.ResolvePolicy = null,
    url: java.lang.String = null,
    views: js.Any = null
  ): _Ng1StateDeclaration = {
    val __obj = js.Dynamic.literal()
    if ($$state != null) __obj.updateDynamic("$$state")(js.Any.fromFunction0($$state))
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic)
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(js.Any.fromFunction2(lazyLoad))
    if (name != null) __obj.updateDynamic("name")(name)
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onRetain != null) __obj.updateDynamic("onRetain")(onRetain)
    if (params != null) __obj.updateDynamic("params")(params)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadOnSearch)) __obj.updateDynamic("reloadOnSearch")(reloadOnSearch)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (resolvePolicy != null) __obj.updateDynamic("resolvePolicy")(resolvePolicy)
    if (url != null) __obj.updateDynamic("url")(url)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[_Ng1StateDeclaration]
  }
}

