package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "Vector4")
@js.native
class Vector4 ()
  extends typings.wonderJs.vector4Mod.Vector4 {
  def this(x: js.Any, y: js.Any, z: js.Any, w: js.Any) = this()
}
/* static members */
object Vector4 {
  
  @JSImport("wonder.js/dist/es2015", "Vector4")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
  @scala.inline
  def create(x: js.Any, y: js.Any, z: js.Any, w: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
