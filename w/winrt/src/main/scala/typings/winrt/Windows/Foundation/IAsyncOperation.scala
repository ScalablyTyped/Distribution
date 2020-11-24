package typings.winrt.Windows.Foundation

import typings.winrt.anon.GetResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAsyncOperation[TResult] extends IPromise[TResult] {
  
  var operation: GetResults[TResult] = js.native
}
