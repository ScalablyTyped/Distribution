package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The original labeling from the input document, without the submitted feedback. */
trait OriginalLabelsIn extends StObject {
  
  /** List of functional categories into which the element falls; in other words, the subject matter of the element. */
  var categories: js.Array[Category]
  
  /** Description of the action specified by the element and whom it affects. */
  var types: js.Array[TypeLabel]
}
object OriginalLabelsIn {
  
  @scala.inline
  def apply(categories: js.Array[Category], types: js.Array[TypeLabel]): OriginalLabelsIn = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalLabelsIn]
  }
  
  @scala.inline
  implicit class OriginalLabelsInMutableBuilder[Self <: OriginalLabelsIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[Category]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: Category*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[TypeLabel]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: TypeLabel*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
