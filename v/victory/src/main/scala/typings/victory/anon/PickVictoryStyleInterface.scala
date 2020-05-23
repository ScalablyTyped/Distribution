package typings.victory.anon

import typings.victory.mod.VictoryStyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<victory.victory.VictoryStyleInterface, 'parent'> */
trait PickVictoryStyleInterface extends js.Object {
  var parent: js.UndefOr[VictoryStyleObject] = js.undefined
}

object PickVictoryStyleInterface {
  @scala.inline
  def apply(parent: VictoryStyleObject = null): PickVictoryStyleInterface = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickVictoryStyleInterface]
  }
}

