package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceQualifier extends js.Object {
  var isDefault: Boolean
  var isMatch: Boolean
  var qualifierName: String
  var qualifierValue: String
  var score: Double
}

object IResourceQualifier {
  @scala.inline
  def apply(isDefault: Boolean, isMatch: Boolean, qualifierName: String, qualifierValue: String, score: Double): IResourceQualifier = {
    val __obj = js.Dynamic.literal(isDefault = isDefault, isMatch = isMatch, qualifierName = qualifierName, qualifierValue = qualifierValue, score = score)
  
    __obj.asInstanceOf[IResourceQualifier]
  }
}

