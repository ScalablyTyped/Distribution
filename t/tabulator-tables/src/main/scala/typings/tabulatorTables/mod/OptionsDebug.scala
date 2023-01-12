package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsDebug extends StObject {
  
  /** Disable deprecation warnings */
  var debugDeprecation: js.UndefOr[Boolean] = js.undefined
  
  /** The debugEventsExternal option will create a console log for every external event that is fired so you can gain an understanding of which events you should be binding to. */
  var debugEventsExternal: js.UndefOr[Boolean] = js.undefined
  
  /** The debugEventsInternal option will create a console log for every internal event that is fired so you can gain an understanding of which events you should be subscribing to in your modules. */
  var debugEventsInternal: js.UndefOr[Boolean] = js.undefined
  
  /** Enabled by default this will provide a console warning if you try and call a function on the table before it has been initialized. */
  var debugInitialization: js.UndefOr[Boolean] = js.undefined
  
  /** Disable component function warnings */
  var debugInvalidComponentFunc: js.UndefOr[Boolean] = js.undefined
  
  /** Enabled by default this will provide a console warning if you are trying to set an option on the table that does not exist. With the new optional modular structure this is particularly valuable as it will prompt you if you are trying to use an option for a module that has not been installed */
  var debugInvalidOptions: js.UndefOr[Boolean] = js.undefined
  
  var invalidOptionWarning: js.UndefOr[Boolean] = js.undefined
}
object OptionsDebug {
  
  inline def apply(): OptionsDebug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsDebug]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsDebug] (val x: Self) extends AnyVal {
    
    inline def setDebugDeprecation(value: Boolean): Self = StObject.set(x, "debugDeprecation", value.asInstanceOf[js.Any])
    
    inline def setDebugDeprecationUndefined: Self = StObject.set(x, "debugDeprecation", js.undefined)
    
    inline def setDebugEventsExternal(value: Boolean): Self = StObject.set(x, "debugEventsExternal", value.asInstanceOf[js.Any])
    
    inline def setDebugEventsExternalUndefined: Self = StObject.set(x, "debugEventsExternal", js.undefined)
    
    inline def setDebugEventsInternal(value: Boolean): Self = StObject.set(x, "debugEventsInternal", value.asInstanceOf[js.Any])
    
    inline def setDebugEventsInternalUndefined: Self = StObject.set(x, "debugEventsInternal", js.undefined)
    
    inline def setDebugInitialization(value: Boolean): Self = StObject.set(x, "debugInitialization", value.asInstanceOf[js.Any])
    
    inline def setDebugInitializationUndefined: Self = StObject.set(x, "debugInitialization", js.undefined)
    
    inline def setDebugInvalidComponentFunc(value: Boolean): Self = StObject.set(x, "debugInvalidComponentFunc", value.asInstanceOf[js.Any])
    
    inline def setDebugInvalidComponentFuncUndefined: Self = StObject.set(x, "debugInvalidComponentFunc", js.undefined)
    
    inline def setDebugInvalidOptions(value: Boolean): Self = StObject.set(x, "debugInvalidOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugInvalidOptionsUndefined: Self = StObject.set(x, "debugInvalidOptions", js.undefined)
    
    inline def setInvalidOptionWarning(value: Boolean): Self = StObject.set(x, "invalidOptionWarning", value.asInstanceOf[js.Any])
    
    inline def setInvalidOptionWarningUndefined: Self = StObject.set(x, "invalidOptionWarning", js.undefined)
  }
}
