package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProperties extends js.Object {
  var properties: AnonExistence
}

object AnonProperties {
  @scala.inline
  def apply(properties: AnonExistence): AnonProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProperties]
  }
}

