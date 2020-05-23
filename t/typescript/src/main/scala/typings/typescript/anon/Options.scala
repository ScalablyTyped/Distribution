package typings.typescript.anon

import typings.typescript.mod.Diagnostic
import typings.typescript.mod.TypeAcquisition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var errors: js.Array[Diagnostic]
  var options: TypeAcquisition
}

object Options {
  @scala.inline
  def apply(errors: js.Array[Diagnostic], options: TypeAcquisition): Options = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

