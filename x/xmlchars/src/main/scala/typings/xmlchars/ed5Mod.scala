package typings.xmlchars

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ed5Mod {
  
  @JSImport("xmlchars/xml/1.0/ed5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xmlchars/xml/1.0/ed5", "CHAR")
  @js.native
  val CHAR: /* "\t\n\r -\\uD7FF\\uE000-\\uFFFD\\uD800\\uDC00-\\uDBFF\\uDFFF" */ String = js.native
  
  @JSImport("xmlchars/xml/1.0/ed5", "CHAR_RE")
  @js.native
  val CHAR_RE: RegExp = js.native
  
  @JSImport("xmlchars/xml/1.0/ed5", "NAME_CHAR")
  @js.native
  val NAME_CHAR: String = js.native
  
  @JSImport("xmlchars/xml/1.0/ed5", "NAME_CHAR_RE")
  @js.native
  val NAME_CHAR_RE: RegExp = js.native
  
  @JSImport("xmlchars/xml/1.0/ed5", "NAME_RE")
  @js.native
  val NAME_RE: RegExp = js.native
  
  @JSImport("xmlchars/xml/1.0/ed5", "NAME_START_CHAR")
  @js.native
  val NAME_START_CHAR: /* ":A-Z_a-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\uD800\\uDC00-\\uDB7F\\uDFFF" */ String = js.native
  
  @JSImport("xmlchars/xml/1.0/ed5", "NAME_START_CHAR_RE")
  @js.native
  val NAME_START_CHAR_RE: RegExp = js.native
  
  @JSImport("xmlchars/xml/1.0/ed5", "NMTOKEN_RE")
  @js.native
  val NMTOKEN_RE: RegExp = js.native
  
  @JSImport("xmlchars/xml/1.0/ed5", "S")
  @js.native
  val S: /* " \t\r\n" */ String = js.native
  
  @JSImport("xmlchars/xml/1.0/ed5", "S_LIST")
  @js.native
  val S_LIST: js.Array[Double] = js.native
  
  @JSImport("xmlchars/xml/1.0/ed5", "S_RE")
  @js.native
  val S_RE: RegExp = js.native
  
  inline def isChar(c: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChar")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNameChar(c: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNameChar")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNameStartChar(c: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNameStartChar")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isS(c: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isS")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
