package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceRelative extends StObject {
  
  var forceRelative: Boolean
  
  var name: js.Array[String]
}
object ForceRelative {
  
  inline def apply(forceRelative: Boolean, name: js.Array[String]): ForceRelative = {
    val __obj = js.Dynamic.literal(forceRelative = forceRelative.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceRelative]
  }
  
  extension [Self <: ForceRelative](x: Self) {
    
    inline def setForceRelative(value: Boolean): Self = StObject.set(x, "forceRelative", value.asInstanceOf[js.Any])
    
    inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
