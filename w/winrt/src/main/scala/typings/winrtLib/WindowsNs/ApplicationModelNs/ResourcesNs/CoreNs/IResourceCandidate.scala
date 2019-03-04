package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceCandidate extends js.Object {
  var isDefault: scala.Boolean
  var isMatch: scala.Boolean
  var isMatchAsDefault: scala.Boolean
  var qualifiers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ResourceQualifier]
  var valueAsString: java.lang.String
  def getQualifierValue(qualifierName: java.lang.String): java.lang.String
  def getValueAsFileAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile]
}

object IResourceCandidate {
  @scala.inline
  def apply(
    getQualifierValue: js.Function1[java.lang.String, java.lang.String],
    getValueAsFileAsync: js.Function0[
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile]
    ],
    isDefault: scala.Boolean,
    isMatch: scala.Boolean,
    isMatchAsDefault: scala.Boolean,
    qualifiers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ResourceQualifier],
    valueAsString: java.lang.String
  ): IResourceCandidate = {
    val __obj = js.Dynamic.literal(getQualifierValue = getQualifierValue, getValueAsFileAsync = getValueAsFileAsync, isDefault = isDefault, isMatch = isMatch, isMatchAsDefault = isMatchAsDefault, qualifiers = qualifiers, valueAsString = valueAsString)
  
    __obj.asInstanceOf[IResourceCandidate]
  }
}

