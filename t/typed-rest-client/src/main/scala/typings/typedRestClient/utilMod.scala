package typings.typedRestClient

import typings.node.bufferMod.global.Buffer
import typings.typedRestClient.interfacesMod.IHttpClientResponse
import typings.typedRestClient.interfacesMod.IRequestQueryParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("typed-rest-client/Util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildProxyBypassRegexFromEnv(bypass: String): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("buildProxyBypassRegexFromEnv")(bypass.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def decompressGzippedContent(buffer: Buffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressGzippedContent")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def decompressGzippedContent(buffer: Buffer, charset: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("decompressGzippedContent")(buffer.asInstanceOf[js.Any], charset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getUrl(resource: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(resource.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getUrl(resource: String, baseUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(resource.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getUrl(resource: String, baseUrl: String, queryParams: IRequestQueryParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(resource.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getUrl(resource: String, baseUrl: Unit, queryParams: IRequestQueryParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(resource.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def obtainContentCharset(response: IHttpClientResponse): String = ^.asInstanceOf[js.Dynamic].applyDynamic("obtainContentCharset")(response.asInstanceOf[js.Any]).asInstanceOf[String]
}
