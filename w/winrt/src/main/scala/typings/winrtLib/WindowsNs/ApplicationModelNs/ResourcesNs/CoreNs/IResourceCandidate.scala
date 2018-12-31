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

