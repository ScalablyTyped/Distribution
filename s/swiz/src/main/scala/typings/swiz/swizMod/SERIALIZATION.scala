package typings.swiz.swizMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SERIALIZATION with Double] = js.native
  /* 0 */ @js.native
  object SERIALIZATION_JSON extends TopLevel[SERIALIZATION_JSON with Double]
  
  /* 1 */ @js.native
  object SERIALIZATION_XML extends TopLevel[SERIALIZATION_XML with Double]
  
}

