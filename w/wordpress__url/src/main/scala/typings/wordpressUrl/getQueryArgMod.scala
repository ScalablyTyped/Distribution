package typings.wordpressUrl

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/url/build-types/get-query-arg", JSImport.Namespace)
@js.native
object getQueryArgMod extends js.Object {
  
  def getQueryArg(url: String, arg: String): js.UndefOr[
    String | js.Array[String] | (StringDictionary[String | js.Array[String] | js.Any])
  ] = js.native
  
  type QueryArgObject = StringDictionary[String | js.Array[String] | js.Any]
  
  type QueryArgParsed = String | js.Array[String] | (StringDictionary[String | js.Array[String] | js.Any])
}
