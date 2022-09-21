package typings.unicodeProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unicode-properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCategory(codePoint: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCategory")(codePoint.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getCombiningClass(codePoint: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCombiningClass")(codePoint.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getEastAsianWidth(codePoint: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEastAsianWidth")(codePoint.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getNumericValue(codePoint: Double): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumericValue")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  inline def getScript(codePoint: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getScript")(codePoint.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAlphabetic(codePoint: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBaseForm(codePoint: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBaseForm")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDigit(codePoint: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDigit")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLowerCase(codePoint: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLowerCase")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMark(codePoint: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMark")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPunctuation(codePoint: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPunctuation")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTitleCase(codePoint: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTitleCase")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUpperCase(codePoint: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUpperCase")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWhiteSpace(codePoint: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhiteSpace")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
