package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "JudgeUtils")
@js.native
class JudgeUtils ()
  extends typings.wonderFrp.judgeUtilsMod.JudgeUtils
/* static members */
object JudgeUtils {
  
  @JSImport("wonder-frp/dist/commonjs", "JudgeUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isEqual(ob1: typings.wonderFrp.entityMod.Entity, ob2: typings.wonderFrp.entityMod.Entity): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(ob1.asInstanceOf[js.Any], ob2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isIObserver(i: IObserver): js.Function0[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("isIObserver")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Any]]
  
  @scala.inline
  def isPromise(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
