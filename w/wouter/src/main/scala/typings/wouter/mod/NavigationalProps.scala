package typings.wouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wouter.AnonTo
  - typings.wouter.AnonHref
*/
trait NavigationalProps extends js.Object

object NavigationalProps {
  @scala.inline
  def AnonTo(to: Path): NavigationalProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationalProps]
  }
  @scala.inline
  def AnonHref(href: Path): NavigationalProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationalProps]
  }
}

