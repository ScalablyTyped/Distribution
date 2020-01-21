package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "JudgeUtils")
@js.native
class JudgeUtils ()
  extends typings.wonderFrp.es2015JudgeUtilsMod.JudgeUtils

/* static members */
@JSImport("wonder-frp/dist/es2015", "JudgeUtils")
@js.native
object JudgeUtils extends js.Object {
  def isEqual(ob1: typings.wonderFrp.coreEntityMod.Entity, ob2: typings.wonderFrp.coreEntityMod.Entity): Boolean = js.native
  def isIObserver(i: IObserver): js.Function0[_] = js.native
  def isPromise(obj: js.Any): Boolean = js.native
}

