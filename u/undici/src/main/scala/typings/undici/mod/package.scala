package typings.undici.mod

import typings.node.streamMod.Duplex
import typings.node.urlMod.URL_
import typings.node.urlMod.UrlObject
import typings.std.URL
import typings.undici.anon.dispatcherundefinedOmitCo
import typings.undici.anon.dispatcherundefinedOmitPi
import typings.undici.anon.dispatcherundefinedOmitRe
import typings.undici.anon.dispatcherundefinedOmitReBody
import typings.undici.anon.dispatcherundefinedOmitUp
import typings.undici.mod.^
import typings.undici.typesConnectorMod.BuildOptions
import typings.undici.typesConnectorMod.connector
import typings.undici.typesDispatcherMod.ConnectData
import typings.undici.typesDispatcherMod.PipelineHandler
import typings.undici.typesDispatcherMod.ResponseData
import typings.undici.typesDispatcherMod.StreamData
import typings.undici.typesDispatcherMod.StreamFactory
import typings.undici.typesDispatcherMod.UpgradeData
import typings.undici.typesFetchMod.RequestInfo
import typings.undici.typesFetchMod.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def buildConnector(): connector = ^.asInstanceOf[js.Dynamic].applyDynamic("buildConnector")().asInstanceOf[connector]
inline def buildConnector(options: BuildOptions): connector = ^.asInstanceOf[js.Dynamic].applyDynamic("buildConnector")(options.asInstanceOf[js.Any]).asInstanceOf[connector]

/** Starts two-way communications with the requested resource. */
inline def connect(url: String): js.Promise[ConnectData] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConnectData]]
inline def connect(url: String, options: dispatcherundefinedOmitCo): js.Promise[ConnectData] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConnectData]]
inline def connect(url: URL_): js.Promise[ConnectData] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConnectData]]
inline def connect(url: URL_, options: dispatcherundefinedOmitCo): js.Promise[ConnectData] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConnectData]]
inline def connect(url: UrlObject): js.Promise[ConnectData] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConnectData]]
inline def connect(url: UrlObject, options: dispatcherundefinedOmitCo): js.Promise[ConnectData] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConnectData]]

inline def fetch(input: RequestInfo): js.Promise[typings.undici.typesFetchMod.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.undici.typesFetchMod.Response]]
inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[typings.undici.typesFetchMod.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.undici.typesFetchMod.Response]]

inline def getGlobalDispatcher(): typings.undici.typesDispatcherMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalDispatcher")().asInstanceOf[typings.undici.typesDispatcherMod.^]

inline def getGlobalOrigin(): js.UndefOr[URL] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalOrigin")().asInstanceOf[js.UndefOr[URL]]

/** For easy use with `stream.pipeline`. */
inline def pipeline(url: String, options: dispatcherundefinedOmitPi, handler: PipelineHandler): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Duplex]
inline def pipeline(url: URL_, options: dispatcherundefinedOmitPi, handler: PipelineHandler): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Duplex]
inline def pipeline(url: UrlObject, options: dispatcherundefinedOmitPi, handler: PipelineHandler): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Duplex]

/** Performs an HTTP request. */
inline def request(url: String): js.Promise[ResponseData] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseData]]
inline def request(url: String, options: dispatcherundefinedOmitRe): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]
inline def request(url: URL_): js.Promise[ResponseData] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseData]]
inline def request(url: URL_, options: dispatcherundefinedOmitRe): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]
inline def request(url: UrlObject): js.Promise[ResponseData] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseData]]
inline def request(url: UrlObject, options: dispatcherundefinedOmitRe): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]

inline def setGlobalDispatcher[DispatcherImplementation /* <: typings.undici.typesDispatcherMod.^ */](dispatcher: DispatcherImplementation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalDispatcher")(dispatcher.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setGlobalOrigin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalOrigin")().asInstanceOf[Unit]
inline def setGlobalOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setGlobalOrigin(origin: URL): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** A faster version of `request`. */
inline def stream(url: String, options: dispatcherundefinedOmitReBody, factory: StreamFactory): js.Promise[StreamData] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamData]]
inline def stream(url: URL_, options: dispatcherundefinedOmitReBody, factory: StreamFactory): js.Promise[StreamData] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamData]]
inline def stream(url: UrlObject, options: dispatcherundefinedOmitReBody, factory: StreamFactory): js.Promise[StreamData] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamData]]

/** Upgrade to a different protocol. */
inline def upgrade(url: String): js.Promise[UpgradeData] = ^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpgradeData]]
inline def upgrade(url: String, options: dispatcherundefinedOmitUp): js.Promise[UpgradeData] = (^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpgradeData]]
inline def upgrade(url: URL_): js.Promise[UpgradeData] = ^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpgradeData]]
inline def upgrade(url: URL_, options: dispatcherundefinedOmitUp): js.Promise[UpgradeData] = (^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpgradeData]]
inline def upgrade(url: UrlObject): js.Promise[UpgradeData] = ^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpgradeData]]
inline def upgrade(url: UrlObject, options: dispatcherundefinedOmitUp): js.Promise[UpgradeData] = (^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpgradeData]]
