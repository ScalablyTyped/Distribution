package typings.winrt.Windows.Graphics.Display

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DisplayOrientations with Double] = js.native
  /* 1 */ @js.native
  object landscape extends TopLevel[landscape with Double]
  
  /* 3 */ @js.native
  object landscapeFlipped extends TopLevel[landscapeFlipped with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object portrait extends TopLevel[portrait with Double]
  
  /* 4 */ @js.native
  object portraitFlipped extends TopLevel[portraitFlipped with Double]
  
}

