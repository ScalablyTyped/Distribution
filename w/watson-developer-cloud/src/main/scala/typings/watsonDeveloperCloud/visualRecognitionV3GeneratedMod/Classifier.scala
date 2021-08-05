package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about a classifier. */
trait Classifier extends StObject {
  
  /** Classes that define a classifier. */
  var classes: js.UndefOr[js.Array[Class]] = js.undefined
  
  /** ID of a classifier identified in the image. */
  var classifier_id: String
  
  /** Whether the classifier can be downloaded as a Core ML model after the training status is `ready`. */
  var core_ml_enabled: js.UndefOr[Boolean] = js.undefined
  
  /** Date and time in Coordinated Universal Time (UTC) that the classifier was created. */
  var created: js.UndefOr[String] = js.undefined
  
  /** If classifier training has failed, this field might explain why. */
  var explanation: js.UndefOr[String] = js.undefined
  
  /** Name of the classifier. */
  var name: String
  
  /** Unique ID of the account who owns the classifier. Might not be returned by some requests. */
  var owner: js.UndefOr[String] = js.undefined
  
  /** Date and time in Coordinated Universal Time (UTC) that the classifier was updated. Might not be returned by some requests. Identical to `updated` and retained for backward compatibility. */
  var retrained: js.UndefOr[String] = js.undefined
  
  /** Training status of classifier. */
  var status: js.UndefOr[String] = js.undefined
  
  /** Date and time in Coordinated Universal Time (UTC) that the classifier was most recently updated. The field matches either `retrained` or `created`. Might not be returned by some requests. */
  var updated: js.UndefOr[String] = js.undefined
}
object Classifier {
  
  inline def apply(classifier_id: String, name: String): Classifier = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifier]
  }
  
  extension [Self <: Classifier](x: Self) {
    
    inline def setClasses(value: js.Array[Class]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: Class*): Self = StObject.set(x, "classes", js.Array(value :_*))
    
    inline def setClassifier_id(value: String): Self = StObject.set(x, "classifier_id", value.asInstanceOf[js.Any])
    
    inline def setCore_ml_enabled(value: Boolean): Self = StObject.set(x, "core_ml_enabled", value.asInstanceOf[js.Any])
    
    inline def setCore_ml_enabledUndefined: Self = StObject.set(x, "core_ml_enabled", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRetrained(value: String): Self = StObject.set(x, "retrained", value.asInstanceOf[js.Any])
    
    inline def setRetrainedUndefined: Self = StObject.set(x, "retrained", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
