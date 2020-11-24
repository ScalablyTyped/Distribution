package typings.textMaskCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Mask = js.Array[java.lang.String | typings.std.RegExp]
  
  type Pipe = js.Function2[
    /* conformedValue */ java.lang.String, 
    /* config */ js.Any, 
    typings.textMaskCore.mod.PipeResult
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.textMaskCore.mod.PipeAddResult
    - java.lang.String
    - typings.textMaskCore.textMaskCoreBooleans.`false`
  */
  type PipeResult = typings.textMaskCore.mod._PipeResult | java.lang.String
}
