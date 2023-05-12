package typings.stubbornFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHandlersMod {
  
  object default {
    
    @JSImport("stubborn-fs/dist/handlers", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def isChangeErrorOk(error: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChangeErrorOk")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNodeError(error: Any): /* is node.NodeJS.ErrnoException */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is node.NodeJS.ErrnoException */ Boolean]
    
    inline def isRetriableError(error: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRetriableError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def onChangeError(error: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChangeError")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
