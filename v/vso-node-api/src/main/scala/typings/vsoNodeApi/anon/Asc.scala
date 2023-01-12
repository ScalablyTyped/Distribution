package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asc extends StObject {
  
  var asc: scala.Double
  
  var desc: scala.Double
}
object Asc {
  
  inline def apply(asc: scala.Double, desc: scala.Double): Asc = {
    val __obj = js.Dynamic.literal(asc = asc.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Asc] (val x: Self) extends AnyVal {
    
    inline def setAsc(value: scala.Double): Self = StObject.set(x, "asc", value.asInstanceOf[js.Any])
    
    inline def setDesc(value: scala.Double): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
  }
}
