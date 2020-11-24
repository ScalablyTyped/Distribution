package typings.superstruct.structMod

import typings.std.IterableIterator
import typings.superstruct.anon.PartialStructFailurePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructContext extends js.Object {
  
  var branch: js.Array[_] = js.native
  
  def check(value: js.Any, struct: Struct[_ | scala.Nothing, _]): IterableIterator[StructFailure] = js.native
  def check(
    value: js.Any,
    struct: Struct[_ | scala.Nothing, _],
    parent: js.UndefOr[scala.Nothing],
    key: String
  ): IterableIterator[StructFailure] = js.native
  def check(
    value: js.Any,
    struct: Struct[_ | scala.Nothing, _],
    parent: js.UndefOr[scala.Nothing],
    key: Double
  ): IterableIterator[StructFailure] = js.native
  def check(value: js.Any, struct: Struct[_ | scala.Nothing, _], parent: js.Any): IterableIterator[StructFailure] = js.native
  def check(value: js.Any, struct: Struct[_ | scala.Nothing, _], parent: js.Any, key: String): IterableIterator[StructFailure] = js.native
  def check(value: js.Any, struct: Struct[_ | scala.Nothing, _], parent: js.Any, key: Double): IterableIterator[StructFailure] = js.native
  
  def fail(): StructFailure = js.native
  def fail(props: PartialStructFailurePath): StructFailure = js.native
  
  var path: js.Array[String | Double] = js.native
  
  var `type`: String = js.native
  
  var value: js.Any = js.native
}
