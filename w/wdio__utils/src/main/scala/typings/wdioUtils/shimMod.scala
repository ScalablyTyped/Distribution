package typings.wdioUtils

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimMod {
  
  @JSImport("@wdio/utils/build/shim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def executeAsync(fn: js.Function, retries: Retries): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAsync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def executeAsync(fn: js.Function, retries: Retries, args: js.Array[js.Any]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAsync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @JSImport("@wdio/utils/build/shim", "executeHooksWithArgs")
  @js.native
  def executeHooksWithArgs: js.Function2[
    /* hooks */ js.UndefOr[js.Function | js.Array[js.Function]], 
    /* args */ js.UndefOr[js.Any | js.Array[js.Any]], 
    js.Promise[js.Array[Error | js.Any]]
  ] = js.native
  @scala.inline
  def executeHooksWithArgs_=(
    x: js.Function2[
      /* hooks */ js.UndefOr[js.Function | js.Array[js.Function]], 
      /* args */ js.UndefOr[js.Any | js.Array[js.Any]], 
      js.Promise[js.Array[Error | js.Any]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("executeHooksWithArgs")(x.asInstanceOf[js.Any])
  
  /* was `typeof executeSyncFn` */
  @scala.inline
  def executeSync(fn: js.Function, retries: Retries): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def executeSync(fn: js.Function, retries: Retries, args: js.Array[js.Any]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @JSImport("@wdio/utils/build/shim", "hasWdioSyncSupport")
  @js.native
  def hasWdioSyncSupport: Boolean = js.native
  @scala.inline
  def hasWdioSyncSupport_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasWdioSyncSupport")(x.asInstanceOf[js.Any])
  
  @JSImport("@wdio/utils/build/shim", "runFnInFiberContext")
  @js.native
  def runFnInFiberContext: js.Function1[
    /* fn */ js.Function, 
    js.ThisFunction1[/* this */ js.Any, /* repeated */ js.Any, js.Promise[js.Any]]
  ] = js.native
  @scala.inline
  def runFnInFiberContext_=(
    x: js.Function1[
      /* fn */ js.Function, 
      js.ThisFunction1[/* this */ js.Any, /* repeated */ js.Any, js.Promise[js.Any]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runFnInFiberContext")(x.asInstanceOf[js.Any])
  
  @JSImport("@wdio/utils/build/shim", "runSync")
  @js.native
  def runSync: js.ThisFunction3[
    /* this */ js.Any, 
    /* fn */ js.Function, 
    /* repeatTest */ js.Any, 
    /* args */ js.Array[js.Any], 
    js.Function2[/* resolve */ js.Function, /* reject */ js.Function, js.Any]
  ] = js.native
  @scala.inline
  def runSync_=(
    x: js.ThisFunction3[
      /* this */ js.Any, 
      /* fn */ js.Function, 
      /* repeatTest */ js.Any, 
      /* args */ js.Array[js.Any], 
      js.Function2[/* resolve */ js.Function, /* reject */ js.Function, js.Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runSync")(x.asInstanceOf[js.Any])
  
  @JSImport("@wdio/utils/build/shim", "wrapCommand")
  @js.native
  def wrapCommand: js.Function2[
    /* commandName */ String, 
    /* fn */ js.Function, 
    js.Function1[/* args */ js.Any, js.Promise[js.Any]]
  ] = js.native
  @scala.inline
  def wrapCommand_=(
    x: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function, 
      js.Function1[/* args */ js.Any, js.Promise[js.Any]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapCommand")(x.asInstanceOf[js.Any])
  
  trait Retries extends StObject {
    
    var attempts: Double
    
    var limit: Double
  }
  object Retries {
    
    @scala.inline
    def apply(attempts: Double, limit: Double): Retries = {
      val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Retries]
    }
    
    @scala.inline
    implicit class RetriesMutableBuilder[Self <: Retries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    }
  }
}
