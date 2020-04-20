package typings.wouter.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wouter.AnonToPath
  - typings.wouter.AnonHrefPath
*/
trait NavigationalProps extends js.Object

object NavigationalProps {
  @scala.inline
  def AnonToPath(to: Path): NavigationalProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationalProps]
  }
  @scala.inline
  def AnonHrefPath(href: Path): NavigationalProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationalProps]
  }
}

