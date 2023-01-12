package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.anon.Second
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables apps get information about users, set globalization preferences, and control the lock screen image. */
object UserProfile {
  
  @js.native
  sealed trait AccountPictureKind extends StObject
  /** Allows you to request a specific image type when using GetAccountPicture . */
  @JSGlobal("Windows.System.UserProfile.AccountPictureKind")
  @js.native
  object AccountPictureKind extends StObject {
    
    /** Indicates you want the large image for the user's account. */
    @js.native
    sealed trait largeImage
      extends StObject
         with AccountPictureKind
    
    /** Indicates you want the small image for the user's account. */
    @js.native
    sealed trait smallImage
      extends StObject
         with AccountPictureKind
    
    /** Indicates you want the video for the user's account. */
    @js.native
    sealed trait video
      extends StObject
         with AccountPictureKind
  }
  
  @js.native
  sealed trait SetAccountPictureResult extends StObject
  /** A result that is returned when you try to set the image for a user account. */
  @JSGlobal("Windows.System.UserProfile.SetAccountPictureResult")
  @js.native
  object SetAccountPictureResult extends StObject {
    
    /** Indicates that the picture was not set because the AccountPictureChangeEnabled property is disabled, or the user cancelled the consent prompt. */
    @js.native
    sealed trait changeDisabled
      extends StObject
         with SetAccountPictureResult
    
    /** Indicates the picture or video was not set. */
    @js.native
    sealed trait failure
      extends StObject
         with SetAccountPictureResult
    
    /** Indicates the picture was not set because the file size was too large. */
    @js.native
    sealed trait fileSizeError
      extends StObject
         with SetAccountPictureResult
    
    /** Indicates that the picture was not set because the picture was too large. */
    @js.native
    sealed trait largeOrDynamicError
      extends StObject
         with SetAccountPictureResult
    
    /** Indicates the picture was successfully set. */
    @js.native
    sealed trait success
      extends StObject
         with SetAccountPictureResult
    
    /** Indicates that the video was not set because of its frame size was too large. */
    @js.native
    sealed trait videoFrameSizeError
      extends StObject
         with SetAccountPictureResult
  }
  
  @js.native
  sealed trait SetImageFeedResult extends StObject
  /** Specifies the result of a call to LockScreen.RequestSetImageFeedAsync */
  @JSGlobal("Windows.System.UserProfile.SetImageFeedResult")
  @js.native
  object SetImageFeedResult extends StObject {
    
    /** The feed was not set because the lock screen image slide show is disabled by group policy. */
    @js.native
    sealed trait changeDisabled
      extends StObject
         with SetImageFeedResult
    
    /** The image feed was set successfully. */
    @js.native
    sealed trait success
      extends StObject
         with SetImageFeedResult
    
    /** The operation was canceled by the user. */
    @js.native
    sealed trait userCanceled
      extends StObject
         with SetImageFeedResult
  }
  
  /** Provides a property that lets the caller retrieve the advertising ID, which is an ID used to provide more relevant advertising by understanding which apps are used by the user and how they are used, and to improve quality of service by determining the frequency and effectiveness of ads and to detect fraud and security issues. */
  trait AdvertisingManager extends StObject
  
  /** Represents a collection of settings that a user can opt-in to during the first run experience. */
  trait FirstSignInSettings extends StObject {
    
    /**
      * Returns an iterator for the items in the collection.
      * @return The iterator.
      */
    def first(): IIterator[IKeyValuePair[Any, Any]]
    
    /**
      * Determines whether the map view contains the specified key.
      * @param key The key to locate in the map view.
      * @return true if the key is found; otherwise, false.
      */
    def hasKey(key: String): Boolean
    
    /**
      * Returns the item in the map view with the specified key.
      * @param key The key to locate in the map view.
      * @return The item associated with the specified key.
      */
    def lookup(key: String): Any
    
    /** Returns the number of elements in the map. */
    var size: Double
    
    /**
      * Splits the map view into two views.
      */
    def split(): Second
  }
  object FirstSignInSettings {
    
    inline def apply(
      first: () => IIterator[IKeyValuePair[Any, Any]],
      hasKey: String => Boolean,
      lookup: String => Any,
      size: Double,
      split: () => Second
    ): FirstSignInSettings = {
      val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
      __obj.asInstanceOf[FirstSignInSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirstSignInSettings] (val x: Self) extends AnyVal {
      
      inline def setFirst(value: () => IIterator[IKeyValuePair[Any, Any]]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setHasKey(value: String => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
      
      inline def setLookup(value: String => Any): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSplit(value: () => Second): Self = StObject.set(x, "split", js.Any.fromFunction0(value))
    }
  }
  
  /** A static class for holding various user globalization preferences. */
  trait GlobalizationPreferences extends StObject
  
  /** Provides properties and methods to manage the full-screen image used as the lock screen background. */
  trait LockScreen extends StObject
  
  /** Represents information about the user, such as name and account picture. */
  trait UserInformation extends StObject
  
  /** Provides properties and methods to manage the user's desktop wallpaper and lock screen background image. */
  trait UserProfilePersonalizationSettings extends StObject {
    
    /**
      * Attempts to set the specified image file as the lock screen background image.
      * @param imageFile The image to set as the lock screen background.
      * @return The result of the async operation. true if the background image was set successfully; otherwise, false.
      */
    def trySetLockScreenImageAsync(imageFile: StorageFile): IPromiseWithIAsyncOperation[Boolean]
    
    /**
      * Attempts to set the specified image file as the desktop wallpaper image.
      * @param imageFile The image to set as the desktop background.
      * @return The result of the async operation. true if the background image was set successfully; otherwise, false.
      */
    def trySetWallpaperImageAsync(imageFile: StorageFile): IPromiseWithIAsyncOperation[Boolean]
  }
  object UserProfilePersonalizationSettings {
    
    inline def apply(
      trySetLockScreenImageAsync: StorageFile => IPromiseWithIAsyncOperation[Boolean],
      trySetWallpaperImageAsync: StorageFile => IPromiseWithIAsyncOperation[Boolean]
    ): UserProfilePersonalizationSettings = {
      val __obj = js.Dynamic.literal(trySetLockScreenImageAsync = js.Any.fromFunction1(trySetLockScreenImageAsync), trySetWallpaperImageAsync = js.Any.fromFunction1(trySetWallpaperImageAsync))
      __obj.asInstanceOf[UserProfilePersonalizationSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserProfilePersonalizationSettings] (val x: Self) extends AnyVal {
      
      inline def setTrySetLockScreenImageAsync(value: StorageFile => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "trySetLockScreenImageAsync", js.Any.fromFunction1(value))
      
      inline def setTrySetWallpaperImageAsync(value: StorageFile => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "trySetWallpaperImageAsync", js.Any.fromFunction1(value))
    }
  }
}
