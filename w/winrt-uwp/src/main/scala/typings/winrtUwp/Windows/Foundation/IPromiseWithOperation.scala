package typings.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPromiseWithOperation[TResult, TOperation /* <: IAsyncAction */] extends IPromise[TResult] {
  
  var operation: TOperation = js.native
}
