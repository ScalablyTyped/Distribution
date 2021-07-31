package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineSpacingRule extends StObject
@JSGlobal("Windows.UI.Text.LineSpacingRule")
@js.native
object LineSpacingRule extends StObject {
  
  @js.native
  sealed trait atLeast
    extends StObject
       with LineSpacingRule
  
  @js.native
  sealed trait double
    extends StObject
       with LineSpacingRule
  
  @js.native
  sealed trait exactly
    extends StObject
       with LineSpacingRule
  
  @js.native
  sealed trait multiple
    extends StObject
       with LineSpacingRule
  
  @js.native
  sealed trait oneAndHalf
    extends StObject
       with LineSpacingRule
  
  @js.native
  sealed trait percent
    extends StObject
       with LineSpacingRule
  
  @js.native
  sealed trait single
    extends StObject
       with LineSpacingRule
  
  @js.native
  sealed trait undefined
    extends StObject
       with LineSpacingRule
}
