package typings
package typescriptDashOptionalLib.typescriptDashOptionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Optional[T] extends js.Object {
  val isEmpty: scala.Boolean
  val isPresent: scala.Boolean
  def filter(predicate: js.Function1[/* value */ T, scala.Boolean]): Optional[T]
  def flatMap[U](mapper: js.Function1[/* value */ T, Optional[U]]): Optional[U]
  def get(): T
  def ifPresent(consumer: js.Function1[/* value */ T, scala.Unit]): scala.Unit
  def ifPresentOrElse(consumer: js.Function1[/* value */ T, scala.Unit], emptyAction: js.Function0[scala.Unit]): scala.Unit
  def map[U](mapper: js.Function1[/* value */ T, U]): Optional[U]
  def matches[U](cases: typescriptDashOptionalLib.distLibTypesMod.Cases[T, U]): U
  def or(supplier: js.Function0[Optional[T]]): Optional[T]
  def orElse(another: T): T
  def orElseGet(supplier: js.Function0[T]): T
  def orElseThrow[U](errorSupplier: js.Function0[U]): T
  def orNull(): T | scala.Null
  def orUndefined(): js.UndefOr[T]
  def toOption(): typescriptDashOptionalLib.distLibTypesMod.Option[T]
}

