package typings
package atWordpressDataLib.atWordpressDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreConfig[S] extends js.Object {
  var actions: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      js.Function1[/* repeated */ js.Any, reduxLib.reduxMod.AnyAction | stdLib.IterableIterator[_]]
    ]
  ] = js.undefined
  var controls: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Function1[/* action */ reduxLib.reduxMod.AnyAction, _]]
  ] = js.undefined
  var initialState: js.UndefOr[S] = js.undefined
  var reducer: reduxLib.reduxMod.Reducer[S, reduxLib.reduxMod.AnyAction]
  var resolvers: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]
  ] = js.undefined
  var selectors: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Function2[/* state */ S, /* repeated */ js.Any, _]]
  ] = js.undefined
}

object StoreConfig {
  @scala.inline
  def apply[S](
    reducer: reduxLib.reduxMod.Reducer[S, reduxLib.reduxMod.AnyAction],
    actions: org.scalablytyped.runtime.StringDictionary[
      js.Function1[/* repeated */ js.Any, reduxLib.reduxMod.AnyAction | stdLib.IterableIterator[_]]
    ] = null,
    controls: org.scalablytyped.runtime.StringDictionary[js.Function1[/* action */ reduxLib.reduxMod.AnyAction, _]] = null,
    initialState: S = null,
    resolvers: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]] = null,
    selectors: org.scalablytyped.runtime.StringDictionary[js.Function2[/* state */ S, /* repeated */ js.Any, _]] = null
  ): StoreConfig[S] = {
    val __obj = js.Dynamic.literal(reducer = reducer)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (controls != null) __obj.updateDynamic("controls")(controls)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers)
    if (selectors != null) __obj.updateDynamic("selectors")(selectors)
    __obj.asInstanceOf[StoreConfig[S]]
  }
}

