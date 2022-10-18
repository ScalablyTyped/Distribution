package typings.urllib

import typings.urllib.srcEsmRequestMod.FixJSONCtlChars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEsmUtilsMod {
  
  @JSImport("urllib/src/esm/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def digestAuthHeader(method: String, uri: String, wwwAuthenticate: String, userpass: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("digestAuthHeader")(method.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], wwwAuthenticate.asInstanceOf[js.Any], userpass.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def globalId(category: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("globalId")(category.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def parseJSON(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def parseJSON(data: String, fixJSONCtlChars: FixJSONCtlChars): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(data.asInstanceOf[js.Any], fixJSONCtlChars.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def performanceTime(startTime: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("performanceTime")(startTime.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def performanceTime(startTime: Double, now: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("performanceTime")(startTime.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sleep(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
