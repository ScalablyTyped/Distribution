package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration
  */
trait IConfiguration extends js.Object {
  var dimensions: IDimension
  var maxImageSize: scala.Double
  var stylesheets: js.Array[java.lang.String]
  var toolbar: js.Array[java.lang.String]
}

object IConfiguration {
  @scala.inline
  def apply(
    dimensions: IDimension,
    maxImageSize: scala.Double,
    stylesheets: js.Array[java.lang.String],
    toolbar: js.Array[java.lang.String]
  ): IConfiguration = {
    val __obj = js.Dynamic.literal(dimensions = dimensions, maxImageSize = maxImageSize, stylesheets = stylesheets, toolbar = toolbar)
  
    __obj.asInstanceOf[IConfiguration]
  }
}

