package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration
  */
trait IConfiguration extends js.Object {
  var dimensions: IDimension
  var maxImageSize: Double
  var stylesheets: js.Array[String]
  var toolbar: js.Array[String]
}

object IConfiguration {
  @scala.inline
  def apply(
    dimensions: IDimension,
    maxImageSize: Double,
    stylesheets: js.Array[String],
    toolbar: js.Array[String]
  ): IConfiguration = {
    val __obj = js.Dynamic.literal(dimensions = dimensions, maxImageSize = maxImageSize, stylesheets = stylesheets, toolbar = toolbar)
  
    __obj.asInstanceOf[IConfiguration]
  }
}

