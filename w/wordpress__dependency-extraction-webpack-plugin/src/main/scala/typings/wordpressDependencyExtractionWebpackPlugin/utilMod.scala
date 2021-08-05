package typings.wordpressDependencyExtractionWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@wordpress/dependency-extraction-webpack-plugin/build-types/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelCaseDash(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCaseDash")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def defaultRequestToExternal(request: String): String | Unit | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRequestToExternal")(request.asInstanceOf[js.Any]).asInstanceOf[String | Unit | js.Array[String]]
  
  inline def defaultRequestToHandle(request: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRequestToHandle")(request.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
}
