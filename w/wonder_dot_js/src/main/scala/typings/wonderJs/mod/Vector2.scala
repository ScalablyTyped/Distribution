package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "Vector2")
@js.native
class Vector2 ()
  extends typings.wonderJs.vector2Mod.Vector2 {
  def this(x: js.Any, y: js.Any) = this()
}
/* static members */
object Vector2 {
  
  @JSImport("wonder.js/dist/es2015", "Vector2")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(): typings.wonderJs.vector2Mod.Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderJs.vector2Mod.Vector2]
  @scala.inline
  def create(x: js.Any, y: js.Any): typings.wonderJs.vector2Mod.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.vector2Mod.Vector2]
}
