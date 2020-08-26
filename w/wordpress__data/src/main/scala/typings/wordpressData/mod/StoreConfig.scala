package typings.wordpressData.mod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.std.Generator
import typings.wordpressData.wordpressDataBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreConfig[S] extends js.Object {
  var actions: js.UndefOr[
    StringDictionary[js.Function1[/* repeated */ js.Any, AnyAction | (Generator[_, _, _])]]
  ] = js.native
  var controls: js.UndefOr[StringDictionary[js.Function1[/* action */ AnyAction, _]]] = js.native
  var initialState: js.UndefOr[S] = js.native
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
  var persist: js.UndefOr[`true` | (js.Array[/* keyof S */ String])] = js.native
  var reducer: Reducer[S, AnyAction] = js.native
  var resolvers: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, _]]] = js.native
  var selectors: js.UndefOr[StringDictionary[js.Function2[/* state */ S, /* repeated */ js.Any, _]]] = js.native
}

object StoreConfig {
  @scala.inline
  def apply[S](reducer: (/* state */ js.UndefOr[S], AnyAction) => S): StoreConfig[S] = {
    val __obj = js.Dynamic.literal(reducer = js.Any.fromFunction2(reducer))
    __obj.asInstanceOf[StoreConfig[S]]
  }
  @scala.inline
  implicit class StoreConfigOps[Self <: StoreConfig[_], S] (val x: Self with StoreConfig[S]) extends AnyVal {
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
    def setReducer(value: (/* state */ js.UndefOr[S], AnyAction) => S): Self = this.set("reducer", js.Any.fromFunction2(value))
    @scala.inline
    def setActions(value: StringDictionary[js.Function1[/* repeated */ js.Any, AnyAction | (Generator[_, _, _])]]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setControls(value: StringDictionary[js.Function1[/* action */ AnyAction, _]]): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setInitialState(value: S): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setPersistVarargs(value: (/* keyof S */ String)*): Self = this.set("persist", js.Array(value :_*))
    @scala.inline
    def setPersist(value: `true` | (js.Array[/* keyof S */ String])): Self = this.set("persist", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    @scala.inline
    def setResolvers(value: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Self = this.set("resolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvers: Self = this.set("resolvers", js.undefined)
    @scala.inline
    def setSelectors(value: StringDictionary[js.Function2[/* state */ S, /* repeated */ js.Any, _]]): Self = this.set("selectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
  }
  
}

