package typings.superstruct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typingsMod {
  
  type Coercer = js.Function1[/* value */ js.Any, js.Any]
  
  type Infer[T /* <: typings.superstruct.structMod.Struct[_, _] */] = /* import warning: importer.ImportType#apply Failed type conversion: T['TYPE'] */ js.Any
  
  type Refiner[T] = js.Function2[
    /* value */ T, 
    /* context */ typings.superstruct.typingsMod.Context, 
    typings.superstruct.typingsMod.Result
  ]
  
  type Result = scala.Boolean | typings.std.Iterable[typings.superstruct.typingsMod.Failure]
  
  type Validator = js.Function2[
    /* value */ js.Any, 
    /* context */ typings.superstruct.typingsMod.Context, 
    typings.superstruct.typingsMod.Result
  ]
}
