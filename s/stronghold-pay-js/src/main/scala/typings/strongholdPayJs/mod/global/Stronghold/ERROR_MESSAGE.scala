package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERROR_MESSAGE extends js.Object
@JSGlobal("Stronghold.ERROR_MESSAGE")
@js.native
object ERROR_MESSAGE extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ERROR_MESSAGE with String] = js.native
  
  @js.native
  sealed trait AMOUNT_BAD_FORMAT extends ERROR_MESSAGE
  /* "The 'amount' option was unable to be parsed as number." */ @js.native
  object AMOUNT_BAD_FORMAT extends TopLevel[AMOUNT_BAD_FORMAT with String]
  
  @js.native
  sealed trait ATTRIBUTE_REQUIRED extends ERROR_MESSAGE
  /* "Attribute is required." */ @js.native
  object ATTRIBUTE_REQUIRED extends TopLevel[ATTRIBUTE_REQUIRED with String]
  
  @js.native
  sealed trait BAD_ENVIRONMENT extends ERROR_MESSAGE
  /* "Invalid environment provided. Expect \"live\" or \"sandbox\"." */ @js.native
  object BAD_ENVIRONMENT extends TopLevel[BAD_ENVIRONMENT with String]
}
