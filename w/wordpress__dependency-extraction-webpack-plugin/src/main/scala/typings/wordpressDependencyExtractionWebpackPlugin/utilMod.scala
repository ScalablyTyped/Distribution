package typings.wordpressDependencyExtractionWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/dependency-extraction-webpack-plugin/build-types/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def camelCaseDash(string: String): String = js.native
  
  def defaultRequestToExternal(request: String): String | Unit | js.Array[String] = js.native
  
  def defaultRequestToHandle(request: String): String | Unit = js.native
}
