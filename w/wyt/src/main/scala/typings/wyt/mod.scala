package typings.wyt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param turnsPerInterval The number of turns that can be taken within a
    * certain interval.
    * @param interval The interval within which `turnsPerInterval` can be executed.
    *
    * @returns a function `(turns?: number) => Promise<number>` that can be called
    * before before requesting a rate-limited resource (i.e. wait for its turn) in
    * order to not exceed the limit.
    */
  @JSImport("wyt", JSImport.Namespace)
  @js.native
  def apply(turnsPerInterval: Double, interval: Double): WaitTurn = js.native
  
  /**
    * @param turns (default=1) The number of turns that will be taken at the
    * same time. You can not await more turns at the same time as
    * `turnsPerInterval`.
    *
    * @returns a promise `Promise<number>` that will resolve with the time
    * waited as soon as another turn can be taken. If more than
    * `turnsPerInterval` are requested at the same time the promise will
    * reject.
    */
  type WaitTurn = js.Function1[/* turns */ js.UndefOr[Double], js.Promise[Double]]
}
