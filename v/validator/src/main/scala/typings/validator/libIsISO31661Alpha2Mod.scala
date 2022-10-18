package typings.validator

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsISO31661Alpha2Mod {
  
  @JSImport("validator/lib/isISO31661Alpha2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("validator/lib/isISO31661Alpha2", "CountryCodes")
  @js.native
  val CountryCodes: Set[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.validator.validatorStrings.AD, typings.validator.validatorStrings.AE, typings.validator.validatorStrings.AF */ Any
  ] = js.native
}
