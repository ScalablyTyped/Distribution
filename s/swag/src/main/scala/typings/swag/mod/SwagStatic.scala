package typings.swag.mod

import typings.swag.anon.TypeofHandlebars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwagStatic extends js.Object {
  def registerHelpers(handlebars: TypeofHandlebars): Unit
}

object SwagStatic {
  @scala.inline
  def apply(registerHelpers: TypeofHandlebars => Unit): SwagStatic = {
    val __obj = js.Dynamic.literal(registerHelpers = js.Any.fromFunction1(registerHelpers))
    __obj.asInstanceOf[SwagStatic]
  }
}

