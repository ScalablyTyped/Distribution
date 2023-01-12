package typings.traceEventLib.anon

import typings.traceEventLib.distSchemaEventsAsyncEventMod.AsyncID2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Global
  extends StObject
     with AsyncID2 {
  
  var global: String
}
object Global {
  
  inline def apply(global: String): Global = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[Global]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
    
    inline def setGlobal(value: String): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
  }
}
