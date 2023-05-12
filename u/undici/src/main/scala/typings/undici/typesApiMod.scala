package typings.undici

import typings.node.streamMod.Duplex
import typings.node.urlMod.URL_
import typings.node.urlMod.UrlObject
import typings.undici.anon.dispatcherdefaultundefine
import typings.undici.anon.dispatcherdefaultundefineBlocking
import typings.undici.anon.dispatcherdefaultundefineBody
import typings.undici.anon.dispatcherdefaultundefineDispatcher
import typings.undici.anon.dispatcherdefaultundefineHeaders
import typings.undici.typesDispatcherMod.Dispatcher.ConnectData
import typings.undici.typesDispatcherMod.Dispatcher.PipelineHandler
import typings.undici.typesDispatcherMod.Dispatcher.ResponseData
import typings.undici.typesDispatcherMod.Dispatcher.StreamData
import typings.undici.typesDispatcherMod.Dispatcher.StreamFactory
import typings.undici.typesDispatcherMod.Dispatcher.UpgradeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesApiMod {
  
  @JSImport("undici/types/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Starts two-way communications with the requested resource. */
  inline def connect(url: String): js.Promise[ConnectData] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConnectData]]
  inline def connect(url: String, options: dispatcherdefaultundefineDispatcher): js.Promise[ConnectData] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConnectData]]
  inline def connect(url: URL_): js.Promise[ConnectData] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConnectData]]
  inline def connect(url: URL_, options: dispatcherdefaultundefineDispatcher): js.Promise[ConnectData] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConnectData]]
  inline def connect(url: UrlObject): js.Promise[ConnectData] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConnectData]]
  inline def connect(url: UrlObject, options: dispatcherdefaultundefineDispatcher): js.Promise[ConnectData] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConnectData]]
  
  /** For easy use with `stream.pipeline`. */
  inline def pipeline(url: String, options: dispatcherdefaultundefineBody, handler: PipelineHandler): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def pipeline(url: URL_, options: dispatcherdefaultundefineBody, handler: PipelineHandler): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def pipeline(url: UrlObject, options: dispatcherdefaultundefineBody, handler: PipelineHandler): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  
  /** Performs an HTTP request. */
  inline def request(url: String): js.Promise[ResponseData] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseData]]
  inline def request(url: String, options: dispatcherdefaultundefine): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]
  inline def request(url: URL_): js.Promise[ResponseData] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseData]]
  inline def request(url: URL_, options: dispatcherdefaultundefine): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]
  inline def request(url: UrlObject): js.Promise[ResponseData] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseData]]
  inline def request(url: UrlObject, options: dispatcherdefaultundefine): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]
  
  /** A faster version of `request`. */
  inline def stream(url: String, options: dispatcherdefaultundefineBlocking, factory: StreamFactory): js.Promise[StreamData] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamData]]
  inline def stream(url: URL_, options: dispatcherdefaultundefineBlocking, factory: StreamFactory): js.Promise[StreamData] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamData]]
  inline def stream(url: UrlObject, options: dispatcherdefaultundefineBlocking, factory: StreamFactory): js.Promise[StreamData] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamData]]
  
  /** Upgrade to a different protocol. */
  inline def upgrade(url: String): js.Promise[UpgradeData] = ^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpgradeData]]
  inline def upgrade(url: String, options: dispatcherdefaultundefineHeaders): js.Promise[UpgradeData] = (^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpgradeData]]
  inline def upgrade(url: URL_): js.Promise[UpgradeData] = ^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpgradeData]]
  inline def upgrade(url: URL_, options: dispatcherdefaultundefineHeaders): js.Promise[UpgradeData] = (^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpgradeData]]
  inline def upgrade(url: UrlObject): js.Promise[UpgradeData] = ^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpgradeData]]
  inline def upgrade(url: UrlObject, options: dispatcherdefaultundefineHeaders): js.Promise[UpgradeData] = (^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpgradeData]]
}
