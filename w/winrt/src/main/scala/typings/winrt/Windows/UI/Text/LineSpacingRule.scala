package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineSpacingRule extends js.Object
@JSGlobal("Windows.UI.Text.LineSpacingRule")
@js.native
object LineSpacingRule extends js.Object {
  
  @js.native
  sealed trait atLeast extends LineSpacingRule
  
  @js.native
  sealed trait double extends LineSpacingRule
  
  @js.native
  sealed trait exactly extends LineSpacingRule
  
  @js.native
  sealed trait multiple extends LineSpacingRule
  
  @js.native
  sealed trait oneAndHalf extends LineSpacingRule
  
  @js.native
  sealed trait percent extends LineSpacingRule
  
  @js.native
  sealed trait single extends LineSpacingRule
  
  @js.native
  sealed trait undefined extends LineSpacingRule
}
