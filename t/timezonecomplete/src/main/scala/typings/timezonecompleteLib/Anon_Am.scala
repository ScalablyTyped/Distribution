package typings
package timezonecompleteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Am extends js.Object {
  var am: java.lang.String
  var midnight: java.lang.String
  var noon: java.lang.String
  var pm: java.lang.String
}

object Anon_Am {
  @scala.inline
  def apply(am: java.lang.String, midnight: java.lang.String, noon: java.lang.String, pm: java.lang.String): Anon_Am = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("am")(am)
    __obj.updateDynamic("midnight")(midnight)
    __obj.updateDynamic("noon")(noon)
    __obj.updateDynamic("pm")(pm)
    __obj.asInstanceOf[Anon_Am]
  }
}

