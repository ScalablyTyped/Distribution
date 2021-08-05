package typings.vuex

import typings.vuex.mod.Payload
import typings.vuex.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("vuex/types/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S](): Plugin[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin[S]]
  inline def default[S](option: LoggerOption[S]): Plugin[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(option.asInstanceOf[js.Any]).asInstanceOf[Plugin[S]]
  
  trait LoggerOption[S] extends StObject {
    
    var actionFilter: js.UndefOr[js.Function2[/* action */ Payload, /* state */ S, Boolean]] = js.undefined
    
    var actionTransformer: js.UndefOr[js.Function1[/* action */ Payload, js.Any]] = js.undefined
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[
        js.Function3[/* mutation */ Payload, /* stateBefore */ S, /* stateAfter */ S, Boolean]
      ] = js.undefined
    
    var logActions: js.UndefOr[Boolean] = js.undefined
    
    var logMutations: js.UndefOr[Boolean] = js.undefined
    
    var mutationTransformer: js.UndefOr[js.Function1[/* mutation */ Payload, js.Any]] = js.undefined
    
    var transformer: js.UndefOr[js.Function1[/* state */ S, js.Any]] = js.undefined
  }
  object LoggerOption {
    
    inline def apply[S](): LoggerOption[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOption[S]]
    }
    
    extension [Self <: LoggerOption[?], S](x: Self & LoggerOption[S]) {
      
      inline def setActionFilter(value: (/* action */ Payload, /* state */ S) => Boolean): Self = StObject.set(x, "actionFilter", js.Any.fromFunction2(value))
      
      inline def setActionFilterUndefined: Self = StObject.set(x, "actionFilter", js.undefined)
      
      inline def setActionTransformer(value: /* action */ Payload => js.Any): Self = StObject.set(x, "actionTransformer", js.Any.fromFunction1(value))
      
      inline def setActionTransformerUndefined: Self = StObject.set(x, "actionTransformer", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setFilter(value: (/* mutation */ Payload, /* stateBefore */ S, /* stateAfter */ S) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLogActions(value: Boolean): Self = StObject.set(x, "logActions", value.asInstanceOf[js.Any])
      
      inline def setLogActionsUndefined: Self = StObject.set(x, "logActions", js.undefined)
      
      inline def setLogMutations(value: Boolean): Self = StObject.set(x, "logMutations", value.asInstanceOf[js.Any])
      
      inline def setLogMutationsUndefined: Self = StObject.set(x, "logMutations", js.undefined)
      
      inline def setMutationTransformer(value: /* mutation */ Payload => js.Any): Self = StObject.set(x, "mutationTransformer", js.Any.fromFunction1(value))
      
      inline def setMutationTransformerUndefined: Self = StObject.set(x, "mutationTransformer", js.undefined)
      
      inline def setTransformer(value: /* state */ S => js.Any): Self = StObject.set(x, "transformer", js.Any.fromFunction1(value))
      
      inline def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
    }
  }
}
