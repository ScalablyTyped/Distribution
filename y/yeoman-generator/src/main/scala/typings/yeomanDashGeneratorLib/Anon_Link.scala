package typings
package yeomanDashGeneratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Link extends js.Object {
  var link: yeomanDashGeneratorLib.yeomanDashGeneratorLibStrings.weak | yeomanDashGeneratorLib.yeomanDashGeneratorLibStrings.strong
  var local: java.lang.String
}

object Anon_Link {
  @scala.inline
  def apply(
    link: yeomanDashGeneratorLib.yeomanDashGeneratorLibStrings.weak | yeomanDashGeneratorLib.yeomanDashGeneratorLibStrings.strong,
    local: java.lang.String
  ): Anon_Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], local = local)
  
    __obj.asInstanceOf[Anon_Link]
  }
}

