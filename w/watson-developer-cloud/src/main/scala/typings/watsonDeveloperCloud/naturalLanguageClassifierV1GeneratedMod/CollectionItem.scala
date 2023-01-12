package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response from the classifier for a phrase in a collection. */
trait CollectionItem extends StObject {
  
  /** An array of up to ten class-confidence pairs sorted in descending order of confidence. */
  var classes: js.UndefOr[js.Array[ClassifiedClass]] = js.undefined
  
  /** The submitted phrase. The maximum length is 2048 characters. */
  var text: js.UndefOr[String] = js.undefined
  
  /** The class with the highest confidence. */
  var top_class: js.UndefOr[String] = js.undefined
}
object CollectionItem {
  
  inline def apply(): CollectionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionItem] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: js.Array[ClassifiedClass]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: ClassifiedClass*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTop_class(value: String): Self = StObject.set(x, "top_class", value.asInstanceOf[js.Any])
    
    inline def setTop_classUndefined: Self = StObject.set(x, "top_class", js.undefined)
  }
}
