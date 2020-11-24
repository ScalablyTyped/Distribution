package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickDiffProvider extends js.Object {
  
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
  implicit class QuickDiffProviderOps[Self <: QuickDiffProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProvideOriginalResource(value: (/* uri */ Uri, /* token */ CancellationToken) => ProviderResult[Uri]): Self = this.set("provideOriginalResource", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteProvideOriginalResource: Self = this.set("provideOriginalResource", js.undefined)
  }
}
