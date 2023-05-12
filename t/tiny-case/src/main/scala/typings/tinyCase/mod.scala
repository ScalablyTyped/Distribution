package typings.tinyCase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tiny-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def kebabCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("kebabCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def pascalCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sentenceCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sentenceCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def snakeCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("snakeCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def titleCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titleCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def upperFirst(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("upperFirst")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def words(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("words")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
