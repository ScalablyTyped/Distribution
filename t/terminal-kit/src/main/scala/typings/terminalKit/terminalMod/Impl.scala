package typings.terminalKit.terminalMod

import typings.terminalKit.anon.Abort
import typings.terminalKit.anon.B
import typings.terminalKit.anon.BarStyle
import typings.terminalKit.anon.Continue
import typings.terminalKit.anon.Delay
import typings.terminalKit.anon.Mouse
import typings.terminalKit.anon.NoAlternate
import typings.terminalKit.anon.Promise
import typings.terminalKit.anon.PromisePromise
import typings.terminalKit.anon.`2`
import typings.terminalKit.anon.`3`
import typings.terminalKit.anon.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends StObject {
  
  def apply(): Terminal = js.native
  def apply(args: js.Any*): Terminal = js.native
  def apply(str: String): Terminal = js.native
  
  def alternateScreenBuffer(): Terminal = js.native
  def alternateScreenBuffer(args: js.Any*): Terminal = js.native
  def alternateScreenBuffer(str: String): Terminal = js.native
  @JSName("alternateScreenBuffer")
  var alternateScreenBuffer_Original: Terminal = js.native
  
  var app: String = js.native
  
  var appName: String = js.native
  
  def applicationKeypad(): Terminal = js.native
  def applicationKeypad(args: js.Any*): Terminal = js.native
  def applicationKeypad(str: String): Terminal = js.native
  @JSName("applicationKeypad")
  var applicationKeypad_Original: Terminal = js.native
  
  def asyncCleanup(): js.Promise[Unit] = js.native
  
  def backDelete(): Terminal = js.native
  def backDelete(args: js.Any*): Terminal = js.native
  def backDelete(str: String): Terminal = js.native
  @JSName("backDelete")
  var backDelete_Original: Terminal = js.native
  
  def backwardTab(n: Double): Terminal = js.native
  
  def bar(value: Double): Unit = js.native
  def bar(value: Double, options: BarStyle): Unit = js.native
  
  def bell(): Terminal = js.native
  def bell(args: js.Any*): Terminal = js.native
  def bell(str: String): Terminal = js.native
  @JSName("bell")
  var bell_Original: Terminal = js.native
  
  def bgBlack(): Terminal = js.native
  def bgBlack(args: js.Any*): Terminal = js.native
  def bgBlack(str: String): Terminal = js.native
  @JSName("bgBlack")
  var bgBlack_Original: CTerminal = js.native
  
  def bgBlue(): Terminal = js.native
  def bgBlue(args: js.Any*): Terminal = js.native
  def bgBlue(str: String): Terminal = js.native
  @JSName("bgBlue")
  var bgBlue_Original: CTerminal = js.native
  
  def bgBrightBlack(): Terminal = js.native
  def bgBrightBlack(args: js.Any*): Terminal = js.native
  def bgBrightBlack(str: String): Terminal = js.native
  @JSName("bgBrightBlack")
  var bgBrightBlack_Original: CTerminal = js.native
  
  def bgBrightBlue(): Terminal = js.native
  def bgBrightBlue(args: js.Any*): Terminal = js.native
  def bgBrightBlue(str: String): Terminal = js.native
  @JSName("bgBrightBlue")
  var bgBrightBlue_Original: CTerminal = js.native
  
  def bgBrightColor(color: String): Terminal = js.native
  def bgBrightColor(color: String, str: String): Terminal = js.native
  def bgBrightColor(color: Double): Terminal = js.native
  def bgBrightColor(color: Double, str: String): Terminal = js.native
  
  def bgBrightCyan(): Terminal = js.native
  def bgBrightCyan(args: js.Any*): Terminal = js.native
  def bgBrightCyan(str: String): Terminal = js.native
  @JSName("bgBrightCyan")
  var bgBrightCyan_Original: CTerminal = js.native
  
  def bgBrightGreen(): Terminal = js.native
  def bgBrightGreen(args: js.Any*): Terminal = js.native
  def bgBrightGreen(str: String): Terminal = js.native
  @JSName("bgBrightGreen")
  var bgBrightGreen_Original: CTerminal = js.native
  
  def bgBrightMagenta(): Terminal = js.native
  def bgBrightMagenta(args: js.Any*): Terminal = js.native
  def bgBrightMagenta(str: String): Terminal = js.native
  @JSName("bgBrightMagenta")
  var bgBrightMagenta_Original: CTerminal = js.native
  
  def bgBrightRed(): Terminal = js.native
  def bgBrightRed(args: js.Any*): Terminal = js.native
  def bgBrightRed(str: String): Terminal = js.native
  @JSName("bgBrightRed")
  var bgBrightRed_Original: CTerminal = js.native
  
  def bgBrightWhite(): Terminal = js.native
  def bgBrightWhite(args: js.Any*): Terminal = js.native
  def bgBrightWhite(str: String): Terminal = js.native
  @JSName("bgBrightWhite")
  var bgBrightWhite_Original: CTerminal = js.native
  
  def bgBrightYellow(): Terminal = js.native
  def bgBrightYellow(args: js.Any*): Terminal = js.native
  def bgBrightYellow(str: String): Terminal = js.native
  @JSName("bgBrightYellow")
  var bgBrightYellow_Original: CTerminal = js.native
  
  def bgColor(color: String): Terminal = js.native
  def bgColor(color: String, str: String): Terminal = js.native
  def bgColor(color: Double): Terminal = js.native
  def bgColor(color: Double, str: String): Terminal = js.native
  
  def bgColor256(color: String): Terminal = js.native
  def bgColor256(color: String, str: String): Terminal = js.native
  def bgColor256(color: Double): Terminal = js.native
  def bgColor256(color: Double, str: String): Terminal = js.native
  
  def bgColorGrayscale(I: Double): Terminal = js.native
  def bgColorGrayscale(I: Double, str: String): Terminal = js.native
  
  def bgColorRgb(r: Double, g: Double, b: Double): Terminal = js.native
  def bgColorRgb(r: Double, g: Double, b: Double, str: String): Terminal = js.native
  
  def bgColorRgbHex(rgb: String): Terminal = js.native
  def bgColorRgbHex(rgb: String, str: String): Terminal = js.native
  
  def bgCyan(): Terminal = js.native
  def bgCyan(args: js.Any*): Terminal = js.native
  def bgCyan(str: String): Terminal = js.native
  @JSName("bgCyan")
  var bgCyan_Original: CTerminal = js.native
  
  def bgDarkColor(color: String): Terminal = js.native
  def bgDarkColor(color: String, str: String): Terminal = js.native
  def bgDarkColor(color: Double): Terminal = js.native
  def bgDarkColor(color: Double, str: String): Terminal = js.native
  
  def bgDefaultColor(): Terminal = js.native
  def bgDefaultColor(args: js.Any*): Terminal = js.native
  def bgDefaultColor(str: String): Terminal = js.native
  @JSName("bgDefaultColor")
  var bgDefaultColor_Original: CTerminal = js.native
  
  def bgGray(): Terminal = js.native
  def bgGray(args: js.Any*): Terminal = js.native
  def bgGray(str: String): Terminal = js.native
  @JSName("bgGray")
  var bgGray_Original: CTerminal = js.native
  
  def bgGreen(): Terminal = js.native
  def bgGreen(args: js.Any*): Terminal = js.native
  def bgGreen(str: String): Terminal = js.native
  @JSName("bgGreen")
  var bgGreen_Original: CTerminal = js.native
  
  def bgGrey(): Terminal = js.native
  def bgGrey(args: js.Any*): Terminal = js.native
  def bgGrey(str: String): Terminal = js.native
  @JSName("bgGrey")
  var bgGrey_Original: CTerminal = js.native
  
  def bgMagenta(): Terminal = js.native
  def bgMagenta(args: js.Any*): Terminal = js.native
  def bgMagenta(str: String): Terminal = js.native
  @JSName("bgMagenta")
  var bgMagenta_Original: CTerminal = js.native
  
  def bgRed(): Terminal = js.native
  def bgRed(args: js.Any*): Terminal = js.native
  def bgRed(str: String): Terminal = js.native
  @JSName("bgRed")
  var bgRed_Original: CTerminal = js.native
  
  def bgWhite(): Terminal = js.native
  def bgWhite(args: js.Any*): Terminal = js.native
  def bgWhite(str: String): Terminal = js.native
  @JSName("bgWhite")
  var bgWhite_Original: CTerminal = js.native
  
  def bgYellow(): Terminal = js.native
  def bgYellow(args: js.Any*): Terminal = js.native
  def bgYellow(str: String): Terminal = js.native
  @JSName("bgYellow")
  var bgYellow_Original: CTerminal = js.native
  
  def bindArgs(args: js.Any*): Terminal = js.native
  
  def black(): Terminal = js.native
  def black(args: js.Any*): Terminal = js.native
  def black(str: String): Terminal = js.native
  @JSName("black")
  var black_Original: CTerminal = js.native
  
  def blink(): Terminal = js.native
  def blink(args: js.Any*): Terminal = js.native
  def blink(str: String): Terminal = js.native
  @JSName("blink")
  var blink_Original: CTerminal = js.native
  
  def blue(): Terminal = js.native
  def blue(args: js.Any*): Terminal = js.native
  def blue(str: String): Terminal = js.native
  @JSName("blue")
  var blue_Original: CTerminal = js.native
  
  def bold(): Terminal = js.native
  def bold(args: js.Any*): Terminal = js.native
  def bold(str: String): Terminal = js.native
  @JSName("bold")
  var bold_Original: CTerminal = js.native
  
  def brightBlack(): Terminal = js.native
  def brightBlack(args: js.Any*): Terminal = js.native
  def brightBlack(str: String): Terminal = js.native
  @JSName("brightBlack")
  var brightBlack_Original: CTerminal = js.native
  
  def brightBlue(): Terminal = js.native
  def brightBlue(args: js.Any*): Terminal = js.native
  def brightBlue(str: String): Terminal = js.native
  @JSName("brightBlue")
  var brightBlue_Original: CTerminal = js.native
  
  def brightColor(color: String): Terminal = js.native
  def brightColor(color: String, str: String): Terminal = js.native
  def brightColor(color: Double): Terminal = js.native
  def brightColor(color: Double, str: String): Terminal = js.native
  
  def brightCyan(): Terminal = js.native
  def brightCyan(args: js.Any*): Terminal = js.native
  def brightCyan(str: String): Terminal = js.native
  @JSName("brightCyan")
  var brightCyan_Original: CTerminal = js.native
  
  def brightGreen(): Terminal = js.native
  def brightGreen(args: js.Any*): Terminal = js.native
  def brightGreen(str: String): Terminal = js.native
  @JSName("brightGreen")
  var brightGreen_Original: CTerminal = js.native
  
  def brightMagenta(): Terminal = js.native
  def brightMagenta(args: js.Any*): Terminal = js.native
  def brightMagenta(str: String): Terminal = js.native
  @JSName("brightMagenta")
  var brightMagenta_Original: CTerminal = js.native
  
  def brightRed(): Terminal = js.native
  def brightRed(args: js.Any*): Terminal = js.native
  def brightRed(str: String): Terminal = js.native
  @JSName("brightRed")
  var brightRed_Original: CTerminal = js.native
  
  def brightWhite(): Terminal = js.native
  def brightWhite(args: js.Any*): Terminal = js.native
  def brightWhite(str: String): Terminal = js.native
  @JSName("brightWhite")
  var brightWhite_Original: CTerminal = js.native
  
  def brightYellow(): Terminal = js.native
  def brightYellow(args: js.Any*): Terminal = js.native
  def brightYellow(str: String): Terminal = js.native
  @JSName("brightYellow")
  var brightYellow_Original: CTerminal = js.native
  
  def clear(): Terminal = js.native
  def clear(args: js.Any*): Terminal = js.native
  def clear(str: String): Terminal = js.native
  @JSName("clear")
  var clear_Original: Terminal = js.native
  
  def color(color: String): Terminal = js.native
  def color(color: String, str: String): Terminal = js.native
  def color(color: Double): Terminal = js.native
  def color(color: Double, str: String): Terminal = js.native
  
  def color256(color: String): Terminal = js.native
  def color256(color: String, str: String): Terminal = js.native
  def color256(color: Double): Terminal = js.native
  def color256(color: Double, str: String): Terminal = js.native
  
  def colorGrayscale(I: Double): Terminal = js.native
  def colorGrayscale(I: Double, str: String): Terminal = js.native
  
  def colorRgb(r: Double, g: Double, b: Double): Terminal = js.native
  def colorRgb(r: Double, g: Double, b: Double, str: String): Terminal = js.native
  
  def colorRgbHex(rgb: String): Terminal = js.native
  def colorRgbHex(rgb: String, str: String): Terminal = js.native
  
  def column(x: Double): Terminal = js.native
  
  def cwd(uri: String): Terminal = js.native
  
  def cyan(): Terminal = js.native
  def cyan(args: js.Any*): Terminal = js.native
  def cyan(str: String): Terminal = js.native
  @JSName("cyan")
  var cyan_Original: CTerminal = js.native
  
  def darkColor(color: String): Terminal = js.native
  def darkColor(color: String, str: String): Terminal = js.native
  def darkColor(color: Double): Terminal = js.native
  def darkColor(color: Double, str: String): Terminal = js.native
  
  def defaultColor(): Terminal = js.native
  def defaultColor(args: js.Any*): Terminal = js.native
  def defaultColor(str: String): Terminal = js.native
  @JSName("defaultColor")
  var defaultColor_Original: CTerminal = js.native
  
  def delete(n: Double): Terminal = js.native
  
  def deleteLine(n: Double): Terminal = js.native
  
  def dim(): Terminal = js.native
  def dim(args: js.Any*): Terminal = js.native
  def dim(str: String): Terminal = js.native
  @JSName("dim")
  var dim_Original: CTerminal = js.native
  
  def down(n: Double): Terminal = js.native
  
  def drawImage(url: String): js.Promise[Unit] = js.native
  def drawImage(url: String, callback: Callback[Unit]): Unit = js.native
  def drawImage(url: String, options: `4`): js.Promise[Unit] = js.native
  def drawImage(url: String, options: `4`, callback: Callback[Unit]): Unit = js.native
  
  def eraseArea(x: Double, y: Double): Terminal = js.native
  def eraseArea(x: Double, y: Double, width: Double): Terminal = js.native
  def eraseArea(x: Double, y: Double, width: Double, height: Double): Terminal = js.native
  def eraseArea(x: Double, y: Double, width: Unit, height: Double): Terminal = js.native
  
  def eraseDisplay(): Terminal = js.native
  def eraseDisplay(args: js.Any*): Terminal = js.native
  def eraseDisplay(str: String): Terminal = js.native
  
  def eraseDisplayAbove(): Terminal = js.native
  def eraseDisplayAbove(args: js.Any*): Terminal = js.native
  def eraseDisplayAbove(str: String): Terminal = js.native
  @JSName("eraseDisplayAbove")
  var eraseDisplayAbove_Original: Terminal = js.native
  
  def eraseDisplayBelow(): Terminal = js.native
  def eraseDisplayBelow(args: js.Any*): Terminal = js.native
  def eraseDisplayBelow(str: String): Terminal = js.native
  @JSName("eraseDisplayBelow")
  var eraseDisplayBelow_Original: Terminal = js.native
  
  @JSName("eraseDisplay")
  var eraseDisplay_Original: Terminal = js.native
  
  def eraseLine(): Terminal = js.native
  def eraseLine(args: js.Any*): Terminal = js.native
  def eraseLine(str: String): Terminal = js.native
  
  def eraseLineAfter(): Terminal = js.native
  def eraseLineAfter(args: js.Any*): Terminal = js.native
  def eraseLineAfter(str: String): Terminal = js.native
  @JSName("eraseLineAfter")
  var eraseLineAfter_Original: Terminal = js.native
  
  def eraseLineBefore(): Terminal = js.native
  def eraseLineBefore(args: js.Any*): Terminal = js.native
  def eraseLineBefore(str: String): Terminal = js.native
  @JSName("eraseLineBefore")
  var eraseLineBefore_Original: Terminal = js.native
  
  @JSName("eraseLine")
  var eraseLine_Original: Terminal = js.native
  
  def eraseScrollback(): Terminal = js.native
  def eraseScrollback(args: js.Any*): Terminal = js.native
  def eraseScrollback(str: String): Terminal = js.native
  @JSName("eraseScrollback")
  var eraseScrollback_Original: Terminal = js.native
  
  def error(): Terminal = js.native
  def error(args: js.Any*): Terminal = js.native
  def error(str: String): Terminal = js.native
  @JSName("error")
  var error_Original: Terminal = js.native
  
  def fileInput(): js.Promise[String] = js.native
  def fileInput(options: IFileInputOptions): js.Promise[String] = js.native
  def fileInput(options: IFileInputOptions, callback: Callback[String]): Unit = js.native
  
  def focusEvent(): Terminal = js.native
  def focusEvent(args: js.Any*): Terminal = js.native
  def focusEvent(str: String): Terminal = js.native
  @JSName("focusEvent")
  var focusEvent_Original: Terminal = js.native
  
  def forwardTab(n: Double): Terminal = js.native
  
  def fullscreen(options: Boolean): Unit = js.native
  def fullscreen(options: NoAlternate): Unit = js.native
  
  var generic: String = js.native
  
  def getColor(register: Double): Unit = js.native
  def getColor(register: Double, callback: Callback[B]): Unit = js.native
  
  def getCursorLocation(
    callback: js.Function3[/* error */ js.Any, /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]
  ): Unit = js.native
  
  def getPalette(register: Double): Unit = js.native
  def getPalette(register: Double, callback: Callback[Palette]): Unit = js.native
  
  def grabInput(options: Boolean): Unit = js.native
  def grabInput(options: Boolean, safeCallback: Boolean): Unit = js.native
  def grabInput(options: Mouse): Unit = js.native
  def grabInput(options: Mouse, safeCallback: Boolean): Unit = js.native
  
  def gray(): Terminal = js.native
  def gray(args: js.Any*): Terminal = js.native
  def gray(str: String): Terminal = js.native
  @JSName("gray")
  var gray_Original: CTerminal = js.native
  
  def green(): Terminal = js.native
  def green(args: js.Any*): Terminal = js.native
  def green(str: String): Terminal = js.native
  @JSName("green")
  var green_Original: CTerminal = js.native
  
  def grey(): Terminal = js.native
  def grey(args: js.Any*): Terminal = js.native
  def grey(str: String): Terminal = js.native
  @JSName("grey")
  var grey_Original: CTerminal = js.native
  
  def gridMenu(menuItems: js.Array[String]): `3` = js.native
  def gridMenu(menuItems: js.Array[String], callback: Callback[GridMenuResponse]): Unit = js.native
  def gridMenu(menuItems: js.Array[String], options: GridMenuOptions): `3` = js.native
  def gridMenu(menuItems: js.Array[String], options: GridMenuOptions, callback: Callback[GridMenuResponse]): Unit = js.native
  
  var height: Double = js.native
  
  def hidden(): Terminal = js.native
  def hidden(args: js.Any*): Terminal = js.native
  def hidden(str: String): Terminal = js.native
  @JSName("hidden")
  var hidden_Original: CTerminal = js.native
  
  def hideCursor(): Terminal = js.native
  def hideCursor(args: js.Any*): Terminal = js.native
  def hideCursor(str: String): Terminal = js.native
  @JSName("hideCursor")
  var hideCursor_Original: Terminal = js.native
  
  def iconName(str: String): Terminal = js.native
  
  def inputField(callback: Callback[js.UndefOr[String]]): Promise = js.native
  def inputField(options: InputFieldOptions): Promise = js.native
  def inputField(options: InputFieldOptions, callback: Callback[js.UndefOr[String]]): Promise = js.native
  
  def insert(n: Double): Terminal = js.native
  
  def insertLine(n: Double): Terminal = js.native
  
  def inverse(): Terminal = js.native
  def inverse(args: js.Any*): Terminal = js.native
  def inverse(str: String): Terminal = js.native
  @JSName("inverse")
  var inverse_Original: CTerminal = js.native
  
  def italic(): Terminal = js.native
  def italic(args: js.Any*): Terminal = js.native
  def italic(str: String): Terminal = js.native
  @JSName("italic")
  var italic_Original: CTerminal = js.native
  
  def left(n: Double): Terminal = js.native
  
  def magenta(): Terminal = js.native
  def magenta(args: js.Any*): Terminal = js.native
  def magenta(str: String): Terminal = js.native
  @JSName("magenta")
  var magenta_Original: CTerminal = js.native
  
  def markupOnly(): Terminal = js.native
  def markupOnly(args: js.Any*): Terminal = js.native
  def markupOnly(str: String): Terminal = js.native
  @JSName("markupOnly")
  var markupOnly_Original: CTerminal = js.native
  
  def mouseButton(): Terminal = js.native
  def mouseButton(args: js.Any*): Terminal = js.native
  def mouseButton(str: String): Terminal = js.native
  @JSName("mouseButton")
  var mouseButton_Original: Terminal = js.native
  
  def mouseDrag(): Terminal = js.native
  def mouseDrag(args: js.Any*): Terminal = js.native
  def mouseDrag(str: String): Terminal = js.native
  @JSName("mouseDrag")
  var mouseDrag_Original: Terminal = js.native
  
  def mouseMotion(): Terminal = js.native
  def mouseMotion(args: js.Any*): Terminal = js.native
  def mouseMotion(str: String): Terminal = js.native
  @JSName("mouseMotion")
  var mouseMotion_Original: Terminal = js.native
  
  def mouseSGR(): Terminal = js.native
  def mouseSGR(args: js.Any*): Terminal = js.native
  def mouseSGR(str: String): Terminal = js.native
  @JSName("mouseSGR")
  var mouseSGR_Original: Terminal = js.native
  
  def move(x: Double, y: Double): Terminal = js.native
  
  def moveTo(): Terminal = js.native
  def moveTo(args: js.Any*): Terminal = js.native
  def moveTo(str: String): Terminal = js.native
  @JSName("moveTo")
  var moveTo_Original: CTerminal = js.native
  
  def nextLine(n: Double): Terminal = js.native
  
  def noFormat(): Terminal = js.native
  def noFormat(args: js.Any*): Terminal = js.native
  def noFormat(str: String): Terminal = js.native
  @JSName("noFormat")
  var noFormat_Original: CTerminal = js.native
  
  def notify(title: String, text: String): Terminal = js.native
  
  def previousLine(n: Double): Terminal = js.native
  
  def processExit(code: Double): Unit = js.native
  
  def progressBar(): ProgressBarController = js.native
  def progressBar(options: ProgressBarOptions): ProgressBarController = js.native
  
  def red(): Terminal = js.native
  def red(args: js.Any*): Terminal = js.native
  def red(str: String): Terminal = js.native
  @JSName("red")
  var red_Original: CTerminal = js.native
  
  def requestColor(n: Double): Terminal = js.native
  
  def requestCursorLocation(): Terminal = js.native
  def requestCursorLocation(args: js.Any*): Terminal = js.native
  def requestCursorLocation(str: String): Terminal = js.native
  @JSName("requestCursorLocation")
  var requestCursorLocation_Original: Terminal = js.native
  
  def requestScreenSize(): Terminal = js.native
  def requestScreenSize(args: js.Any*): Terminal = js.native
  def requestScreenSize(str: String): Terminal = js.native
  @JSName("requestScreenSize")
  var requestScreenSize_Original: Terminal = js.native
  
  def reset(): Terminal = js.native
  def reset(args: js.Any*): Terminal = js.native
  def reset(str: String): Terminal = js.native
  
  def resetCursorColorRgb(): Terminal = js.native
  def resetCursorColorRgb(args: js.Any*): Terminal = js.native
  def resetCursorColorRgb(str: String): Terminal = js.native
  @JSName("resetCursorColorRgb")
  var resetCursorColorRgb_Original: Terminal = js.native
  
  def resetDefaultBgColorRgb(): Terminal = js.native
  def resetDefaultBgColorRgb(args: js.Any*): Terminal = js.native
  def resetDefaultBgColorRgb(str: String): Terminal = js.native
  @JSName("resetDefaultBgColorRgb")
  var resetDefaultBgColorRgb_Original: Terminal = js.native
  
  def resetDefaultColorRgb(): Terminal = js.native
  def resetDefaultColorRgb(args: js.Any*): Terminal = js.native
  def resetDefaultColorRgb(str: String): Terminal = js.native
  @JSName("resetDefaultColorRgb")
  var resetDefaultColorRgb_Original: Terminal = js.native
  
  def resetHighlightBgColorRgb(): Terminal = js.native
  def resetHighlightBgColorRgb(args: js.Any*): Terminal = js.native
  def resetHighlightBgColorRgb(str: String): Terminal = js.native
  @JSName("resetHighlightBgColorRgb")
  var resetHighlightBgColorRgb_Original: Terminal = js.native
  
  def resetScrollingRegion(): Terminal = js.native
  def resetScrollingRegion(args: js.Any*): Terminal = js.native
  def resetScrollingRegion(str: String): Terminal = js.native
  @JSName("resetScrollingRegion")
  var resetScrollingRegion_Original: Terminal = js.native
  
  @JSName("reset")
  var reset_Original: Terminal = js.native
  
  def restoreCursor(): Terminal = js.native
  def restoreCursor(args: js.Any*): Terminal = js.native
  def restoreCursor(str: String): Terminal = js.native
  @JSName("restoreCursor")
  var restoreCursor_Original: Terminal = js.native
  
  def right(n: Double): Terminal = js.native
  
  def saveCursor(): Terminal = js.native
  def saveCursor(args: js.Any*): Terminal = js.native
  def saveCursor(str: String): Terminal = js.native
  @JSName("saveCursor")
  var saveCursor_Original: Terminal = js.native
  
  def scrollDown(n: Double): Terminal = js.native
  
  def scrollUp(n: Double): Terminal = js.native
  
  def scrollingRegion(top: Double, bottom: Double): Terminal = js.native
  
  def setColor(register: Double, rgb: B): Unit = js.native
  def setColor(register: Double, rgb: B, names: js.Array[String]): Unit = js.native
  def setColor(register: Double, r: Double, g: Double, b: Double): Unit = js.native
  def setColor(register: Double, r: Double, g: Double, b: Double, names: js.Array[String]): Unit = js.native
  
  def setCursorColor(register: Double): Terminal = js.native
  
  def setCursorColorRgb(r: Double, g: Double, b: Double): Terminal = js.native
  
  def setDefaultBgColorRgb(r: Double, g: Double, b: Double): Terminal = js.native
  
  def setDefaultColorRgb(r: Double, g: Double, b: Double): Terminal = js.native
  
  def setHighlightBgColorRgb(r: Double, g: Double, b: Double): Terminal = js.native
  
  def setPalette(palette: String): Unit = js.native
  def setPalette(palette: Palette): Unit = js.native
  
  def singleColumnMenu(menuItems: js.Array[String]): `2` = js.native
  def singleColumnMenu(menuItems: js.Array[String], callback: Callback[SingleColumnMenuResponse]): Unit = js.native
  def singleColumnMenu(menuItems: js.Array[String], options: SingleColumnMenuOptions): `2` = js.native
  def singleColumnMenu(
    menuItems: js.Array[String],
    options: SingleColumnMenuOptions,
    callback: Callback[SingleColumnMenuResponse]
  ): Unit = js.native
  
  def singleLineMenu(menuItems: js.Array[String]): PromisePromise = js.native
  def singleLineMenu(menuItems: js.Array[String], callback: Callback[SingleLineMenuResponse]): Unit = js.native
  def singleLineMenu(menuItems: js.Array[String], options: SingleLineMenuOptions): PromisePromise = js.native
  def singleLineMenu(
    menuItems: js.Array[String],
    options: SingleLineMenuOptions,
    callback: Callback[SingleLineMenuResponse]
  ): Unit = js.native
  
  def singleRowMenu(menuItems: js.Array[String]): PromisePromise = js.native
  def singleRowMenu(menuItems: js.Array[String], callback: Callback[SingleLineMenuResponse]): Unit = js.native
  def singleRowMenu(menuItems: js.Array[String], options: SingleLineMenuOptions): PromisePromise = js.native
  def singleRowMenu(
    menuItems: js.Array[String],
    options: SingleLineMenuOptions,
    callback: Callback[SingleLineMenuResponse]
  ): Unit = js.native
  
  def slowTyping(str: String): js.Promise[Unit] = js.native
  def slowTyping(str: String, callback: Callback[Unit]): Unit = js.native
  def slowTyping(str: String, options: Delay): js.Promise[Unit] = js.native
  def slowTyping(str: String, options: Delay, callback: Callback[Unit]): Unit = js.native
  
  def str(): Terminal = js.native
  def str(args: js.Any*): Terminal = js.native
  def str(str: String): Terminal = js.native
  @JSName("str")
  var str_Original: Terminal = js.native
  
  def strike(): Terminal = js.native
  def strike(args: js.Any*): Terminal = js.native
  def strike(str: String): Terminal = js.native
  @JSName("strike")
  var strike_Original: CTerminal = js.native
  
  def styleReset(): Terminal = js.native
  def styleReset(args: js.Any*): Terminal = js.native
  def styleReset(str: String): Terminal = js.native
  @JSName("styleReset")
  var styleReset_Original: CTerminal = js.native
  
  def tabClear(): Terminal = js.native
  def tabClear(args: js.Any*): Terminal = js.native
  def tabClear(str: String): Terminal = js.native
  
  def tabClearAll(): Terminal = js.native
  def tabClearAll(args: js.Any*): Terminal = js.native
  def tabClearAll(str: String): Terminal = js.native
  @JSName("tabClearAll")
  var tabClearAll_Original: Terminal = js.native
  
  @JSName("tabClear")
  var tabClear_Original: Terminal = js.native
  
  def tabSet(): Terminal = js.native
  def tabSet(args: js.Any*): Terminal = js.native
  def tabSet(str: String): Terminal = js.native
  @JSName("tabSet")
  var tabSet_Original: Terminal = js.native
  
  var termconfigFile: String = js.native
  
  def underline(): Terminal = js.native
  def underline(args: js.Any*): Terminal = js.native
  def underline(str: String): Terminal = js.native
  @JSName("underline")
  var underline_Original: CTerminal = js.native
  
  var up: (js.Function1[/* n */ Double, Terminal]) | (js.Function2[/* n */ Double, /* repeated */ js.Any, Terminal]) = js.native
  
  def white(): Terminal = js.native
  def white(args: js.Any*): Terminal = js.native
  def white(str: String): Terminal = js.native
  @JSName("white")
  var white_Original: CTerminal = js.native
  
  var width: Double = js.native
  
  def windowTitle(str: String): Terminal = js.native
  
  def wrap(): Terminal = js.native
  def wrap(args: js.Any*): Terminal = js.native
  def wrap(str: String): Terminal = js.native
  
  def wrapColumn(): Unit = js.native
  def wrapColumn(options: Continue): Unit = js.native
  def wrapColumn(x: Double, width: Double): Unit = js.native
  def wrapColumn(x: Unit, width: Double): Unit = js.native
  
  @JSName("wrap")
  var wrap_Original: CTerminal = js.native
  
  def yellow(): Terminal = js.native
  def yellow(args: js.Any*): Terminal = js.native
  def yellow(str: String): Terminal = js.native
  @JSName("yellow")
  var yellow_Original: CTerminal = js.native
  
  def yesOrNo(): Abort = js.native
  def yesOrNo(options: YesOrNoOptions): Abort = js.native
  def yesOrNo(options: YesOrNoOptions, callback: Callback[Boolean]): Unit = js.native
}
