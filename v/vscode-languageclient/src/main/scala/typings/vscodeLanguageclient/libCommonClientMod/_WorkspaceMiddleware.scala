package typings.vscodeLanguageclient.libCommonClientMod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.FileEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _WorkspaceMiddleware extends StObject {
  
  var didChangeWatchedFile: js.UndefOr[
    js.ThisFunction2[
      /* this */ Unit, 
      /* event */ FileEvent, 
      /* next */ DidChangeWatchedFileSignature, 
      js.Promise[Unit]
    ]
  ] = js.undefined
}
object _WorkspaceMiddleware {
  
  inline def apply(): _WorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_WorkspaceMiddleware]
  }
  
  extension [Self <: _WorkspaceMiddleware](x: Self) {
    
    inline def setDidChangeWatchedFile(
      value: js.ThisFunction2[
          /* this */ Unit, 
          /* event */ FileEvent, 
          /* next */ DidChangeWatchedFileSignature, 
          js.Promise[Unit]
        ]
    ): Self = StObject.set(x, "didChangeWatchedFile", value.asInstanceOf[js.Any])
    
    inline def setDidChangeWatchedFileUndefined: Self = StObject.set(x, "didChangeWatchedFile", js.undefined)
  }
}
