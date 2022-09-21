package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "Vector3")
@js.native
open class Vector3 ()
  extends typings.wonderJs.vector3Mod.Vector3 {
  def this(x: Double, y: Double, z: Double) = this()
}
/* static members */
object Vector3 {
  
  @JSImport("wonder.js/dist/es2015", "Vector3")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typings.wonderJs.vector3Mod.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderJs.vector3Mod.Vector3]
  inline def create(x: Double, y: Double, z: Double): typings.wonderJs.vector3Mod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.vector3Mod.Vector3]
  
  @JSImport("wonder.js/dist/es2015", "Vector3.forward")
  @js.native
  def forward: Any = js.native
  inline def forward_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forward")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder.js/dist/es2015", "Vector3.right")
  @js.native
  def right: Any = js.native
  inline def right_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder.js/dist/es2015", "Vector3.up")
  @js.native
  def up: Any = js.native
  inline def up_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("up")(x.asInstanceOf[js.Any])
}
