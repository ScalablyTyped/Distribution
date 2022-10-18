package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "Vector2")
@js.native
open class Vector2 ()
  extends typings.wonderJs.distEs2015MathVector2Mod.Vector2 {
  def this(x: Any, y: Any) = this()
}
/* static members */
object Vector2 {
  
  @JSImport("wonder.js/dist/es2015", "Vector2")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typings.wonderJs.distEs2015MathVector2Mod.Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderJs.distEs2015MathVector2Mod.Vector2]
  inline def create(x: Any, y: Any): typings.wonderJs.distEs2015MathVector2Mod.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.distEs2015MathVector2Mod.Vector2]
}
