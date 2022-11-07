package typings.three.global.THREE

import typings.three.srcCoreEventDispatcherMod.BaseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Object3D")
@js.native
open class Object3D[E /* <: BaseEvent */] ()
  extends typings.three.mod.Object3D[E]
/* static members */
object Object3D {
  
  @JSGlobal("THREE.Object3D")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("THREE.Object3D.DefaultMatrixAutoUpdate")
  @js.native
  def DefaultMatrixAutoUpdate: Boolean = js.native
  inline def DefaultMatrixAutoUpdate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultMatrixAutoUpdate")(x.asInstanceOf[js.Any])
  
  @JSGlobal("THREE.Object3D.DefaultMatrixWorldAutoUpdate")
  @js.native
  def DefaultMatrixWorldAutoUpdate: Boolean = js.native
  inline def DefaultMatrixWorldAutoUpdate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultMatrixWorldAutoUpdate")(x.asInstanceOf[js.Any])
  
  @JSGlobal("THREE.Object3D.DefaultUp")
  @js.native
  def DefaultUp: typings.three.srcMathVector3Mod.Vector3 = js.native
  inline def DefaultUp_=(x: typings.three.srcMathVector3Mod.Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultUp")(x.asInstanceOf[js.Any])
}
