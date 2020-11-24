package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Globalization.DayOfWeek
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.System.UserProfile.AccountPictureKind
import typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult
import typings.winrtUwp.Windows.System.UserProfile.SetImageFeedResult
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.accountpicturechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables apps get information about users, set globalization preferences, and control the lock screen image. */
@JSGlobal("Windows.System.UserProfile")
@js.native
object UserProfile extends js.Object {
  
  /** Allows you to request a specific image type when using GetAccountPicture . */
  @js.native
  object AccountPictureKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.UserProfile.AccountPictureKind with Double] = js.native
    
    /* 1 */ val largeImage: typings.winrtUwp.Windows.System.UserProfile.AccountPictureKind.largeImage with Double = js.native
    
    /* 0 */ val smallImage: typings.winrtUwp.Windows.System.UserProfile.AccountPictureKind.smallImage with Double = js.native
    
    /* 2 */ val video: typings.winrtUwp.Windows.System.UserProfile.AccountPictureKind.video with Double = js.native
  }
  
  /** Provides a property that lets the caller retrieve the advertising ID, which is an ID used to provide more relevant advertising by understanding which apps are used by the user and how they are used, and to improve quality of service by determining the frequency and effectiveness of ads and to detect fraud and security issues. */
  @js.native
  abstract class AdvertisingManager ()
    extends typings.winrtUwp.Windows.System.UserProfile.AdvertisingManager
  /* static members */
  @js.native
  object AdvertisingManager extends js.Object {
    
    /** Retrieves a unique ID used to provide more relevant advertising by understanding which apps are used by the user and how they are used, and to improve quality of service by determining the frequency and effectiveness of ads and to detect fraud and security issues. This ID is per-user, per-device; all of the apps for a single user on a device have the same advertising ID. If the advertising ID feature is turned off, no ID is retrieved. */
    var advertisingId: String = js.native
  }
  
  /** Represents a collection of settings that a user can opt-in to during the first run experience. */
  @js.native
  abstract class FirstSignInSettings ()
    extends typings.winrtUwp.Windows.System.UserProfile.FirstSignInSettings
  /* static members */
  @js.native
  object FirstSignInSettings extends js.Object {
    
    /**
      * Gets the default instance of the settings.
      * @return The default instance of the settings.
      */
    def getDefault(): typings.winrtUwp.Windows.System.UserProfile.FirstSignInSettings = js.native
  }
  
  /** A static class for holding various user globalization preferences. */
  @js.native
  abstract class GlobalizationPreferences ()
    extends typings.winrtUwp.Windows.System.UserProfile.GlobalizationPreferences
  /* static members */
  @js.native
  object GlobalizationPreferences extends js.Object {
    
    /** Gets the set of calendars that are preferred by the user, in order of preference. */
    var calendars: IVectorView[String] = js.native
    
    /** Gets the set of clocks that are preferred by the user, in order of preference. */
    var clocks: IVectorView[String] = js.native
    
    /** Gets the set of currencies that are preferred by the user, in order of preference. */
    var currencies: IVectorView[String] = js.native
    
    /** Gets the user's home geographic region. */
    var homeGeographicRegion: String = js.native
    
    /** Gets the set of languages that are preferred by the user, in order of preference. */
    var languages: IVectorView[String] = js.native
    
    /** Gets the day of the week that is considered to be the first day of the week. */
    var weekStartsOn: DayOfWeek = js.native
  }
  
  /** Provides properties and methods to manage the full-screen image used as the lock screen background. */
  @js.native
  abstract class LockScreen ()
    extends typings.winrtUwp.Windows.System.UserProfile.LockScreen
  /* static members */
  @js.native
  object LockScreen extends js.Object {
    
    /**
      * Gets the current lock screen image as a data stream.
      * @return The stream that contains the lock screen image data.
      */
    def getImageStream(): IRandomAccessStream = js.native
    
    /** Gets the current lock screen image. */
    var originalImageFile: Uri = js.native
    
    /**
      * Registers an RSS image feed to be used as a lock screen slideshow. (Windows 8.1 only)
      * @param syndicationFeedUri The URI of the RSS image feed.
      * @return One of the SetImageFeedResult values.
      */
    def requestSetImageFeedAsync(syndicationFeedUri: Uri): IPromiseWithIAsyncOperation[SetImageFeedResult] = js.native
    
    /**
      * Sets the lock screen image from a StorageFile object.
      * @param value The StorageFile object that contains the new image for the lock screen.
      * @return The object used to set the image for the lock screen.
      */
    def setImageFileAsync(value: IStorageFile): IPromiseWithIAsyncAction = js.native
    
    /**
      * Sets the lock screen image from a data stream.
      * @param value The stream that contains the image data.
      * @return The object used to set the lock screen image.
      */
    def setImageStreamAsync(value: IRandomAccessStream): IPromiseWithIAsyncAction = js.native
    
    /**
      * Unregisters the image feed being used in the lock screen slideshow, stopping the slideshow. (Windows 8.1 only)
      * @return true if the image feed was disabled; otherwise, false.
      */
    def tryRemoveImageFeed(): Boolean = js.native
  }
  
  /** A result that is returned when you try to set the image for a user account. */
  @js.native
  object SetAccountPictureResult extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult with Double] = js.native
    
    /* 1 */ val changeDisabled: typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult.changeDisabled with Double = js.native
    
    /* 5 */ val failure: typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult.failure with Double = js.native
    
    /* 4 */ val fileSizeError: typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult.fileSizeError with Double = js.native
    
    /* 2 */ val largeOrDynamicError: typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult.largeOrDynamicError with Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult.success with Double = js.native
    
    /* 3 */ val videoFrameSizeError: typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult.videoFrameSizeError with Double = js.native
  }
  
  /** Specifies the result of a call to LockScreen.RequestSetImageFeedAsync */
  @js.native
  object SetImageFeedResult extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.UserProfile.SetImageFeedResult with Double] = js.native
    
    /* 1 */ val changeDisabled: typings.winrtUwp.Windows.System.UserProfile.SetImageFeedResult.changeDisabled with Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.System.UserProfile.SetImageFeedResult.success with Double = js.native
    
    /* 2 */ val userCanceled: typings.winrtUwp.Windows.System.UserProfile.SetImageFeedResult.userCanceled with Double = js.native
  }
  
  /** Represents information about the user, such as name and account picture. */
  @js.native
  abstract class UserInformation ()
    extends typings.winrtUwp.Windows.System.UserProfile.UserInformation
  /* static members */
  @js.native
  object UserInformation extends js.Object {
    
    /** Determines if the user's account picture can be changed. */
    var accountPictureChangeEnabled: Boolean = js.native
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_accountpicturechanged(`type`: accountpicturechanged, listener: EventHandler[_]): Unit = js.native
    
    /**
      * Gets the account picture for the user.
      * @param kind An enumeration that you can use to determine what type of image you want (small, large, and so on).
      * @return An object that contains the image.
      */
    def getAccountPicture(kind: AccountPictureKind): IStorageFile = js.native
    
    /**
      * Gets the display name for the user account.
      * @return The display name for the user account.
      */
    def getDisplayNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
    
    /**
      * Gets the domain name for the user.
      * @return A string that represents the domain name for the user.
      */
    def getDomainNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
    
    /**
      * Gets the user's first name.
      * @return The user's first name.
      */
    def getFirstNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
    
    /**
      * Gets the user's last name.
      * @return The user's last name.
      */
    def getLastNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
    
    /**
      * Gets the principal name for the user. This name is the User Principal Name (typically the user's address, although this is not always true.)
      * @return The user's principal name.
      */
    def getPrincipalNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
    
    /**
      * Gets the Uniform Resource Identifier (URI) of the session initiation protocol for the user.
      * @return The URI of the session initiation protocol.
      */
    def getSessionInitiationProtocolUriAsync(): IPromiseWithIAsyncOperation[Uri] = js.native
    
    /** Allows you to see if your app is allowed to access the user's information. */
    var nameAccessAllowed: Boolean = js.native
    
    /** Occurs when the user's image or name changes. */
    def onaccountpicturechanged(ev: js.Any with WinRTEvent[_]): Unit = js.native
    /** Occurs when the user's image or name changes. */
    @JSName("onaccountpicturechanged")
    var onaccountpicturechanged_Original: EventHandler[_] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_accountpicturechanged(`type`: accountpicturechanged, listener: EventHandler[_]): Unit = js.native
    
    /**
      * Sets the picture for the user's account using an IStorageFile object.
      * @param image A file that contains the image.
      * @return A value that indicates the success or failure of the operation.
      */
    def setAccountPictureAsync(image: IStorageFile): IPromiseWithIAsyncOperation[SetAccountPictureResult] = js.native
    
    /**
      * Sets the picture for the user's account using an IRandomAccessStream object.
      * @param image The image.
      * @return A value that indicates the success or failure of the operation.
      */
    def setAccountPictureFromStreamAsync(image: IRandomAccessStream): IPromiseWithIAsyncOperation[SetAccountPictureResult] = js.native
    
    /**
      * Sets the pictures for the user's account using an IStorageFile object. Supports adding a small image, large image, and video.
      * @param smallImage A small version of the image.
      * @param largeImage A large version of the image.
      * @param video A video.
      * @return A value that indicates the success or failure of the operation.
      */
    def setAccountPicturesAsync(smallImage: IStorageFile, largeImage: IStorageFile, video: IStorageFile): IPromiseWithIAsyncOperation[SetAccountPictureResult] = js.native
    
    /**
      * Sets the pictures for the user's account using an IRandomAccessStream object. Supports adding a small image, large image, and video.
      * @param smallImage A small version of the image.
      * @param largeImage A large version of the image.
      * @param video A video.
      * @return A value that indicates the success or failure of the operation.
      */
    def setAccountPicturesFromStreamsAsync(smallImage: IRandomAccessStream, largeImage: IRandomAccessStream, video: IRandomAccessStream): IPromiseWithIAsyncOperation[SetAccountPictureResult] = js.native
  }
  
  /** Provides properties and methods to manage the user's desktop wallpaper and lock screen background image. */
  @js.native
  abstract class UserProfilePersonalizationSettings ()
    extends typings.winrtUwp.Windows.System.UserProfile.UserProfilePersonalizationSettings
  /* static members */
  @js.native
  object UserProfilePersonalizationSettings extends js.Object {
    
    /** Gets the current instance of UserProfilePersonalizationSettings . */
    var current: typings.winrtUwp.Windows.System.UserProfile.UserProfilePersonalizationSettings = js.native
    
    /**
      * Gets a value that indicates whether changing the desktop and lock screen images is supported on the current device.
      * @return true if changing the desktop and lock screen images is supported; otherwise, false.
      */
    def isSupported(): Boolean = js.native
  }
}
