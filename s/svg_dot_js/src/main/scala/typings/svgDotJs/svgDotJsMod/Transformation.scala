package typings.svgDotJs.svgDotJsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transformation
  extends Instantiable2[/* source */ Transform, /* inversed */ Boolean, Transformation]
     with Instantiable1[/* transform (repeated) */ Transform, Transformation] {
  def at(pos: Double): Matrix = js.native
  def undo(transform: Transform): this.type = js.native
}

