package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The updated labeling from the input document, accounting for the submitted feedback. */
@js.native
trait UpdatedLabelsOut extends StObject {
  
  /** List of functional categories into which the element falls; in other words, the subject matter of the element. */
  var categories: js.UndefOr[js.Array[Category]] = js.native
  
  /** The type of modification the feedback entry in the `updated_labels` array. Possible values are `added`, `not_changed`, and `removed`. */
  var modification: js.UndefOr[String] = js.native
  
  /** Description of the action specified by the element and whom it affects. */
  var types: js.UndefOr[js.Array[TypeLabel]] = js.native
}
object UpdatedLabelsOut {
  
  @scala.inline
  def apply(): UpdatedLabelsOut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatedLabelsOut]
  }
  
  @scala.inline
  implicit class UpdatedLabelsOutMutableBuilder[Self <: UpdatedLabelsOut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[Category]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: Category*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setModification(value: String): Self = StObject.set(x, "modification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModificationUndefined: Self = StObject.set(x, "modification", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[TypeLabel]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: TypeLabel*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
