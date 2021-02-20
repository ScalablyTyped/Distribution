package typings.vuex

import typings.vuex.mod.Payload
import typings.vuex.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("vuex/types/logger", JSImport.Default)
  @js.native
  def default[S](): Plugin[S] = js.native
  @JSImport("vuex/types/logger", JSImport.Default)
  @js.native
  def default[S](option: LoggerOption[S]): Plugin[S] = js.native
  
  @js.native
  trait LoggerOption[S] extends StObject {
    
    var actionFilter: js.UndefOr[js.Function2[/* action */ Payload, /* state */ S, Boolean]] = js.native
    
    var actionTransformer: js.UndefOr[js.Function1[/* action */ Payload, _]] = js.native
    
    var collapsed: js.UndefOr[Boolean] = js.native
    
    var filter: js.UndefOr[
        js.Function3[/* mutation */ Payload, /* stateBefore */ S, /* stateAfter */ S, Boolean]
      ] = js.native
    
    var logActions: js.UndefOr[Boolean] = js.native
    
    var logMutations: js.UndefOr[Boolean] = js.native
    
    var mutationTransformer: js.UndefOr[js.Function1[/* mutation */ Payload, _]] = js.native
    
    var transformer: js.UndefOr[js.Function1[/* state */ S, _]] = js.native
  }
  object LoggerOption {
    
    @scala.inline
    def apply[S](): LoggerOption[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOption[S]]
    }
    
    @scala.inline
    implicit class LoggerOptionMutableBuilder[Self <: LoggerOption[_], S] (val x: Self with LoggerOption[S]) extends AnyVal {
      
      @scala.inline
      def setActionFilter(value: (/* action */ Payload, /* state */ S) => Boolean): Self = StObject.set(x, "actionFilter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setActionFilterUndefined: Self = StObject.set(x, "actionFilter", js.undefined)
      
      @scala.inline
      def setActionTransformer(value: /* action */ Payload => _): Self = StObject.set(x, "actionTransformer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionTransformerUndefined: Self = StObject.set(x, "actionTransformer", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setFilter(value: (/* mutation */ Payload, /* stateBefore */ S, /* stateAfter */ S) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setLogActions(value: Boolean): Self = StObject.set(x, "logActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogActionsUndefined: Self = StObject.set(x, "logActions", js.undefined)
      
      @scala.inline
      def setLogMutations(value: Boolean): Self = StObject.set(x, "logMutations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogMutationsUndefined: Self = StObject.set(x, "logMutations", js.undefined)
      
      @scala.inline
      def setMutationTransformer(value: /* mutation */ Payload => _): Self = StObject.set(x, "mutationTransformer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMutationTransformerUndefined: Self = StObject.set(x, "mutationTransformer", js.undefined)
      
      @scala.inline
      def setTransformer(value: /* state */ S => _): Self = StObject.set(x, "transformer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
    }
  }
}
