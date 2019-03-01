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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefault")(isDefault)
    __obj.updateDynamic("isMatch")(isMatch)
    __obj.updateDynamic("qualifierName")(qualifierName)
    __obj.updateDynamic("qualifierValue")(qualifierValue)
    __obj.updateDynamic("score")(score)
    __obj.asInstanceOf[IResourceQualifier]
  }
}

