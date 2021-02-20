package typings.wordpressUrl

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getQueryArgMod {
  
  @JSImport("@wordpress/url/build-types/get-query-arg", "getQueryArg")
  @js.native
  def getQueryArg(url: String, arg: String): js.UndefOr[
    String | js.Array[String] | (StringDictionary[String | js.Array[String] | js.Any])
  ] = js.native
  
  type QueryArgObject = StringDictionary[String | js.Array[String] | js.Any]
  
  type QueryArgParsed = String | js.Array[String] | (StringDictionary[String | js.Array[String] | js.Any])
}
