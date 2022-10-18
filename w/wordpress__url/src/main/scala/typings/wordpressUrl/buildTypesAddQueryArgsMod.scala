package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesAddQueryArgsMod {
  
  @JSImport("@wordpress/url/build-types/add-query-args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addQueryArgs(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addQueryArgs")().asInstanceOf[String]
  inline def addQueryArgs(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addQueryArgs")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def addQueryArgs(url: String, args: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addQueryArgs")(url.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def addQueryArgs(url: Unit, args: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addQueryArgs")(url.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
}
