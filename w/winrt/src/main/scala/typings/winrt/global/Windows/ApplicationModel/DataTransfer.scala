package typings.winrt.global.Windows.ApplicationModel

import typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import typings.winrt.anon.First
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTransfer {
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard")
  @js.native
  open class Clipboard ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.Clipboard
  /* static members */
  object Clipboard {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
    
    inline def getContent(): typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageView = ^.asInstanceOf[js.Dynamic].applyDynamic("getContent")().asInstanceOf[typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageView]
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.oncontentchanged")
    @js.native
    def oncontentchanged: Any = js.native
    inline def oncontentchanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oncontentchanged")(x.asInstanceOf[js.Any])
    
    inline def setContent(content: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackage): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContent")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackage")
  @js.native
  open class DataPackage ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackage
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageOperation")
  @js.native
  object DataPackageOperation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation & Double
      ] = js.native
    
    /* 1 */ val copy: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation.copy & Double = js.native
    
    /* 3 */ val link: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation.link & Double = js.native
    
    /* 2 */ val move: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation.move & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation.none & Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySet")
  @js.native
  open class DataPackagePropertySet ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet {
    
    /* CompleteClass */
    var applicationListingUri: Uri = js.native
    
    /* CompleteClass */
    var applicationName: String = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    var description: String = js.native
    
    /* CompleteClass */
    var fileTypes: IVector[String] = js.native
    
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, Any]] = js.native
    
    /* CompleteClass */
    override def getView(): IMapView[String, Any] = js.native
    
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def insert(key: String, value: Any): Boolean = js.native
    
    /* CompleteClass */
    override def lookup(key: String): Any = js.native
    
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    var thumbnail: IRandomAccessStreamReference = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySetView")
  @js.native
  open class DataPackagePropertySetView ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackagePropertySetView {
    
    /* CompleteClass */
    var applicationListingUri: Uri = js.native
    
    /* CompleteClass */
    var applicationName: String = js.native
    
    /* CompleteClass */
    var description: String = js.native
    
    /* CompleteClass */
    var fileTypes: IVectorView[String] = js.native
    
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, Any]] = js.native
    
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def lookup(key: String): Any = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def split(): First[String, Any] = js.native
    
    /* CompleteClass */
    var thumbnail: RandomAccessStreamReference = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageView")
  @js.native
  open class DataPackageView ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageView
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataProviderDeferral")
  @js.native
  open class DataProviderDeferral ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.DataProviderDeferral {
    
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataProviderRequest")
  @js.native
  open class DataProviderRequest ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.DataProviderRequest {
    
    /* CompleteClass */
    var deadline: js.Date = js.native
    
    /* CompleteClass */
    var formatId: String = js.native
    
    /* CompleteClass */
    override def getDeferral(): typings.winrt.Windows.ApplicationModel.DataTransfer.DataProviderDeferral = js.native
    
    /* CompleteClass */
    override def setData(value: Any): Unit = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequest")
  @js.native
  open class DataRequest ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.DataRequest {
    
    /* CompleteClass */
    var data: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackage = js.native
    
    /* CompleteClass */
    var deadline: js.Date = js.native
    
    /* CompleteClass */
    override def failWithDisplayText(value: String): Unit = js.native
    
    /* CompleteClass */
    override def getDeferral(): typings.winrt.Windows.ApplicationModel.DataTransfer.DataRequestDeferral = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequestDeferral")
  @js.native
  open class DataRequestDeferral ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.DataRequestDeferral {
    
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequestedEventArgs")
  @js.native
  open class DataRequestedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.DataRequestedEventArgs {
    
    /* CompleteClass */
    var request: typings.winrt.Windows.ApplicationModel.DataTransfer.DataRequest = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
  @js.native
  open class DataTransferManager ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.DataTransferManager {
    
    /* CompleteClass */
    var ondatarequested: Any = js.native
    
    /* CompleteClass */
    var ontargetapplicationchosen: Any = js.native
  }
  /* static members */
  object DataTransferManager {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getForCurrentView(): typings.winrt.Windows.ApplicationModel.DataTransfer.DataTransferManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrt.Windows.ApplicationModel.DataTransfer.DataTransferManager]
    
    inline def showShareUI(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showShareUI")().asInstanceOf[Unit]
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.HtmlFormatHelper")
  @js.native
  open class HtmlFormatHelper ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.HtmlFormatHelper
  /* static members */
  object HtmlFormatHelper {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.HtmlFormatHelper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createHtmlFormat(htmlFragment: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createHtmlFormat")(htmlFragment.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getStaticFragment(htmlFormat: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStaticFragment")(htmlFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.OperationCompletedEventArgs")
  @js.native
  open class OperationCompletedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.OperationCompletedEventArgs {
    
    /* CompleteClass */
    var operation: DataPackageOperation = js.native
  }
  
  object ShareTarget {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.ShareTarget.QuickLink")
    @js.native
    open class QuickLink ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.QuickLink {
      
      /* CompleteClass */
      var id: String = js.native
      
      /* CompleteClass */
      var supportedDataFormats: IVector[String] = js.native
      
      /* CompleteClass */
      var supportedFileTypes: IVector[String] = js.native
      
      /* CompleteClass */
      var thumbnail: RandomAccessStreamReference = js.native
      
      /* CompleteClass */
      var title: String = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation")
    @js.native
    open class ShareOperation ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats")
  @js.native
  open class StandardDataFormats ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.StandardDataFormats
  /* static members */
  object StandardDataFormats {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.bitmap")
    @js.native
    def bitmap: String = js.native
    inline def bitmap_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitmap")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.html")
    @js.native
    def html: String = js.native
    inline def html_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.rtf")
    @js.native
    def rtf: String = js.native
    inline def rtf_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rtf")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.storageItems")
    @js.native
    def storageItems: String = js.native
    inline def storageItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storageItems")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.text")
    @js.native
    def text: String = js.native
    inline def text_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.uri")
    @js.native
    def uri: String = js.native
    inline def uri_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uri")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.TargetApplicationChosenEventArgs")
  @js.native
  open class TargetApplicationChosenEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.DataTransfer.TargetApplicationChosenEventArgs {
    
    /* CompleteClass */
    var applicationName: String = js.native
  }
}
