package typings.superstruct

import org.scalablytyped.runtime.TopLevel
import typings.std.Iterable
import typings.std.Record
import typings.superstruct.structMod.Struct
import typings.superstruct.structMod.StructContext
import typings.superstruct.structMod.StructFailure
import typings.superstruct.structMod.StructResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def toFailures(result: StructResult, context: StructContext): Iterable[StructFailure] = js.native
  type StructRecord[T] = Record[String, Struct[T, js.Any]]
  type StructTuple[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: superstruct.superstruct/lib/struct.Struct<T[K], any>}
    */ typings.superstruct.superstructStrings.StructTuple with TopLevel[T]
}

