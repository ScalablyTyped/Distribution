package typings.useDashPersistedDashState

import typings.react.reactMod.Dispatch
import typings.react.reactMod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_InitialState extends js.Object {
  def apply[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = js.native
  def apply[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
  def apply[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
}

