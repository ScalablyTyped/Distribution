package typings
package svgDotJsLib.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewBox
  extends org.scalablytyped.runtime.Instantiable1[/* source */ ViewBoxAlias, ViewBox]
     with org.scalablytyped.runtime.Instantiable4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      ViewBox
    ] {
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var zoom: js.UndefOr[scala.Double] = js.native
  def at(pos: scala.Double): ViewBox = js.native
  def morph(source: ViewBoxAlias): ViewBox = js.native
  def morph(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): ViewBox = js.native
}

