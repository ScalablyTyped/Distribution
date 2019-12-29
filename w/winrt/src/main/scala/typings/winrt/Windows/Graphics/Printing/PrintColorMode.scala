package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintColorMode extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintColorMode")
@js.native
object PrintColorMode extends js.Object {
  @js.native
  sealed trait color extends PrintColorMode
  
  @js.native
  sealed trait default extends PrintColorMode
  
  @js.native
  sealed trait grayscale extends PrintColorMode
  
  @js.native
  sealed trait monochrome extends PrintColorMode
  
  @js.native
  sealed trait notAvailable extends PrintColorMode
  
  @js.native
  sealed trait printerCustom extends PrintColorMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintColorMode with Double] = js.native
  /* 3 */ @js.native
  object color extends TopLevel[color with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 4 */ @js.native
  object grayscale extends TopLevel[grayscale with Double]
  
  /* 5 */ @js.native
  object monochrome extends TopLevel[monochrome with Double]
  
  /* 1 */ @js.native
  object notAvailable extends TopLevel[notAvailable with Double]
  
  /* 2 */ @js.native
  object printerCustom extends TopLevel[printerCustom with Double]
  
}

