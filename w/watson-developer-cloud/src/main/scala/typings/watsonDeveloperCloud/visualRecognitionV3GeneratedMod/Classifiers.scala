package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A container for the list of classifiers. */
@js.native
trait Classifiers extends js.Object {
  /** List of classifiers. */
  var classifiers: js.Array[Classifier] = js.native
}

object Classifiers {
  @scala.inline
  def apply(classifiers: js.Array[Classifier]): Classifiers = {
    val __obj = js.Dynamic.literal(classifiers = classifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifiers]
  }
  @scala.inline
  implicit class ClassifiersOps[Self <: Classifiers] (val x: Self) extends AnyVal {
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
    def setClassifiersVarargs(value: Classifier*): Self = this.set("classifiers", js.Array(value :_*))
    @scala.inline
    def setClassifiers(value: js.Array[Classifier]): Self = this.set("classifiers", value.asInstanceOf[js.Any])
  }
  
}

