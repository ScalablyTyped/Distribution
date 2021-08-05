package typings.wordsToNumbers

import typings.wordsToNumbers.anon.Fuzzy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("words-to-numbers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String): String | Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any]).asInstanceOf[String | Double | Null]
  inline def default(text: String, options: Fuzzy): String | Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Double | Null]
  
  inline def wordsToNumbers(text: String): String | Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("wordsToNumbers")(text.asInstanceOf[js.Any]).asInstanceOf[String | Double | Null]
  inline def wordsToNumbers(text: String, options: Fuzzy): String | Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("wordsToNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Double | Null]
}
