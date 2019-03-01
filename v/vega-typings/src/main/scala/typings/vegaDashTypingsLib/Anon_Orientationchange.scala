package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Orientationchange extends js.Object {
  var source: vegaDashTypingsLib.vegaDashTypingsLibStrings.window
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.orientationchange
}

object Anon_Orientationchange {
  @scala.inline
  def apply(
    source: vegaDashTypingsLib.vegaDashTypingsLibStrings.window,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.orientationchange
  ): Anon_Orientationchange = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Anon_Orientationchange]
  }
}

