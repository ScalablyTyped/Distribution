package typings.wonderDashFrp.distCommonjsMod

import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "JudgeUtils")
@js.native
class JudgeUtils ()
  extends typings.wonderDashFrp.distCommonjsJudgeUtilsMod.JudgeUtils

/* static members */
@JSImport("wonder-frp/dist/commonjs", "JudgeUtils")
@js.native
object JudgeUtils extends js.Object {
  def isEqual(
    ob1: typings.wonderDashFrp.distCommonjsCoreEntityMod.Entity,
    ob2: typings.wonderDashFrp.distCommonjsCoreEntityMod.Entity
  ): Boolean = js.native
  def isIObserver(i: IObserver): js.Function0[_] = js.native
  def isPromise(obj: js.Any): Boolean = js.native
}

