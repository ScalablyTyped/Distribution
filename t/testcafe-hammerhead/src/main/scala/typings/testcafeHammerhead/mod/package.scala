package typings.testcafeHammerhead.mod

import typings.node.bufferMod.global.Buffer
import typings.std.ReadableStream
import typings.testcafeHammerhead.RequestFilterRulePredicate
import typings.testcafeHammerhead.anon.PartialRequestFilterRuleO
import typings.testcafeHammerhead.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def INJECTABLE_SCRIPTS: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("INJECTABLE_SCRIPTS").asInstanceOf[js.Array[String]]

inline def SPECIAL_BLANK_PAGE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SPECIAL_BLANK_PAGE").asInstanceOf[String]

inline def SPECIAL_ERROR_PAGE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SPECIAL_ERROR_PAGE").asInstanceOf[String]

inline def generateUniqueId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUniqueId")().asInstanceOf[String]
inline def generateUniqueId(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUniqueId")(length.asInstanceOf[js.Any]).asInstanceOf[String]

inline def injectResources(html: String, resources: PageInjectableResources): String = (^.asInstanceOf[js.Dynamic].applyDynamic("injectResources")(html.asInstanceOf[js.Any], resources.asInstanceOf[js.Any])).asInstanceOf[String]

inline def isScriptProcessed(code: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScriptProcessed")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def parseProxyUrl(url: String): ParsedProxyUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("parseProxyUrl")(url.asInstanceOf[js.Any]).asInstanceOf[ParsedProxyUrl]

inline def processScript(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("processScript")(src.asInstanceOf[js.Any]).asInstanceOf[String]
inline def processScript(src: String, withHeader: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("processScript")(src.asInstanceOf[js.Any], withHeader.asInstanceOf[js.Any])).asInstanceOf[String]
inline def processScript(src: String, withHeader: Boolean, wrapLastExprWithProcessHtml: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("processScript")(src.asInstanceOf[js.Any], withHeader.asInstanceOf[js.Any], wrapLastExprWithProcessHtml.asInstanceOf[js.Any])).asInstanceOf[String]
inline def processScript(src: String, withHeader: Boolean, wrapLastExprWithProcessHtml: Boolean, resolver: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("processScript")(src.asInstanceOf[js.Any], withHeader.asInstanceOf[js.Any], wrapLastExprWithProcessHtml.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[String]
inline def processScript(src: String, withHeader: Boolean, wrapLastExprWithProcessHtml: Unit, resolver: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("processScript")(src.asInstanceOf[js.Any], withHeader.asInstanceOf[js.Any], wrapLastExprWithProcessHtml.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[String]
inline def processScript(src: String, withHeader: Unit, wrapLastExprWithProcessHtml: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("processScript")(src.asInstanceOf[js.Any], withHeader.asInstanceOf[js.Any], wrapLastExprWithProcessHtml.asInstanceOf[js.Any])).asInstanceOf[String]
inline def processScript(src: String, withHeader: Unit, wrapLastExprWithProcessHtml: Boolean, resolver: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("processScript")(src.asInstanceOf[js.Any], withHeader.asInstanceOf[js.Any], wrapLastExprWithProcessHtml.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[String]
inline def processScript(src: String, withHeader: Unit, wrapLastExprWithProcessHtml: Unit, resolver: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("processScript")(src.asInstanceOf[js.Any], withHeader.asInstanceOf[js.Any], wrapLastExprWithProcessHtml.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[String]

inline def promisifyStream(s: ReadableStream[Any]): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("promisifyStream")(s.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
inline def promisifyStream(s: ReadableStream[Any], contentLength: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("promisifyStream")(s.asInstanceOf[js.Any], contentLength.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]

inline def responseMockSetBodyMethod: ResponseMockSetBodyMethod_ = ^.asInstanceOf[js.Dynamic].selectDynamic("responseMockSetBodyMethod").asInstanceOf[ResponseMockSetBodyMethod_]

inline def sameOriginCheck(location: String, checkedUrl: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sameOriginCheck")(location.asInstanceOf[js.Any], checkedUrl.asInstanceOf[js.Any])).asInstanceOf[Boolean]

type RequestFilterRuleInit = String | js.RegExp | PartialRequestFilterRuleO | RequestFilterRulePredicate
