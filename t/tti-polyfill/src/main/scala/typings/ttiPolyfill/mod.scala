package typings.ttiPolyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tti-polyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFirstConsistentlyInteractive(): js.Promise[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstConsistentlyInteractive")().asInstanceOf[js.Promise[Double | Null]]
  inline def getFirstConsistentlyInteractive(opts: GetFirstConsistentlyInteractiveOpts): js.Promise[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstConsistentlyInteractive")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double | Null]]
  
  trait GetFirstConsistentlyInteractiveOpts extends StObject {
    
    /**
      * The lower bound to start forward-searching for the quite window. If no value is set, the default is after the
      * DOMContentLoaded event.
      */
    var minValue: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * When true (the default), a mutation observer is used to detect when added
      * DOM elements will create additional network requests. This can be
      * disabled to improve performance in cases where you know no additional
      * request-creating DOM elements will be added.
      */
    var useMutationObserver: js.UndefOr[Boolean] = js.undefined
  }
  object GetFirstConsistentlyInteractiveOpts {
    
    inline def apply(): GetFirstConsistentlyInteractiveOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetFirstConsistentlyInteractiveOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetFirstConsistentlyInteractiveOpts] (val x: Self) extends AnyVal {
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueNull: Self = StObject.set(x, "minValue", null)
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setUseMutationObserver(value: Boolean): Self = StObject.set(x, "useMutationObserver", value.asInstanceOf[js.Any])
      
      inline def setUseMutationObserverUndefined: Self = StObject.set(x, "useMutationObserver", js.undefined)
    }
  }
}
