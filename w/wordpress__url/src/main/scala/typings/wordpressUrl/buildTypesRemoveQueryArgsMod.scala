package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesRemoveQueryArgsMod {
  
  @JSImport("@wordpress/url/build-types/remove-query-args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeQueryArgs(url: String, args: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeQueryArgs")(scala.List(url.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
}
