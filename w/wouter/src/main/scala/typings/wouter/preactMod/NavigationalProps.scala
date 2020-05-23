package typings.wouter.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wouter.anon.ToPath
  - typings.wouter.anon.HrefPath
*/
trait NavigationalProps extends js.Object

object NavigationalProps {
  @scala.inline
  def ToPath(to: Path): NavigationalProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationalProps]
  }
  @scala.inline
  def HrefPath(href: Path): NavigationalProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationalProps]
  }
}

