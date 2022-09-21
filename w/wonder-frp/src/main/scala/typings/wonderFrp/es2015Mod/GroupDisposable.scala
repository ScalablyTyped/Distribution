package typings.wonderFrp.es2015Mod

import typings.wonderFrp.disposableIdisposableMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "GroupDisposable")
@js.native
open class GroupDisposable ()
  extends typings.wonderFrp.disposableGroupDisposableMod.GroupDisposable {
  def this(disposable: IDisposable) = this()
}
/* static members */
object GroupDisposable {
  
  @JSImport("wonder-frp/dist/es2015", "GroupDisposable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typings.wonderFrp.disposableGroupDisposableMod.GroupDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderFrp.disposableGroupDisposableMod.GroupDisposable]
  inline def create(disposable: IDisposable): typings.wonderFrp.disposableGroupDisposableMod.GroupDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(disposable.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.disposableGroupDisposableMod.GroupDisposable]
}
