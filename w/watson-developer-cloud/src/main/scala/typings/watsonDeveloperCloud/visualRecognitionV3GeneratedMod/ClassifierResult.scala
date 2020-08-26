package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Classifier and score combination. */
@js.native
trait ClassifierResult extends js.Object {
  /** Classes within the classifier. */
  var classes: js.Array[ClassResult] = js.native
  /** ID of a classifier identified in the image. */
  var classifier_id: String = js.native
  /** Name of the classifier. */
  var name: String = js.native
}

object ClassifierResult {
  @scala.inline
  def apply(classes: js.Array[ClassResult], classifier_id: String, name: String): ClassifierResult = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], classifier_id = classifier_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierResult]
  }
  @scala.inline
  implicit class ClassifierResultOps[Self <: ClassifierResult] (val x: Self) extends AnyVal {
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
    def setClassesVarargs(value: ClassResult*): Self = this.set("classes", js.Array(value :_*))
    @scala.inline
    def setClasses(value: js.Array[ClassResult]): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassifier_id(value: String): Self = this.set("classifier_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

