package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A container for the list of classifiers. */
trait Classifiers extends js.Object {
  /** List of classifiers. */
  var classifiers: js.Array[Classifier]
}

object Classifiers {
  @scala.inline
  def apply(classifiers: js.Array[Classifier]): Classifiers = {
    val __obj = js.Dynamic.literal(classifiers = classifiers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Classifiers]
  }
}

