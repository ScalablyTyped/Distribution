package typings.wordpressAutop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/autop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autop(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("autop")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def autop(text: String, br: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autop")(text.asInstanceOf[js.Any], br.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removep(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removep")(html.asInstanceOf[js.Any]).asInstanceOf[String]
}
