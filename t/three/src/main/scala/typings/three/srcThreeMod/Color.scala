package typings.three.srcThreeMod

import typings.std.Record
import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "Color")
@js.native
open class Color ()
  extends typings.three.srcMathColorMod.Color {
  def this(color: ColorRepresentation) = this()
  def this(r: Double, g: Double, b: Double) = this()
}
/* static members */
object Color {
  
  @JSImport("three/src/Three", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of X11 color names.
    */
  @JSImport("three/src/Three", "Color.NAMES")
  @js.native
  def NAMES: Record[String, Double] = js.native
  inline def NAMES_=(x: Record[String, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAMES")(x.asInstanceOf[js.Any])
}
