package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "JudgeUtils")
@js.native
class JudgeUtils ()
  extends typings.wonderFrp.judgeUtilsMod.JudgeUtils

/* static members */
@JSImport("wonder-frp/dist/commonjs", "JudgeUtils")
@js.native
object JudgeUtils extends js.Object {
  def isEqual(ob1: typings.wonderFrp.entityMod.Entity, ob2: typings.wonderFrp.entityMod.Entity): Boolean = js.native
  def isIObserver(i: IObserver): js.Function0[_] = js.native
  def isPromise(obj: js.Any): Boolean = js.native
}

