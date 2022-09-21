package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsutil {
  
  @JSImport("ts-model", "tsutil")
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeToIdentifier(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeToIdentifier")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeToJavaIdentifier(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeToJavaIdentifier")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeTypescriptPropertyName(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeTypescriptPropertyName")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isValidTypescriptIdentifier(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTypescriptIdentifier")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def ramlType2TSType(ramlType: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ramlType2TSType")(ramlType.asInstanceOf[js.Any]).asInstanceOf[String]
}
