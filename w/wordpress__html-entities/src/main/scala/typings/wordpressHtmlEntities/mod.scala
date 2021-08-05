package typings.wordpressHtmlEntities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/html-entities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeEntities(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeEntities")(html.asInstanceOf[js.Any]).asInstanceOf[String]
}
