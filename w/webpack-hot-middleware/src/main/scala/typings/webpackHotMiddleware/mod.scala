package typings.webpackHotMiddleware

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.NextHandleFunction
import typings.webpack.mod.Compiler
import typings.webpack.mod.MultiCompiler
import typings.webpackHotMiddleware.webpackHotMiddlewareBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(compiler: Compiler): NextHandleFunction & EventStream = ^.asInstanceOf[js.Dynamic].apply(compiler.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction & EventStream]
  inline def apply(compiler: Compiler, options: MiddlewareOptions): NextHandleFunction & EventStream = (^.asInstanceOf[js.Dynamic].apply(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NextHandleFunction & EventStream]
  inline def apply(compiler: MultiCompiler): NextHandleFunction & EventStream = ^.asInstanceOf[js.Dynamic].apply(compiler.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction & EventStream]
  inline def apply(compiler: MultiCompiler, options: MiddlewareOptions): NextHandleFunction & EventStream = (^.asInstanceOf[js.Dynamic].apply(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NextHandleFunction & EventStream]
  
  @JSImport("webpack-hot-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ClientOptions extends StObject {
    
    var ansiColors: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var autoConnect: js.UndefOr[Boolean] = js.undefined
    
    var dynamicPublicPath: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var noInfo: js.UndefOr[Boolean] = js.undefined
    
    var overlay: js.UndefOr[Boolean] = js.undefined
    
    var overlayStyles: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var overlayWarnings: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var reload: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setAnsiColors(value: StringDictionary[Any]): Self = StObject.set(x, "ansiColors", value.asInstanceOf[js.Any])
      
      inline def setAnsiColorsUndefined: Self = StObject.set(x, "ansiColors", js.undefined)
      
      inline def setAutoConnect(value: Boolean): Self = StObject.set(x, "autoConnect", value.asInstanceOf[js.Any])
      
      inline def setAutoConnectUndefined: Self = StObject.set(x, "autoConnect", js.undefined)
      
      inline def setDynamicPublicPath(value: Boolean): Self = StObject.set(x, "dynamicPublicPath", value.asInstanceOf[js.Any])
      
      inline def setDynamicPublicPathUndefined: Self = StObject.set(x, "dynamicPublicPath", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoInfo(value: Boolean): Self = StObject.set(x, "noInfo", value.asInstanceOf[js.Any])
      
      inline def setNoInfoUndefined: Self = StObject.set(x, "noInfo", js.undefined)
      
      inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyles(value: StringDictionary[Any]): Self = StObject.set(x, "overlayStyles", value.asInstanceOf[js.Any])
      
      inline def setOverlayStylesUndefined: Self = StObject.set(x, "overlayStyles", js.undefined)
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setOverlayWarnings(value: Boolean): Self = StObject.set(x, "overlayWarnings", value.asInstanceOf[js.Any])
      
      inline def setOverlayWarningsUndefined: Self = StObject.set(x, "overlayWarnings", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      inline def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait EventStream extends StObject {
    
    def close(): Unit
    
    def publish(payload: Any): Unit
  }
  object EventStream {
    
    inline def apply(close: () => Unit, publish: Any => Unit): EventStream = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), publish = js.Any.fromFunction1(publish))
      __obj.asInstanceOf[EventStream]
    }
    
    extension [Self <: EventStream](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setPublish(value: Any => Unit): Self = StObject.set(x, "publish", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Logger extends StObject {
    
    def apply(message: Any, optionalParams: Any*): Unit = js.native
    def apply(message: Unit, optionalParams: Any*): Unit = js.native
  }
  
  trait MiddlewareOptions extends StObject {
    
    var heartbeat: js.UndefOr[Double] = js.undefined
    
    var log: js.UndefOr[`false` | Logger] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object MiddlewareOptions {
    
    inline def apply(): MiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiddlewareOptions]
    }
    
    extension [Self <: MiddlewareOptions](x: Self) {
      
      inline def setHeartbeat(value: Double): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatUndefined: Self = StObject.set(x, "heartbeat", js.undefined)
      
      inline def setLog(value: `false` | Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
