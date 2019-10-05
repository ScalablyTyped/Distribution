package typings.atWordpressData.atWordpressDataMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.ReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", "combineReducers")
@js.native
object combineReducers extends js.Object {
  def apply[S](reducers: ReducersMapObject[S, _]): Reducer[S, AnyAction] = js.native
}

