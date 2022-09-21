package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "Vector4")
@js.native
open class Vector4 ()
  extends typings.wonderJs.vector4Mod.Vector4 {
  def this(x: Any, y: Any, z: Any, w: Any) = this()
}
/* static members */
object Vector4 {
  
  @JSImport("wonder.js/dist/es2015", "Vector4")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Any]
  inline def create(x: Any, y: Any, z: Any, w: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Any]
}
