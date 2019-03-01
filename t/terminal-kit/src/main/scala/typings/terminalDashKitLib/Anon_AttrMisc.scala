package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttrMisc extends js.Object {
  var attr: scala.Double
  var misc: js.Any
  var offset: scala.Double
  var text: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object Anon_AttrMisc {
  @scala.inline
  def apply(
    attr: scala.Double,
    misc: js.Any,
    offset: scala.Double,
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): Anon_AttrMisc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attr")(attr)
    __obj.updateDynamic("misc")(misc)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_AttrMisc]
  }
}

