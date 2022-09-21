package typings.yaml

import typings.yaml.scalarMod.Scalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifyNumberMod {
  
  @JSImport("yaml/dist/stringify/stringifyNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringifyNumber(hasFormatMinFractionDigitsTagValue: Scalar[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyNumber")(hasFormatMinFractionDigitsTagValue.asInstanceOf[js.Any]).asInstanceOf[String]
}
