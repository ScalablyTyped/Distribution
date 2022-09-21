package typings.vastClient.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackOptions extends StObject {
  
  /**
    * An optional Object of parameters(vast macros) to be used in the tracking calls.
    */
  var macros: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
    * Indicate if the event has to be tracked only once.
    * Default: false
    */
  var once: js.UndefOr[Boolean] = js.undefined
}
object TrackOptions {
  
  inline def apply(): TrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackOptions]
  }
  
  extension [Self <: TrackOptions](x: Self) {
    
    inline def setMacros(value: Record[String, Any]): Self = StObject.set(x, "macros", value.asInstanceOf[js.Any])
    
    inline def setMacrosUndefined: Self = StObject.set(x, "macros", js.undefined)
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
  }
}
