package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dimension
  */
trait IDimension extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object IDimension {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): IDimension = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[IDimension]
  }
}

