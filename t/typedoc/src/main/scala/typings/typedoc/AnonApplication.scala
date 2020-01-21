package typings.typedoc

import typings.typedoc.applicationMod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplication extends js.Object {
  var application: Application
}

object AnonApplication {
  @scala.inline
  def apply(application: Application): AnonApplication = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApplication]
  }
}

