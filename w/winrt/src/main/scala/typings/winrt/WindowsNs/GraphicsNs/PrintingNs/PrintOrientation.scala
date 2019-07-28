package typings.winrt.WindowsNs.GraphicsNs.PrintingNs

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
  
  /* 0 */ val default: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation.default with Double = js.native
  /* 5 */ val landscape: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation.landscape with Double = js.native
  /* 6 */ val landscapeFlipped: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation.landscapeFlipped with Double = js.native
  /* 1 */ val notAvailable: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation.notAvailable with Double = js.native
  /* 3 */ val portrait: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation.portrait with Double = js.native
  /* 4 */ val portraitFlipped: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation.portraitFlipped with Double = js.native
  /* 2 */ val printerCustom: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation.printerCustom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOrientation with Double] = js.native
}

