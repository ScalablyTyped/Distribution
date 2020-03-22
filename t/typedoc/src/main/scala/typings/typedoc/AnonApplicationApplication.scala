package typings.typedoc

import typings.typedoc.mod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplicationApplication extends js.Object {
  var application: Application
}

object AnonApplicationApplication {
  @scala.inline
  def apply(application: Application): AnonApplicationApplication = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApplicationApplication]
  }
}

