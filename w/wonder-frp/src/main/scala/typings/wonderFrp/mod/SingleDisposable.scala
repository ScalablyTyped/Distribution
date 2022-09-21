package typings.wonderFrp.mod

import typings.wonderFrp.idisposableMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "SingleDisposable")
@js.native
open class SingleDisposable protected ()
  extends typings.wonderFrp.singleDisposableMod.SingleDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: IDisposable) = this()
}
/* static members */
object SingleDisposable {
  
  @JSImport("wonder-frp/dist/commonjs", "SingleDisposable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typings.wonderFrp.singleDisposableMod.SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderFrp.singleDisposableMod.SingleDisposable]
  inline def create(dispose: js.Function): typings.wonderFrp.singleDisposableMod.SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.singleDisposableMod.SingleDisposable]
  inline def create(dispose: IDisposable): typings.wonderFrp.singleDisposableMod.SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.singleDisposableMod.SingleDisposable]
}
