package typings.wonderFrp

import typings.wonderFrp.entityMod.Entity
import typings.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/JudgeUtils", JSImport.Namespace)
@js.native
object judgeUtilsMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JudgeUtils$ * / any */ @js.native
  class JudgeUtils () extends js.Object
  
  /* static members */
  @js.native
  object JudgeUtils extends js.Object {
    def isEqual(ob1: Entity, ob2: Entity): Boolean = js.native
    def isIObserver(i: IObserver): js.Function0[_] = js.native
    def isPromise(obj: js.Any): Boolean = js.native
  }
  
}

