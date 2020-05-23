package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsEsSpecCompliant extends js.Object {
  var options: EsSpecCompliant
}

object OptionsEsSpecCompliant {
  @scala.inline
  def apply(options: EsSpecCompliant): OptionsEsSpecCompliant = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsEsSpecCompliant]
  }
}

