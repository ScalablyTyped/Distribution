package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides formatting information for a stack frame. */
trait StackFrameFormat
  extends StObject
     with ValueFormat {
  
  /** Includes all stack frames, including those the debug adapter might otherwise hide. */
  var includeAll: js.UndefOr[Boolean] = js.undefined
  
  /** Displays the line number of the stack frame. */
  var line: js.UndefOr[Boolean] = js.undefined
  
  /** Displays the module of the stack frame. */
  var module: js.UndefOr[Boolean] = js.undefined
  
  /** Displays the names of parameters for the stack frame. */
  var parameterNames: js.UndefOr[Boolean] = js.undefined
  
  /** Displays the types of parameters for the stack frame. */
  var parameterTypes: js.UndefOr[Boolean] = js.undefined
  
  /** Displays the values of parameters for the stack frame. */
  var parameterValues: js.UndefOr[Boolean] = js.undefined
  
  /** Displays parameters for the stack frame. */
  var parameters: js.UndefOr[Boolean] = js.undefined
}
object StackFrameFormat {
  
  inline def apply(): StackFrameFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackFrameFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackFrameFormat] (val x: Self) extends AnyVal {
    
    inline def setIncludeAll(value: Boolean): Self = StObject.set(x, "includeAll", value.asInstanceOf[js.Any])
    
    inline def setIncludeAllUndefined: Self = StObject.set(x, "includeAll", js.undefined)
    
    inline def setLine(value: Boolean): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setParameterNames(value: Boolean): Self = StObject.set(x, "parameterNames", value.asInstanceOf[js.Any])
    
    inline def setParameterNamesUndefined: Self = StObject.set(x, "parameterNames", js.undefined)
    
    inline def setParameterTypes(value: Boolean): Self = StObject.set(x, "parameterTypes", value.asInstanceOf[js.Any])
    
    inline def setParameterTypesUndefined: Self = StObject.set(x, "parameterTypes", js.undefined)
    
    inline def setParameterValues(value: Boolean): Self = StObject.set(x, "parameterValues", value.asInstanceOf[js.Any])
    
    inline def setParameterValuesUndefined: Self = StObject.set(x, "parameterValues", js.undefined)
    
    inline def setParameters(value: Boolean): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
