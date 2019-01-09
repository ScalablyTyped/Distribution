package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AB
  extends org.scalablytyped.runtime.Instantiable4[
      /* r */ scala.Double, 
      /* g */ scala.Double, 
      /* b */ scala.Double, 
      /* a */ scala.Double, 
      stylusLib.stylusMod.StylusNs.NodesNs.RGBA
    ] {
  /**
    * Return a `RGBA` from the given `hsla`.
    */
  def fromHSLA(hsla: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
    * Return an `RGBA` without clamping values.
    */
  def withoutClamping(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
}

