package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Identification of a specific type. */
trait TypeLabelComparison extends StObject {
  
  /** A pair of `nature` and `party` objects. The `nature` object identifies the effect of the element on the identified `party`, and the `party` object identifies the affected party. */
  var label: js.UndefOr[Label] = js.undefined
}
object TypeLabelComparison {
  
  inline def apply(): TypeLabelComparison = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeLabelComparison]
  }
  
  extension [Self <: TypeLabelComparison](x: Self) {
    
    inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
