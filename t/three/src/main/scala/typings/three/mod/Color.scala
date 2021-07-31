package typings.three.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "Color")
@js.native
class Color ()
  extends typings.three.colorMod.Color {
  def this(color: String) = this()
  def this(color: Double) = this()
  def this(color: typings.three.colorMod.Color) = this()
  def this(r: Double, g: Double, b: Double) = this()
}
/* static members */
object Color {
  
  @JSImport("three", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	 * List of X11 color names.
  	 */
  @JSImport("three", "Color.NAMES")
  @js.native
  def NAMES: Record[String, Double] = js.native
  @scala.inline
  def NAMES_=(x: Record[String, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAMES")(x.asInstanceOf[js.Any])
}
