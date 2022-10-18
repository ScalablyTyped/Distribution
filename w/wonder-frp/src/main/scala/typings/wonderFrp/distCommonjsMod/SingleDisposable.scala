package typings.wonderFrp.distCommonjsMod

import typings.wonderFrp.distCommonjsDisposableIdisposableMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "SingleDisposable")
@js.native
open class SingleDisposable protected ()
  extends typings.wonderFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: IDisposable) = this()
}
/* static members */
object SingleDisposable {
  
  @JSImport("wonder-frp/dist/commonjs", "SingleDisposable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typings.wonderFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable]
  inline def create(dispose: js.Function): typings.wonderFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable]
  inline def create(dispose: IDisposable): typings.wonderFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable]
}
