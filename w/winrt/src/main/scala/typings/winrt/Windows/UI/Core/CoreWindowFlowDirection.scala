package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoreWindowFlowDirection extends js.Object
@JSGlobal("Windows.UI.Core.CoreWindowFlowDirection")
@js.native
object CoreWindowFlowDirection extends js.Object {
  
  @js.native
  sealed trait leftToRight extends CoreWindowFlowDirection
  
  @js.native
  sealed trait rightToLeft extends CoreWindowFlowDirection
}
