package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class and confidence. */
@js.native
trait ClassifiedClass extends js.Object {
  /** Class label. */
  var class_name: js.UndefOr[String] = js.native
  /** A decimal percentage that represents the confidence that Watson has in this class. Higher values represent higher confidences. */
  var confidence: js.UndefOr[Double] = js.native
}

object ClassifiedClass {
  @scala.inline
  def apply(): ClassifiedClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifiedClass]
  }
  @scala.inline
  implicit class ClassifiedClassOps[Self <: ClassifiedClass] (val x: Self) extends AnyVal {
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
    def setClass_name(value: String): Self = this.set("class_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass_name: Self = this.set("class_name", js.undefined)
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
  }
  
}

