package typings.terminalDashKit

import typings.terminalDashKit.rectMod.AbsoluteOptions
import typings.terminalDashKit.rectMod.Region
import typings.terminalDashKit.rectMod.^
import typings.terminalDashKit.screenBufferMod.Attributes
import typings.terminalDashKit.screenBufferMod.Options
import typings.terminalDashKit.terminalMod.CreateOptions
import typings.terminalDashKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", JSImport.Namespace)
@js.native
object terminalDashKitMod extends js.Object {
  @js.native
  class Rect protected () extends ^ {
    def this(options: AbsoluteOptions) = this()
    def this(options: typings.terminalDashKit.rectMod.Rect) = this()
    def this(options: Region) = this()
    def this(options: typings.terminalDashKit.screenBufferMod.^) = this()
    def this(options: Terminal) = this()
    def this(options: typings.terminalDashKit.textBufferMod.^) = this()
    def this(xmin: Double, xmax: Double, ymin: Double, ymax: Double) = this()
  }
  
  @js.native
  class ScreenBuffer protected ()
    extends typings.terminalDashKit.screenBufferMod.^ {
    def this(options: Options) = this()
  }
  
  @js.native
  class ScreenBufferHD protected ()
    extends typings.terminalDashKit.screenBufferHDMod.^ {
    def this(options: Anon_Blending) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class TextBuffer protected ()
    extends typings.terminalDashKit.textBufferMod.^ {
    def this(options: typings.terminalDashKit.textBufferMod.Options) = this()
  }
  
  val realTerminal: Terminal = js.native
  val terminal: Terminal = js.native
  def autoComplete(array: js.Array[String], startString: String): String = js.native
  def autoComplete(array: js.Array[String], startString: String, returnAlternatives: Boolean): String = js.native
  def autoComplete(array: js.Array[String], startString: String, returnAlternatives: Boolean, prefix: String): String = js.native
  def autoComplete(
    array: js.Array[String],
    startString: String,
    returnAlternatives: Boolean,
    prefix: String,
    postfix: String
  ): String = js.native
  def createTerminal(): Terminal = js.native
  def createTerminal(createOptions: CreateOptions): Terminal = js.native
  def getDetectedTerminal(calback: js.Function2[/* error */ js.Any, /* term */ Terminal, Unit]): Unit = js.native
  def getParentTerminalInfo(
    callback: js.Function4[
      /* error */ js.Any, 
      /* codename */ js.UndefOr[String], 
      /* name */ js.UndefOr[String], 
      /* pid */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = js.native
  def stringWidth(str: String): Double = js.native
  def stripEscapeSequences(str: String): String = js.native
  def truncateString(str: String, maxWidth: Double): String = js.native
  /* static members */
  @js.native
  object Rect extends js.Object {
    def wrappingRect(params: Anon_DstRect): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ScreenBuffer extends js.Object {
    def attr2object(attrFlags: Double): Unit = js.native
    def create(options: Options): typings.terminalDashKit.screenBufferMod.ScreenBuffer = js.native
    def createFromString(options: Anon_AttrTransparencyChar, str: String): typings.terminalDashKit.screenBufferMod.ScreenBuffer = js.native
    def loadImage(
      url: String,
      calback: js.Function2[
          /* error */ js.UndefOr[js.Any], 
          /* image */ js.UndefOr[typings.terminalDashKit.screenBufferHDMod.^], 
          Unit
        ]
    ): Unit = js.native
    def loadImage(
      url: String,
      options: Anon_Shrink,
      calback: js.Function2[/* error */ js.Any, /* image */ typings.terminalDashKit.screenBufferHDMod.^, Unit]
    ): Unit = js.native
    def loadSync(filepath: String): typings.terminalDashKit.screenBufferMod.ScreenBuffer = js.native
    def object2attr(attrObject: Attributes): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ScreenBufferHD extends js.Object {
    def loadImage(
      url: String,
      calback: js.Function2[/* error */ js.UndefOr[js.Any], /* image */ js.UndefOr[this.type], Unit]
    ): Unit = js.native
    def loadImage(
      url: String,
      options: Anon_ShrinkAnonHeightWidth,
      callback: js.Function2[/* error */ js.Any, /* image */ this.type, Unit]
    ): Unit = js.native
  }
  
  @js.native
  object Terminal extends js.Object {
    @js.native
    class AutocompletionArray[T] ()
      extends typings.terminalDashKit.terminalMod.AutocompletionArray[T]
    
  }
  
}

