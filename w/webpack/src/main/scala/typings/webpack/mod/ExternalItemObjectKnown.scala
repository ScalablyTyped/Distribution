package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If an dependency matches exactly a property of the object, the property value is used as dependency.
  */
trait ExternalItemObjectKnown extends StObject {
  
  /**
  	 * Specify externals depending on the layer.
  	 */
  var byLayer: js.UndefOr[
    StringDictionary[ExternalItem] | (js.Function1[/* layer */ Null | String, ExternalItem])
  ] = js.undefined
}
object ExternalItemObjectKnown {
  
  inline def apply(): ExternalItemObjectKnown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalItemObjectKnown]
  }
  
  extension [Self <: ExternalItemObjectKnown](x: Self) {
    
    inline def setByLayer(value: StringDictionary[ExternalItem] | (js.Function1[/* layer */ Null | String, ExternalItem])): Self = StObject.set(x, "byLayer", value.asInstanceOf[js.Any])
    
    inline def setByLayerFunction1(value: /* layer */ Null | String => ExternalItem): Self = StObject.set(x, "byLayer", js.Any.fromFunction1(value))
    
    inline def setByLayerUndefined: Self = StObject.set(x, "byLayer", js.undefined)
  }
}
