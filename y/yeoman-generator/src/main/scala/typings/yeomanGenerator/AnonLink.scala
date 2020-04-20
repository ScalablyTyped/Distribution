package typings.yeomanGenerator

import typings.yeomanGenerator.yeomanGeneratorStrings.strong
import typings.yeomanGenerator.yeomanGeneratorStrings.weak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLink extends js.Object {
  var link: weak | strong
  var local: String
}

object AnonLink {
  @scala.inline
  def apply(link: weak | strong, local: String): AnonLink = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLink]
  }
}

