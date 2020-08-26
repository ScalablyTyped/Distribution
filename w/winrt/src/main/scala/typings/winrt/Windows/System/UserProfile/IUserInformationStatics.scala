package typings.winrt.Windows.System.UserProfile

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserInformationStatics extends js.Object {
  var accountPictureChangeEnabled: Boolean = js.native
  var nameAccessAllowed: Boolean = js.native
  var onaccountpicturechanged: js.Any = js.native
  def getAccountPicture(kind: AccountPictureKind): IStorageFile = js.native
  def getDisplayNameAsync(): IAsyncOperation[String] = js.native
  def getDomainNameAsync(): IAsyncOperation[String] = js.native
  def getFirstNameAsync(): IAsyncOperation[String] = js.native
  def getLastNameAsync(): IAsyncOperation[String] = js.native
  def getPrincipalNameAsync(): IAsyncOperation[String] = js.native
  def getSessionInitiationProtocolUriAsync(): IAsyncOperation[Uri] = js.native
  def setAccountPictureAsync(image: IStorageFile): IAsyncOperation[SetAccountPictureResult] = js.native
  def setAccountPictureFromStreamAsync(image: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult] = js.native
  def setAccountPicturesAsync(smallImage: IStorageFile, largeImage: IStorageFile, video: IStorageFile): IAsyncOperation[SetAccountPictureResult] = js.native
  def setAccountPicturesFromStreamsAsync(smallImage: IRandomAccessStream, largeImage: IRandomAccessStream, video: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult] = js.native
}

object IUserInformationStatics {
  @scala.inline
  def apply(
    accountPictureChangeEnabled: Boolean,
    getAccountPicture: AccountPictureKind => IStorageFile,
    getDisplayNameAsync: () => IAsyncOperation[String],
    getDomainNameAsync: () => IAsyncOperation[String],
    getFirstNameAsync: () => IAsyncOperation[String],
    getLastNameAsync: () => IAsyncOperation[String],
    getPrincipalNameAsync: () => IAsyncOperation[String],
    getSessionInitiationProtocolUriAsync: () => IAsyncOperation[Uri],
    nameAccessAllowed: Boolean,
    onaccountpicturechanged: js.Any,
    setAccountPictureAsync: IStorageFile => IAsyncOperation[SetAccountPictureResult],
    setAccountPictureFromStreamAsync: IRandomAccessStream => IAsyncOperation[SetAccountPictureResult],
    setAccountPicturesAsync: (IStorageFile, IStorageFile, IStorageFile) => IAsyncOperation[SetAccountPictureResult],
    setAccountPicturesFromStreamsAsync: (IRandomAccessStream, IRandomAccessStream, IRandomAccessStream) => IAsyncOperation[SetAccountPictureResult]
  ): IUserInformationStatics = {
    val __obj = js.Dynamic.literal(accountPictureChangeEnabled = accountPictureChangeEnabled.asInstanceOf[js.Any], getAccountPicture = js.Any.fromFunction1(getAccountPicture), getDisplayNameAsync = js.Any.fromFunction0(getDisplayNameAsync), getDomainNameAsync = js.Any.fromFunction0(getDomainNameAsync), getFirstNameAsync = js.Any.fromFunction0(getFirstNameAsync), getLastNameAsync = js.Any.fromFunction0(getLastNameAsync), getPrincipalNameAsync = js.Any.fromFunction0(getPrincipalNameAsync), getSessionInitiationProtocolUriAsync = js.Any.fromFunction0(getSessionInitiationProtocolUriAsync), nameAccessAllowed = nameAccessAllowed.asInstanceOf[js.Any], onaccountpicturechanged = onaccountpicturechanged.asInstanceOf[js.Any], setAccountPictureAsync = js.Any.fromFunction1(setAccountPictureAsync), setAccountPictureFromStreamAsync = js.Any.fromFunction1(setAccountPictureFromStreamAsync), setAccountPicturesAsync = js.Any.fromFunction3(setAccountPicturesAsync), setAccountPicturesFromStreamsAsync = js.Any.fromFunction3(setAccountPicturesFromStreamsAsync))
    __obj.asInstanceOf[IUserInformationStatics]
  }
  @scala.inline
  implicit class IUserInformationStaticsOps[Self <: IUserInformationStatics] (val x: Self) extends AnyVal {
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
    def setAccountPictureChangeEnabled(value: Boolean): Self = this.set("accountPictureChangeEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAccountPicture(value: AccountPictureKind => IStorageFile): Self = this.set("getAccountPicture", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDisplayNameAsync(value: () => IAsyncOperation[String]): Self = this.set("getDisplayNameAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDomainNameAsync(value: () => IAsyncOperation[String]): Self = this.set("getDomainNameAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFirstNameAsync(value: () => IAsyncOperation[String]): Self = this.set("getFirstNameAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLastNameAsync(value: () => IAsyncOperation[String]): Self = this.set("getLastNameAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPrincipalNameAsync(value: () => IAsyncOperation[String]): Self = this.set("getPrincipalNameAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSessionInitiationProtocolUriAsync(value: () => IAsyncOperation[Uri]): Self = this.set("getSessionInitiationProtocolUriAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setNameAccessAllowed(value: Boolean): Self = this.set("nameAccessAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnaccountpicturechanged(value: js.Any): Self = this.set("onaccountpicturechanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetAccountPictureAsync(value: IStorageFile => IAsyncOperation[SetAccountPictureResult]): Self = this.set("setAccountPictureAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAccountPictureFromStreamAsync(value: IRandomAccessStream => IAsyncOperation[SetAccountPictureResult]): Self = this.set("setAccountPictureFromStreamAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAccountPicturesAsync(value: (IStorageFile, IStorageFile, IStorageFile) => IAsyncOperation[SetAccountPictureResult]): Self = this.set("setAccountPicturesAsync", js.Any.fromFunction3(value))
    @scala.inline
    def setSetAccountPicturesFromStreamsAsync(
      value: (IRandomAccessStream, IRandomAccessStream, IRandomAccessStream) => IAsyncOperation[SetAccountPictureResult]
    ): Self = this.set("setAccountPicturesFromStreamsAsync", js.Any.fromFunction3(value))
  }
  
}

