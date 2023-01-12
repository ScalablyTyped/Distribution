package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferencedExport extends StObject {
  
  /**
  	 * when false, referenced export can not be mangled, defaults to true
  	 */
  var canMangle: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * name of the referenced export
  	 */
  var name: js.Array[String]
}
object ReferencedExport {
  
  inline def apply(name: js.Array[String]): ReferencedExport = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferencedExport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferencedExport] (val x: Self) extends AnyVal {
    
    inline def setCanMangle(value: Boolean): Self = StObject.set(x, "canMangle", value.asInstanceOf[js.Any])
    
    inline def setCanMangleUndefined: Self = StObject.set(x, "canMangle", js.undefined)
    
    inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
