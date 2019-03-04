package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceQualifier extends js.Object {
  var isDefault: scala.Boolean
  var isMatch: scala.Boolean
  var qualifierName: java.lang.String
  var qualifierValue: java.lang.String
  var score: scala.Double
}

object IResourceQualifier {
  @scala.inline
  def apply(
    isDefault: scala.Boolean,
    isMatch: scala.Boolean,
    qualifierName: java.lang.String,
    qualifierValue: java.lang.String,
    score: scala.Double
  ): IResourceQualifier = {
    val __obj = js.Dynamic.literal(isDefault = isDefault, isMatch = isMatch, qualifierName = qualifierName, qualifierValue = qualifierValue, score = score)
  
    __obj.asInstanceOf[IResourceQualifier]
  }
}

