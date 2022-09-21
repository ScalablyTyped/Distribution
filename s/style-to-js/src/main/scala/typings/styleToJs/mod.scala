package typings.styleToJs

import typings.std.Record
import typings.styleToJs.utilitiesMod.CamelCaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("style-to-js/cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(style: String): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
  inline def default(style: String, options: StyleToJSOptions): StyleObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StyleObject]
  
  type StyleObject = Record[String, String]
  
  type StyleToJSOptions = CamelCaseOptions
}
