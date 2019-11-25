package typings.wouter

import typings.wouter.wouterMod.NavigationalProps
import typings.wouter.wouterMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_To extends NavigationalProps {
  var to: Path
}

object Anon_To {
  @scala.inline
  def apply(to: Path): Anon_To = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_To]
  }
}

