package typings.validator

import typings.validator.validatorMod.HashAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isHash", JSImport.Namespace)
@js.native
object libIsHashMod extends js.Object {
  def default(str: String, algorithm: HashAlgorithm): Boolean = js.native
}

