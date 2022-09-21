package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Long {
  
  @JSImport("tablestore", "Long")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromNumber(num: Double): int64 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(num.asInstanceOf[js.Any]).asInstanceOf[int64]
  
  inline def fromString(str: String): int64 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[int64]
}
