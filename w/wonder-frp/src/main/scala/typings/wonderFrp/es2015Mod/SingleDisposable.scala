package typings.wonderFrp.es2015Mod

import typings.wonderFrp.disposableIdisposableMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "SingleDisposable")
@js.native
open class SingleDisposable protected ()
  extends typings.wonderFrp.disposableSingleDisposableMod.SingleDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: IDisposable) = this()
}
/* static members */
object SingleDisposable {
  
  @JSImport("wonder-frp/dist/es2015", "SingleDisposable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typings.wonderFrp.disposableSingleDisposableMod.SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderFrp.disposableSingleDisposableMod.SingleDisposable]
  inline def create(dispose: js.Function): typings.wonderFrp.disposableSingleDisposableMod.SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.disposableSingleDisposableMod.SingleDisposable]
  inline def create(dispose: IDisposable): typings.wonderFrp.disposableSingleDisposableMod.SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.disposableSingleDisposableMod.SingleDisposable]
}
