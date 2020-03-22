package typings.stylus

import org.scalablytyped.runtime.Instantiable4
import typings.stylus.mod.Stylus.Nodes.HSLA
import typings.stylus.mod.Stylus.Nodes.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofHSLA extends Instantiable4[/* h */ Double, /* s */ Double, /* l */ Double, /* a */ Double, HSLA] {
  /**
    * Return a `HSLA` from the given `hsla`.
    */
  def fromRGBA(rgba: RGBA): HSLA = js.native
}

