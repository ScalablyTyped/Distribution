package typings.wordpressUrl

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getQueryArgMod {
  
  @JSImport("@wordpress/url/build-types/get-query-arg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getQueryArg(url: String, arg: String): QueryArgParsed | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getQueryArg")(url.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[QueryArgParsed | Unit]
  
  trait QueryArgObject
    extends StObject
       with /* key */ StringDictionary[QueryArgParsed]
  object QueryArgObject {
    
    inline def apply(): QueryArgObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryArgObject]
    }
  }
  
  type QueryArgParsed = String | js.Array[String] | QueryArgObject
}
