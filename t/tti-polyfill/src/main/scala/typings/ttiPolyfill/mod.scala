package typings.ttiPolyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tti-polyfill", "getFirstConsistentlyInteractive")
  @js.native
  def getFirstConsistentlyInteractive(): js.Promise[Double | Null] = js.native
  @JSImport("tti-polyfill", "getFirstConsistentlyInteractive")
  @js.native
  def getFirstConsistentlyInteractive(opts: GetFirstConsistentlyInteractiveOpts): js.Promise[Double | Null] = js.native
  
  @js.native
  trait GetFirstConsistentlyInteractiveOpts extends StObject {
    
    /**
      * The lower bound to start forward-searching for the quite window. If no value is set, the default is after the
      * DOMContentLoaded event.
      */
    var minValue: js.UndefOr[Double | Null] = js.native
    
    /**
      * When true (the default), a mutation observer is used to detect when added
      * DOM elements will create additional network requests. This can be
      * disabled to improve performance in cases where you know no additional
      * request-creating DOM elements will be added.
      */
    var useMutationObserver: js.UndefOr[Boolean] = js.native
  }
  object GetFirstConsistentlyInteractiveOpts {
    
    @scala.inline
    def apply(): GetFirstConsistentlyInteractiveOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetFirstConsistentlyInteractiveOpts]
    }
    
    @scala.inline
    implicit class GetFirstConsistentlyInteractiveOptsMutableBuilder[Self <: GetFirstConsistentlyInteractiveOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueNull: Self = StObject.set(x, "minValue", null)
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      @scala.inline
      def setUseMutationObserver(value: Boolean): Self = StObject.set(x, "useMutationObserver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseMutationObserverUndefined: Self = StObject.set(x, "useMutationObserver", js.undefined)
    }
  }
}
