package typings.atWordpressData.atWordpressDataMod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreConfig[S] extends js.Object {
  var actions: js.UndefOr[
    StringDictionary[js.Function1[/* repeated */ js.Any, AnyAction | IterableIterator[_]]]
  ] = js.undefined
  var controls: js.UndefOr[StringDictionary[js.Function1[/* action */ AnyAction, _]]] = js.undefined
  var initialState: js.UndefOr[S] = js.undefined
  var reducer: Reducer[S, AnyAction]
  var resolvers: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, _]]] = js.undefined
  var selectors: js.UndefOr[StringDictionary[js.Function2[/* state */ S, /* repeated */ js.Any, _]]] = js.undefined
}

object StoreConfig {
  @scala.inline
  def apply[S](
    reducer: Reducer[S, AnyAction],
    actions: StringDictionary[js.Function1[/* repeated */ js.Any, AnyAction | IterableIterator[_]]] = null,
    controls: StringDictionary[js.Function1[/* action */ AnyAction, _]] = null,
    initialState: S = null,
    resolvers: StringDictionary[js.Function1[/* repeated */ js.Any, _]] = null,
    selectors: StringDictionary[js.Function2[/* state */ S, /* repeated */ js.Any, _]] = null
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

