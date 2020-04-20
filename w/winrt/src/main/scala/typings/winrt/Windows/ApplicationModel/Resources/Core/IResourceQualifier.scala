package typings.winrt.Windows.ApplicationModel.Resources.Core

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
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceQualifier]
  }
}

