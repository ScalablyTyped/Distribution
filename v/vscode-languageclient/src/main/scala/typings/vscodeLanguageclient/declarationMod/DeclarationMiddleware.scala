package typings.vscodeLanguageclient.declarationMod

import typings.vscode.mod.Declaration
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclarationMiddleware extends js.Object {
  
  var provideDeclaration: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideDeclarationSignature, 
      ProviderResult[Declaration]
    ]
  ] = js.native
}
object DeclarationMiddleware {
  
  @scala.inline
  def apply(): DeclarationMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclarationMiddleware]
  }
  
  @scala.inline
  implicit class DeclarationMiddlewareOps[Self <: DeclarationMiddleware] (val x: Self) extends AnyVal {
    
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
    def setProvideDeclaration(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideDeclarationSignature, 
          ProviderResult[Declaration]
        ]
    ): Self = this.set("provideDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvideDeclaration: Self = this.set("provideDeclaration", js.undefined)
  }
}
