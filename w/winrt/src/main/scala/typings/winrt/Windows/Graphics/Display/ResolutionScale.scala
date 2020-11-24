package typings.winrt.Windows.Graphics.Display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResolutionScale extends js.Object
@JSGlobal("Windows.Graphics.Display.ResolutionScale")
@js.native
object ResolutionScale extends js.Object {
  
  @js.native
  sealed trait invalid extends ResolutionScale
  
  @js.native
  sealed trait scale100Percent extends ResolutionScale
  
  @js.native
  sealed trait scale140Percent extends ResolutionScale
  
  @js.native
  sealed trait scale180Percent extends ResolutionScale
}
