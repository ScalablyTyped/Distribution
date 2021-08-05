package typings.superstruct

import org.scalablytyped.runtime.TopLevel
import typings.std.IterableIterator
import typings.std.Iterator
import typings.std.Record
import typings.superstruct.structMod.Struct
import typings.superstruct.structMod.StructContext
import typings.superstruct.structMod.StructFailure
import typings.superstruct.structMod.StructResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("superstruct/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iteratorShift[T](input: Iterator[T, js.Any, Unit]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("iteratorShift")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def toFailures(result: StructResult, context: StructContext): IterableIterator[StructFailure] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFailures")(result.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[StructFailure]]
  
  type StructRecord[T] = Record[String, Struct[T, js.Any]]
  
  type StructTuple[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: superstruct.superstruct/lib/struct.Struct<T[K], any>}
    */ typings.superstruct.superstructStrings.StructTuple & TopLevel[T]
}
