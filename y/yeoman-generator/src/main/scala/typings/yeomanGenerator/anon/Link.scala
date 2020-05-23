package typings.yeomanGenerator.anon

import typings.yeomanGenerator.yeomanGeneratorStrings.strong
import typings.yeomanGenerator.yeomanGeneratorStrings.weak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var link: weak | strong
  var local: String
}

object Link {
  @scala.inline
  def apply(link: weak | strong, local: String): Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

