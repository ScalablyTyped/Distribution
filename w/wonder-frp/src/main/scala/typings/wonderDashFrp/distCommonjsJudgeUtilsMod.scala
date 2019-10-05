package typings.wonderDashFrp

import typings.wonderDashFrp.distCommonjsCoreEntityMod.Entity
import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/JudgeUtils", JSImport.Namespace)
@js.native
object distCommonjsJudgeUtilsMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JudgeUtils$ * / any */ @js.native
  class JudgeUtils () extends js.Object
  
  /* static members */
  @js.native
  object JudgeUtils extends js.Object {
    def isEqual(ob1: Entity, ob2: Entity): Boolean = js.native
    def isIObserver(i: IObserver): js.Function0[_] = js.native
    def isPromise(obj: js.Any): Boolean = js.native
  }
  
}

