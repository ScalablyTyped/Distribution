package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickDiffProvider extends StObject {
  
  /**
    * Provide a [uri](#Uri) to the original resource of any given resource uri.
    *
    * @param uri The uri of the resource open in a text editor.
    * @param token A cancellation token.
    * @return A thenable that resolves to uri of the matching original resource.
    */
  var provideOriginalResource: js.UndefOr[js.Function2[/* uri */ Uri, /* token */ CancellationToken, ProviderResult[Uri]]] = js.native
}
object QuickDiffProvider {
  
  @scala.inline
  def apply(): QuickDiffProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuickDiffProvider]
  }
  
  @scala.inline
  implicit class QuickDiffProviderMutableBuilder[Self <: QuickDiffProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideOriginalResource(value: (/* uri */ Uri, /* token */ CancellationToken) => ProviderResult[Uri]): Self = StObject.set(x, "provideOriginalResource", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProvideOriginalResourceUndefined: Self = StObject.set(x, "provideOriginalResource", js.undefined)
  }
}
