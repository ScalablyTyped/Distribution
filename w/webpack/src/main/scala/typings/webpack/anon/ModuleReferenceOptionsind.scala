package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined webpack.webpack.ModuleReferenceOptions & {  index :number} */
trait ModuleReferenceOptionsind extends StObject {
  
  /**
  	 * if the position is ASI safe or unknown
  	 */
  var asiSafe: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * true, when this referenced export is called
  	 */
  var call: Boolean
  
  /**
  	 * true, when this referenced export is directly imported (not via property access)
  	 */
  var directImport: Boolean
  
  /**
  	 * the properties/exports of the module
  	 */
  var ids: js.Array[String]
  
  var index: Double
}
object ModuleReferenceOptionsind {
  
  inline def apply(call: Boolean, directImport: Boolean, ids: js.Array[String], index: Double): ModuleReferenceOptionsind = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], directImport = directImport.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleReferenceOptionsind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleReferenceOptionsind] (val x: Self) extends AnyVal {
    
    inline def setAsiSafe(value: Boolean): Self = StObject.set(x, "asiSafe", value.asInstanceOf[js.Any])
    
    inline def setAsiSafeUndefined: Self = StObject.set(x, "asiSafe", js.undefined)
    
    inline def setCall(value: Boolean): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    
    inline def setDirectImport(value: Boolean): Self = StObject.set(x, "directImport", value.asInstanceOf[js.Any])
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
