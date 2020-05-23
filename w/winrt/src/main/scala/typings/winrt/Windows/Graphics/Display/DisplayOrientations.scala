package typings.winrt.Windows.Graphics.Display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DisplayOrientations extends js.Object

@JSGlobal("Windows.Graphics.Display.DisplayOrientations")
@js.native
object DisplayOrientations extends js.Object {
  @js.native
  sealed trait landscape extends DisplayOrientations
  
  @js.native
  sealed trait landscapeFlipped extends DisplayOrientations
  
  @js.native
  sealed trait none extends DisplayOrientations
  
  @js.native
  sealed trait portrait extends DisplayOrientations
  
  @js.native
  sealed trait portraitFlipped extends DisplayOrientations
  
}

