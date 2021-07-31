package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.protocolMod.FileEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _WorkspaceMiddleware extends StObject {
  
  var didChangeConfiguration: js.UndefOr[
    js.ThisFunction2[
      /* this */ Unit, 
      /* sections */ js.UndefOr[js.Array[String]], 
      /* next */ DidChangeConfigurationSignature, 
      Unit
    ]
  ] = js.undefined
  
  var didChangeWatchedFile: js.UndefOr[
    js.ThisFunction2[/* this */ Unit, /* event */ FileEvent, /* next */ DidChangeWatchedFileSignature, Unit]
  ] = js.undefined
}
object _WorkspaceMiddleware {
  
  @scala.inline
  def apply(): _WorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_WorkspaceMiddleware]
  }
  
  @scala.inline
  implicit class _WorkspaceMiddlewareMutableBuilder[Self <: _WorkspaceMiddleware] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDidChangeConfiguration(
      value: js.ThisFunction2[
          /* this */ Unit, 
          /* sections */ js.UndefOr[js.Array[String]], 
          /* next */ DidChangeConfigurationSignature, 
          Unit
        ]
    ): Self = StObject.set(x, "didChangeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDidChangeConfigurationUndefined: Self = StObject.set(x, "didChangeConfiguration", js.undefined)
    
    @scala.inline
    def setDidChangeWatchedFile(
      value: js.ThisFunction2[/* this */ Unit, /* event */ FileEvent, /* next */ DidChangeWatchedFileSignature, Unit]
    ): Self = StObject.set(x, "didChangeWatchedFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDidChangeWatchedFileUndefined: Self = StObject.set(x, "didChangeWatchedFile", js.undefined)
  }
}
