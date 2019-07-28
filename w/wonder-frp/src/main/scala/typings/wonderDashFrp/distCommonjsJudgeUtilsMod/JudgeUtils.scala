package typings.wonderDashFrp.distCommonjsJudgeUtilsMod

import typings.wonderDashFrp.distCommonjsCoreEntityMod.Entity
import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("wonder-frp/dist/commonjs/JudgeUtils", "JudgeUtils")
@js.native
class JudgeUtils () extends js.Object

/* static members */
@JSImport("wonder-frp/dist/commonjs/JudgeUtils", "JudgeUtils")
@js.native
object JudgeUtils extends js.Object {
  def isEqual(ob1: Entity, ob2: Entity): Boolean = js.native
  def isIObserver(i: IObserver): js.Function0[_] = js.native
  def isPromise(obj: js.Any): Boolean = js.native
}

