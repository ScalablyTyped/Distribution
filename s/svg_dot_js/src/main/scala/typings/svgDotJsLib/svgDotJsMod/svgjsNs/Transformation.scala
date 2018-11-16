package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transformation
  extends ScalablyTyped.runtime.Instantiable2[/* source */ Transform, /* inversed */ scala.Boolean, Transformation]
     with ScalablyTyped.runtime.Instantiable1[/* transform (repeated) */ Transform, Transformation] {
  def at(pos: scala.Double): Matrix = js.native
  def undo(transform: Transform): this.type = js.native
}

