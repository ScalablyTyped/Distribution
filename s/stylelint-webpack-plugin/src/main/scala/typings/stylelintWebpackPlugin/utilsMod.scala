package typings.stylelintWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("stylelint-webpack-plugin/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrify[T](value: T): (js.Array[Any | String | T]) | T = ^.asInstanceOf[js.Dynamic].applyDynamic("arrify")(value.asInstanceOf[js.Any]).asInstanceOf[(js.Array[Any | String | T]) | T]
  
  inline def jsonStringifyReplacerSortKeys(_underscore: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonStringifyReplacerSortKeys")(_underscore.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseFiles(files: String, context: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFiles")(files.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def parseFiles(files: js.Array[String], context: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFiles")(files.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def parseFoldersToGlobs(patterns: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFoldersToGlobs")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def parseFoldersToGlobs(patterns: String, extensions: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFoldersToGlobs")(patterns.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def parseFoldersToGlobs(patterns: String, extensions: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFoldersToGlobs")(patterns.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def parseFoldersToGlobs(patterns: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFoldersToGlobs")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def parseFoldersToGlobs(patterns: js.Array[String], extensions: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFoldersToGlobs")(patterns.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def parseFoldersToGlobs(patterns: js.Array[String], extensions: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFoldersToGlobs")(patterns.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
