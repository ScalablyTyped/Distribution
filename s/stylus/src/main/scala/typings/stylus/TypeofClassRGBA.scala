package typings.stylus

import org.scalablytyped.runtime.Instantiable4
import typings.stylus.stylusMod.StylusNs.NodesNs.HSLA
import typings.stylus.stylusMod.StylusNs.NodesNs.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassRGBA extends Instantiable4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ Double, RGBA] {
  /**
    * Return a `RGBA` from the given `hsla`.
    */
  def fromHSLA(hsla: HSLA): RGBA = js.native
  /**
    * Return an `RGBA` without clamping values.
    */
  def withoutClamping(r: Double, g: Double, b: Double, a: Double): RGBA = js.native
}

