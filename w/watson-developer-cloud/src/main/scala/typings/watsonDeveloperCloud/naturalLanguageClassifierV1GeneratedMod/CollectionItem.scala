package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response from the classifier for a phrase in a collection. */
@js.native
trait CollectionItem extends StObject {
  
  /** An array of up to ten class-confidence pairs sorted in descending order of confidence. */
  var classes: js.UndefOr[js.Array[ClassifiedClass]] = js.native
  
  /** The submitted phrase. The maximum length is 2048 characters. */
  var text: js.UndefOr[String] = js.native
  
  /** The class with the highest confidence. */
  var top_class: js.UndefOr[String] = js.native
}
object CollectionItem {
  
  @scala.inline
  def apply(): CollectionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionItem]
  }
  
  @scala.inline
  implicit class CollectionItemMutableBuilder[Self <: CollectionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.Array[ClassifiedClass]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setClassesVarargs(value: ClassifiedClass*): Self = StObject.set(x, "classes", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTop_class(value: String): Self = StObject.set(x, "top_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_classUndefined: Self = StObject.set(x, "top_class", js.undefined)
  }
}
