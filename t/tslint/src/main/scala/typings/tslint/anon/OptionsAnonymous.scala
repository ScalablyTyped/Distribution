package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsAnonymous extends js.Object {
  var options: Anonymous
}

object OptionsAnonymous {
  @scala.inline
  def apply(options: Anonymous): OptionsAnonymous = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsAnonymous]
  }
}

