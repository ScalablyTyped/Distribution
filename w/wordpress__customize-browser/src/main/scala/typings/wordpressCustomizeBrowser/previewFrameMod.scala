package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery.Deferred
import typings.std.Window
import typings.wordpressCustomizeBrowser.messengerMod.Messenger
import typings.wordpressCustomizeBrowser.messengerMod.MessengerParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewFrameMod {
  
  @JSImport("@wordpress/customize-browser/PreviewFrame", "PreviewFrame")
  @js.native
  class PreviewFrame[T] protected () extends Messenger[T] {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def initialize(params: PreviewFrameParams): Unit = js.native
    def initialize(params: PreviewFrameParams, options: js.Object): Unit = js.native
    
    def login(deferred: Deferred[_, _, _]): Unit = js.native
    
    def run(deferred: Deferred[_, _, _]): Unit = js.native
    
    var sensitivity: Double | Null = js.native
  }
  /* static members */
  object PreviewFrame {
    
    @JSImport("@wordpress/customize-browser/PreviewFrame", "PreviewFrame.uuid")
    @js.native
    def uuid(): String = js.native
  }
  
  @js.native
  trait PreviewFrameParams extends MessengerParams {
    
    var container: js.Any = js.native
    
    // TODO
    var previewUrl: js.Any = js.native
    
    // TODO
    var query: js.Any = js.native
  }
  object PreviewFrameParams {
    
    @scala.inline
    def apply(
      channel: String,
      container: js.Any,
      previewUrl: js.Any,
      query: js.Any,
      targetWindow: Window,
      url: String
    ): PreviewFrameParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], previewUrl = previewUrl.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], targetWindow = targetWindow.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewFrameParams]
    }
    
    @scala.inline
    implicit class PreviewFrameParamsMutableBuilder[Self <: PreviewFrameParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUrl(value: js.Any): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
