package typings.wegameApi.anon

import typings.wegameApi.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
  var stat: Stats
}

object Stat {
  @scala.inline
  def apply(stat: Stats): Stat = {
    val __obj = js.Dynamic.literal(stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
}

