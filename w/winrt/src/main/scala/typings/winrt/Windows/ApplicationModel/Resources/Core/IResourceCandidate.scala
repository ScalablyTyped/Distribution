package typings.winrt.Windows.ApplicationModel.Resources.Core

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceCandidate extends js.Object {
  var isDefault: Boolean
  var isMatch: Boolean
  var isMatchAsDefault: Boolean
  var qualifiers: IVectorView[ResourceQualifier]
  var valueAsString: String
  def getQualifierValue(qualifierName: String): String
  def getValueAsFileAsync(): IAsyncOperation[StorageFile]
}

object IResourceCandidate {
  @scala.inline
  def apply(
    getQualifierValue: String => String,
    getValueAsFileAsync: () => IAsyncOperation[StorageFile],
    isDefault: Boolean,
    isMatch: Boolean,
    isMatchAsDefault: Boolean,
    qualifiers: IVectorView[ResourceQualifier],
    valueAsString: String
  ): IResourceCandidate = {
    val __obj = js.Dynamic.literal(getQualifierValue = js.Any.fromFunction1(getQualifierValue), getValueAsFileAsync = js.Any.fromFunction0(getValueAsFileAsync), isDefault = isDefault, isMatch = isMatch, isMatchAsDefault = isMatchAsDefault, qualifiers = qualifiers, valueAsString = valueAsString)
  
    __obj.asInstanceOf[IResourceCandidate]
  }
}

