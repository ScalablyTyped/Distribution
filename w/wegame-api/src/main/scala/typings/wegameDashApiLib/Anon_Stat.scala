package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stat extends js.Object {
  var stat: Stats
}

object Anon_Stat {
  @scala.inline
  def apply(stat: Stats): Anon_Stat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stat")(stat)
    __obj.asInstanceOf[Anon_Stat]
  }
}

