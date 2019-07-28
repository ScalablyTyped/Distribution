package typings.swiz.swizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SERIALIZATION extends js.Object

@JSImport("swiz", "SERIALIZATION")
@js.native
object SERIALIZATION extends js.Object {
  @js.native
  sealed trait SERIALIZATION_JSON extends SERIALIZATION
  
  @js.native
  sealed trait SERIALIZATION_XML extends SERIALIZATION
  
  /* 0 */ val SERIALIZATION_JSON: typings.swiz.swizMod.SERIALIZATION.SERIALIZATION_JSON with Double = js.native
  /* 1 */ val SERIALIZATION_XML: typings.swiz.swizMod.SERIALIZATION.SERIALIZATION_XML with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SERIALIZATION with Double] = js.native
}

