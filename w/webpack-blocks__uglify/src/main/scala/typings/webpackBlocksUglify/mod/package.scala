package typings.webpackBlocksUglify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExtractCommentsFunction = js.Function2[
    /* node */ js.Any, 
    /* comment */ js.Any, 
    scala.Boolean | typings.webpackBlocksUglify.mod.ExtractCommentsObject
  ]
  
  type FileNameFunction = js.Function1[/* file */ java.lang.String, java.lang.String]
  
  type TestType = java.lang.String | typings.std.RegExp
}
