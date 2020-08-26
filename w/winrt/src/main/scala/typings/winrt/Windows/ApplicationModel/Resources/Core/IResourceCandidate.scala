package typings.winrt.Windows.ApplicationModel.Resources.Core

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceCandidate extends js.Object {
  var isDefault: Boolean = js.native
  var isMatch: Boolean = js.native
  var isMatchAsDefault: Boolean = js.native
  var qualifiers: IVectorView[ResourceQualifier] = js.native
  var valueAsString: String = js.native
  def getQualifierValue(qualifierName: String): String = js.native
  def getValueAsFileAsync(): IAsyncOperation[StorageFile] = js.native
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
    val __obj = js.Dynamic.literal(getQualifierValue = js.Any.fromFunction1(getQualifierValue), getValueAsFileAsync = js.Any.fromFunction0(getValueAsFileAsync), isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], isMatchAsDefault = isMatchAsDefault.asInstanceOf[js.Any], qualifiers = qualifiers.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceCandidate]
  }
  @scala.inline
  implicit class IResourceCandidateOps[Self <: IResourceCandidate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetQualifierValue(value: String => String): Self = this.set("getQualifierValue", js.Any.fromFunction1(value))
    @scala.inline
    def setGetValueAsFileAsync(value: () => IAsyncOperation[StorageFile]): Self = this.set("getValueAsFileAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMatch(value: Boolean): Self = this.set("isMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMatchAsDefault(value: Boolean): Self = this.set("isMatchAsDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setQualifiers(value: IVectorView[ResourceQualifier]): Self = this.set("qualifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueAsString(value: String): Self = this.set("valueAsString", value.asInstanceOf[js.Any])
  }
  
}

