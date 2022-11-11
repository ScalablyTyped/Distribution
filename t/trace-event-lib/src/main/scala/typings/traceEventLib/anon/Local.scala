package typings.traceEventLib.anon

import typings.traceEventLib.distSchemaEventsAsyncEventMod.AsyncID2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Local
  extends StObject
     with AsyncID2 {
  
  var local: String
}
object Local {
  
  inline def apply(local: String): Local = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[Local]
  }
  
  extension [Self <: Local](x: Self) {
    
    inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
  }
}
