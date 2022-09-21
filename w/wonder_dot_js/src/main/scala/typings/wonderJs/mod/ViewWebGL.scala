package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ViewWebGL")
@js.native
open class ViewWebGL protected ()
  extends typings.wonderJs.viewMod.ViewWebGL {
  def this(dom: Any) = this()
}
/* static members */
object ViewWebGL {
  
  @JSImport("wonder.js/dist/es2015", "ViewWebGL")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(view: Any): typings.wonderJs.viewMod.ViewWebGL = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(view.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.viewMod.ViewWebGL]
}
