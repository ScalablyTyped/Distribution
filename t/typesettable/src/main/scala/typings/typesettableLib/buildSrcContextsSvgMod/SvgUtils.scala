package typings
package typesettableLib.buildSrcContextsSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts/svg", "SvgUtils")
@js.native
class SvgUtils () extends js.Object

@JSImport("typesettable/build/src/contexts/svg", "SvgUtils")
@js.native
object SvgUtils extends js.Object {
  var SVG_NS: java.lang.String = js.native
  /**
       * Appends an SVG element with the specified tag name to the provided element.
       * The variadic classnames are added to the new element.
       *
       * Returns the new element.
       */
  def append(element: stdLib.Element, tagName: java.lang.String, classNames: java.lang.String*): stdLib.SVGElement = js.native
  /**
       * Creates and returns a new SVGElement with the attached classnames.
       */
  def create(tagName: java.lang.String, classNames: java.lang.String*): stdLib.SVGElement = js.native
  /**
       * Returns the width/height of svg element's bounding box
       */
  def getDimensions(element: stdLib.SVGGraphicsElement): typesettableLib.buildSrcMeasurersAbstractMeasurerMod.IDimensions = js.native
}

