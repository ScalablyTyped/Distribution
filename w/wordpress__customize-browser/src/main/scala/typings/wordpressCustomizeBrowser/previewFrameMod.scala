package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery.Deferred
import typings.std.Window
import typings.wordpressCustomizeBrowser.messengerMod.Messenger
import typings.wordpressCustomizeBrowser.messengerMod.MessengerParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewFrameMod {
  
  @JSImport("@wordpress/customize-browser/PreviewFrame", "PreviewFrame")
  @js.native
  open class PreviewFrame[T] protected () extends Messenger[T] {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def initialize(params: PreviewFrameParams): Unit = js.native
    def initialize(params: PreviewFrameParams, options: js.Object): Unit = js.native
    
    def login(deferred: Deferred[Any, Any, Any]): Unit = js.native
    
    def run(deferred: Deferred[Any, Any, Any]): Unit = js.native
    
    var sensitivity: Double | Null = js.native
  }
  /* static members */
  object PreviewFrame {
    
    @JSImport("@wordpress/customize-browser/PreviewFrame", "PreviewFrame")
    @js.native
    val ^ : js.Any = js.native
    
    inline def uuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[String]
  }
  
  trait PreviewFrameParams
    extends StObject
       with MessengerParams {
    
    var container: Any
    
    // TODO
    var previewUrl: Any
    
    // TODO
    var query: Any
  }
  object PreviewFrameParams {
    
    inline def apply(channel: String, container: Any, previewUrl: Any, query: Any, targetWindow: Window, url: String): PreviewFrameParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], previewUrl = previewUrl.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], targetWindow = targetWindow.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewFrameParams]
    }
    
    extension [Self <: PreviewFrameParams](x: Self) {
      
      inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setPreviewUrl(value: Any): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
