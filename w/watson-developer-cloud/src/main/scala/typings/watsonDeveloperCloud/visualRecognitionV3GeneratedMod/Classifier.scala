package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about a classifier. */
@js.native
trait Classifier extends js.Object {
  
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
  implicit class ClassifierOps[Self <: Classifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassifier_id(value: String): Self = this.set("classifier_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesVarargs(value: Class*): Self = this.set("classes", js.Array(value :_*))
    
    @scala.inline
    def setClasses(value: js.Array[Class]): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setCore_ml_enabled(value: Boolean): Self = this.set("core_ml_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCore_ml_enabled: Self = this.set("core_ml_enabled", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setExplanation(value: String): Self = this.set("explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplanation: Self = this.set("explanation", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setRetrained(value: String): Self = this.set("retrained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetrained: Self = this.set("retrained", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
}
