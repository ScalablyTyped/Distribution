package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewaresMod {
  
  @JSImport("webdriverio/build/middlewares", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def elementErrorHandler(fn: js.Function): js.Function2[
    /* commandName */ js.Any, 
    /* commandFn */ js.Any, 
    js.Function1[/* repeated */ js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementErrorHandler")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* commandName */ js.Any, 
    /* commandFn */ js.Any, 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]]
  
  inline def multiremoteHandler(wrapCommand: js.Any): js.Function1[/* commandName */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiremoteHandler")(wrapCommand.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* commandName */ js.Any, js.Any]]
}
