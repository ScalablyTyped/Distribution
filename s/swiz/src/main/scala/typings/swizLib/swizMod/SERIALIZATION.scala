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
  
  val SERIALIZATION_JSON: SERIALIZATION_JSON with java.lang.String = js.native
  val SERIALIZATION_XML: SERIALIZATION_XML with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[swizLib.swizMod.SERIALIZATION with java.lang.String] = js.native
}

