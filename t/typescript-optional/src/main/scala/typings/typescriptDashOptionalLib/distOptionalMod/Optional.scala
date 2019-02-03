package typings
package typescriptDashOptionalLib.distOptionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-optional/dist/optional", "Optional")
@js.native
abstract class Optional[T] () extends js.Object {
  def filter(predicate: js.Function1[/* value */ T, scala.Boolean]): Optional[T] = js.native
  def flatMap[U](mapper: js.Function1[/* value */ T, Optional[U]]): Optional[U] = js.native
  def get(): T = js.native
  def ifPresent(consumer: js.Function1[/* value */ T, scala.Unit]): scala.Unit = js.native
  def ifPresentOrElse(consumer: js.Function1[/* value */ T, scala.Unit], emptyAction: js.Function0[scala.Unit]): scala.Unit = js.native
  def isEmpty(): scala.Boolean = js.native
  def isPresent(): scala.Boolean = js.native
  def map[U](mapper: js.Function1[/* value */ T, U]): Optional[stdLib.NonNullable[U]] = js.native
  def matches[U](cases: typescriptDashOptionalLib.distTypesMod.Cases[T, U]): U = js.native
  def or(supplier: js.Function0[Optional[T]]): Optional[T] = js.native
  def orElse(another: T): T = js.native
  def orElseGet(supplier: js.Function0[T]): T = js.native
  def orElseThrow[U](errorSupplier: js.Function0[U]): T = js.native
  def orNull(): T | scala.Null = js.native
  def orUndefined(): js.UndefOr[T] = js.native
  def toJSON(key: java.lang.String): js.Any = js.native
  def toOption(): typescriptDashOptionalLib.distTypesMod.Option[T] = js.native
}

/* static members */
@JSImport("typescript-optional/dist/optional", "Optional")
@js.native
object Optional extends js.Object {
  def empty[T](): typescriptDashOptionalLib.distOptionalMod.Optional[T] = js.native
  def from[T](option: typescriptDashOptionalLib.distTypesMod.Option[T]): typescriptDashOptionalLib.distOptionalMod.Optional[T] = js.native
  def of[T](value: T): typescriptDashOptionalLib.distOptionalMod.Optional[T] = js.native
  def ofNonNull[T](value: T): typescriptDashOptionalLib.distOptionalMod.Optional[T] = js.native
  def ofNullable[T](): typescriptDashOptionalLib.distOptionalMod.Optional[T] = js.native
  def ofNullable[T](nullable: T): typescriptDashOptionalLib.distOptionalMod.Optional[T] = js.native
}

