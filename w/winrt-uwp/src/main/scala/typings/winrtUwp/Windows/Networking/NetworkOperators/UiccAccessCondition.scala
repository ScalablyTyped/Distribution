package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UiccAccessCondition extends StObject
/** Describes the conditions placed on operations using a UICC application. */
@JSGlobal("Windows.Networking.NetworkOperators.UiccAccessCondition")
@js.native
object UiccAccessCondition extends StObject {
  
  /** Access requires Administrative 5. */
  @js.native
  sealed trait administrative5
    extends StObject
       with UiccAccessCondition
  
  /** Access requires Administrative 6. */
  @js.native
  sealed trait administrative6
    extends StObject
       with UiccAccessCondition
  
  /** Access is always allowed. */
  @js.native
  sealed trait alwaysAllowed
    extends StObject
       with UiccAccessCondition
  
  /** Access is never allowed. */
  @js.native
  sealed trait neverAllowed
    extends StObject
       with UiccAccessCondition
  
  /** Access requires PIN 1. */
  @js.native
  sealed trait pin1
    extends StObject
       with UiccAccessCondition
  
  /** Access requires PIN 2. */
  @js.native
  sealed trait pin2
    extends StObject
       with UiccAccessCondition
  
  /** Access requires PIN 3. */
  @js.native
  sealed trait pin3
    extends StObject
       with UiccAccessCondition
  
  /** Access requires PIN 4. */
  @js.native
  sealed trait pin4
    extends StObject
       with UiccAccessCondition
}
