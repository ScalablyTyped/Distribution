package typings.validator

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toDateMod {
  
  @JSImport("validator/lib/toDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the input string to a `Date`, or `null` if the input is not a date.
    */
  inline def default(input: String): Date | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[Date | Null]
}
