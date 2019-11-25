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
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], maxImageSize = maxImageSize.asInstanceOf[js.Any], stylesheets = stylesheets.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IConfiguration]
  }
}

