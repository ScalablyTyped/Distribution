package typings.terser.mod

import org.scalablytyped.runtime.StringDictionary
import typings.terser.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def minify(files: String): js.Promise[MinifyOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MinifyOutput]]
inline def minify(files: String, options: MinifyOptions): js.Promise[MinifyOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinifyOutput]]
inline def minify(files: js.Array[String]): js.Promise[MinifyOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MinifyOutput]]
inline def minify(files: js.Array[String], options: MinifyOptions): js.Promise[MinifyOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinifyOutput]]
inline def minify(files: StringDictionary[String]): js.Promise[MinifyOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MinifyOutput]]
inline def minify(files: StringDictionary[String], options: MinifyOptions): js.Promise[MinifyOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinifyOutput]]
