package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import typings.winrtUwp.Windows.UI.Color
import typings.winrtUwp.anon.Second
import typings.winrtUwp.winrtUwpStrings.contentchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes that are used to exchange data between a source app and a target app. These classes are used in share and clipboard operations. */
object DataTransfer {
  
  /** Gets and sets information from the clipboard object. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard")
  @js.native
  abstract class Clipboard ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.Clipboard
  object Clipboard {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_contentchanged(`type`: contentchanged, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Removes all data from the Clipboard. */
    /* static member */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    /** Adds the content to the Clipboard and releases the DataPackage object from the source app. This method allows the content to remain available after the application shuts down. */
    /* static member */
    inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
    
    /**
      * Gets the current content that is stored in the clipboard object.
      * @return Contains the content of the Clipboard.
      */
    /* static member */
    inline def getContent(): typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageView = ^.asInstanceOf[js.Dynamic].applyDynamic("getContent")().asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageView]
    
    /** Occurs when the data stored in the Clipboard changes. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.oncontentchanged")
    @js.native
    def oncontentchanged: EventHandler[Any] = js.native
    inline def oncontentchanged_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oncontentchanged")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_contentchanged(`type`: contentchanged, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sets the current content that is stored in the clipboard object.
      * @param content Contains the content of the clipboard. If NULL, the clipboard is emptied.
      */
    /* static member */
    inline def setContent(content: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackage): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContent")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /** Contains the data that a user wants to exchange with another app. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackage")
  @js.native
  /** Constructor that creates a new DataPackage . */
  open class DataPackage ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackage
  
  /** Specifies the operation to perform on the DataPackage in clipboard and drag and drop scenarios. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageOperation")
  @js.native
  object DataPackageOperation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation & Double
      ] = js.native
    
    /* 1 */ val copy: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.copy & Double = js.native
    
    /* 3 */ val link: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.link & Double = js.native
    
    /* 2 */ val move: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.move & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation.none & Double = js.native
  }
  
  /** Defines a set of properties to use with a DataPackage object. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySet")
  @js.native
  abstract class DataPackagePropertySet ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet {
    
    /** Gets or sets the Uniform Resource Identifier (URI) of the app's location in the Windows Store. */
    /* CompleteClass */
    var applicationListingUri: Uri = js.native
    
    /** Gets or sets the name of the app that created the DataPackage object. */
    /* CompleteClass */
    var applicationName: String = js.native
    
    /** Removes all items from the property set. */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /** Gets or sets the application link to the content from the source app. */
    /* CompleteClass */
    var contentSourceApplicationLink: Uri = js.native
    
    /** Provides a web link to shared content that's currently displayed in the app. */
    /* CompleteClass */
    var contentSourceWebLink: Uri = js.native
    
    /** Gets or sets text that describes the contents of the DataPackage . */
    /* CompleteClass */
    var description: String = js.native
    
    /** Gets or sets the enterprise identity (see Enterprise data protection). */
    /* CompleteClass */
    var enterpriseId: String = js.native
    
    /** Specifies a vector object that contains the types of files stored in the DataPackage object. */
    /* CompleteClass */
    var fileTypes: IVector[String] = js.native
    
    /**
      * Returns an iterator to enumerate the items in the property set.
      * @return The first item in the DataPackage object.
      */
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[Any, Any]] = js.native
    
    /**
      * Gets an immutable view of the property set.
      * @return The immutable view.
      */
    /* CompleteClass */
    override def getView(): IMapView[String, Any] = js.native
    
    /**
      * Indicates whether the DataPackagePropertySet object contains a specific property.
      * @param key The key.
      * @return True if the property set has an item with the specified key; otherwise false.
      */
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    
    /**
      * Adds a property to the DataPackagePropertySet object.
      * @param key The key to insert.
      * @param value The value to insert.
      * @return True if the method replaced a value that already existed for the key; false if this is a new key.
      */
    /* CompleteClass */
    override def insert(key: String, value: Any): Boolean = js.native
    
    /** Gets or sets a background color for the sharing app's Square30x30Logo . */
    /* CompleteClass */
    var logoBackgroundColor: Color = js.native
    
    /**
      * Retrieves the value of a specific property.
      * @param key The key.
      * @return The value, if an item with the specified key exists. Otherwise, an error code.
      */
    /* CompleteClass */
    override def lookup(key: String): Any = js.native
    
    /** Gets or sets the package family name of the source app. */
    /* CompleteClass */
    var packageFamilyName: String = js.native
    
    /**
      * Removes an item from the property set.
      * @param key The key.
      */
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
    
    /** Gets the number of items that are contained in the property set. */
    /* CompleteClass */
    var size: Double = js.native
    
    /** Gets or sets the source app's logo. */
    /* CompleteClass */
    var square30x30Logo: IRandomAccessStreamReference = js.native
    
    /** Gets or sets a thumbnail image for the DataPackage . */
    /* CompleteClass */
    var thumbnail: IRandomAccessStreamReference = js.native
    
    /** Gets or sets the text that displays as a title for the contents of the DataPackage object. */
    /* CompleteClass */
    var title: String = js.native
  }
  
  /** Gets the set of properties of a DataPackageView object. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySetView")
  @js.native
  abstract class DataPackagePropertySetView ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackagePropertySetView {
    
    /** Gets the Uniform Resource Identifier (URI) of the app's location in the Windows Store. */
    /* CompleteClass */
    var applicationListingUri: Uri = js.native
    
    /** Gets the name of the app that created the DataPackage object. */
    /* CompleteClass */
    var applicationName: String = js.native
    
    /** Gets the application link to the content from the source app. */
    /* CompleteClass */
    var contentSourceApplicationLink: Uri = js.native
    
    /** Gets a web link to shared content that's currently displayed in the app. */
    /* CompleteClass */
    var contentSourceWebLink: Uri = js.native
    
    /** Gets the text that describes the contents of the DataPackage . */
    /* CompleteClass */
    var description: String = js.native
    
    /** Gets or sets the enterprise Id. */
    /* CompleteClass */
    var enterpriseId: String = js.native
    
    /** Gets a vector object that contains the types of files stored in the DataPackage object. */
    /* CompleteClass */
    var fileTypes: IVectorView[String] = js.native
    
    /**
      * Returns an iterator to enumerate the items in the property set.
      * @return The first item in the DataPackage object.
      */
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[Any, Any]] = js.native
    
    /**
      * Indicates whether the DataPackagePropertySetView object contains a specific property.
      * @param key The key.
      * @return True if the property set has an item with the specified key; otherwise false.
      */
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    
    /** Gets a background color for the sharing app's Square30x30Logo . */
    /* CompleteClass */
    var logoBackgroundColor: Color = js.native
    
    /**
      * Retrieves the value of a specific property.
      * @param key The key.
      * @return The value, if an item with the specified key exists. Otherwise, an error code.
      */
    /* CompleteClass */
    override def lookup(key: String): Any = js.native
    
    /** Gets the package family name of the source app. */
    /* CompleteClass */
    var packageFamilyName: String = js.native
    
    /** Gets the number of items that are contained in the property set. */
    /* CompleteClass */
    var size: Double = js.native
    
    /**
      * Divides the object into two views
      */
    /* CompleteClass */
    override def split(): Second = js.native
    
    /** Gets the source app's logo. */
    /* CompleteClass */
    var square30x30Logo: IRandomAccessStreamReference = js.native
    
    /** Gets the thumbnail image for the DataPackageView . */
    /* CompleteClass */
    var thumbnail: RandomAccessStreamReference = js.native
    
    /** Gets the text that displays as a title for the contents of the DataPackagePropertySetView object. */
    /* CompleteClass */
    var title: String = js.native
  }
  
  /** A read-only version of a DataPackage . Apps that receive shared content get this object when acquiring content. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageView")
  @js.native
  abstract class DataPackageView ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageView
  
  /** Used by a source app's deferral delegate to notify a DataPackage object that the source app will produce data from another asynchronous function. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataProviderDeferral")
  @js.native
  abstract class DataProviderDeferral ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataProviderDeferral {
    
    /** Informs a DataPackage that it is ready for processing. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** An object of this type is passed to the DataProviderHandler delegate. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataProviderRequest")
  @js.native
  abstract class DataProviderRequest ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataProviderRequest {
    
    /** Gets the deadline for finishing a delayed rendering operation. If execution goes beyond that deadline, the results of delayed rendering are ignored. */
    /* CompleteClass */
    var deadline: js.Date = js.native
    
    /** Specifies the format id. */
    /* CompleteClass */
    var formatId: String = js.native
    
    /**
      * Returns a DataProviderDeferral object.
      * @return An data provider deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataProviderDeferral = js.native
    
    /**
      * Sets the content of the DataPackage to be shared with a target app.
      * @param value The object associated with a particular format in the DataPackage .
      */
    /* CompleteClass */
    override def setData(value: Any): Unit = js.native
  }
  
  /** Lets your app supply the content the user wants to share or specify a message, if an error occurs. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequest")
  @js.native
  abstract class DataRequest ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataRequest {
    
    /** Sets or gets a DataPackage object that contains the content a user wants to share. */
    /* CompleteClass */
    var data: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackage = js.native
    
    /** Gets the deadline for finishing a delayed rendering operation. If execution goes beyond that deadline, the results of delayed rendering are ignored. */
    /* CompleteClass */
    var deadline: js.Date = js.native
    
    /**
      * Cancels the sharing operation and supplies an error string to display to the user.
      * @param value The text to display to the user.
      */
    /* CompleteClass */
    override def failWithDisplayText(value: String): Unit = js.native
    
    /**
      * Supports asynchronous sharing operations by creating and returning a DataRequestDeferral object.
      * @return An object that allows you to share or send content asynchronously.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataRequestDeferral = js.native
  }
  
  /** Enables you to exchange content with a target app asynchronously. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequestDeferral")
  @js.native
  abstract class DataRequestDeferral ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataRequestDeferral {
    
    /** Indicates that the content for an asynchronous share is ready for a target app, or that an error in the sharing operation occurred. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Contains information about the DataRequested event. The system fires this event when the user invokes the Share UI. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequestedEventArgs")
  @js.native
  abstract class DataRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataRequestedEventArgs {
    
    /** Enables you to get the DataRequest object and either give it data or a failure message. */
    /* CompleteClass */
    var request: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataRequest = js.native
  }
  
  /** Programmatically initiates an exchange of content with other apps. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
  @js.native
  abstract class DataTransferManager ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataTransferManager
  object DataTransferManager {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the DataTransferManager object associated with the current window.
      * @return The DataTransferManager object associated with the current window.
      */
    /* static member */
    inline def getForCurrentView(): typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataTransferManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataTransferManager]
    
    /** Programmatically initiates the user interface for sharing content with another app. */
    /* static member */
    inline def showShareUI(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showShareUI")().asInstanceOf[Unit]
  }
  
  /** Responsible for formatting HTML content that you want to share or add to the Clipboard. Also allows you to get HTML fragments from the content. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.HtmlFormatHelper")
  @js.native
  abstract class HtmlFormatHelper ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.HtmlFormatHelper
  object HtmlFormatHelper {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.HtmlFormatHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Takes a string that represents HTML content and adds the necessary headers to ensure it is formatted correctly for share and Clipboard operations.
      * @param htmlFragment A string representing the HTML content.
      * @return A string representing the formatted HTML.
      */
    /* static member */
    inline def createHtmlFormat(htmlFragment: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createHtmlFormat")(htmlFragment.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Gets a string that represents an HTML fragment.
      * @param htmlFormat The formatted HTML.
      * @return An HTML fragment based on the formatted HTML.
      */
    /* static member */
    inline def getStaticFragment(htmlFormat: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStaticFragment")(htmlFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /** Contains info about the action that a target app completed during a paste operation. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.OperationCompletedEventArgs")
  @js.native
  abstract class OperationCompletedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.OperationCompletedEventArgs {
    
    /* CompleteClass */
    var acceptedFormatId: Any = js.native
    
    /* unmapped type */
    /** Specifies the operation that the target app completed. */
    /* CompleteClass */
    var operation: DataPackageOperation = js.native
  }
  
  /** Contains the classes and events that a target app uses to complete share operations and create shortcuts, called QuickLinks, that the system can use to streamline future sharing operations to the app. */
  object ShareTarget {
    
    /** Represents shortcuts that help users share content with the apps they use most. */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.ShareTarget.QuickLink")
    @js.native
    /** Creates a new instance of a QuickLink object. */
    open class QuickLink ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.ShareTarget.QuickLink {
      
      /** Specifies an ID for the QuickLink. Your app receives this ID when the user selects its QuickLink. You can use this ID to further customize the sharing process for the user. */
      /* CompleteClass */
      var id: String = js.native
      
      /** An array of strings that specify the data formats supported by the QuickLink app. The system shows the QuickLink only when the data that a user wants to share matches a format in this array. */
      /* CompleteClass */
      var supportedDataFormats: IVector[String] = js.native
      
      /** An array of strings that specify the file types supported by a QuickLink app. The system shows the QuickLink only when the data that a user wants to share contains file items, and the file extensions for those file items match a file type in this array. */
      /* CompleteClass */
      var supportedFileTypes: IVector[String] = js.native
      
      /** Specifies a thumbnail image for the QuickLink. The system displays this image when the user is presented with a list of possible apps to share content with. */
      /* CompleteClass */
      var thumbnail: RandomAccessStreamReference = js.native
      
      /** Specifies the title of a QuickLink. The system displays this info when the user is presented with a list of possible apps to share content with. */
      /* CompleteClass */
      var title: String = js.native
    }
    
    /** Handles the bulk of the work during a share operation. This includes the data that the user wants to share, setting or removing QuickLinks, and informing the system about the status of the operation. */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation")
    @js.native
    abstract class ShareOperation ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
  }
  
  /** Enables an app to share a file with another app by passing a token as part of a Uri activation. The target app redeems the token to get the file shared by the source app. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.SharedStorageAccessManager")
  @js.native
  abstract class SharedStorageAccessManager ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.SharedStorageAccessManager
  object SharedStorageAccessManager {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.SharedStorageAccessManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the sharing token that enables an app to share the specified file with another app.
      * @param file The file to share with the target app.
      * @return The sharing token to provide to the target app as part of a Uri activation.
      */
    /* static member */
    inline def addFile(file: IStorageFile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addFile")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Gets a file shared by another app by providing the sharing token received from the source app.
      * @param token The sharing token for the shared file.
      * @return A wrapper object that contains the shared file.
      */
    /* static member */
    inline def redeemTokenForFileAsync(token: String): IPromiseWithIAsyncOperation[StorageFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("redeemTokenForFileAsync")(token.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[StorageFile]]
    
    /**
      * Revokes an existing sharing token.
      * @param token The sharing token to revoke.
      */
    /* static member */
    inline def removeFile(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /** Contains static properties that return string values. Each string corresponds to a known format ID. Use this class to avoid errors in using string constants to specify data formats. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats")
  @js.native
  abstract class StandardDataFormats ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.StandardDataFormats
  object StandardDataFormats {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats")
    @js.native
    val ^ : js.Any = js.native
    
    /** A read-only property that returns the format ID string value corresponding to the activation link format. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.applicationLink")
    @js.native
    def applicationLink: String = js.native
    inline def applicationLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("applicationLink")(x.asInstanceOf[js.Any])
    
    /** A read-only property that returns the format ID string value corresponding to the Bitmap format. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.bitmap")
    @js.native
    def bitmap: String = js.native
    inline def bitmap_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitmap")(x.asInstanceOf[js.Any])
    
    /** A read-only property that returns the format ID string value corresponding to the HTML format. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.html")
    @js.native
    def html: String = js.native
    inline def html_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
    
    /** A read-only property that returns the format ID string value corresponding to the Rich Text Format (RTF). */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.rtf")
    @js.native
    def rtf: String = js.native
    inline def rtf_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rtf")(x.asInstanceOf[js.Any])
    
    /** A read-only property that returns the format ID string value corresponding to the StorageItem format. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.storageItems")
    @js.native
    def storageItems: String = js.native
    inline def storageItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storageItems")(x.asInstanceOf[js.Any])
    
    /** A read-only property that returns the format ID string value corresponding to the Text format. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.text")
    @js.native
    def text: String = js.native
    inline def text_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
    
    /** A read-only property that returns the format ID string value corresponding to the Uniform Resource Identifier (URI) format. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.uri")
    @js.native
    def uri: String = js.native
    inline def uri_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uri")(x.asInstanceOf[js.Any])
    
    /** A read-only property that returns the format ID string value corresponding to the web link format. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.webLink")
    @js.native
    def webLink: String = js.native
    inline def webLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webLink")(x.asInstanceOf[js.Any])
  }
  
  /** Contains information about the target app the user chose to share content with. To get this object, you must handle the TargetApplicationChosen event. */
  @JSGlobal("Windows.ApplicationModel.DataTransfer.TargetApplicationChosenEventArgs")
  @js.native
  abstract class TargetApplicationChosenEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.DataTransfer.TargetApplicationChosenEventArgs {
    
    /** Contains the name of the app that the user chose to share content with. */
    /* CompleteClass */
    var applicationName: String = js.native
  }
}
