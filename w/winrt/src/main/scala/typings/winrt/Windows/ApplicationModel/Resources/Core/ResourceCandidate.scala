package typings.winrt.Windows.ApplicationModel.Resources.Core

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceCandidate extends IResourceCandidate

object ResourceCandidate {
  @scala.inline
  def apply(
    getQualifierValue: String => String,
    getValueAsFileAsync: () => IAsyncOperation[StorageFile],
    isDefault: Boolean,
    isMatch: Boolean,
    isMatchAsDefault: Boolean,
    qualifiers: IVectorView[ResourceQualifier],
    valueAsString: String
  ): ResourceCandidate = {
    val __obj = js.Dynamic.literal(getQualifierValue = js.Any.fromFunction1(getQualifierValue), getValueAsFileAsync = js.Any.fromFunction0(getValueAsFileAsync), isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], isMatchAsDefault = isMatchAsDefault.asInstanceOf[js.Any], qualifiers = qualifiers.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceCandidate]
  }
}

