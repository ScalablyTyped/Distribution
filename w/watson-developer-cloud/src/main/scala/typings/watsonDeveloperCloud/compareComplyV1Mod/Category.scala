package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information defining an element's subject matter. */
trait Category extends StObject {
  
  /** The category of the associated element. */
  var label: js.UndefOr[String] = js.undefined
  
  /** One or more hashed values that you can send to IBM to provide feedback or receive support. */
  var provenance_ids: js.UndefOr[js.Array[String]] = js.undefined
}
object Category {
  
  inline def apply(): Category = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Category]
  }
  
  extension [Self <: Category](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setProvenance_ids(value: js.Array[String]): Self = StObject.set(x, "provenance_ids", value.asInstanceOf[js.Any])
    
    inline def setProvenance_idsUndefined: Self = StObject.set(x, "provenance_ids", js.undefined)
    
    inline def setProvenance_idsVarargs(value: String*): Self = StObject.set(x, "provenance_ids", js.Array(value*))
  }
}
