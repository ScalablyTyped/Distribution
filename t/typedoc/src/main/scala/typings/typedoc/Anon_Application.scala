package typings.typedoc

import typings.typedoc.distLibApplicationMod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Application extends js.Object {
  var application: Application
}

object Anon_Application {
  @scala.inline
  def apply(application: Application): Anon_Application = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Application]
  }
}

