package typings.twuniEmojify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@twuni/emojify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def emojify(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emojify")(text.asInstanceOf[js.Any]).asInstanceOf[String]
}
