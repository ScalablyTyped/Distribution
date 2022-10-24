package typings.wixStyleReact

import typings.wixStyleReact.anon.MaxValue
import typings.wixStyleReact.anon.MinValue
import typings.wixStyleReact.distTypesInputMod.InputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNumberInputUtilsMod {
  
  @JSImport("wix-style-react/dist/types/NumberInput/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultValueToNullIfEmpty(value: InputValue, defaultValue: InputValue): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultValueToNullIfEmpty")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  inline def defaultValueToNullIfInvalidNumber(value: String): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValueToNullIfInvalidNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
  inline def defaultValueToNullIfInvalidNumber(value: Double): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValueToNullIfInvalidNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
  
  inline def getErrorMessageByLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorMessageByLocale")().asInstanceOf[String]
  
  inline def getHasError(param0: MaxValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getHasError")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInRange(param0: MinValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInRange")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
