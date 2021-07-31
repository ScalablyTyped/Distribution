package typings.yargs

import typings.yargs.anon.PartialArguments
import typings.yargs.yargsMod.Arguments
import typings.yargs.yargsMod.YargsInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
  @JSImport("yargs/build/lib/middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def applyMiddleware(
    argv: js.Promise[Arguments],
    yargs: YargsInstance,
    middlewares: js.Array[Middleware],
    beforeValidation: Boolean
  ): Arguments | js.Promise[Arguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyMiddleware")(argv.asInstanceOf[js.Any], yargs.asInstanceOf[js.Any], middlewares.asInstanceOf[js.Any], beforeValidation.asInstanceOf[js.Any])).asInstanceOf[Arguments | js.Promise[Arguments]]
  @scala.inline
  def applyMiddleware(
    argv: Arguments,
    yargs: YargsInstance,
    middlewares: js.Array[Middleware],
    beforeValidation: Boolean
  ): Arguments | js.Promise[Arguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyMiddleware")(argv.asInstanceOf[js.Any], yargs.asInstanceOf[js.Any], middlewares.asInstanceOf[js.Any], beforeValidation.asInstanceOf[js.Any])).asInstanceOf[Arguments | js.Promise[Arguments]]
  
  @scala.inline
  def commandMiddlewareFactory(): js.Array[Middleware] = ^.asInstanceOf[js.Dynamic].applyDynamic("commandMiddlewareFactory")().asInstanceOf[js.Array[Middleware]]
  @scala.inline
  def commandMiddlewareFactory(commandMiddleware: js.Array[MiddlewareCallback]): js.Array[Middleware] = ^.asInstanceOf[js.Dynamic].applyDynamic("commandMiddlewareFactory")(commandMiddleware.asInstanceOf[js.Any]).asInstanceOf[js.Array[Middleware]]
  
  @scala.inline
  def globalMiddlewareFactory[T](globalMiddleware: js.Array[Middleware], context: T): js.Function2[
    /* callback */ MiddlewareCallback | js.Array[MiddlewareCallback], 
    /* applyBeforeValidation */ js.UndefOr[Boolean], 
    T
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globalMiddlewareFactory")(globalMiddleware.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* callback */ MiddlewareCallback | js.Array[MiddlewareCallback], 
    /* applyBeforeValidation */ js.UndefOr[Boolean], 
    T
  ]]
  
  @js.native
  trait Middleware extends MiddlewareCallback {
    
    var applyBeforeValidation: Boolean = js.native
  }
  
  type MiddlewareCallback = js.Function2[
    /* argv */ Arguments, 
    /* yargs */ YargsInstance, 
    PartialArguments | js.Promise[PartialArguments]
  ]
}
