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
import typings.winrtUwp.winrtUwpStrings.accountpicturechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables apps get information about users, set globalization preferences, and control the lock screen image. */
object UserProfile {
  
  /** Allows you to request a specific image type when using GetAccountPicture . */
  @JSGlobal("Windows.System.UserProfile.AccountPictureKind")
  @js.native
  object AccountPictureKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.UserProfile.AccountPictureKind with Double] = js.native
    
    /* 1 */ val largeImage: typings.winrtUwp.Windows.System.UserProfile.AccountPictureKind.largeImage with Double = js.native
    
    /* 0 */ val smallImage: typings.winrtUwp.Windows.System.UserProfile.AccountPictureKind.smallImage with Double = js.native
    
    /* 2 */ val video: typings.winrtUwp.Windows.System.UserProfile.AccountPictureKind.video with Double = js.native
  }
  
  /** Provides a property that lets the caller retrieve the advertising ID, which is an ID used to provide more relevant advertising by understanding which apps are used by the user and how they are used, and to improve quality of service by determining the frequency and effectiveness of ads and to detect fraud and security issues. */
  @JSGlobal("Windows.System.UserProfile.AdvertisingManager")
  @js.native
  abstract class AdvertisingManager ()
    extends typings.winrtUwp.Windows.System.UserProfile.AdvertisingManager
  object AdvertisingManager {
    
    @JSGlobal("Windows.System.UserProfile.AdvertisingManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** Retrieves a unique ID used to provide more relevant advertising by understanding which apps are used by the user and how they are used, and to improve quality of service by determining the frequency and effectiveness of ads and to detect fraud and security issues. This ID is per-user, per-device; all of the apps for a single user on a device have the same advertising ID. If the advertising ID feature is turned off, no ID is retrieved. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.AdvertisingManager.advertisingId")
    @js.native
    def advertisingId: String = js.native
    @scala.inline
    def advertisingId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("advertisingId")(x.asInstanceOf[js.Any])
  }
  
  /** Represents a collection of settings that a user can opt-in to during the first run experience. */
  @JSGlobal("Windows.System.UserProfile.FirstSignInSettings")
  @js.native
  abstract class FirstSignInSettings ()
    extends typings.winrtUwp.Windows.System.UserProfile.FirstSignInSettings
  object FirstSignInSettings {
    
    /**
      * Gets the default instance of the settings.
      * @return The default instance of the settings.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.FirstSignInSettings.getDefault")
    @js.native
    def getDefault(): typings.winrtUwp.Windows.System.UserProfile.FirstSignInSettings = js.native
  }
  
  /** A static class for holding various user globalization preferences. */
  @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences")
  @js.native
  abstract class GlobalizationPreferences ()
    extends typings.winrtUwp.Windows.System.UserProfile.GlobalizationPreferences
  object GlobalizationPreferences {
    
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the set of calendars that are preferred by the user, in order of preference. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.calendars")
    @js.native
    def calendars: IVectorView[String] = js.native
    @scala.inline
    def calendars_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendars")(x.asInstanceOf[js.Any])
    
    /** Gets the set of clocks that are preferred by the user, in order of preference. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.clocks")
    @js.native
    def clocks: IVectorView[String] = js.native
    @scala.inline
    def clocks_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clocks")(x.asInstanceOf[js.Any])
    
    /** Gets the set of currencies that are preferred by the user, in order of preference. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.currencies")
    @js.native
    def currencies: IVectorView[String] = js.native
    @scala.inline
    def currencies_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currencies")(x.asInstanceOf[js.Any])
    
    /** Gets the user's home geographic region. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.homeGeographicRegion")
    @js.native
    def homeGeographicRegion: String = js.native
    @scala.inline
    def homeGeographicRegion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("homeGeographicRegion")(x.asInstanceOf[js.Any])
    
    /** Gets the set of languages that are preferred by the user, in order of preference. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.languages")
    @js.native
    def languages: IVectorView[String] = js.native
    @scala.inline
    def languages_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languages")(x.asInstanceOf[js.Any])
    
    /** Gets the day of the week that is considered to be the first day of the week. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.weekStartsOn")
    @js.native
    def weekStartsOn: DayOfWeek = js.native
    @scala.inline
    def weekStartsOn_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weekStartsOn")(x.asInstanceOf[js.Any])
  }
  
  /** Provides properties and methods to manage the full-screen image used as the lock screen background. */
  @JSGlobal("Windows.System.UserProfile.LockScreen")
  @js.native
  abstract class LockScreen ()
    extends typings.winrtUwp.Windows.System.UserProfile.LockScreen
  object LockScreen {
    
    @JSGlobal("Windows.System.UserProfile.LockScreen")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the current lock screen image as a data stream.
      * @return The stream that contains the lock screen image data.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.LockScreen.getImageStream")
    @js.native
    def getImageStream(): IRandomAccessStream = js.native
    
    /** Gets the current lock screen image. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.LockScreen.originalImageFile")
    @js.native
    def originalImageFile: Uri = js.native
    @scala.inline
    def originalImageFile_=(x: Uri): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("originalImageFile")(x.asInstanceOf[js.Any])
    
    /**
      * Registers an RSS image feed to be used as a lock screen slideshow. (Windows 8.1 only)
      * @param syndicationFeedUri The URI of the RSS image feed.
      * @return One of the SetImageFeedResult values.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.LockScreen.requestSetImageFeedAsync")
    @js.native
    def requestSetImageFeedAsync(syndicationFeedUri: Uri): IPromiseWithIAsyncOperation[SetImageFeedResult] = js.native
    
    /**
      * Sets the lock screen image from a StorageFile object.
      * @param value The StorageFile object that contains the new image for the lock screen.
      * @return The object used to set the image for the lock screen.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.LockScreen.setImageFileAsync")
    @js.native
    def setImageFileAsync(value: IStorageFile): IPromiseWithIAsyncAction = js.native
    
    /**
      * Sets the lock screen image from a data stream.
      * @param value The stream that contains the image data.
      * @return The object used to set the lock screen image.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.LockScreen.setImageStreamAsync")
    @js.native
    def setImageStreamAsync(value: IRandomAccessStream): IPromiseWithIAsyncAction = js.native
    
    /**
      * Unregisters the image feed being used in the lock screen slideshow, stopping the slideshow. (Windows 8.1 only)
      * @return true if the image feed was disabled; otherwise, false.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.LockScreen.tryRemoveImageFeed")
    @js.native
    def tryRemoveImageFeed(): Boolean = js.native
  }
  
  /** A result that is returned when you try to set the image for a user account. */
  @JSGlobal("Windows.System.UserProfile.SetAccountPictureResult")
  @js.native
  object SetAccountPictureResult extends StObject {
    
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
  @JSGlobal("Windows.System.UserProfile.SetImageFeedResult")
  @js.native
  object SetImageFeedResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.UserProfile.SetImageFeedResult with Double] = js.native
    
    /* 1 */ val changeDisabled: typings.winrtUwp.Windows.System.UserProfile.SetImageFeedResult.changeDisabled with Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.System.UserProfile.SetImageFeedResult.success with Double = js.native
    
    /* 2 */ val userCanceled: typings.winrtUwp.Windows.System.UserProfile.SetImageFeedResult.userCanceled with Double = js.native
  }
  
  /** Represents information about the user, such as name and account picture. */
  @JSGlobal("Windows.System.UserProfile.UserInformation")
  @js.native
  abstract class UserInformation ()
    extends typings.winrtUwp.Windows.System.UserProfile.UserInformation
  object UserInformation {
    
    @JSGlobal("Windows.System.UserProfile.UserInformation")
    @js.native
    val ^ : js.Any = js.native
    
    /** Determines if the user's account picture can be changed. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.accountPictureChangeEnabled")
    @js.native
    def accountPictureChangeEnabled: Boolean = js.native
    @scala.inline
    def accountPictureChangeEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accountPictureChangeEnabled")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.addEventListener")
    @js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.addEventListener")
    @js.native
    def addEventListener_accountpicturechanged(`type`: accountpicturechanged, listener: EventHandler[_]): Unit = js.native
    
    /**
      * Gets the account picture for the user.
      * @param kind An enumeration that you can use to determine what type of image you want (small, large, and so on).
      * @return An object that contains the image.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.getAccountPicture")
    @js.native
    def getAccountPicture(kind: AccountPictureKind): IStorageFile = js.native
    
    /**
      * Gets the display name for the user account.
      * @return The display name for the user account.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.getDisplayNameAsync")
    @js.native
    def getDisplayNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
    
    /**
      * Gets the domain name for the user.
      * @return A string that represents the domain name for the user.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.getDomainNameAsync")
    @js.native
    def getDomainNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
    
    /**
      * Gets the user's first name.
      * @return The user's first name.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.getFirstNameAsync")
    @js.native
    def getFirstNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
    
    /**
      * Gets the user's last name.
      * @return The user's last name.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.getLastNameAsync")
    @js.native
    def getLastNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
    
    /**
      * Gets the principal name for the user. This name is the User Principal Name (typically the user's address, although this is not always true.)
      * @return The user's principal name.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.getPrincipalNameAsync")
    @js.native
    def getPrincipalNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
    
    /**
      * Gets the Uniform Resource Identifier (URI) of the session initiation protocol for the user.
      * @return The URI of the session initiation protocol.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.getSessionInitiationProtocolUriAsync")
    @js.native
    def getSessionInitiationProtocolUriAsync(): IPromiseWithIAsyncOperation[Uri] = js.native
    
    /** Allows you to see if your app is allowed to access the user's information. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.nameAccessAllowed")
    @js.native
    def nameAccessAllowed: Boolean = js.native
    @scala.inline
    def nameAccessAllowed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nameAccessAllowed")(x.asInstanceOf[js.Any])
    
    /** Occurs when the user's image or name changes. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.onaccountpicturechanged")
    @js.native
    def onaccountpicturechanged: EventHandler[js.Any] = js.native
    @scala.inline
    def onaccountpicturechanged_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onaccountpicturechanged")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.removeEventListener")
    @js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.removeEventListener")
    @js.native
    def removeEventListener_accountpicturechanged(`type`: accountpicturechanged, listener: EventHandler[_]): Unit = js.native
    
    /**
      * Sets the picture for the user's account using an IStorageFile object.
      * @param image A file that contains the image.
      * @return A value that indicates the success or failure of the operation.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.setAccountPictureAsync")
    @js.native
    def setAccountPictureAsync(image: IStorageFile): IPromiseWithIAsyncOperation[SetAccountPictureResult] = js.native
    
    /**
      * Sets the picture for the user's account using an IRandomAccessStream object.
      * @param image The image.
      * @return A value that indicates the success or failure of the operation.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.setAccountPictureFromStreamAsync")
    @js.native
    def setAccountPictureFromStreamAsync(image: IRandomAccessStream): IPromiseWithIAsyncOperation[SetAccountPictureResult] = js.native
    
    /**
      * Sets the pictures for the user's account using an IStorageFile object. Supports adding a small image, large image, and video.
      * @param smallImage A small version of the image.
      * @param largeImage A large version of the image.
      * @param video A video.
      * @return A value that indicates the success or failure of the operation.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.setAccountPicturesAsync")
    @js.native
    def setAccountPicturesAsync(smallImage: IStorageFile, largeImage: IStorageFile, video: IStorageFile): IPromiseWithIAsyncOperation[SetAccountPictureResult] = js.native
    
    /**
      * Sets the pictures for the user's account using an IRandomAccessStream object. Supports adding a small image, large image, and video.
      * @param smallImage A small version of the image.
      * @param largeImage A large version of the image.
      * @param video A video.
      * @return A value that indicates the success or failure of the operation.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.setAccountPicturesFromStreamsAsync")
    @js.native
    def setAccountPicturesFromStreamsAsync(smallImage: IRandomAccessStream, largeImage: IRandomAccessStream, video: IRandomAccessStream): IPromiseWithIAsyncOperation[SetAccountPictureResult] = js.native
  }
  
  /** Provides properties and methods to manage the user's desktop wallpaper and lock screen background image. */
  @JSGlobal("Windows.System.UserProfile.UserProfilePersonalizationSettings")
  @js.native
  abstract class UserProfilePersonalizationSettings ()
    extends typings.winrtUwp.Windows.System.UserProfile.UserProfilePersonalizationSettings
  object UserProfilePersonalizationSettings {
    
    @JSGlobal("Windows.System.UserProfile.UserProfilePersonalizationSettings")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the current instance of UserProfilePersonalizationSettings . */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserProfilePersonalizationSettings.current")
    @js.native
    def current: typings.winrtUwp.Windows.System.UserProfile.UserProfilePersonalizationSettings = js.native
    @scala.inline
    def current_=(x: typings.winrtUwp.Windows.System.UserProfile.UserProfilePersonalizationSettings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
    
    /**
      * Gets a value that indicates whether changing the desktop and lock screen images is supported on the current device.
      * @return true if changing the desktop and lock screen images is supported; otherwise, false.
      */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserProfilePersonalizationSettings.isSupported")
    @js.native
    def isSupported(): Boolean = js.native
  }
}
