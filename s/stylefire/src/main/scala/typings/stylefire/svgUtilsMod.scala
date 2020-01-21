package typings.stylefire

import typings.std.SVGElement
import typings.std.SVGPathElement
import typings.stylefire.svgTypesMod.Dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylefire/lib/svg/utils", JSImport.Namespace)
@js.native
object svgUtilsMod extends js.Object {
  def getDimensions(element: SVGElement): Dimensions = js.native
  def getDimensions(element: SVGPathElement): Dimensions = js.native
  def getSVGElementDimensions(element: SVGElement): Dimensions = js.native
  def getSVGElementDimensions(element: SVGPathElement): Dimensions = js.native
}

