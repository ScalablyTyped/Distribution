package typings.svelte.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lastindex extends StObject {
  
  /**
    * The index of the last claimed element
    */
  var last_index: Double
  
  /**
    * The total number of elements claimed
    */
  var total_claimed: Double
}
object Lastindex {
  
  inline def apply(last_index: Double, total_claimed: Double): Lastindex = {
    val __obj = js.Dynamic.literal(last_index = last_index.asInstanceOf[js.Any], total_claimed = total_claimed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastindex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lastindex] (val x: Self) extends AnyVal {
    
    inline def setLast_index(value: Double): Self = StObject.set(x, "last_index", value.asInstanceOf[js.Any])
    
    inline def setTotal_claimed(value: Double): Self = StObject.set(x, "total_claimed", value.asInstanceOf[js.Any])
  }
}
