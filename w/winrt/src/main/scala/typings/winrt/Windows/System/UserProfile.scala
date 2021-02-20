package typings.winrt.Windows.System

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Globalization.DayOfWeek
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UserProfile {
  
  @js.native
  sealed trait AccountPictureKind extends StObject
  @JSGlobal("Windows.System.UserProfile.AccountPictureKind")
  @js.native
  object AccountPictureKind extends StObject {
    
    @js.native
    sealed trait largeImage extends AccountPictureKind
    
    @js.native
    sealed trait smallImage extends AccountPictureKind
    
    @js.native
    sealed trait video extends AccountPictureKind
  }
  
  @js.native
  sealed trait SetAccountPictureResult extends StObject
  @JSGlobal("Windows.System.UserProfile.SetAccountPictureResult")
  @js.native
  object SetAccountPictureResult extends StObject {
    
    @js.native
    sealed trait changeDisabled extends SetAccountPictureResult
    
    @js.native
    sealed trait failure extends SetAccountPictureResult
    
    @js.native
    sealed trait fileSizeError extends SetAccountPictureResult
    
    @js.native
    sealed trait largeOrDynamicError extends SetAccountPictureResult
    
    @js.native
    sealed trait success extends SetAccountPictureResult
    
    @js.native
    sealed trait videoFrameSizeError extends SetAccountPictureResult
  }
  
  @js.native
  trait GlobalizationPreferences extends StObject
  
  @js.native
  trait IGlobalizationPreferencesStatics extends StObject {
    
    var calendars: IVectorView[String] = js.native
    
    var clocks: IVectorView[String] = js.native
    
    var currencies: IVectorView[String] = js.native
    
    var homeGeographicRegion: String = js.native
    
    var languages: IVectorView[String] = js.native
    
    var weekStartsOn: DayOfWeek = js.native
  }
  object IGlobalizationPreferencesStatics {
    
    @scala.inline
    def apply(
      calendars: IVectorView[String],
      clocks: IVectorView[String],
      currencies: IVectorView[String],
      homeGeographicRegion: String,
      languages: IVectorView[String],
      weekStartsOn: DayOfWeek
    ): IGlobalizationPreferencesStatics = {
      val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any], clocks = clocks.asInstanceOf[js.Any], currencies = currencies.asInstanceOf[js.Any], homeGeographicRegion = homeGeographicRegion.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], weekStartsOn = weekStartsOn.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGlobalizationPreferencesStatics]
    }
    
    @scala.inline
    implicit class IGlobalizationPreferencesStaticsMutableBuilder[Self <: IGlobalizationPreferencesStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendars(value: IVectorView[String]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClocks(value: IVectorView[String]): Self = StObject.set(x, "clocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencies(value: IVectorView[String]): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeGeographicRegion(value: String): Self = StObject.set(x, "homeGeographicRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguages(value: IVectorView[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekStartsOn(value: DayOfWeek): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ILockScreenStatics extends StObject {
    
    def getImageStream(): IRandomAccessStream = js.native
    
    var originalImageFile: Uri = js.native
    
    def setImageFileAsync(value: IStorageFile): IAsyncAction = js.native
    
    def setImageStreamAsync(value: IRandomAccessStream): IAsyncAction = js.native
  }
  object ILockScreenStatics {
    
    @scala.inline
    def apply(
      getImageStream: () => IRandomAccessStream,
      originalImageFile: Uri,
      setImageFileAsync: IStorageFile => IAsyncAction,
      setImageStreamAsync: IRandomAccessStream => IAsyncAction
    ): ILockScreenStatics = {
      val __obj = js.Dynamic.literal(getImageStream = js.Any.fromFunction0(getImageStream), originalImageFile = originalImageFile.asInstanceOf[js.Any], setImageFileAsync = js.Any.fromFunction1(setImageFileAsync), setImageStreamAsync = js.Any.fromFunction1(setImageStreamAsync))
      __obj.asInstanceOf[ILockScreenStatics]
    }
    
    @scala.inline
    implicit class ILockScreenStaticsMutableBuilder[Self <: ILockScreenStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetImageStream(value: () => IRandomAccessStream): Self = StObject.set(x, "getImageStream", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOriginalImageFile(value: Uri): Self = StObject.set(x, "originalImageFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetImageFileAsync(value: IStorageFile => IAsyncAction): Self = StObject.set(x, "setImageFileAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetImageStreamAsync(value: IRandomAccessStream => IAsyncAction): Self = StObject.set(x, "setImageStreamAsync", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IUserInformationStatics extends StObject {
    
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
    implicit class IUserInformationStaticsMutableBuilder[Self <: IUserInformationStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountPictureChangeEnabled(value: Boolean): Self = StObject.set(x, "accountPictureChangeEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAccountPicture(value: AccountPictureKind => IStorageFile): Self = StObject.set(x, "getAccountPicture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDisplayNameAsync(value: () => IAsyncOperation[String]): Self = StObject.set(x, "getDisplayNameAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDomainNameAsync(value: () => IAsyncOperation[String]): Self = StObject.set(x, "getDomainNameAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFirstNameAsync(value: () => IAsyncOperation[String]): Self = StObject.set(x, "getFirstNameAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLastNameAsync(value: () => IAsyncOperation[String]): Self = StObject.set(x, "getLastNameAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPrincipalNameAsync(value: () => IAsyncOperation[String]): Self = StObject.set(x, "getPrincipalNameAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSessionInitiationProtocolUriAsync(value: () => IAsyncOperation[Uri]): Self = StObject.set(x, "getSessionInitiationProtocolUriAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNameAccessAllowed(value: Boolean): Self = StObject.set(x, "nameAccessAllowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnaccountpicturechanged(value: js.Any): Self = StObject.set(x, "onaccountpicturechanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAccountPictureAsync(value: IStorageFile => IAsyncOperation[SetAccountPictureResult]): Self = StObject.set(x, "setAccountPictureAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAccountPictureFromStreamAsync(value: IRandomAccessStream => IAsyncOperation[SetAccountPictureResult]): Self = StObject.set(x, "setAccountPictureFromStreamAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAccountPicturesAsync(value: (IStorageFile, IStorageFile, IStorageFile) => IAsyncOperation[SetAccountPictureResult]): Self = StObject.set(x, "setAccountPicturesAsync", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetAccountPicturesFromStreamsAsync(
        value: (IRandomAccessStream, IRandomAccessStream, IRandomAccessStream) => IAsyncOperation[SetAccountPictureResult]
      ): Self = StObject.set(x, "setAccountPicturesFromStreamsAsync", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait LockScreen extends StObject
  
  @js.native
  trait UserInformation extends StObject
}
