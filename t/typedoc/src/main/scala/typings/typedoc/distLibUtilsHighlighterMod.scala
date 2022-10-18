package typings.typedoc

import typings.shiki.mod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsHighlighterMod {
  
  @JSImport("typedoc/dist/lib/utils/highlighter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")().asInstanceOf[String]
  
  inline def getSupportedLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedLanguages")().asInstanceOf[js.Array[String]]
  
  inline def highlight(code: String, lang: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(code.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isSupportedLanguage(lang: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedLanguage")(lang.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def loadHighlighter(lightTheme: Theme, darkTheme: Theme): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadHighlighter")(lightTheme.asInstanceOf[js.Any], darkTheme.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
