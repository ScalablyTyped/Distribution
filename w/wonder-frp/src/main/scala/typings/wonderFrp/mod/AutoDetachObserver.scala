package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "AutoDetachObserver")
@js.native
class AutoDetachObserver protected ()
  extends typings.wonderFrp.autoDetachObserverMod.AutoDetachObserver {
  def this(observer: IObserver) = this()
  def this(onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
}
/* static members */
object AutoDetachObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "AutoDetachObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(observer: IObserver): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(observer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
