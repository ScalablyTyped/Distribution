package typings.webpackHotMiddleware

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.NextHandleFunction
import typings.webpackHotMiddleware.webpackHotMiddlewareBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.ICompiler */ js.Any
  ): NextHandleFunction & EventStream = ^.asInstanceOf[js.Dynamic].apply(compiler.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction & EventStream]
  @scala.inline
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.ICompiler */ js.Any,
    options: MiddlewareOptions
  ): NextHandleFunction & EventStream = (^.asInstanceOf[js.Dynamic].apply(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NextHandleFunction & EventStream]
  
  @JSImport("webpack-hot-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ClientOptions extends StObject {
    
    var ansiColors: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var autoConnect: js.UndefOr[Boolean] = js.undefined
    
    var dynamicPublicPath: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var noInfo: js.UndefOr[Boolean] = js.undefined
    
    var overlay: js.UndefOr[Boolean] = js.undefined
    
    var overlayStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var overlayWarnings: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var reload: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ClientOptions {
    
    @scala.inline
    def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnsiColors(value: StringDictionary[js.Any]): Self = StObject.set(x, "ansiColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnsiColorsUndefined: Self = StObject.set(x, "ansiColors", js.undefined)
      
      @scala.inline
      def setAutoConnect(value: Boolean): Self = StObject.set(x, "autoConnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoConnectUndefined: Self = StObject.set(x, "autoConnect", js.undefined)
      
      @scala.inline
      def setDynamicPublicPath(value: Boolean): Self = StObject.set(x, "dynamicPublicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicPublicPathUndefined: Self = StObject.set(x, "dynamicPublicPath", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoInfo(value: Boolean): Self = StObject.set(x, "noInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoInfoUndefined: Self = StObject.set(x, "noInfo", js.undefined)
      
      @scala.inline
      def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyles(value: StringDictionary[js.Any]): Self = StObject.set(x, "overlayStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStylesUndefined: Self = StObject.set(x, "overlayStyles", js.undefined)
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setOverlayWarnings(value: Boolean): Self = StObject.set(x, "overlayWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayWarningsUndefined: Self = StObject.set(x, "overlayWarnings", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait EventStream extends StObject {
    
    def close(): Unit
    
    def publish(payload: js.Any): Unit
  }
  object EventStream {
    
    @scala.inline
    def apply(close: () => Unit, publish: js.Any => Unit): EventStream = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), publish = js.Any.fromFunction1(publish))
      __obj.asInstanceOf[EventStream]
    }
    
    @scala.inline
    implicit class EventStreamMutableBuilder[Self <: EventStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPublish(value: js.Any => Unit): Self = StObject.set(x, "publish", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Logger extends StObject {
    
    def apply(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def apply(message: Unit, optionalParams: js.Any*): Unit = js.native
  }
  
  trait MiddlewareOptions extends StObject {
    
    var heartbeat: js.UndefOr[Double] = js.undefined
    
    var log: js.UndefOr[`false` | Logger] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object MiddlewareOptions {
    
    @scala.inline
    def apply(): MiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiddlewareOptions]
    }
    
    @scala.inline
    implicit class MiddlewareOptionsMutableBuilder[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeartbeat(value: Double): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartbeatUndefined: Self = StObject.set(x, "heartbeat", js.undefined)
      
      @scala.inline
      def setLog(value: `false` | Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
