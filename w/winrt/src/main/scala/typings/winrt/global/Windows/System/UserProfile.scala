package typings.winrt.global.Windows.System

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Globalization.DayOfWeek
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import typings.winrt.Windows.System.UserProfile.AccountPictureKind
import typings.winrt.Windows.System.UserProfile.SetAccountPictureResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.System.UserProfile")
@js.native
object UserProfile extends js.Object {
  
  @js.native
  object AccountPictureKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.System.UserProfile.AccountPictureKind with Double] = js.native
    
    /* 1 */ val largeImage: typings.winrt.Windows.System.UserProfile.AccountPictureKind.largeImage with Double = js.native
    
    /* 0 */ val smallImage: typings.winrt.Windows.System.UserProfile.AccountPictureKind.smallImage with Double = js.native
    
    /* 2 */ val video: typings.winrt.Windows.System.UserProfile.AccountPictureKind.video with Double = js.native
  }
  
  @js.native
  class GlobalizationPreferences ()
    extends typings.winrt.Windows.System.UserProfile.GlobalizationPreferences
  /* static members */
  @js.native
  object GlobalizationPreferences extends js.Object {
    
    var calendars: IVectorView[String] = js.native
    
    var clocks: IVectorView[String] = js.native
    
    var currencies: IVectorView[String] = js.native
    
    var homeGeographicRegion: String = js.native
    
    var languages: IVectorView[String] = js.native
    
    var weekStartsOn: DayOfWeek = js.native
  }
  
  @js.native
  class LockScreen ()
    extends typings.winrt.Windows.System.UserProfile.LockScreen
  /* static members */
  @js.native
  object LockScreen extends js.Object {
    
    def getImageStream(): IRandomAccessStream = js.native
    
    var originalImageFile: Uri = js.native
    
    def setImageFileAsync(value: IStorageFile): IAsyncAction = js.native
    
    def setImageStreamAsync(value: IRandomAccessStream): IAsyncAction = js.native
  }
  
  @js.native
  object SetAccountPictureResult extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.System.UserProfile.SetAccountPictureResult with Double] = js.native
    
    /* 1 */ val changeDisabled: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.changeDisabled with Double = js.native
    
    /* 5 */ val failure: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.failure with Double = js.native
    
    /* 4 */ val fileSizeError: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.fileSizeError with Double = js.native
    
    /* 2 */ val largeOrDynamicError: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.largeOrDynamicError with Double = js.native
    
    /* 0 */ val success: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.success with Double = js.native
    
    /* 3 */ val videoFrameSizeError: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.videoFrameSizeError with Double = js.native
  }
  
  @js.native
  class UserInformation ()
    extends typings.winrt.Windows.System.UserProfile.UserInformation
  /* static members */
  @js.native
  object UserInformation extends js.Object {
    
    var accountPictureChangeEnabled: Boolean = js.native
    
    def getAccountPicture(kind: AccountPictureKind): IStorageFile = js.native
    
    def getDisplayNameAsync(): IAsyncOperation[String] = js.native
    
    def getDomainNameAsync(): IAsyncOperation[String] = js.native
    
    def getFirstNameAsync(): IAsyncOperation[String] = js.native
    
    def getLastNameAsync(): IAsyncOperation[String] = js.native
    
    def getPrincipalNameAsync(): IAsyncOperation[String] = js.native
    
    def getSessionInitiationProtocolUriAsync(): IAsyncOperation[Uri] = js.native
    
    var nameAccessAllowed: Boolean = js.native
    
    var onaccountpicturechanged: js.Any = js.native
    
    def setAccountPictureAsync(image: IStorageFile): IAsyncOperation[SetAccountPictureResult] = js.native
    
    def setAccountPictureFromStreamAsync(image: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult] = js.native
    
    def setAccountPicturesAsync(smallImage: IStorageFile, largeImage: IStorageFile, video: IStorageFile): IAsyncOperation[SetAccountPictureResult] = js.native
    
    def setAccountPicturesFromStreamsAsync(smallImage: IRandomAccessStream, largeImage: IRandomAccessStream, video: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult] = js.native
  }
}
