package typings.tstl.errorGeneratorMod

import typings.tstl.anon.MODULE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  var constructor: MODULE
}

object Instance {
  @scala.inline
  def apply(constructor: MODULE): Instance = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

