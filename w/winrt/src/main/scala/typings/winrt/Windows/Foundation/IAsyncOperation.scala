package typings.winrt.Windows.Foundation

import typings.winrt.anon.GetResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAsyncOperation[TResult]
  extends StObject
     with IPromise[TResult] {
  
  var operation: GetResults[TResult] = js.native
}
