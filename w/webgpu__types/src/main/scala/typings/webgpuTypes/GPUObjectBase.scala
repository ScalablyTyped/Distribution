package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUObjectBase extends StObject {
  
  /**
    * Initially the empty string.
    * A developer-provided label which can be used by the browser, OS, or other tools to help
    * identify the underlying internal object to the developer. Examples include displaying
    * the label in error/warning messages, browser developer tools, and platform debugging
    * utilities. The user agent is free to choose if and how it will use this label.
    * Note: {@link GPUObjectBase#label} is defined as a {@link USVString} because some user agents may
    * supply it to the debug facilities of the underlying native APIs.
    */
  var label: String
}
object GPUObjectBase {
  
  inline def apply(label: String): GPUObjectBase = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUObjectBase]
  }
  
  extension [Self <: GPUObjectBase](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
