package typings.winrt.WindowsNs.GraphicsNs.PrintingNs

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
  
  /* 3 */ val color: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode.color with Double = js.native
  /* 0 */ val default: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode.default with Double = js.native
  /* 4 */ val grayscale: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode.grayscale with Double = js.native
  /* 5 */ val monochrome: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode.monochrome with Double = js.native
  /* 1 */ val notAvailable: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode.notAvailable with Double = js.native
  /* 2 */ val printerCustom: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode.printerCustom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintColorMode with Double] = js.native
}

