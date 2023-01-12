package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceRelativeName extends StObject {
  
  var forceRelative: Boolean
  
  var name: String | js.Array[String]
}
object ForceRelativeName {
  
  inline def apply(forceRelative: Boolean, name: String | js.Array[String]): ForceRelativeName = {
    val __obj = js.Dynamic.literal(forceRelative = forceRelative.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceRelativeName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForceRelativeName] (val x: Self) extends AnyVal {
    
    inline def setForceRelative(value: Boolean): Self = StObject.set(x, "forceRelative", value.asInstanceOf[js.Any])
    
    inline def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
