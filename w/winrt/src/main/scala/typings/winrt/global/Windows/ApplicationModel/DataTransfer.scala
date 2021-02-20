package typings.winrt.global.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTransfer {
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard")
  @js.native
  class Clipboard ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.Clipboard
  /* static members */
  object Clipboard {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.clear")
    @js.native
    def clear(): Unit = js.native
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.flush")
    @js.native
    def flush(): Unit = js.native
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.getContent")
    @js.native
    def getContent(): typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageView = js.native
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.oncontentchanged")
    @js.native
    def oncontentchanged: js.Any = js.native
    @scala.inline
    def oncontentchanged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oncontentchanged")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard.setContent")
    @js.native
    def setContent(content: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackage): Unit = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackage")
  @js.native
  class DataPackage ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackage
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageOperation")
  @js.native
  object DataPackageOperation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation with Double
      ] = js.native
    
    /* 1 */ val copy: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation.copy with Double = js.native
    
    /* 3 */ val link: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation.link with Double = js.native
    
    /* 2 */ val move: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation.move with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageOperation.none with Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySet")
  @js.native
  class DataPackagePropertySet ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySetView")
  @js.native
  class DataPackagePropertySetView ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackagePropertySetView
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageView")
  @js.native
  class DataPackageView ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackageView
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataProviderDeferral")
  @js.native
  class DataProviderDeferral ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.DataProviderDeferral
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataProviderRequest")
  @js.native
  class DataProviderRequest ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.DataProviderRequest
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequest")
  @js.native
  class DataRequest ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.DataRequest
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequestDeferral")
  @js.native
  class DataRequestDeferral ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.DataRequestDeferral
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequestedEventArgs")
  @js.native
  class DataRequestedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.DataRequestedEventArgs
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
  @js.native
  class DataTransferManager ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.DataTransferManager
  /* static members */
  object DataTransferManager {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrt.Windows.ApplicationModel.DataTransfer.DataTransferManager = js.native
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager.showShareUI")
    @js.native
    def showShareUI(): Unit = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.HtmlFormatHelper")
  @js.native
  class HtmlFormatHelper ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.HtmlFormatHelper
  /* static members */
  object HtmlFormatHelper {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.HtmlFormatHelper.createHtmlFormat")
    @js.native
    def createHtmlFormat(htmlFragment: String): String = js.native
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.HtmlFormatHelper.getStaticFragment")
    @js.native
    def getStaticFragment(htmlFormat: String): String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.OperationCompletedEventArgs")
  @js.native
  class OperationCompletedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.OperationCompletedEventArgs
  
  object ShareTarget {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.ShareTarget.QuickLink")
    @js.native
    class QuickLink ()
      extends typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.QuickLink
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation")
    @js.native
    class ShareOperation ()
      extends typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats")
  @js.native
  class StandardDataFormats ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.StandardDataFormats
  /* static members */
  object StandardDataFormats {
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.bitmap")
    @js.native
    def bitmap: String = js.native
    @scala.inline
    def bitmap_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitmap")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.html")
    @js.native
    def html: String = js.native
    @scala.inline
    def html_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.rtf")
    @js.native
    def rtf: String = js.native
    @scala.inline
    def rtf_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rtf")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.storageItems")
    @js.native
    def storageItems: String = js.native
    @scala.inline
    def storageItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storageItems")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.text")
    @js.native
    def text: String = js.native
    @scala.inline
    def text_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats.uri")
    @js.native
    def uri: String = js.native
    @scala.inline
    def uri_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uri")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.ApplicationModel.DataTransfer.TargetApplicationChosenEventArgs")
  @js.native
  class TargetApplicationChosenEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.DataTransfer.TargetApplicationChosenEventArgs
}
