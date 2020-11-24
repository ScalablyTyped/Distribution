package typings.winrt.Windows.Foundation

import typings.winrt.anon.Completed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAsyncOperationWithProgress[TResult, TProgress] extends IPromise[TResult] {
  
  var operation: Completed[TResult, TProgress] = js.native
}
