package typings.webgme.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmeUtil")
@js.native
object GmeUtil extends js.Object {
  @js.native
  class Canon ()
    extends typings.webgme.GmeUtil.Canon {
    /* CompleteClass */
    override def parse(thing: js.Any): String = js.native
    /* CompleteClass */
    override def stringify(thing: js.Any): String = js.native
  }
  
  @JSName("CANON")
  var CANON_ : typings.webgme.GmeUtil.Canon = js.native
  def ASSERT(condition: Boolean): scala.Nothing = js.native
}

