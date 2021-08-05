package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Delete model results. */
trait DeleteModelResults extends StObject {
  
  /** model_id of the deleted model. */
  var deleted: js.UndefOr[String] = js.undefined
}
object DeleteModelResults {
  
  inline def apply(): DeleteModelResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteModelResults]
  }
  
  extension [Self <: DeleteModelResults](x: Self) {
    
    inline def setDeleted(value: String): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
  }
}
