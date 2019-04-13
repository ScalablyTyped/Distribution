package typings
package svgDotJsLib.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transformation
  extends org.scalablytyped.runtime.Instantiable2[/* source */ Transform, /* inversed */ scala.Boolean, Transformation]
     with org.scalablytyped.runtime.Instantiable1[/* transform (repeated) */ Transform, Transformation] {
  def at(pos: scala.Double): Matrix = js.native
  def undo(transform: Transform): this.type = js.native
}

