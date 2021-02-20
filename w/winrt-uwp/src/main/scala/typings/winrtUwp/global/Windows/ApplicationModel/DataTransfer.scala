package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.winrtUwpStrings.contentchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes that are used to exchange data between a source app and a target app. These classes are used in share and clipboard operations. */
object DataTransfer {
  
  /** Gets and sets information from the clipboard object. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard")
  @js.native
  abstract class Clipboard ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.Clipboard
  object Clipboard {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.addEventListener")
    @js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.addEventListener")
    @js.native
    def addEventListener_contentchanged(`type`: contentchanged, listener: EventHandler[_]): Unit = js.native
    
    /** Removes all data from the Clipboard. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.clear")
    @js.native
    def clear(): Unit = js.native
    
    /** Adds the content to the Clipboard and releases the DataPackage object from the source app. This method allows the content to remain available after the application shuts down. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.flush")
    @js.native
    def flush(): Unit = js.native
    
    /**
      * Gets the current content that is stored in the clipboard object.
      * @return Contains the content of the Clipboard.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.getContent")
    @js.native
    def getContent(): typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageView = js.native
    
    /** Occurs when the data stored in the Clipboard changes. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.oncontentchanged")
    @js.native
    def oncontentchanged: EventHandler[js.Any] = js.native
    @scala.inline
    def oncontentchanged_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oncontentchanged")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.removeEventListener")
    @js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.removeEventListener")
    @js.native
    def removeEventListener_contentchanged(`type`: contentchanged, listener: EventHandler[_]): Unit = js.native
    
    /**
      * Sets the current content that is stored in the clipboard object.
      * @param content Contains the content of the clipboard. If NULL, the clipboard is emptied.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.setContent")
    @js.native
    def setContent(content: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackage): Unit = js.native
  }
  
  /** Contains the data that a user wants to exchange with another app. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackage")
  @js.native
  /** Constructor that creates a new DataPackage . */
  class DataPackage ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackage
  
  /** Specifies the operation to perform on the DataPackage in clipboard and drag and drop scenarios. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageOperation")
  @js.native
  object DataPackageOperation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation with Double
      ] = js.native
    
    /* 1 */ val copy: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.copy with Double = js.native
    
    /* 3 */ val link: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.link with Double = js.native
    
