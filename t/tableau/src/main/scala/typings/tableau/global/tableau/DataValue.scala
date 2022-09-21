package typings.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.DataValue")
@js.native
open class DataValue ()
  extends StObject
     with typings.tableau.tableau.DataValue {
  
  /** The value formatted according to the locale and the formatting applied to the field or parameter. */
  /* CompleteClass */
  var formattedValue: String = js.native
  
  /** Contains the raw native value as a JavaScript type, which is one of String, Number, Boolean, or Date */
  /* CompleteClass */
  var value: Any = js.native
}
