package typings.three.global.THREE

import typings.std.Record
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Color")
@js.native
open class Color ()
  extends typings.three.mod.Color {
  def this(color: ColorRepresentation) = this()
  def this(r: Double, g: Double, b: Double) = this()
}
/* static members */
object Color {
  
  @JSGlobal("THREE.Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of X11 color names.
    */
  @JSGlobal("THREE.Color.NAMES")
  @js.native
  def NAMES: Record[String, Double] = js.native
  inline def NAMES_=(x: Record[String, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAMES")(x.asInstanceOf[js.Any])
}
