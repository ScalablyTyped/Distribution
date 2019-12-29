package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmeUtil")
@js.native
object GmeUtil extends js.Object {
  @js.native
  class Canon () extends js.Object {
    def parse(thing: js.Any): String = js.native
    def stringify(thing: js.Any): String = js.native
  }
  
  var CANON: Canon = js.native
  def ASSERT(condition: Boolean): scala.Nothing = js.native
}

