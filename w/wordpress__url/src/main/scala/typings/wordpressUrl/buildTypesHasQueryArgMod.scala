package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHasQueryArgMod {
  
  @JSImport("@wordpress/url/build-types/has-query-arg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasQueryArg(url: String, arg: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasQueryArg")(url.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
