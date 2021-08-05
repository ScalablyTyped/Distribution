package typings.stylelintWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("stylelint-webpack-plugin/declarations/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseFiles(files: String, context: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFiles")(files.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def parseFiles(files: js.Array[String], context: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFiles")(files.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def replaceBackslashes(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceBackslashes")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
