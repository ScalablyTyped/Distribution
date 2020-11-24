package typings.swiz.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SERIALIZATION extends js.Object
@JSImport("swiz", "SERIALIZATION")
@js.native
object SERIALIZATION extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SERIALIZATION with Double] = js.native
  
  @js.native
  sealed trait SERIALIZATION_JSON extends SERIALIZATION
  /* 0 */ @js.native
  object SERIALIZATION_JSON extends TopLevel[SERIALIZATION_JSON with Double]
  
  @js.native
  sealed trait SERIALIZATION_XML extends SERIALIZATION
  /* 1 */ @js.native
  object SERIALIZATION_XML extends TopLevel[SERIALIZATION_XML with Double]
}
