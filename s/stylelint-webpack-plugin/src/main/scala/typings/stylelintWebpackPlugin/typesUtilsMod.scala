package typings.stylelintWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMod {
  
  @JSImport("stylelint-webpack-plugin/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrify[T](value: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends null | undefined ? [] : T extends string ? [string] : T extends std.Array<unknown> ? T : T extends std.Iterable<infer T_1> ? std.Array<T_1> : [T] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("arrify")(value.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends null | undefined ? [] : T extends string ? [string] : T extends std.Array<unknown> ? T : T extends std.Iterable<infer T_1> ? std.Array<T_1> : [T] */ js.Any]
  
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
