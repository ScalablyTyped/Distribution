package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** Response from the classifier for a phrase. */
@js.native
trait Classification extends js.Object {
  
  /** An array of up to ten class-confidence pairs sorted in descending order of confidence. */
  var classes: js.UndefOr[js.Array[ClassifiedClass]] = js.native
  
  /** Unique identifier for this classifier. */
  var classifier_id: js.UndefOr[String] = js.native
  
  /** The submitted phrase. */
  var text: js.UndefOr[String] = js.native
  
  /** The class with the highest confidence. */
  var top_class: js.UndefOr[String] = js.native
  
  /** Link to the classifier. */
  var url: js.UndefOr[String] = js.native
}
object Classification {
  
  @scala.inline
  def apply(): Classification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classification]
  }
  
  @scala.inline
  implicit class ClassificationOps[Self <: Classification] (val x: Self) extends AnyVal {
    
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
    def setClassesVarargs(value: ClassifiedClass*): Self = this.set("classes", js.Array(value :_*))
    
    @scala.inline
    def setClasses(value: js.Array[ClassifiedClass]): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setClassifier_id(value: String): Self = this.set("classifier_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassifier_id: Self = this.set("classifier_id", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTop_class(value: String): Self = this.set("top_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop_class: Self = this.set("top_class", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
