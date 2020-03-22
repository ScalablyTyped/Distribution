package typings.stylus

import org.scalablytyped.runtime.Instantiable4
import typings.stylus.mod.Stylus.Nodes.HSLA
import typings.stylus.mod.Stylus.Nodes.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofRGBA extends Instantiable4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ Double, RGBA] {
  /**
    * Return a `RGBA` from the given `hsla`.
    */
  def fromHSLA(hsla: HSLA): RGBA = js.native
  /**
    * Return an `RGBA` without clamping values.
    */
  def withoutClamping(r: Double, g: Double, b: Double, a: Double): RGBA = js.native
}

