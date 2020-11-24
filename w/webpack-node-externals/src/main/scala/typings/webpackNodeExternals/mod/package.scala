package typings.webpackNodeExternals

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /** a function that accepts the module name and returns whether it should be included */
  type AllowlistFunctionType = js.Function1[/* moduleName */ java.lang.String, scala.Boolean]
  
  type AllowlistOption = java.lang.String | typings.std.RegExp | typings.webpackNodeExternals.mod.AllowlistFunctionType
  
  type ImportTypeCallback = js.Function1[/* moduleName */ java.lang.String, java.lang.String]
}
