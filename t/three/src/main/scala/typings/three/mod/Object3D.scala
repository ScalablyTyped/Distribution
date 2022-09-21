package typings.three.mod

import typings.three.eventDispatcherMod.BaseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "Object3D")
@js.native
open class Object3D[E /* <: BaseEvent */] ()
  extends typings.three.threeMod.Object3D[E]
/* static members */
object Object3D {
  
  @JSImport("three", "Object3D")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three", "Object3D.DefaultMatrixAutoUpdate")
  @js.native
  def DefaultMatrixAutoUpdate: Boolean = js.native
  inline def DefaultMatrixAutoUpdate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultMatrixAutoUpdate")(x.asInstanceOf[js.Any])
  
  @JSImport("three", "Object3D.DefaultUp")
  @js.native
  def DefaultUp: typings.three.vector3Mod.Vector3 = js.native
  inline def DefaultUp_=(x: typings.three.vector3Mod.Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultUp")(x.asInstanceOf[js.Any])
}
