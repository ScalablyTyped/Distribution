package typings
package swagLib.swagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwagStatic extends js.Object {
  def registerHelpers(handlebars: swagLib.Anon_AST): scala.Unit
}

object SwagStatic {
  @scala.inline
  def apply(registerHelpers: js.Function1[swagLib.Anon_AST, scala.Unit]): SwagStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerHelpers")(registerHelpers)
    __obj.asInstanceOf[SwagStatic]
  }
}

