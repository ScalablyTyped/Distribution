package typings.wordpressUrl

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesGetQueryArgsMod {
  
  @JSImport("@wordpress/url/build-types/get-query-args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getQueryArgs(url: String): QueryArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryArgs")(url.asInstanceOf[js.Any]).asInstanceOf[QueryArgs]
  
  type QueryArgParsed = typings.wordpressUrl.buildTypesGetQueryArgMod.QueryArgParsed
  
  type QueryArgs = Record[String, QueryArgParsed]
}
