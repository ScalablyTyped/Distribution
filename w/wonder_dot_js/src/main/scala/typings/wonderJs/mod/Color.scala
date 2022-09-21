package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "Color")
@js.native
open class Color ()
  extends typings.wonderJs.colorMod.Color
/* static members */
object Color {
  
  @JSImport("wonder.js/dist/es2015", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typings.wonderJs.colorMod.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderJs.colorMod.Color]
  inline def create(colorVal: String): typings.wonderJs.colorMod.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(colorVal.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.colorMod.Color]
}
