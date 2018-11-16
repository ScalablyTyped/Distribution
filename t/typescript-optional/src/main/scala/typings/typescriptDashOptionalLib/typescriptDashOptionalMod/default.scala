package typings
package typescriptDashOptionalLib.typescriptDashOptionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-optional", JSImport.Default)
@js.native
abstract class default[T] () extends Optional[T] {
  /* CompleteClass */
  override val isEmpty: scala.Boolean = js.native
  /* CompleteClass */
  override val isPresent: scala.Boolean = js.native
  /* CompleteClass */
  override def filter(predicate: js.Function1[T, scala.Boolean]): Optional[T] = js.native
  /* CompleteClass */
  override def flatMap[U](mapper: js.Function1[T, Optional[U]]): Optional[U] = js.native
  /* CompleteClass */
  override def get(): T = js.native
  /* CompleteClass */
  override def ifPresent(consumer: js.Function1[T, scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def ifPresentOrElse(consumer: js.Function1[T, scala.Unit], emptyAction: js.Function0[scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def map[U](mapper: js.Function1[T, U]): Optional[U] = js.native
  /* CompleteClass */
  override def matches[U](cases: typescriptDashOptionalLib.distLibTypesMod.Cases[T, U]): U = js.native
  /* CompleteClass */
  override def or(supplier: js.Function0[Optional[T]]): Optional[T] = js.native
  /* CompleteClass */
  override def orElse(another: T): T = js.native
  /* CompleteClass */
  override def orElseGet(supplier: js.Function0[T]): T = js.native
  /* CompleteClass */
  override def orElseThrow[U](errorSupplier: js.Function0[U]): T = js.native
  /* CompleteClass */
  override def orNull(): T | scala.Null = js.native
  /* CompleteClass */
  override def orUndefined(): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def toOption(): typescriptDashOptionalLib.distLibTypesMod.Option[T] = js.native
}

@JSImport("typescript-optional", JSImport.Default)
@js.native
object default extends js.Object {
  def empty[T](): typescriptDashOptionalLib.typescriptDashOptionalMod.Optional[T] = js.native
  def from[T](option: typescriptDashOptionalLib.distLibTypesMod.Option[T]): typescriptDashOptionalLib.typescriptDashOptionalMod.Optional[T] = js.native
  def of[T](value: T): typescriptDashOptionalLib.typescriptDashOptionalMod.Optional[T] = js.native
  def ofNonNull[T](value: T): typescriptDashOptionalLib.typescriptDashOptionalMod.Optional[T] = js.native
  def ofNullable[T](): typescriptDashOptionalLib.typescriptDashOptionalMod.Optional[T] = js.native
  def ofNullable[T](nullable: T): typescriptDashOptionalLib.typescriptDashOptionalMod.Optional[T] = js.native
}

