package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information defining an element's subject matter. */
trait CategoryComparison extends StObject {
  
  /** The category of the associated element. */
  var label: js.UndefOr[String] = js.undefined
}
object CategoryComparison {
  
  inline def apply(): CategoryComparison = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryComparison]
  }
  
  extension [Self <: CategoryComparison](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
