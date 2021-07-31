package typings.winrt.global.Windows

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Globalization.DayOfWeek
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import typings.winrt.Windows.System.Threading.Core.SignalHandler
import typings.winrt.Windows.System.Threading.TimerDestroyedHandler
import typings.winrt.Windows.System.Threading.TimerElapsedHandler
import typings.winrt.Windows.System.Threading.WorkItemHandler
import typings.winrt.Windows.System.Threading.WorkItemOptions
import typings.winrt.Windows.System.Threading.WorkItemPriority
import typings.winrt.Windows.System.UserProfile.AccountPictureKind
import typings.winrt.Windows.System.UserProfile.SetAccountPictureResult
import typings.winrt.Windows.UI.Popups.Placement
import typings.winrt.Windows.UI.ViewManagement.ViewSizePreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object System {
  
  object Display {
    
    @JSGlobal("Windows.System.Display.DisplayRequest")
    @js.native
    class DisplayRequest ()
      extends StObject
         with typings.winrt.Windows.System.Display.DisplayRequest {
      
      /* CompleteClass */
      override def requestActive(): Unit = js.native
      
      /* CompleteClass */
      override def requestRelease(): Unit = js.native
    }
  }
  
  @JSGlobal("Windows.System.Launcher")
  @js.native
  class Launcher ()
    extends StObject
       with typings.winrt.Windows.System.Launcher
  /* static members */
  object Launcher {
    
    @JSGlobal("Windows.System.Launcher")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def launchFileAsync(file: IStorageFile): IAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("launchFileAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[Boolean]]
    @scala.inline
    def launchFileAsync(file: IStorageFile, options: typings.winrt.Windows.System.LauncherOptions): IAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("launchFileAsync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[Boolean]]
    
    @scala.inline
    def launchUriAsync(uri: Uri): IAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("launchUriAsync")(uri.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[Boolean]]
    @scala.inline
    def launchUriAsync(uri: Uri, options: typings.winrt.Windows.System.LauncherOptions): IAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("launchUriAsync")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[Boolean]]
  }
  
  @JSGlobal("Windows.System.LauncherOptions")
  @js.native
  class LauncherOptions ()
    extends StObject
       with typings.winrt.Windows.System.LauncherOptions {
    
    /* CompleteClass */
    var contentType: String = js.native
    
    /* CompleteClass */
    var desiredRemainingView: ViewSizePreference = js.native
    
    /* CompleteClass */
    var displayApplicationPicker: Boolean = js.native
    
    /* CompleteClass */
    var fallbackUri: Uri = js.native
    
    /* CompleteClass */
    var preferredApplicationDisplayName: String = js.native
    
    /* CompleteClass */
    var preferredApplicationPackageFamilyName: String = js.native
    
    /* CompleteClass */
    var treatAsUntrusted: Boolean = js.native
    
    /* CompleteClass */
    var uI: typings.winrt.Windows.System.LauncherUIOptions = js.native
  }
  
  @JSGlobal("Windows.System.LauncherUIOptions")
  @js.native
  class LauncherUIOptions ()
    extends StObject
       with typings.winrt.Windows.System.LauncherUIOptions {
    
    /* CompleteClass */
    var invocationPoint: Point = js.native
    
    /* CompleteClass */
    var preferredPlacement: Placement = js.native
    
    /* CompleteClass */
    var selectionRect: Rect = js.native
  }
  
  @JSGlobal("Windows.System.ProcessorArchitecture")
  @js.native
  object ProcessorArchitecture extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.System.ProcessorArchitecture & Double] = js.native
    
    /* 1 */ val arm: typings.winrt.Windows.System.ProcessorArchitecture.arm & Double = js.native
    
    /* 3 */ val neutral: typings.winrt.Windows.System.ProcessorArchitecture.neutral & Double = js.native
    
    /* 4 */ val unknown: typings.winrt.Windows.System.ProcessorArchitecture.unknown & Double = js.native
    
    /* 2 */ val x64: typings.winrt.Windows.System.ProcessorArchitecture.x64 & Double = js.native
    
    /* 0 */ val x86: typings.winrt.Windows.System.ProcessorArchitecture.x86 & Double = js.native
  }
  
  object Profile {
    
    @JSGlobal("Windows.System.Profile.HardwareIdentification")
    @js.native
    class HardwareIdentification ()
      extends StObject
         with typings.winrt.Windows.System.Profile.HardwareIdentification
    /* static members */
    object HardwareIdentification {
      
      @JSGlobal("Windows.System.Profile.HardwareIdentification")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def getPackageSpecificToken(nonce: IBuffer): typings.winrt.Windows.System.Profile.HardwareToken = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageSpecificToken")(nonce.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.System.Profile.HardwareToken]
    }
    
    @JSGlobal("Windows.System.Profile.HardwareToken")
    @js.native
    class HardwareToken ()
      extends StObject
         with typings.winrt.Windows.System.Profile.HardwareToken {
      
      /* CompleteClass */
      var certificate: IBuffer = js.native
      
      /* CompleteClass */
      var id: IBuffer = js.native
      
      /* CompleteClass */
      var signature: IBuffer = js.native
    }
  }
  
  object RemoteDesktop {
    
    @JSGlobal("Windows.System.RemoteDesktop.InteractiveSession")
    @js.native
    class InteractiveSession ()
      extends StObject
         with typings.winrt.Windows.System.RemoteDesktop.InteractiveSession
    /* static members */
    object InteractiveSession {
      
      @JSGlobal("Windows.System.RemoteDesktop.InteractiveSession")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.System.RemoteDesktop.InteractiveSession.isRemote")
      @js.native
      def isRemote: Boolean = js.native
      @scala.inline
      def isRemote_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRemote")(x.asInstanceOf[js.Any])
    }
  }
  
  object Threading {
    
    object Core {
      
      @JSGlobal("Windows.System.Threading.Core.PreallocatedWorkItem")
      @js.native
      class PreallocatedWorkItem protected ()
        extends StObject
           with typings.winrt.Windows.System.Threading.Core.PreallocatedWorkItem {
        def this(handler: WorkItemHandler) = this()
        def this(handler: WorkItemHandler, priority: WorkItemPriority) = this()
        def this(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions) = this()
        
        /* CompleteClass */
        override def runAsync(): IAsyncAction = js.native
      }
      
      @JSGlobal("Windows.System.Threading.Core.SignalNotifier")
      @js.native
      class SignalNotifier ()
        extends StObject
           with typings.winrt.Windows.System.Threading.Core.SignalNotifier {
        
        /* CompleteClass */
        override def enable(): Unit = js.native
        
        /* CompleteClass */
        override def terminate(): Unit = js.native
      }
      /* static members */
      object SignalNotifier {
        
        @JSGlobal("Windows.System.Threading.Core.SignalNotifier")
        @js.native
        val ^ : js.Any = js.native
        
        @scala.inline
        def attachToEvent(name: String, handler: SignalHandler): typings.winrt.Windows.System.Threading.Core.SignalNotifier = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToEvent")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.System.Threading.Core.SignalNotifier]
        @scala.inline
        def attachToEvent(name: String, handler: SignalHandler, timeout: Double): typings.winrt.Windows.System.Threading.Core.SignalNotifier = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToEvent")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.System.Threading.Core.SignalNotifier]
        
        @scala.inline
        def attachToSemaphore(name: String, handler: SignalHandler): typings.winrt.Windows.System.Threading.Core.SignalNotifier = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSemaphore")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.System.Threading.Core.SignalNotifier]
        @scala.inline
        def attachToSemaphore(name: String, handler: SignalHandler, timeout: Double): typings.winrt.Windows.System.Threading.Core.SignalNotifier = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSemaphore")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.System.Threading.Core.SignalNotifier]
      }
    }
    
    @JSGlobal("Windows.System.Threading.ThreadPool")
    @js.native
    class ThreadPool ()
      extends StObject
         with typings.winrt.Windows.System.Threading.ThreadPool
    /* static members */
    object ThreadPool {
      
      @JSGlobal("Windows.System.Threading.ThreadPool")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def runAsync(handler: WorkItemHandler): IAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("runAsync")(handler.asInstanceOf[js.Any]).asInstanceOf[IAsyncAction]
      @scala.inline
      def runAsync(handler: WorkItemHandler, priority: WorkItemPriority): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("runAsync")(handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
      @scala.inline
      def runAsync(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("runAsync")(handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
    }
    
    @JSGlobal("Windows.System.Threading.ThreadPoolTimer")
    @js.native
    class ThreadPoolTimer ()
      extends StObject
         with typings.winrt.Windows.System.Threading.ThreadPoolTimer {
      
      /* CompleteClass */
      override def cancel(): Unit = js.native
      
      /* CompleteClass */
      var delay: Double = js.native
      
      /* CompleteClass */
      var period: Double = js.native
    }
    /* static members */
    object ThreadPoolTimer {
      
      @JSGlobal("Windows.System.Threading.ThreadPoolTimer")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def createPeriodicTimer(handler: TimerElapsedHandler, period: Double): typings.winrt.Windows.System.Threading.ThreadPoolTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("createPeriodicTimer")(handler.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.System.Threading.ThreadPoolTimer]
      @scala.inline
      def createPeriodicTimer(handler: TimerElapsedHandler, period: Double, destroyed: TimerDestroyedHandler): typings.winrt.Windows.System.Threading.ThreadPoolTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("createPeriodicTimer")(handler.asInstanceOf[js.Any], period.asInstanceOf[js.Any], destroyed.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.System.Threading.ThreadPoolTimer]
      
      @scala.inline
      def createTimer(handler: TimerElapsedHandler, delay: Double): typings.winrt.Windows.System.Threading.ThreadPoolTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("createTimer")(handler.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.System.Threading.ThreadPoolTimer]
      @scala.inline
      def createTimer(handler: TimerElapsedHandler, delay: Double, destroyed: TimerDestroyedHandler): typings.winrt.Windows.System.Threading.ThreadPoolTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("createTimer")(handler.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], destroyed.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.System.Threading.ThreadPoolTimer]
    }
    
    @JSGlobal("Windows.System.Threading.WorkItemOptions")
    @js.native
    object WorkItemOptions extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.System.Threading.WorkItemOptions & Double] = js.native
      
      /* 0 */ val none: typings.winrt.Windows.System.Threading.WorkItemOptions.none & Double = js.native
      
      /* 1 */ val timeSliced: typings.winrt.Windows.System.Threading.WorkItemOptions.timeSliced & Double = js.native
    }
    
    @JSGlobal("Windows.System.Threading.WorkItemPriority")
    @js.native
    object WorkItemPriority extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.System.Threading.WorkItemPriority & Double] = js.native
      
      /* 2 */ val high: typings.winrt.Windows.System.Threading.WorkItemPriority.high & Double = js.native
      
      /* 0 */ val low: typings.winrt.Windows.System.Threading.WorkItemPriority.low & Double = js.native
      
      /* 1 */ val normal: typings.winrt.Windows.System.Threading.WorkItemPriority.normal & Double = js.native
    }
  }
  
  object UserProfile {
    
    @JSGlobal("Windows.System.UserProfile.AccountPictureKind")
    @js.native
    object AccountPictureKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.System.UserProfile.AccountPictureKind & Double] = js.native
      
      /* 1 */ val largeImage: typings.winrt.Windows.System.UserProfile.AccountPictureKind.largeImage & Double = js.native
      
      /* 0 */ val smallImage: typings.winrt.Windows.System.UserProfile.AccountPictureKind.smallImage & Double = js.native
      
      /* 2 */ val video: typings.winrt.Windows.System.UserProfile.AccountPictureKind.video & Double = js.native
    }
    
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences")
    @js.native
    class GlobalizationPreferences ()
      extends StObject
         with typings.winrt.Windows.System.UserProfile.GlobalizationPreferences
    /* static members */
    object GlobalizationPreferences {
      
      @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.calendars")
      @js.native
      def calendars: IVectorView[String] = js.native
      @scala.inline
      def calendars_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendars")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.clocks")
      @js.native
      def clocks: IVectorView[String] = js.native
      @scala.inline
      def clocks_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clocks")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.currencies")
      @js.native
      def currencies: IVectorView[String] = js.native
      @scala.inline
      def currencies_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currencies")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.homeGeographicRegion")
      @js.native
      def homeGeographicRegion: String = js.native
      @scala.inline
      def homeGeographicRegion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("homeGeographicRegion")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.languages")
      @js.native
      def languages: IVectorView[String] = js.native
      @scala.inline
      def languages_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languages")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.weekStartsOn")
      @js.native
      def weekStartsOn: DayOfWeek = js.native
      @scala.inline
      def weekStartsOn_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weekStartsOn")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.System.UserProfile.LockScreen")
    @js.native
    class LockScreen ()
      extends StObject
         with typings.winrt.Windows.System.UserProfile.LockScreen
    /* static members */
    object LockScreen {
      
      @JSGlobal("Windows.System.UserProfile.LockScreen")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def getImageStream(): IRandomAccessStream = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageStream")().asInstanceOf[IRandomAccessStream]
      
      @JSGlobal("Windows.System.UserProfile.LockScreen.originalImageFile")
      @js.native
      def originalImageFile: Uri = js.native
      @scala.inline
      def originalImageFile_=(x: Uri): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("originalImageFile")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageFileAsync(value: IStorageFile): IAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setImageFileAsync")(value.asInstanceOf[js.Any]).asInstanceOf[IAsyncAction]
      
      @scala.inline
      def setImageStreamAsync(value: IRandomAccessStream): IAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setImageStreamAsync")(value.asInstanceOf[js.Any]).asInstanceOf[IAsyncAction]
    }
    
    @JSGlobal("Windows.System.UserProfile.SetAccountPictureResult")
    @js.native
    object SetAccountPictureResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.System.UserProfile.SetAccountPictureResult & Double] = js.native
      
      /* 1 */ val changeDisabled: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.changeDisabled & Double = js.native
      
      /* 5 */ val failure: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.failure & Double = js.native
      
      /* 4 */ val fileSizeError: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.fileSizeError & Double = js.native
      
      /* 2 */ val largeOrDynamicError: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.largeOrDynamicError & Double = js.native
      
      /* 0 */ val success: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.success & Double = js.native
      
      /* 3 */ val videoFrameSizeError: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.videoFrameSizeError & Double = js.native
    }
    
    @JSGlobal("Windows.System.UserProfile.UserInformation")
    @js.native
    class UserInformation ()
      extends StObject
         with typings.winrt.Windows.System.UserProfile.UserInformation
    /* static members */
    object UserInformation {
      
      @JSGlobal("Windows.System.UserProfile.UserInformation")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.accountPictureChangeEnabled")
      @js.native
      def accountPictureChangeEnabled: Boolean = js.native
      @scala.inline
      def accountPictureChangeEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accountPictureChangeEnabled")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def getAccountPicture(kind: AccountPictureKind): IStorageFile = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountPicture")(kind.asInstanceOf[js.Any]).asInstanceOf[IStorageFile]
      
      @scala.inline
      def getDisplayNameAsync(): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayNameAsync")().asInstanceOf[IAsyncOperation[String]]
      
      @scala.inline
      def getDomainNameAsync(): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainNameAsync")().asInstanceOf[IAsyncOperation[String]]
      
      @scala.inline
      def getFirstNameAsync(): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstNameAsync")().asInstanceOf[IAsyncOperation[String]]
      
      @scala.inline
      def getLastNameAsync(): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastNameAsync")().asInstanceOf[IAsyncOperation[String]]
      
      @scala.inline
      def getPrincipalNameAsync(): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrincipalNameAsync")().asInstanceOf[IAsyncOperation[String]]
      
      @scala.inline
      def getSessionInitiationProtocolUriAsync(): IAsyncOperation[Uri] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionInitiationProtocolUriAsync")().asInstanceOf[IAsyncOperation[Uri]]
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.nameAccessAllowed")
      @js.native
      def nameAccessAllowed: Boolean = js.native
      @scala.inline
      def nameAccessAllowed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nameAccessAllowed")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.onaccountpicturechanged")
      @js.native
      def onaccountpicturechanged: js.Any = js.native
      @scala.inline
      def onaccountpicturechanged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onaccountpicturechanged")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountPictureAsync(image: IStorageFile): IAsyncOperation[SetAccountPictureResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAccountPictureAsync")(image.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[SetAccountPictureResult]]
      
      @scala.inline
      def setAccountPictureFromStreamAsync(image: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAccountPictureFromStreamAsync")(image.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[SetAccountPictureResult]]
      
      @scala.inline
      def setAccountPicturesAsync(smallImage: IStorageFile, largeImage: IStorageFile, video: IStorageFile): IAsyncOperation[SetAccountPictureResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("setAccountPicturesAsync")(smallImage.asInstanceOf[js.Any], largeImage.asInstanceOf[js.Any], video.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[SetAccountPictureResult]]
      
      @scala.inline
      def setAccountPicturesFromStreamsAsync(smallImage: IRandomAccessStream, largeImage: IRandomAccessStream, video: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("setAccountPicturesFromStreamsAsync")(smallImage.asInstanceOf[js.Any], largeImage.asInstanceOf[js.Any], video.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[SetAccountPictureResult]]
    }
  }
  
  @JSGlobal("Windows.System.VirtualKey")
  @js.native
  object VirtualKey extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.System.VirtualKey & Double] = js.native
    
    /* 53 */ val a: typings.winrt.Windows.System.VirtualKey.a & Double = js.native
    
    /* 25 */ val accept: typings.winrt.Windows.System.VirtualKey.accept & Double = js.native
    
    /* 94 */ val add: typings.winrt.Windows.System.VirtualKey.add & Double = js.native
    
    /* 81 */ val application: typings.winrt.Windows.System.VirtualKey.application & Double = js.native
    
    /* 54 */ val b: typings.winrt.Windows.System.VirtualKey.b & Double = js.native
    
    /* 7 */ val back: typings.winrt.Windows.System.VirtualKey.back & Double = js.native
    
    /* 55 */ val c: typings.winrt.Windows.System.VirtualKey.c & Double = js.native
    
    /* 3 */ val cancel: typings.winrt.Windows.System.VirtualKey.cancel & Double = js.native
    
    /* 15 */ val capitalLock: typings.winrt.Windows.System.VirtualKey.capitalLock & Double = js.native
    
    /* 9 */ val clear: typings.winrt.Windows.System.VirtualKey.clear & Double = js.native
    
    /* 12 */ val control: typings.winrt.Windows.System.VirtualKey.control & Double = js.native
    
    /* 23 */ val convert: typings.winrt.Windows.System.VirtualKey.convert & Double = js.native
    
    /* 56 */ val d: typings.winrt.Windows.System.VirtualKey.d & Double = js.native
    
    /* 97 */ val decimal: typings.winrt.Windows.System.VirtualKey.decimal & Double = js.native
    
    /* 41 */ val delete_ : typings.winrt.Windows.System.VirtualKey.delete_ & Double = js.native
    
    /* 98 */ val divide: typings.winrt.Windows.System.VirtualKey.divide & Double = js.native
    
    /* 35 */ val down: typings.winrt.Windows.System.VirtualKey.down & Double = js.native
    
    /* 57 */ val e: typings.winrt.Windows.System.VirtualKey.e & Double = js.native
    
    /* 30 */ val end: typings.winrt.Windows.System.VirtualKey.end & Double = js.native
    
    /* 10 */ val enter: typings.winrt.Windows.System.VirtualKey.enter & Double = js.native
    
    /* 22 */ val escape: typings.winrt.Windows.System.VirtualKey.escape & Double = js.native
    
    /* 38 */ val execute: typings.winrt.Windows.System.VirtualKey.execute & Double = js.native
    
    /* 58 */ val f: typings.winrt.Windows.System.VirtualKey.f & Double = js.native
    
    /* 99 */ val f1: typings.winrt.Windows.System.VirtualKey.f1 & Double = js.native
    
    /* 108 */ val f10: typings.winrt.Windows.System.VirtualKey.f10 & Double = js.native
    
    /* 109 */ val f11: typings.winrt.Windows.System.VirtualKey.f11 & Double = js.native
    
    /* 110 */ val f12: typings.winrt.Windows.System.VirtualKey.f12 & Double = js.native
    
    /* 111 */ val f13: typings.winrt.Windows.System.VirtualKey.f13 & Double = js.native
    
    /* 112 */ val f14: typings.winrt.Windows.System.VirtualKey.f14 & Double = js.native
    
    /* 113 */ val f15: typings.winrt.Windows.System.VirtualKey.f15 & Double = js.native
    
    /* 114 */ val f16: typings.winrt.Windows.System.VirtualKey.f16 & Double = js.native
    
    /* 115 */ val f17: typings.winrt.Windows.System.VirtualKey.f17 & Double = js.native
    
    /* 116 */ val f18: typings.winrt.Windows.System.VirtualKey.f18 & Double = js.native
    
    /* 117 */ val f19: typings.winrt.Windows.System.VirtualKey.f19 & Double = js.native
    
    /* 100 */ val f2: typings.winrt.Windows.System.VirtualKey.f2 & Double = js.native
    
    /* 118 */ val f20: typings.winrt.Windows.System.VirtualKey.f20 & Double = js.native
    
    /* 119 */ val f21: typings.winrt.Windows.System.VirtualKey.f21 & Double = js.native
    
    /* 120 */ val f22: typings.winrt.Windows.System.VirtualKey.f22 & Double = js.native
    
    /* 121 */ val f23: typings.winrt.Windows.System.VirtualKey.f23 & Double = js.native
    
    /* 122 */ val f24: typings.winrt.Windows.System.VirtualKey.f24 & Double = js.native
    
    /* 101 */ val f3: typings.winrt.Windows.System.VirtualKey.f3 & Double = js.native
    
    /* 102 */ val f4: typings.winrt.Windows.System.VirtualKey.f4 & Double = js.native
    
    /* 103 */ val f5: typings.winrt.Windows.System.VirtualKey.f5 & Double = js.native
    
    /* 104 */ val f6: typings.winrt.Windows.System.VirtualKey.f6 & Double = js.native
    
    /* 105 */ val f7: typings.winrt.Windows.System.VirtualKey.f7 & Double = js.native
    
    /* 106 */ val f8: typings.winrt.Windows.System.VirtualKey.f8 & Double = js.native
    
    /* 107 */ val f9: typings.winrt.Windows.System.VirtualKey.f9 & Double = js.native
    
    /* 19 */ val `final`: typings.winrt.Windows.System.VirtualKey.`final` & Double = js.native
    
    /* 59 */ val g: typings.winrt.Windows.System.VirtualKey.g & Double = js.native
    
    /* 60 */ val h: typings.winrt.Windows.System.VirtualKey.h & Double = js.native
    
    /* 17 */ val hangul: typings.winrt.Windows.System.VirtualKey.hangul & Double = js.native
    
    /* 20 */ val hanja: typings.winrt.Windows.System.VirtualKey.hanja & Double = js.native
    
    /* 42 */ val help: typings.winrt.Windows.System.VirtualKey.help & Double = js.native
    
    /* 31 */ val home: typings.winrt.Windows.System.VirtualKey.home & Double = js.native
    
    /* 61 */ val i: typings.winrt.Windows.System.VirtualKey.i & Double = js.native
    
    /* 40 */ val insert: typings.winrt.Windows.System.VirtualKey.insert & Double = js.native
    
    /* 62 */ val j: typings.winrt.Windows.System.VirtualKey.j & Double = js.native
    
    /* 18 */ val junja: typings.winrt.Windows.System.VirtualKey.junja & Double = js.native
    
    /* 63 */ val k: typings.winrt.Windows.System.VirtualKey.k & Double = js.native
    
    /* 16 */ val kana: typings.winrt.Windows.System.VirtualKey.kana & Double = js.native
    
    /* 21 */ val kanji: typings.winrt.Windows.System.VirtualKey.kanji & Double = js.native
    
    /* 64 */ val l: typings.winrt.Windows.System.VirtualKey.l & Double = js.native
    
    /* 32 */ val left: typings.winrt.Windows.System.VirtualKey.left & Double = js.native
    
    /* 1 */ val leftButton: typings.winrt.Windows.System.VirtualKey.leftButton & Double = js.native
    
    /* 127 */ val leftControl: typings.winrt.Windows.System.VirtualKey.leftControl & Double = js.native
    
    /* 129 */ val leftMenu: typings.winrt.Windows.System.VirtualKey.leftMenu & Double = js.native
    
    /* 125 */ val leftShift: typings.winrt.Windows.System.VirtualKey.leftShift & Double = js.native
    
    /* 79 */ val leftWindows: typings.winrt.Windows.System.VirtualKey.leftWindows & Double = js.native
    
    /* 65 */ val m: typings.winrt.Windows.System.VirtualKey.m & Double = js.native
    
    /* 13 */ val menu: typings.winrt.Windows.System.VirtualKey.menu & Double = js.native
    
    /* 4 */ val middleButton: typings.winrt.Windows.System.VirtualKey.middleButton & Double = js.native
    
    /* 26 */ val modeChange: typings.winrt.Windows.System.VirtualKey.modeChange & Double = js.native
    
    /* 93 */ val multiply: typings.winrt.Windows.System.VirtualKey.multiply & Double = js.native
    
    /* 66 */ val n: typings.winrt.Windows.System.VirtualKey.n & Double = js.native
    
    /* 24 */ val nonConvert: typings.winrt.Windows.System.VirtualKey.nonConvert & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.System.VirtualKey.none & Double = js.native
    
    /* 43 */ val number0: typings.winrt.Windows.System.VirtualKey.number0 & Double = js.native
    
    /* 44 */ val number1: typings.winrt.Windows.System.VirtualKey.number1 & Double = js.native
    
    /* 45 */ val number2: typings.winrt.Windows.System.VirtualKey.number2 & Double = js.native
    
    /* 46 */ val number3: typings.winrt.Windows.System.VirtualKey.number3 & Double = js.native
    
    /* 47 */ val number4: typings.winrt.Windows.System.VirtualKey.number4 & Double = js.native
    
    /* 48 */ val number5: typings.winrt.Windows.System.VirtualKey.number5 & Double = js.native
    
    /* 49 */ val number6: typings.winrt.Windows.System.VirtualKey.number6 & Double = js.native
    
    /* 50 */ val number7: typings.winrt.Windows.System.VirtualKey.number7 & Double = js.native
    
    /* 51 */ val number8: typings.winrt.Windows.System.VirtualKey.number8 & Double = js.native
    
    /* 52 */ val number9: typings.winrt.Windows.System.VirtualKey.number9 & Double = js.native
    
    /* 123 */ val numberKeyLock: typings.winrt.Windows.System.VirtualKey.numberKeyLock & Double = js.native
    
    /* 83 */ val numberPad0: typings.winrt.Windows.System.VirtualKey.numberPad0 & Double = js.native
    
    /* 84 */ val numberPad1: typings.winrt.Windows.System.VirtualKey.numberPad1 & Double = js.native
    
    /* 85 */ val numberPad2: typings.winrt.Windows.System.VirtualKey.numberPad2 & Double = js.native
    
    /* 86 */ val numberPad3: typings.winrt.Windows.System.VirtualKey.numberPad3 & Double = js.native
    
    /* 87 */ val numberPad4: typings.winrt.Windows.System.VirtualKey.numberPad4 & Double = js.native
    
    /* 88 */ val numberPad5: typings.winrt.Windows.System.VirtualKey.numberPad5 & Double = js.native
    
    /* 89 */ val numberPad6: typings.winrt.Windows.System.VirtualKey.numberPad6 & Double = js.native
    
    /* 90 */ val numberPad7: typings.winrt.Windows.System.VirtualKey.numberPad7 & Double = js.native
    
    /* 91 */ val numberPad8: typings.winrt.Windows.System.VirtualKey.numberPad8 & Double = js.native
    
    /* 92 */ val numberPad9: typings.winrt.Windows.System.VirtualKey.numberPad9 & Double = js.native
    
    /* 67 */ val o: typings.winrt.Windows.System.VirtualKey.o & Double = js.native
    
    /* 68 */ val p: typings.winrt.Windows.System.VirtualKey.p & Double = js.native
    
    /* 29 */ val pageDown: typings.winrt.Windows.System.VirtualKey.pageDown & Double = js.native
    
    /* 28 */ val pageUp: typings.winrt.Windows.System.VirtualKey.pageUp & Double = js.native
    
    /* 14 */ val pause: typings.winrt.Windows.System.VirtualKey.pause & Double = js.native
    
    /* 37 */ val print: typings.winrt.Windows.System.VirtualKey.print & Double = js.native
    
    /* 69 */ val q: typings.winrt.Windows.System.VirtualKey.q & Double = js.native
    
    /* 70 */ val r: typings.winrt.Windows.System.VirtualKey.r & Double = js.native
    
    /* 34 */ val right: typings.winrt.Windows.System.VirtualKey.right & Double = js.native
    
    /* 2 */ val rightButton: typings.winrt.Windows.System.VirtualKey.rightButton & Double = js.native
    
    /* 128 */ val rightControl: typings.winrt.Windows.System.VirtualKey.rightControl & Double = js.native
    
    /* 130 */ val rightMenu: typings.winrt.Windows.System.VirtualKey.rightMenu & Double = js.native
    
    /* 126 */ val rightShift: typings.winrt.Windows.System.VirtualKey.rightShift & Double = js.native
    
    /* 80 */ val rightWindows: typings.winrt.Windows.System.VirtualKey.rightWindows & Double = js.native
    
    /* 71 */ val s: typings.winrt.Windows.System.VirtualKey.s & Double = js.native
    
    /* 124 */ val scroll: typings.winrt.Windows.System.VirtualKey.scroll & Double = js.native
    
    /* 36 */ val select: typings.winrt.Windows.System.VirtualKey.select & Double = js.native
    
    /* 95 */ val separator: typings.winrt.Windows.System.VirtualKey.separator & Double = js.native
    
    /* 11 */ val shift: typings.winrt.Windows.System.VirtualKey.shift & Double = js.native
    
    /* 82 */ val sleep: typings.winrt.Windows.System.VirtualKey.sleep & Double = js.native
    
    /* 39 */ val snapshot: typings.winrt.Windows.System.VirtualKey.snapshot & Double = js.native
    
    /* 27 */ val space: typings.winrt.Windows.System.VirtualKey.space & Double = js.native
    
    /* 96 */ val subtract: typings.winrt.Windows.System.VirtualKey.subtract & Double = js.native
    
    /* 72 */ val t: typings.winrt.Windows.System.VirtualKey.t & Double = js.native
    
    /* 8 */ val tab: typings.winrt.Windows.System.VirtualKey.tab & Double = js.native
    
    /* 73 */ val u: typings.winrt.Windows.System.VirtualKey.u & Double = js.native
    
    /* 33 */ val up: typings.winrt.Windows.System.VirtualKey.up & Double = js.native
    
    /* 74 */ val v: typings.winrt.Windows.System.VirtualKey.v & Double = js.native
    
    /* 75 */ val w: typings.winrt.Windows.System.VirtualKey.w & Double = js.native
    
    /* 76 */ val x: typings.winrt.Windows.System.VirtualKey.x & Double = js.native
    
    /* 5 */ val xButton1: typings.winrt.Windows.System.VirtualKey.xButton1 & Double = js.native
    
    /* 6 */ val xButton2: typings.winrt.Windows.System.VirtualKey.xButton2 & Double = js.native
    
    /* 77 */ val y: typings.winrt.Windows.System.VirtualKey.y & Double = js.native
    
    /* 78 */ val z: typings.winrt.Windows.System.VirtualKey.z & Double = js.native
  }
  
  @JSGlobal("Windows.System.VirtualKeyModifiers")
  @js.native
  object VirtualKeyModifiers extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.System.VirtualKeyModifiers & Double] = js.native
    
    /* 1 */ val control: typings.winrt.Windows.System.VirtualKeyModifiers.control & Double = js.native
    
    /* 2 */ val menu: typings.winrt.Windows.System.VirtualKeyModifiers.menu & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.System.VirtualKeyModifiers.none & Double = js.native
    
    /* 3 */ val shift: typings.winrt.Windows.System.VirtualKeyModifiers.shift & Double = js.native
    
    /* 4 */ val windows: typings.winrt.Windows.System.VirtualKeyModifiers.windows & Double = js.native
  }
}
