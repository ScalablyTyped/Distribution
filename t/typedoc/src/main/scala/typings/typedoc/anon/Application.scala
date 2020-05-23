package typings.typedoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  var application: typings.typedoc.applicationMod.Application
}

object Application {
  @scala.inline
  def apply(application: typings.typedoc.applicationMod.Application): Application = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
}

