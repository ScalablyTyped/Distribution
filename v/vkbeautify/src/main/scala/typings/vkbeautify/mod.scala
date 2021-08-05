package typings.vkbeautify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vkbeautify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def css(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def css(text: String, amountOfWhitespaces: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("css")(text.asInstanceOf[js.Any], amountOfWhitespaces.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def css(text: String, amountOfWhitespaces: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("css")(text.asInstanceOf[js.Any], amountOfWhitespaces.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cssmin(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssmin")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cssmin(text: String, preserveComments: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cssmin")(text.asInstanceOf[js.Any], preserveComments.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def json(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def json(text: String, amountOfWhitespaces: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(text.asInstanceOf[js.Any], amountOfWhitespaces.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def json(text: String, amountOfWhitespaces: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(text.asInstanceOf[js.Any], amountOfWhitespaces.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def jsonmin(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonmin")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sql(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sql")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sql(text: String, amountOfWhitespaces: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sql")(text.asInstanceOf[js.Any], amountOfWhitespaces.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sql(text: String, amountOfWhitespaces: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sql")(text.asInstanceOf[js.Any], amountOfWhitespaces.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sqlmin(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sqlmin")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def xml(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xml")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def xml(text: String, amountOfWhitespaces: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("xml")(text.asInstanceOf[js.Any], amountOfWhitespaces.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def xml(text: String, amountOfWhitespaces: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("xml")(text.asInstanceOf[js.Any], amountOfWhitespaces.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def xmlmin(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlmin")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def xmlmin(text: String, preserveComments: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlmin")(text.asInstanceOf[js.Any], preserveComments.asInstanceOf[js.Any])).asInstanceOf[String]
}
