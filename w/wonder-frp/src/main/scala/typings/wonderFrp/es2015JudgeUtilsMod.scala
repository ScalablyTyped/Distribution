package typings.wonderFrp

import typings.wonderFrp.coreEntityMod.Entity
import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015JudgeUtilsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JudgeUtils$ * / any */ @JSImport("wonder-frp/dist/es2015/JudgeUtils", "JudgeUtils")
  @js.native
  class JudgeUtils () extends StObject
  /* static members */
  object JudgeUtils {
    
    @JSImport("wonder-frp/dist/es2015/JudgeUtils", "JudgeUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isEqual(ob1: Entity, ob2: Entity): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(ob1.asInstanceOf[js.Any], ob2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isIObserver(i: IObserver): js.Function0[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("isIObserver")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Any]]
    
    @scala.inline
    def isPromise(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
