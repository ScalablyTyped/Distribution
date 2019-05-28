package typings
package useDashPersistedDashStateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_InitialState extends js.Object {
  def apply[S](): js.Tuple2[
    js.UndefOr[S], 
    reactLib.reactMod.Dispatch[reactLib.reactMod.SetStateAction[js.UndefOr[S]]]
  ] = js.native
  def apply[S](initialState: S): js.Tuple2[S, reactLib.reactMod.Dispatch[reactLib.reactMod.SetStateAction[S]]] = js.native
  def apply[S](initialState: js.Function0[S]): js.Tuple2[S, reactLib.reactMod.Dispatch[reactLib.reactMod.SetStateAction[S]]] = js.native
}

