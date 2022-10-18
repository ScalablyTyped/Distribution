package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Globalization.DayOfWeek
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.System.UserProfile.AccountPictureKind
import typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult
import typings.winrtUwp.Windows.System.UserProfile.SetImageFeedResult
import typings.winrtUwp.anon.Second
import typings.winrtUwp.winrtUwpStrings.accountpicturechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables apps get information about users, set globalization preferences, and control the lock screen image. */
object UserProfile {
  
  /** Allows you to request a specific image type when using GetAccountPicture . */
  @JSGlobal("Windows.System.UserProfile.AccountPictureKind")
  @js.native
  object AccountPictureKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.UserProfile.AccountPictureKind & Double] = js.native
    
    /* 1 */ val largeImage: typings.winrtUwp.Windows.System.UserProfile.AccountPictureKind.largeImage & Double = js.native
    
    /* 0 */ val smallImage: typings.winrtUwp.Windows.System.UserProfile.AccountPictureKind.smallImage & Double = js.native
    
    /* 2 */ val video: typings.winrtUwp.Windows.System.UserProfile.AccountPictureKind.video & Double = js.native
  }
  
  /** Provides a property that lets the caller retrieve the advertising ID, which is an ID used to provide more relevant advertising by understanding which apps are used by the user and how they are used, and to improve quality of service by determining the frequency and effectiveness of ads and to detect fraud and security issues. */
  /* note: abstract class */ @JSGlobal("Windows.System.UserProfile.AdvertisingManager")
  @js.native
  open class AdvertisingManager ()
    extends StObject
       with typings.winrtUwp.Windows.System.UserProfile.AdvertisingManager
  object AdvertisingManager {
    
    @JSGlobal("Windows.System.UserProfile.AdvertisingManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** Retrieves a unique ID used to provide more relevant advertising by understanding which apps are used by the user and how they are used, and to improve quality of service by determining the frequency and effectiveness of ads and to detect fraud and security issues. This ID is per-user, per-device; all of the apps for a single user on a device have the same advertising ID. If the advertising ID feature is turned off, no ID is retrieved. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.AdvertisingManager.advertisingId")
    @js.native
    def advertisingId: String = js.native
    inline def advertisingId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("advertisingId")(x.asInstanceOf[js.Any])
  }
  
  /** Represents a collection of settings that a user can opt-in to during the first run experience. */
  /* note: abstract class */ @JSGlobal("Windows.System.UserProfile.FirstSignInSettings")
  @js.native
  open class FirstSignInSettings ()
    extends StObject
       with typings.winrtUwp.Windows.System.UserProfile.FirstSignInSettings {
    
    /**
      * Returns an iterator for the items in the collection.
      * @return The iterator.
      */
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[Any, Any]] = js.native
    
    /**
      * Determines whether the map view contains the specified key.
      * @param key The key to locate in the map view.
      * @return true if the key is found; otherwise, false.
      */
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    
    /**
      * Returns the item in the map view with the specified key.
      * @param key The key to locate in the map view.
      * @return The item associated with the specified key.
      */
    /* CompleteClass */
    override def lookup(key: String): Any = js.native
    
    /** Returns the number of elements in the map. */
    /* CompleteClass */
    var size: Double = js.native
    
    /**
      * Splits the map view into two views.
      */
    /* CompleteClass */
    override def split(): Second = js.native
  }
  object FirstSignInSettings {
    
    @JSGlobal("Windows.System.UserProfile.FirstSignInSettings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the default instance of the settings.
      * @return The default instance of the settings.
      */
    /* static member */
    inline def getDefault(): typings.winrtUwp.Windows.System.UserProfile.FirstSignInSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.System.UserProfile.FirstSignInSettings]
  }
  
  /** A static class for holding various user globalization preferences. */
  /* note: abstract class */ @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences")
  @js.native
  open class GlobalizationPreferences ()
    extends StObject
       with typings.winrtUwp.Windows.System.UserProfile.GlobalizationPreferences
  object GlobalizationPreferences {
    
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the set of calendars that are preferred by the user, in order of preference. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.calendars")
    @js.native
    def calendars: IVectorView[String] = js.native
    inline def calendars_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendars")(x.asInstanceOf[js.Any])
    
    /** Gets the set of clocks that are preferred by the user, in order of preference. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.clocks")
    @js.native
    def clocks: IVectorView[String] = js.native
    inline def clocks_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clocks")(x.asInstanceOf[js.Any])
    
    /** Gets the set of currencies that are preferred by the user, in order of preference. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.currencies")
    @js.native
    def currencies: IVectorView[String] = js.native
    inline def currencies_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currencies")(x.asInstanceOf[js.Any])
    
    /** Gets the user's home geographic region. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.homeGeographicRegion")
    @js.native
    def homeGeographicRegion: String = js.native
    inline def homeGeographicRegion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("homeGeographicRegion")(x.asInstanceOf[js.Any])
    
    /** Gets the set of languages that are preferred by the user, in order of preference. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.languages")
    @js.native
    def languages: IVectorView[String] = js.native
    inline def languages_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languages")(x.asInstanceOf[js.Any])
    
    /** Gets the day of the week that is considered to be the first day of the week. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.weekStartsOn")
    @js.native
    def weekStartsOn: DayOfWeek = js.native
    inline def weekStartsOn_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weekStartsOn")(x.asInstanceOf[js.Any])
  }
  
  /** Provides properties and methods to manage the full-screen image used as the lock screen background. */
  /* note: abstract class */ @JSGlobal("Windows.System.UserProfile.LockScreen")
  @js.native
  open class LockScreen ()
    extends StObject
       with typings.winrtUwp.Windows.System.UserProfile.LockScreen
  object LockScreen {
    
    @JSGlobal("Windows.System.UserProfile.LockScreen")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the current lock screen image as a data stream.
      * @return The stream that contains the lock screen image data.
      */
    /* static member */
    inline def getImageStream(): IRandomAccessStream = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageStream")().asInstanceOf[IRandomAccessStream]
    
    /** Gets the current lock screen image. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.LockScreen.originalImageFile")
    @js.native
    def originalImageFile: Uri = js.native
    inline def originalImageFile_=(x: Uri): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("originalImageFile")(x.asInstanceOf[js.Any])
    
    /**
      * Registers an RSS image feed to be used as a lock screen slideshow. (Windows 8.1 only)
      * @param syndicationFeedUri The URI of the RSS image feed.
      * @return One of the SetImageFeedResult values.
      */
    /* static member */
    inline def requestSetImageFeedAsync(syndicationFeedUri: Uri): IPromiseWithIAsyncOperation[SetImageFeedResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestSetImageFeedAsync")(syndicationFeedUri.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[SetImageFeedResult]]
    
    /**
      * Sets the lock screen image from a StorageFile object.
      * @param value The StorageFile object that contains the new image for the lock screen.
      * @return The object used to set the image for the lock screen.
      */
    /* static member */
    inline def setImageFileAsync(value: IStorageFile): IPromiseWithIAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setImageFileAsync")(value.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncAction]
    
    /**
      * Sets the lock screen image from a data stream.
      * @param value The stream that contains the image data.
      * @return The object used to set the lock screen image.
      */
    /* static member */
    inline def setImageStreamAsync(value: IRandomAccessStream): IPromiseWithIAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setImageStreamAsync")(value.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncAction]
    
    /**
      * Unregisters the image feed being used in the lock screen slideshow, stopping the slideshow. (Windows 8.1 only)
      * @return true if the image feed was disabled; otherwise, false.
      */
    /* static member */
    inline def tryRemoveImageFeed(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tryRemoveImageFeed")().asInstanceOf[Boolean]
  }
  
  /** A result that is returned when you try to set the image for a user account. */
  @JSGlobal("Windows.System.UserProfile.SetAccountPictureResult")
  @js.native
  object SetAccountPictureResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult & Double] = js.native
    
    /* 1 */ val changeDisabled: typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult.changeDisabled & Double = js.native
    
    /* 5 */ val failure: typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult.failure & Double = js.native
    
    /* 4 */ val fileSizeError: typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult.fileSizeError & Double = js.native
    
    /* 2 */ val largeOrDynamicError: typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult.largeOrDynamicError & Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult.success & Double = js.native
    
    /* 3 */ val videoFrameSizeError: typings.winrtUwp.Windows.System.UserProfile.SetAccountPictureResult.videoFrameSizeError & Double = js.native
  }
  
  /** Specifies the result of a call to LockScreen.RequestSetImageFeedAsync */
  @JSGlobal("Windows.System.UserProfile.SetImageFeedResult")
  @js.native
  object SetImageFeedResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.UserProfile.SetImageFeedResult & Double] = js.native
    
    /* 1 */ val changeDisabled: typings.winrtUwp.Windows.System.UserProfile.SetImageFeedResult.changeDisabled & Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.System.UserProfile.SetImageFeedResult.success & Double = js.native
    
    /* 2 */ val userCanceled: typings.winrtUwp.Windows.System.UserProfile.SetImageFeedResult.userCanceled & Double = js.native
  }
  
  /** Represents information about the user, such as name and account picture. */
  /* note: abstract class */ @JSGlobal("Windows.System.UserProfile.UserInformation")
  @js.native
  open class UserInformation ()
    extends StObject
       with typings.winrtUwp.Windows.System.UserProfile.UserInformation
  object UserInformation {
    
    @JSGlobal("Windows.System.UserProfile.UserInformation")
    @js.native
    val ^ : js.Any = js.native
    
    /** Determines if the user's account picture can be changed. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.accountPictureChangeEnabled")
    @js.native
    def accountPictureChangeEnabled: Boolean = js.native
    inline def accountPictureChangeEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accountPictureChangeEnabled")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_accountpicturechanged(`type`: accountpicturechanged, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Gets the account picture for the user.
      * @param kind An enumeration that you can use to determine what type of image you want (small, large, and so on).
      * @return An object that contains the image.
      */
    /* static member */
    inline def getAccountPicture(kind: AccountPictureKind): IStorageFile = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountPicture")(kind.asInstanceOf[js.Any]).asInstanceOf[IStorageFile]
    
    /**
      * Gets the display name for the user account.
      * @return The display name for the user account.
      */
    /* static member */
    inline def getDisplayNameAsync(): IPromiseWithIAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayNameAsync")().asInstanceOf[IPromiseWithIAsyncOperation[String]]
    
    /**
      * Gets the domain name for the user.
      * @return A string that represents the domain name for the user.
      */
    /* static member */
    inline def getDomainNameAsync(): IPromiseWithIAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainNameAsync")().asInstanceOf[IPromiseWithIAsyncOperation[String]]
    
    /**
      * Gets the user's first name.
      * @return The user's first name.
      */
    /* static member */
    inline def getFirstNameAsync(): IPromiseWithIAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstNameAsync")().asInstanceOf[IPromiseWithIAsyncOperation[String]]
    
    /**
      * Gets the user's last name.
      * @return The user's last name.
      */
    /* static member */
    inline def getLastNameAsync(): IPromiseWithIAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastNameAsync")().asInstanceOf[IPromiseWithIAsyncOperation[String]]
    
    /**
      * Gets the principal name for the user. This name is the User Principal Name (typically the user's address, although this is not always true.)
      * @return The user's principal name.
      */
    /* static member */
    inline def getPrincipalNameAsync(): IPromiseWithIAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrincipalNameAsync")().asInstanceOf[IPromiseWithIAsyncOperation[String]]
    
    /**
      * Gets the Uniform Resource Identifier (URI) of the session initiation protocol for the user.
      * @return The URI of the session initiation protocol.
      */
    /* static member */
    inline def getSessionInitiationProtocolUriAsync(): IPromiseWithIAsyncOperation[Uri] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionInitiationProtocolUriAsync")().asInstanceOf[IPromiseWithIAsyncOperation[Uri]]
    
    /** Allows you to see if your app is allowed to access the user's information. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.nameAccessAllowed")
    @js.native
    def nameAccessAllowed: Boolean = js.native
    inline def nameAccessAllowed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nameAccessAllowed")(x.asInstanceOf[js.Any])
    
    /** Occurs when the user's image or name changes. */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserInformation.onaccountpicturechanged")
    @js.native
    def onaccountpicturechanged: EventHandler[Any] = js.native
    inline def onaccountpicturechanged_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onaccountpicturechanged")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_accountpicturechanged(`type`: accountpicturechanged, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sets the picture for the user's account using an IStorageFile object.
      * @param image A file that contains the image.
      * @return A value that indicates the success or failure of the operation.
      */
    /* static member */
    inline def setAccountPictureAsync(image: IStorageFile): IPromiseWithIAsyncOperation[SetAccountPictureResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAccountPictureAsync")(image.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[SetAccountPictureResult]]
    
    /**
      * Sets the picture for the user's account using an IRandomAccessStream object.
      * @param image The image.
      * @return A value that indicates the success or failure of the operation.
      */
    /* static member */
    inline def setAccountPictureFromStreamAsync(image: IRandomAccessStream): IPromiseWithIAsyncOperation[SetAccountPictureResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAccountPictureFromStreamAsync")(image.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[SetAccountPictureResult]]
    
    /**
      * Sets the pictures for the user's account using an IStorageFile object. Supports adding a small image, large image, and video.
      * @param smallImage A small version of the image.
      * @param largeImage A large version of the image.
      * @param video A video.
      * @return A value that indicates the success or failure of the operation.
      */
    /* static member */
    inline def setAccountPicturesAsync(smallImage: IStorageFile, largeImage: IStorageFile, video: IStorageFile): IPromiseWithIAsyncOperation[SetAccountPictureResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("setAccountPicturesAsync")(smallImage.asInstanceOf[js.Any], largeImage.asInstanceOf[js.Any], video.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[SetAccountPictureResult]]
    
    /**
      * Sets the pictures for the user's account using an IRandomAccessStream object. Supports adding a small image, large image, and video.
      * @param smallImage A small version of the image.
      * @param largeImage A large version of the image.
      * @param video A video.
      * @return A value that indicates the success or failure of the operation.
      */
    /* static member */
    inline def setAccountPicturesFromStreamsAsync(smallImage: IRandomAccessStream, largeImage: IRandomAccessStream, video: IRandomAccessStream): IPromiseWithIAsyncOperation[SetAccountPictureResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("setAccountPicturesFromStreamsAsync")(smallImage.asInstanceOf[js.Any], largeImage.asInstanceOf[js.Any], video.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[SetAccountPictureResult]]
  }
  
  /** Provides properties and methods to manage the user's desktop wallpaper and lock screen background image. */
  /* note: abstract class */ @JSGlobal("Windows.System.UserProfile.UserProfilePersonalizationSettings")
  @js.native
  open class UserProfilePersonalizationSettings ()
    extends StObject
       with typings.winrtUwp.Windows.System.UserProfile.UserProfilePersonalizationSettings {
    
    /**
      * Attempts to set the specified image file as the lock screen background image.
      * @param imageFile The image to set as the lock screen background.
      * @return The result of the async operation. true if the background image was set successfully; otherwise, false.
      */
    /* CompleteClass */
    override def trySetLockScreenImageAsync(imageFile: StorageFile): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Attempts to set the specified image file as the desktop wallpaper image.
      * @param imageFile The image to set as the desktop background.
      * @return The result of the async operation. true if the background image was set successfully; otherwise, false.
      */
    /* CompleteClass */
    override def trySetWallpaperImageAsync(imageFile: StorageFile): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
  object UserProfilePersonalizationSettings {
    
    @JSGlobal("Windows.System.UserProfile.UserProfilePersonalizationSettings")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the current instance of UserProfilePersonalizationSettings . */
    /* static member */
    @JSGlobal("Windows.System.UserProfile.UserProfilePersonalizationSettings.current")
    @js.native
    def current: typings.winrtUwp.Windows.System.UserProfile.UserProfilePersonalizationSettings = js.native
    inline def current_=(x: typings.winrtUwp.Windows.System.UserProfile.UserProfilePersonalizationSettings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
    
    /**
      * Gets a value that indicates whether changing the desktop and lock screen images is supported on the current device.
      * @return true if changing the desktop and lock screen images is supported; otherwise, false.
      */
    /* static member */
    inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  }
}
