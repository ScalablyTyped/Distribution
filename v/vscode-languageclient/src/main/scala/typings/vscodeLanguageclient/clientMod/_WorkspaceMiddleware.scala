package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.protocolMod.FileEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _WorkspaceMiddleware extends js.Object {
  
  var didChangeConfiguration: js.UndefOr[
    js.ThisFunction2[
      /* this */ Unit, 
      /* sections */ js.UndefOr[js.Array[String]], 
      /* next */ DidChangeConfigurationSignature, 
      Unit
    ]
  ] = js.native
  
  var didChangeWatchedFile: js.UndefOr[
    js.ThisFunction2[/* this */ Unit, /* event */ FileEvent, /* next */ DidChangeWatchedFileSignature, Unit]
  ] = js.native
}
object _WorkspaceMiddleware {
  
  @scala.inline
  def apply(): _WorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_WorkspaceMiddleware]
  }
  
  @scala.inline
  implicit class _WorkspaceMiddlewareOps[Self <: _WorkspaceMiddleware] (val x: Self) extends AnyVal {
    
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
    def setDidChangeConfiguration(
      value: js.ThisFunction2[
          /* this */ Unit, 
          /* sections */ js.UndefOr[js.Array[String]], 
          /* next */ DidChangeConfigurationSignature, 
          Unit
        ]
    ): Self = this.set("didChangeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDidChangeConfiguration: Self = this.set("didChangeConfiguration", js.undefined)
    
    @scala.inline
    def setDidChangeWatchedFile(
      value: js.ThisFunction2[/* this */ Unit, /* event */ FileEvent, /* next */ DidChangeWatchedFileSignature, Unit]
    ): Self = this.set("didChangeWatchedFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDidChangeWatchedFile: Self = this.set("didChangeWatchedFile", js.undefined)
  }
}
