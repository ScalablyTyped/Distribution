package typings.strongholdPayJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stronghold-pay-js", "ERROR_MESSAGE")
@js.native
object ERROR_MESSAGE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.strongholdPayJs.mod.global.Stronghold.ERROR_MESSAGE & String] = js.native
  
  /* "The 'amount' option was unable to be parsed as number." */ val AMOUNT_BAD_FORMAT: typings.strongholdPayJs.mod.global.Stronghold.ERROR_MESSAGE.AMOUNT_BAD_FORMAT & String = js.native
  
  /* "Attribute is required." */ val ATTRIBUTE_REQUIRED: typings.strongholdPayJs.mod.global.Stronghold.ERROR_MESSAGE.ATTRIBUTE_REQUIRED & String = js.native
  
  /* "Invalid environment provided. Expect \"live\" or \"sandbox\"." */ val BAD_ENVIRONMENT: typings.strongholdPayJs.mod.global.Stronghold.ERROR_MESSAGE.BAD_ENVIRONMENT & String = js.native
}
