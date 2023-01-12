package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sync extends StObject {
  
  var async: ListPipeListAsync
  
  var sync: ListMulti
}
object Sync {
  
  inline def apply(async: ListPipeListAsync, sync: ListMulti): Sync = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sync] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: ListPipeListAsync): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setSync(value: ListMulti): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
  }
}
