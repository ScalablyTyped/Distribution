package typings.atWordpressData.atWordpressDataMod

import typings.redux.reduxMod.ActionFromReducersMapObject
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.CombinedState
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.ReducersMapObject
import typings.redux.reduxMod.StateFromReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", "combineReducers")
@js.native
object combineReducers extends js.Object {
  def apply[M /* <: ReducersMapObject[_, _] */](reducers: M): Reducer[CombinedState[StateFromReducersMapObject[M]], ActionFromReducersMapObject[M]] = js.native
  def apply[S](reducers: ReducersMapObject[S, _]): Reducer[CombinedState[S], AnyAction] = js.native
}

