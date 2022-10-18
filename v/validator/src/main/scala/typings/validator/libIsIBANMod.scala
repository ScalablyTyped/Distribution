package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsIBANMod {
  
  @JSImport("validator/lib/isIBAN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("validator/lib/isIBAN", "locales")
  @js.native
  val locales: js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 78, starting with typings.validator.validatorStrings.AD, typings.validator.validatorStrings.AE, typings.validator.validatorStrings.AL */ Any
  ] = js.native
}
