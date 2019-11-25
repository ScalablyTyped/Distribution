package typings.walkdir

import typings.walkdir.walkdirNumbers.`false`
import typings.walkdir.walkdirNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var return_object: js.UndefOr[`false`] = js.undefined
  var sync: `true`
}

object Anon_False {
  @scala.inline
  def apply(sync: `true`, return_object: `false` = null): Anon_False = {
    val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
    if (return_object != null) __obj.updateDynamic("return_object")(return_object.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

