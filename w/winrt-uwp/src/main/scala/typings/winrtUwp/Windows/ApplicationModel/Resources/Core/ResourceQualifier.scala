package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the qualifiers associated with a ResourceCandidate . */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifier")
@js.native
abstract class ResourceQualifier () extends js.Object {
  /** Indicates whether this qualifier should be considered as a default match when no match is found. */
  var isDefault: Boolean = js.native
  /** Indicates whether a given qualifier for a given candidate matched the context when a named resource is resolved to a candidate for some given context. */
  var isMatch: Boolean = js.native
  /** The name of the qualifier. */
  var qualifierName: String = js.native
  /** The value of the qualifier. */
  var qualifierValue: String = js.native
  /** A score that indicates how well the qualifier matched the context against which it was resolved. */
  var score: Double = js.native
}

