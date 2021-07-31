package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "Object3D")
@js.native
class Object3D ()
  extends typings.three.object3DMod.Object3D
/* static members */
object Object3D {
  
  @JSImport("three", "Object3D")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three", "Object3D.DefaultMatrixAutoUpdate")
  @js.native
  def DefaultMatrixAutoUpdate: Boolean = js.native
  @scala.inline
  def DefaultMatrixAutoUpdate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultMatrixAutoUpdate")(x.asInstanceOf[js.Any])
  
  @JSImport("three", "Object3D.DefaultUp")
  @js.native
  def DefaultUp: typings.three.vector3Mod.Vector3 = js.native
  @scala.inline
  def DefaultUp_=(x: typings.three.vector3Mod.Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultUp")(x.asInstanceOf[js.Any])
}
