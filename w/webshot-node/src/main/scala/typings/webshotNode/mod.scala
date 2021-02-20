package typings.webshotNode

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.std.Error
import typings.webshotNode.anon.Bottom
import typings.webshotNode.anon.Height
import typings.webshotNode.anon.Width
import typings.webshotNode.webshotNodeStrings.file
import typings.webshotNode.webshotNodeStrings.html
import typings.webshotNode.webshotNodeStrings.jpeg
import typings.webshotNode.webshotNodeStrings.jpg
import typings.webshotNode.webshotNodeStrings.png
import typings.webshotNode.webshotNodeStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webshot-node", JSImport.Namespace)
  @js.native
  def apply(src: String): ReadableStream = js.native
  @JSImport("webshot-node", JSImport.Namespace)
  @js.native
  def apply(src: String, cb: js.Function1[/* e */ Error | Null, Unit]): ReadableStream = js.native
  @JSImport("webshot-node", JSImport.Namespace)
  @js.native
  def apply(src: String, dst: String): Unit = js.native
  @JSImport("webshot-node", JSImport.Namespace)
  @js.native
  def apply(src: String, dst: String, cb: js.Function1[/* e */ Error | Null, Unit]): Unit = js.native
  @JSImport("webshot-node", JSImport.Namespace)
  @js.native
  def apply(src: String, dst: String, options: Options): Unit = js.native
  @JSImport("webshot-node", JSImport.Namespace)
  @js.native
  def apply(src: String, dst: String, options: Options, cb: js.Function1[/* e */ Error | Null, Unit]): Unit = js.native
  @JSImport("webshot-node", JSImport.Namespace)
  @js.native
  def apply(src: String, options: Options): ReadableStream = js.native
  @JSImport("webshot-node", JSImport.Namespace)
  @js.native
  def apply(src: String, options: Options, cb: js.Function1[/* e */ Error | Null, Unit]): ReadableStream = js.native
  
  @js.native
  trait Options extends StObject {
    
    var captureSelector: js.UndefOr[Boolean] = js.native
    
    var cookies: js.UndefOr[js.Array[StringDictionary[_]] | Null] = js.native
    
    var customCSS: js.UndefOr[String] = js.native
    
    var customHeaders: js.UndefOr[js.Array[StringDictionary[_]] | Null] = js.native
    
    var defaultWhiteBackground: js.UndefOr[Boolean] = js.native
    
    var errorIfJSException: js.UndefOr[Boolean] = js.native
    
    var errorIfStatusIsNot200: js.UndefOr[Boolean] = js.native
    
    var phantomConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var phantomPath: js.UndefOr[String] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var renderDelay: js.UndefOr[Double] = js.native
    
    var screenSize: js.UndefOr[Height] = js.native
    
    var shotOffset: js.UndefOr[Bottom] = js.native
    
    var shotSize: js.UndefOr[Width] = js.native
    
    var siteType: js.UndefOr[url | file | html] = js.native
    
    var streamType: js.UndefOr[png | jpg | jpeg] = js.native
    
    var takeShotOnCallback: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var windowSize: js.UndefOr[Height] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptureSelector(value: Boolean): Self = StObject.set(x, "captureSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureSelectorUndefined: Self = StObject.set(x, "captureSelector", js.undefined)
      
      @scala.inline
      def setCookies(value: js.Array[StringDictionary[_]]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesNull: Self = StObject.set(x, "cookies", null)
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setCookiesVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "cookies", js.Array(value :_*))
      
      @scala.inline
      def setCustomCSS(value: String): Self = StObject.set(x, "customCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomCSSUndefined: Self = StObject.set(x, "customCSS", js.undefined)
      
      @scala.inline
      def setCustomHeaders(value: js.Array[StringDictionary[_]]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersNull: Self = StObject.set(x, "customHeaders", null)
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setCustomHeadersVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "customHeaders", js.Array(value :_*))
      
      @scala.inline
      def setDefaultWhiteBackground(value: Boolean): Self = StObject.set(x, "defaultWhiteBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultWhiteBackgroundUndefined: Self = StObject.set(x, "defaultWhiteBackground", js.undefined)
      
      @scala.inline
      def setErrorIfJSException(value: Boolean): Self = StObject.set(x, "errorIfJSException", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorIfJSExceptionUndefined: Self = StObject.set(x, "errorIfJSException", js.undefined)
      
      @scala.inline
      def setErrorIfStatusIsNot200(value: Boolean): Self = StObject.set(x, "errorIfStatusIsNot200", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorIfStatusIsNot200Undefined: Self = StObject.set(x, "errorIfStatusIsNot200", js.undefined)
      
      @scala.inline
      def setPhantomConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "phantomConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhantomConfigUndefined: Self = StObject.set(x, "phantomConfig", js.undefined)
      
      @scala.inline
      def setPhantomPath(value: String): Self = StObject.set(x, "phantomPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhantomPathUndefined: Self = StObject.set(x, "phantomPath", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setRenderDelay(value: Double): Self = StObject.set(x, "renderDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderDelayUndefined: Self = StObject.set(x, "renderDelay", js.undefined)
      
      @scala.inline
      def setScreenSize(value: Height): Self = StObject.set(x, "screenSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenSizeUndefined: Self = StObject.set(x, "screenSize", js.undefined)
      
      @scala.inline
      def setShotOffset(value: Bottom): Self = StObject.set(x, "shotOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShotOffsetUndefined: Self = StObject.set(x, "shotOffset", js.undefined)
      
      @scala.inline
      def setShotSize(value: Width): Self = StObject.set(x, "shotSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShotSizeUndefined: Self = StObject.set(x, "shotSize", js.undefined)
      
      @scala.inline
      def setSiteType(value: url | file | html): Self = StObject.set(x, "siteType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteTypeUndefined: Self = StObject.set(x, "siteType", js.undefined)
      
      @scala.inline
      def setStreamType(value: png | jpg | jpeg): Self = StObject.set(x, "streamType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamTypeUndefined: Self = StObject.set(x, "streamType", js.undefined)
      
      @scala.inline
      def setTakeShotOnCallback(value: Boolean): Self = StObject.set(x, "takeShotOnCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTakeShotOnCallbackUndefined: Self = StObject.set(x, "takeShotOnCallback", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWindowSize(value: Height): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
    }
  }
}
