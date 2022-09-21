package typings.stylableCodeFormatter

import typings.jsBeautify.mod.CSSBeautifyOptions
import typings.stylableCodeFormatter.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/code-formatter/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocumentFormatting(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentFormatting")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getDocumentFormatting(content: String, offset: Unit, options: CSSBeautifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentFormatting")(content.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getDocumentFormatting(content: String, offset: End): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentFormatting")(content.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getDocumentFormatting(content: String, offset: End, options: CSSBeautifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentFormatting")(content.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
