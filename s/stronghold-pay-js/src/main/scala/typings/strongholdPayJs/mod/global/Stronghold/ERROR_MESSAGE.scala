package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERROR_MESSAGE extends StObject
@JSGlobal("Stronghold.ERROR_MESSAGE")
@js.native
object ERROR_MESSAGE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ERROR_MESSAGE with String] = js.native
  
  @js.native
  sealed trait AMOUNT_BAD_FORMAT extends ERROR_MESSAGE
  /* "The 'amount' option was unable to be parsed as number." */ val AMOUNT_BAD_FORMAT: typings.strongholdPayJs.mod.global.Stronghold.ERROR_MESSAGE.AMOUNT_BAD_FORMAT with String = js.native
  
  @js.native
  sealed trait ATTRIBUTE_REQUIRED extends ERROR_MESSAGE
  /* "Attribute is required." */ val ATTRIBUTE_REQUIRED: typings.strongholdPayJs.mod.global.Stronghold.ERROR_MESSAGE.ATTRIBUTE_REQUIRED with String = js.native
  
  @js.native
  sealed trait BAD_ENVIRONMENT extends ERROR_MESSAGE
  /* "Invalid environment provided. Expect \"live\" or \"sandbox\"." */ val BAD_ENVIRONMENT: typings.strongholdPayJs.mod.global.Stronghold.ERROR_MESSAGE.BAD_ENVIRONMENT with String = js.native
}
