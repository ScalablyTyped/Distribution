package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Identification of a specific type. */
@js.native
trait TypeLabelComparison extends StObject {
  
  /** A pair of `nature` and `party` objects. The `nature` object identifies the effect of the element on the identified `party`, and the `party` object identifies the affected party. */
  var label: js.UndefOr[Label] = js.native
}
object TypeLabelComparison {
  
  @scala.inline
  def apply(): TypeLabelComparison = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeLabelComparison]
  }
  
  @scala.inline
  implicit class TypeLabelComparisonMutableBuilder[Self <: TypeLabelComparison] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
