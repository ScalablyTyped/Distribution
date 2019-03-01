package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndexedResourceQualifier extends js.Object {
  var qualifierName: java.lang.String
  var qualifierValue: java.lang.String
}

object IIndexedResourceQualifier {
  @scala.inline
  def apply(qualifierName: java.lang.String, qualifierValue: java.lang.String): IIndexedResourceQualifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qualifierName")(qualifierName)
    __obj.updateDynamic("qualifierValue")(qualifierValue)
    __obj.asInstanceOf[IIndexedResourceQualifier]
  }
}

