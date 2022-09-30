package typings.webdriverio

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewaresMod {
  
  @JSImport("webdriverio/build/middlewares", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def elementErrorHandler(fn: js.Function): js.Function2[
    /* commandName */ String, 
    /* commandFn */ js.Function, 
    js.ThisFunction1[/* this */ Element, /* repeated */ Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementErrorHandler")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* commandName */ String, 
    /* commandFn */ js.Function, 
    js.ThisFunction1[/* this */ Element, /* repeated */ Any, Any]
  ]]
  
  inline def multiremoteHandler(wrapCommand: js.Function): js.Function1[
    /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser * / any */ /* commandName */ String, 
    Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiremoteHandler")(wrapCommand.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser * / any */ /* commandName */ String, 
    Any
  ]]
}
