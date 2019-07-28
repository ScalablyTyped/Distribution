package typings.vegaDashTypings

import typings.vegaDashTypings.vegaDashTypingsStrings.orientationchange
import typings.vegaDashTypings.vegaDashTypingsStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Orientationchange extends js.Object {
  var source: window
  var `type`: orientationchange
}

object Anon_Orientationchange {
  @scala.inline
  def apply(source: window, `type`: orientationchange): Anon_Orientationchange = {
    val __obj = js.Dynamic.literal(source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Orientationchange]
  }
}

