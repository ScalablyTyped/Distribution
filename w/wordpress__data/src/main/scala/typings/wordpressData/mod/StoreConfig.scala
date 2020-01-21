package typings.wordpressData.mod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.std.Generator
import typings.wordpressData.wordpressDataBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreConfig[S] extends js.Object {
  var actions: js.UndefOr[
    StringDictionary[js.Function1[/* repeated */ js.Any, AnyAction | (Generator[_, _, _])]]
  ] = js.undefined
  var controls: js.UndefOr[StringDictionary[js.Function1[/* action */ AnyAction, _]]] = js.undefined
  var initialState: js.UndefOr[S] = js.undefined
  /**
    * Use persist with the persistence plugin to persist state.
    *
    * The registry must use the `persistence` plugin.
    *
    * Set to `true` to persist all state, or pass an array of state keys to persist.
    *
    * @example
    *
    * import { plugins, registerStore, use } from '@wordpress/data';
    *
    * use( plugins.persistence, { storageKey: 'example' } );
    *
    * registerStore( 'my-plugin', {
    *   // …
    *   persist: [ 'state-key-to-persist' ],
    * } );
    */
  var persist: js.UndefOr[`true` | js.Array[String]] = js.undefined
  var reducer: Reducer[S, AnyAction]
  var resolvers: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, _]]] = js.undefined
  var selectors: js.UndefOr[StringDictionary[js.Function2[/* state */ S, /* repeated */ js.Any, _]]] = js.undefined
}

object StoreConfig {
  @scala.inline
  def apply[S](
    reducer: (/* state */ js.UndefOr[S], AnyAction) => S,
    actions: StringDictionary[js.Function1[/* repeated */ js.Any, AnyAction | (Generator[_, _, _])]] = null,
    controls: StringDictionary[js.Function1[/* action */ AnyAction, _]] = null,
    initialState: S = null,
    persist: `true` | js.Array[String] = null,
    resolvers: StringDictionary[js.Function1[/* repeated */ js.Any, _]] = null,
    selectors: StringDictionary[js.Function2[/* state */ S, /* repeated */ js.Any, _]] = null
  ): StoreConfig[S] = {
    val __obj = js.Dynamic.literal(reducer = js.Any.fromFunction2(reducer))
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (persist != null) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreConfig[S]]
  }
}

