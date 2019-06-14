package typings
package swizLib.swizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SERIALIZATION extends js.Object

@JSImport("swiz", "SERIALIZATION")
@js.native
object SERIALIZATION extends js.Object {
  @js.native
  sealed trait SERIALIZATION_JSON
    extends swizLib.swizMod.SERIALIZATION
  
  @js.native
  sealed trait SERIALIZATION_XML
    extends swizLib.swizMod.SERIALIZATION
  
  /* 0 */ val SERIALIZATION_JSON: SERIALIZATION_JSON with scala.Double = js.native
  /* 1 */ val SERIALIZATION_XML: SERIALIZATION_XML with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[swizLib.swizMod.SERIALIZATION with scala.Double] = js.native
}

