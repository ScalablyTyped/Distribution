package typings.wordpressEscapeHtml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/escape-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeAmpersand(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeAmpersand")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeAttribute(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeAttribute")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeEditableHTML(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeEditableHTML")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeHTML(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHTML")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeLessThan(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeLessThan")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeQuotationMark(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeQuotationMark")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isValidAttributeName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAttributeName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
