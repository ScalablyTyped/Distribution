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
  
  @scala.inline
  def apply(): CategoryComparison = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryComparison]
  }
  
  @scala.inline
  implicit class CategoryComparisonMutableBuilder[Self <: CategoryComparison] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
