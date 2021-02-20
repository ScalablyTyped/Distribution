package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about a classifier. */
@js.native
trait Classifier extends StObject {
  
  /** Classes that define a classifier. */
  var classes: js.UndefOr[js.Array[Class]] = js.native
  
  /** ID of a classifier identified in the image. */
  var classifier_id: String = js.native
  
  /** Whether the classifier can be downloaded as a Core ML model after the training status is `ready`. */
  var core_ml_enabled: js.UndefOr[Boolean] = js.native
  
  /** Date and time in Coordinated Universal Time (UTC) that the classifier was created. */
  var created: js.UndefOr[String] = js.native
  
  /** If classifier training has failed, this field might explain why. */
  var explanation: js.UndefOr[String] = js.native
  
  /** Name of the classifier. */
  var name: String = js.native
  
  /** Unique ID of the account who owns the classifier. Might not be returned by some requests. */
  var owner: js.UndefOr[String] = js.native
  
  /** Date and time in Coordinated Universal Time (UTC) that the classifier was updated. Might not be returned by some requests. Identical to `updated` and retained for backward compatibility. */
  var retrained: js.UndefOr[String] = js.native
  
  /** Training status of classifier. */
  var status: js.UndefOr[String] = js.native
  
  /** Date and time in Coordinated Universal Time (UTC) that the classifier was most recently updated. The field matches either `retrained` or `created`. Might not be returned by some requests. */
  var updated: js.UndefOr[String] = js.native
}
object Classifier {
  
  @scala.inline
  def apply(classifier_id: String, name: String): Classifier = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifier]
  }
  
  @scala.inline
  implicit class ClassifierMutableBuilder[Self <: Classifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.Array[Class]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setClassesVarargs(value: Class*): Self = StObject.set(x, "classes", js.Array(value :_*))
    
    @scala.inline
    def setClassifier_id(value: String): Self = StObject.set(x, "classifier_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCore_ml_enabled(value: Boolean): Self = StObject.set(x, "core_ml_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCore_ml_enabledUndefined: Self = StObject.set(x, "core_ml_enabled", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRetrained(value: String): Self = StObject.set(x, "retrained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrainedUndefined: Self = StObject.set(x, "retrained", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
