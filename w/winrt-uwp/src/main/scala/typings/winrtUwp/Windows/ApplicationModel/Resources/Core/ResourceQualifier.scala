package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the qualifiers associated with a ResourceCandidate . */
trait ResourceQualifier extends js.Object {
  /** Indicates whether this qualifier should be considered as a default match when no match is found. */
  var isDefault: Boolean
  /** Indicates whether a given qualifier for a given candidate matched the context when a named resource is resolved to a candidate for some given context. */
  var isMatch: Boolean
  /** The name of the qualifier. */
  var qualifierName: String
  /** The value of the qualifier. */
  var qualifierValue: String
  /** A score that indicates how well the qualifier matched the context against which it was resolved. */
  var score: Double
}

object ResourceQualifier {
  @scala.inline
  def apply(isDefault: Boolean, isMatch: Boolean, qualifierName: String, qualifierValue: String, score: Double): ResourceQualifier = {
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQualifier]
  }
}

