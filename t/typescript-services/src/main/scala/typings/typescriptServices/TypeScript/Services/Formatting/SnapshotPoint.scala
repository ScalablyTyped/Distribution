package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotPoint extends js.Object {
  var position: Double
  var snapshot: ITextSnapshot
  def add(offset: Double): SnapshotPoint
  def getContainingLine(): ITextSnapshotLine
}

object SnapshotPoint {
  @scala.inline
  def apply(
    add: Double => SnapshotPoint,
    getContainingLine: () => ITextSnapshotLine,
    position: Double,
    snapshot: ITextSnapshot
  ): SnapshotPoint = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getContainingLine = js.Any.fromFunction0(getContainingLine), position = position.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotPoint]
  }
}