    /* 2 */ val move: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.move with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.none with Double = js.native
  }
  
  /** Defines a set of properties to use with a DataPackage object. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySet")
  @js.native
  abstract class DataPackagePropertySet ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet
  
  /** Gets the set of properties of a DataPackageView object. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySetView")
  @js.native
  abstract class DataPackagePropertySetView ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackagePropertySetView
  
  /** A read-only version of a DataPackage . Apps that receive shared content get this object when acquiring content. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageView")
  @js.native
  abstract class DataPackageView ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageView
  
  /** Used by a source app's deferral delegate to notify a DataPackage object that the source app will produce data from another asynchronous function. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataProviderDeferral")
  @js.native
  abstract class DataProviderDeferral ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataProviderDeferral
  
  /** An object of this type is passed to the DataProviderHandler delegate. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataProviderRequest")
  @js.native
  abstract class DataProviderRequest ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataProviderRequest
  
  /** Lets your app supply the content the user wants to share or specify a message, if an error occurs. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequest")
  @js.native
  abstract class DataRequest ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataRequest
  
  /** Enables you to exchange content with a target app asynchronously. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequestDeferral")
  @js.native
  abstract class DataRequestDeferral ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataRequestDeferral
  
  /** Contains information about the DataRequested event. The system fires this event when the user invokes the Share UI. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequestedEventArgs")
  @js.native
  abstract class DataRequestedEventArgs ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataRequestedEventArgs
  
  /** Programmatically initiates an exchange of content with other apps. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
  @js.native
  abstract class DataTransferManager ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataTransferManager
  object DataTransferManager {
    
    /**
      * Returns the DataTransferManager object associated with the current window.
      * @return The DataTransferManager object associated with the current window.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataTransferManager = js.native
    
    /** Programmatically initiates the user interface for sharing content with another app. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager.showShareUI")
    @js.native
    def showShareUI(): Unit = js.native
  }
  
  /** Responsible for formatting HTML content that you want to share or add to the Clipboard. Also allows you to get HTML fragments from the content. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.HtmlFormatHelper")
  @js.native
  abstract class HtmlFormatHelper ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.HtmlFormatHelper
  object HtmlFormatHelper {
    
    /**
      * Takes a string that represents HTML content and adds the necessary headers to ensure it is formatted correctly for share and Clipboard operations.
      * @param htmlFragment A string representing the HTML content.
      * @return A string representing the formatted HTML.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.HtmlFormatHelper.createHtmlFormat")
    @js.native
    def createHtmlFormat(htmlFragment: String): String = js.native
    
    /**
      * Gets a string that represents an HTML fragment.
      * @param htmlFormat The formatted HTML.
      * @return An HTML fragment based on the formatted HTML.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.HtmlFormatHelper.getStaticFragment")
    @js.native
    def getStaticFragment(htmlFormat: String): String = js.native
  }
  
  /** Contains info about the action that a target app completed during a paste operation. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.OperationCompletedEventArgs")
  @js.native
  abstract class OperationCompletedEventArgs ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.OperationCompletedEventArgs
  
  /** Contains the classes and events that a target app uses to complete share operations and create shortcuts, called QuickLinks, that the system can use to streamline future sharing operations to the app. */
  object ShareTarget {
    
    /** Represents shortcuts that help users share content with the apps they use most. */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.ShareTarget.QuickLink")
    @js.native
    /** Creates a new instance of a QuickLink object. */
    class QuickLink ()
      extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.ShareTarget.QuickLink
    
    /** Handles the bulk of the work during a share operation. This includes the data that the user wants to share, setting or removing QuickLinks, and informing the system about the status of the operation. */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation")
    @js.native
    abstract class ShareOperation ()
      extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
  }
  
  /** Enables an app to share a file with another app by passing a token as part of a Uri activation. The target app redeems the token to get the file shared by the source app. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.SharedStorageAccessManager")
  @js.native
  abstract class SharedStorageAccessManager ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.SharedStorageAccessManager
  object SharedStorageAccessManager {
    
    /**
      * Gets the sharing token that enables an app to share the specified file with another app.
      * @param file The file to share with the target app.
      * @return The sharing token to provide to the target app as part of a Uri activation.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.SharedStorageAccessManager.addFile")
    @js.native
    def addFile(file: IStorageFile): String = js.native
    
    /**
      * Gets a file shared by another app by providing the sharing token received from the source app.
      * @param token The sharing token for the shared file.
      * @return A wrapper object that contains the shared file.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.SharedStorageAccessManager.redeemTokenForFileAsync")
    @js.native
    def redeemTokenForFileAsync(token: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
    
    /**
      * Revokes an existing sharing token.
      * @param token The sharing token to revoke.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.SharedStorageAccessManager.removeFile")
    @js.native
    def removeFile(token: String): Unit = js.native
  }
  
  /** Contains static properties that return string values. Each string corresponds to a known format ID. Use this class to avoid errors in using string constants to specify data formats. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats")
  @js.native
  abstract class StandardDataFormats ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.StandardDataFormats
  object StandardDataFormats {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats")
    @js.native
    val ^ : js.Any = js.native
    
    /** A read-only property that returns the format ID string value corresponding to the activation link format. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.applicationLink")
    @js.native
    def applicationLink: String = js.native
    @scala.inline
    def applicationLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("applicationLink")(x.asInstanceOf[js.Any])
    
    /** A read-only property that returns the format ID string value corresponding to the Bitmap format. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.bitmap")
    @js.native
    def bitmap: String = js.native
    @scala.inline
    def bitmap_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitmap")(x.asInstanceOf[js.Any])
    
    /** A read-only property that returns the format ID string value corresponding to the HTML format. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.html")
    @js.native
    def html: String = js.native
    @scala.inline
    def html_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
    
    /** A read-only property that returns the format ID string value corresponding to the Rich Text Format (RTF). */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.rtf")
    @js.native
    def rtf: String = js.native
    @scala.inline
    def rtf_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rtf")(x.asInstanceOf[js.Any])
    
    /** A read-only property that returns the format ID string value corresponding to the StorageItem format. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.storageItems")
    @js.native
    def storageItems: String = js.native
    @scala.inline
    def storageItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storageItems")(x.asInstanceOf[js.Any])
    
    /** A read-only property that returns the format ID string value corresponding to the Text format. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.text")
    @js.native
    def text: String = js.native
    @scala.inline
    def text_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
    
    /** A read-only property that returns the format ID string value corresponding to the Uniform Resource Identifier (URI) format. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.uri")
    @js.native
    def uri: String = js.native
    @scala.inline
    def uri_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uri")(x.asInstanceOf[js.Any])
    
    /** A read-only property that returns the format ID string value corresponding to the web link format. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.webLink")
    @js.native
    def webLink: String = js.native
    @scala.inline
    def webLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webLink")(x.asInstanceOf[js.Any])
  }
  
  /** Contains information about the target app the user chose to share content with. To get this object, you must handle the TargetApplicationChosen event. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.TargetApplicationChosenEventArgs")
  @js.native
  abstract class TargetApplicationChosenEventArgs ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.TargetApplicationChosenEventArgs
}
