package typings.superstruct.indexEsMod

import typings.std.Iterable
import typings.superstruct.anon.PartialStructFailureBranch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `StructContext` contains information about the current value being
  * validated as well as helper functions for failures and recursive validating.
  */
/**
  * A `StructContext` contains information about the current value being
  * validated as well as helper functions for failures and recursive validating.
  */
@js.native
trait StructContext extends js.Object {
  var branch: js.Array[_] = js.native
  var path: js.Array[String | Double] = js.native
  var `type`: String = js.native
  var value: js.Any = js.native
  def check(value: js.Any, struct: Struct_[_ | scala.Nothing, _]): Iterable[StructFailure] = js.native
  def check(
    value: js.Any,
    struct: Struct_[_ | scala.Nothing, _],
    parent: js.UndefOr[scala.Nothing],
    key: String
  ): Iterable[StructFailure] = js.native
  def check(
    value: js.Any,
    struct: Struct_[_ | scala.Nothing, _],
    parent: js.UndefOr[scala.Nothing],
    key: Double
  ): Iterable[StructFailure] = js.native
  def check(value: js.Any, struct: Struct_[_ | scala.Nothing, _], parent: js.Any): Iterable[StructFailure] = js.native
  def check(value: js.Any, struct: Struct_[_ | scala.Nothing, _], parent: js.Any, key: String): Iterable[StructFailure] = js.native
  def check(value: js.Any, struct: Struct_[_ | scala.Nothing, _], parent: js.Any, key: Double): Iterable[StructFailure] = js.native
  def fail(): StructFailure = js.native
  def fail(props: PartialStructFailureBranch): StructFailure = js.native
}

