package typings.undici.mod

import typings.node.streamMod.Duplex
import typings.node.urlMod.URL_
import typings.node.urlMod.UrlObject
import typings.std.Record
import typings.std.URL
import typings.undici.anon.Domain
import typings.undici.anon.dispatcherdefaultundefine
import typings.undici.anon.dispatcherdefaultundefineBlocking
import typings.undici.anon.dispatcherdefaultundefineBody
import typings.undici.anon.dispatcherdefaultundefineDispatcher
import typings.undici.anon.dispatcherdefaultundefineHeaders
import typings.undici.mod.^
import typings.undici.typesConnectorMod.buildConnector.BuildOptions
import typings.undici.typesConnectorMod.buildConnector.connector
import typings.undici.typesContentTypeMod.MIMEType
import typings.undici.typesCookiesMod.Cookie
import typings.undici.typesDispatcherMod.Dispatcher.ConnectData
import typings.undici.typesDispatcherMod.Dispatcher.PipelineHandler
import typings.undici.typesDispatcherMod.Dispatcher.ResponseData
import typings.undici.typesDispatcherMod.Dispatcher.StreamData
import typings.undici.typesDispatcherMod.Dispatcher.StreamFactory
import typings.undici.typesDispatcherMod.Dispatcher.UpgradeData
import typings.undici.typesFetchMod.RequestInfo
import typings.undici.typesFetchMod.RequestInit
import typings.undici.undiciStrings.failure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def buildConnector(): connector = ^.asInstanceOf[js.Dynamic].applyDynamic("buildConnector")().asInstanceOf[connector]
inline def buildConnector(options: BuildOptions): connector = ^.asInstanceOf[js.Dynamic].applyDynamic("buildConnector")(options.asInstanceOf[js.Any]).asInstanceOf[connector]

/** Starts two-way communications with the requested resource. */
inline def connect(url: String): js.Promise[ConnectData] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConnectData]]
inline def connect(url: String, options: dispatcherdefaultundefineDispatcher): js.Promise[ConnectData] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConnectData]]
inline def connect(url: URL_): js.Promise[ConnectData] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConnectData]]
inline def connect(url: URL_, options: dispatcherdefaultundefineDispatcher): js.Promise[ConnectData] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConnectData]]
inline def connect(url: UrlObject): js.Promise[ConnectData] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConnectData]]
inline def connect(url: UrlObject, options: dispatcherdefaultundefineDispatcher): js.Promise[ConnectData] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConnectData]]

inline def deleteCookie(headers: typings.undici.typesFetchMod.Headers, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteCookie")(headers.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def deleteCookie(headers: typings.undici.typesFetchMod.Headers, name: String, attributes: Domain): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteCookie")(headers.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fetch(input: RequestInfo): js.Promise[typings.undici.typesFetchMod.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.undici.typesFetchMod.Response]]
inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[typings.undici.typesFetchMod.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.undici.typesFetchMod.Response]]

inline def getCookies(headers: typings.undici.typesFetchMod.Headers): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCookies")(headers.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]

inline def getGlobalDispatcher(): typings.undici.typesDispatcherMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalDispatcher")().asInstanceOf[typings.undici.typesDispatcherMod.default]

inline def getGlobalOrigin(): js.UndefOr[URL] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalOrigin")().asInstanceOf[js.UndefOr[URL]]

inline def getSetCookies(headers: typings.undici.typesFetchMod.Headers): js.Array[Cookie] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSetCookies")(headers.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cookie]]

inline def parseMIMEType(input: String): failure | MIMEType = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMIMEType")(input.asInstanceOf[js.Any]).asInstanceOf[failure | MIMEType]

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

inline def serializeAMimeType(mimeType: MIMEType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAMimeType")(mimeType.asInstanceOf[js.Any]).asInstanceOf[String]

inline def setCookie(headers: typings.undici.typesFetchMod.Headers, cookie: Cookie): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(headers.asInstanceOf[js.Any], cookie.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setGlobalDispatcher[DispatcherImplementation /* <: typings.undici.typesDispatcherMod.default */](dispatcher: DispatcherImplementation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalDispatcher")(dispatcher.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setGlobalOrigin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalOrigin")().asInstanceOf[Unit]
inline def setGlobalOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setGlobalOrigin(origin: URL): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]

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
