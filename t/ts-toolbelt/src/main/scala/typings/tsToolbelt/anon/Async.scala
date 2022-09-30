package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Async extends StObject {
  
  var async: Multi
  
  var sync: typings.tsToolbelt.anon.List
}
object Async {
  
  inline def apply(async: Multi, sync: typings.tsToolbelt.anon.List): Async = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
  
  extension [Self <: Async](x: Self) {
    
    inline def setAsync(value: Multi): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setSync(value: typings.tsToolbelt.anon.List): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
  }
}
