package typings.superstruct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object structMod {
  
  type StructResult = scala.Boolean | typings.std.Iterable[typings.superstruct.structMod.StructFailure]
  
  type StructType[T /* <: typings.superstruct.structMod.Struct[_, _] */] = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T['refiner']>[0] */ js.Any
}
