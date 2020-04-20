package typings.typedoc

import typings.typedoc.typedocStrings.categorizeByGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var name: categorizeByGroup
}

object Anon2 {
  @scala.inline
  def apply(name: categorizeByGroup): Anon2 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2]
  }
}

