package typings.wonderFrp.mod

import typings.wonderFrp.idisposableMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "GroupDisposable")
@js.native
open class GroupDisposable ()
  extends typings.wonderFrp.groupDisposableMod.GroupDisposable {
  def this(disposable: IDisposable) = this()
}
/* static members */
object GroupDisposable {
  
  @JSImport("wonder-frp/dist/commonjs", "GroupDisposable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typings.wonderFrp.groupDisposableMod.GroupDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderFrp.groupDisposableMod.GroupDisposable]
  inline def create(disposable: IDisposable): typings.wonderFrp.groupDisposableMod.GroupDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(disposable.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.groupDisposableMod.GroupDisposable]
}
