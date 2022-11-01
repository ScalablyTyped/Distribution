package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object card {
  
  @JSImport("swell-js", "card")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createToken(input: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createToken")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def validateCVC(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCVC")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateExpiry(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateExpiry")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateNumber(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNumber")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
