package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A classifier for natural language phrases. */
@js.native
trait Classifier extends js.Object {
  /** Unique identifier for this classifier. */
  var classifier_id: String = js.native
  /** Date and time (UTC) the classifier was created. */
  var created: js.UndefOr[String] = js.native
  /** The language used for the classifier. */
  var language: js.UndefOr[String] = js.native
  /** User-supplied name for the classifier. */
  var name: js.UndefOr[String] = js.native
  /** The state of the classifier. */
  var status: js.UndefOr[String] = js.native
  /** Additional detail about the status. */
  var status_description: js.UndefOr[String] = js.native
  /** Link to the classifier. */
  var url: String = js.native
}

object Classifier {
  @scala.inline
  def apply(classifier_id: String, url: String): Classifier = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatus_description(value: String): Self = this.set("status_description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus_description: Self = this.set("status_description", js.undefined)
  }
  
}

