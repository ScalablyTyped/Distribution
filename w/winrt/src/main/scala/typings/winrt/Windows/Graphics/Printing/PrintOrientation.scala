package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOrientation extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintOrientation")
@js.native
object PrintOrientation extends js.Object {
  @js.native
  sealed trait default extends PrintOrientation
  
  @js.native
  sealed trait landscape extends PrintOrientation
  
  @js.native
  sealed trait landscapeFlipped extends PrintOrientation
  
  @js.native
  sealed trait notAvailable extends PrintOrientation
  
  @js.native
  sealed trait portrait extends PrintOrientation
  
  @js.native
  sealed trait portraitFlipped extends PrintOrientation
  
  @js.native
  sealed trait printerCustom extends PrintOrientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOrientation with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 5 */ @js.native
  object landscape extends TopLevel[landscape with Double]
  
  /* 6 */ @js.native
  object landscapeFlipped extends TopLevel[landscapeFlipped with Double]
  
  /* 1 */ @js.native
  object notAvailable extends TopLevel[notAvailable with Double]
  
  /* 3 */ @js.native
  object portrait extends TopLevel[portrait with Double]
  
  /* 4 */ @js.native
  object portraitFlipped extends TopLevel[portraitFlipped with Double]
  
  /* 2 */ @js.native
  object printerCustom extends TopLevel[printerCustom with Double]
  
}

