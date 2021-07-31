package typings.wordpressUrl

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getQueryArgMod {
  
  @JSImport("@wordpress/url/build-types/get-query-arg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getQueryArg(url: String, arg: String): js.UndefOr[
    String | js.Array[String] | (StringDictionary[String | js.Array[String] | js.Any])
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getQueryArg")(url.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    String | js.Array[String] | (StringDictionary[String | js.Array[String] | js.Any])
  ]]
  
  type QueryArgObject = StringDictionary[String | js.Array[String] | js.Any]
  
  type QueryArgParsed = String | js.Array[String] | (StringDictionary[String | js.Array[String] | js.Any])
}
