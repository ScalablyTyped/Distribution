package typings.yeomanDashGenerator

import typings.yeomanDashGenerator.yeomanDashGeneratorStrings.strong
import typings.yeomanDashGenerator.yeomanDashGeneratorStrings.weak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Link extends js.Object {
  var link: weak | strong
  var local: String
}

object Anon_Link {
  @scala.inline
  def apply(link: weak | strong, local: String): Anon_Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], local = local)
  
    __obj.asInstanceOf[Anon_Link]
  }
}

