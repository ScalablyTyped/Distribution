package typings.terminalKit

import typings.terminalKit.anon.Attr
import typings.terminalKit.anon.Blending
import typings.terminalKit.anon.DstRect
import typings.terminalKit.anon.Shrink
import typings.terminalKit.anon.`0`
import typings.terminalKit.rectMod.AbsoluteOptions
import typings.terminalKit.rectMod.Region
import typings.terminalKit.rectMod.^
import typings.terminalKit.screenBufferMod.Attributes
import typings.terminalKit.screenBufferMod.Options
import typings.terminalKit.terminalMod.CreateOptions
import typings.terminalKit.terminalMod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("terminal-kit", "Rect")
  @js.native
  class Rect protected () extends ^ {
    def this(options: AbsoluteOptions) = this()
    def this(options: typings.terminalKit.rectMod.Rect) = this()
    def this(options: Region) = this()
    def this(options: typings.terminalKit.screenBufferMod.^) = this()
    def this(options: Terminal) = this()
    def this(options: typings.terminalKit.textBufferMod.^) = this()
    def this(xmin: Double, xmax: Double, ymin: Double, ymax: Double) = this()
  }
  object Rect {
    
    /* static member */
    @JSImport("terminal-kit", "Rect.wrappingRect")
    @js.native
    def wrappingRect(params: DstRect): Unit = js.native
  }
  
  @JSImport("terminal-kit", "ScreenBuffer")
  @js.native
  class ScreenBuffer protected ()
    extends typings.terminalKit.screenBufferMod.^ {
    def this(options: Options) = this()
  }
  object ScreenBuffer {
    
    /* static member */
    @JSImport("terminal-kit", "ScreenBuffer.attr2object")
    @js.native
    def attr2object(attrFlags: Double): Unit = js.native
    
    /* static member */
    @JSImport("terminal-kit", "ScreenBuffer.create")
    @js.native
    def create(options: Options): typings.terminalKit.screenBufferMod.ScreenBuffer = js.native
    
    /* static member */
    @JSImport("terminal-kit", "ScreenBuffer.createFromString")
    @js.native
    def createFromString(options: Attr, str: String): typings.terminalKit.screenBufferMod.ScreenBuffer = js.native
    
    /* static member */
    @JSImport("terminal-kit", "ScreenBuffer.loadImage")
    @js.native
    def loadImage(
      url: String,
      calback: js.Function2[
          /* error */ js.UndefOr[js.Any], 
          /* image */ js.UndefOr[typings.terminalKit.screenBufferHDMod.^], 
          Unit
        ]
    ): Unit = js.native
    /* static member */
    @JSImport("terminal-kit", "ScreenBuffer.loadImage")
    @js.native
    def loadImage(
      url: String,
      options: Shrink,
      calback: js.Function2[/* error */ js.Any, /* image */ typings.terminalKit.screenBufferHDMod.^, Unit]
    ): Unit = js.native
    
    /* static member */
    @JSImport("terminal-kit", "ScreenBuffer.loadSync")
    @js.native
    def loadSync(filepath: String): typings.terminalKit.screenBufferMod.ScreenBuffer = js.native
    
    /* static member */
    @JSImport("terminal-kit", "ScreenBuffer.object2attr")
    @js.native
    def object2attr(attrObject: Attributes): Unit = js.native
  }
  
  @JSImport("terminal-kit", "ScreenBufferHD")
  @js.native
  class ScreenBufferHD protected ()
    extends typings.terminalKit.screenBufferHDMod.^ {
    def this(options: Blending) = this()
    def this(options: Options) = this()
  }
  object ScreenBufferHD {
    
    /* static member */
    @JSImport("terminal-kit", "ScreenBufferHD.loadImage")
    @js.native
    def loadImage(
      url: String,
      calback: js.Function2[
          /* error */ js.UndefOr[js.Any], 
          /* image */ js.UndefOr[typings.terminalKit.screenBufferHDMod.ScreenBufferHD], 
          Unit
        ]
    ): Unit = js.native
    /* static member */
    @JSImport("terminal-kit", "ScreenBufferHD.loadImage")
    @js.native
    def loadImage(
      url: String,
      options: `0`,
      callback: js.Function2[
          /* error */ js.Any, 
          /* image */ typings.terminalKit.screenBufferHDMod.ScreenBufferHD, 
          Unit
        ]
    ): Unit = js.native
  }
  
  object Terminal_ {
    
    @JSImport("terminal-kit", "Terminal.AutocompletionArray")
    @js.native
    class AutocompletionArray[T] ()
      extends typings.terminalKit.terminalMod.AutocompletionArray[T]
  }
  
  @JSImport("terminal-kit", "TextBuffer")
  @js.native
  class TextBuffer protected ()
    extends typings.terminalKit.textBufferMod.^ {
    def this(options: typings.terminalKit.textBufferMod.Options) = this()
  }
  
  @JSImport("terminal-kit", "autoComplete")
  @js.native
  def autoComplete(array: js.Array[String], startString: String): String = js.native
  @JSImport("terminal-kit", "autoComplete")
  @js.native
  def autoComplete(
    array: js.Array[String],
    startString: String,
    returnAlternatives: js.UndefOr[scala.Nothing],
    prefix: js.UndefOr[scala.Nothing],
    postfix: String
  ): String = js.native
  @JSImport("terminal-kit", "autoComplete")
  @js.native
  def autoComplete(
    array: js.Array[String],
    startString: String,
    returnAlternatives: js.UndefOr[scala.Nothing],
    prefix: String
  ): String = js.native
  @JSImport("terminal-kit", "autoComplete")
  @js.native
  def autoComplete(
    array: js.Array[String],
    startString: String,
    returnAlternatives: js.UndefOr[scala.Nothing],
    prefix: String,
    postfix: String
  ): String = js.native
  @JSImport("terminal-kit", "autoComplete")
  @js.native
  def autoComplete(array: js.Array[String], startString: String, returnAlternatives: Boolean): String = js.native
  @JSImport("terminal-kit", "autoComplete")
  @js.native
  def autoComplete(
    array: js.Array[String],
    startString: String,
    returnAlternatives: Boolean,
    prefix: js.UndefOr[scala.Nothing],
    postfix: String
  ): String = js.native
  @JSImport("terminal-kit", "autoComplete")
  @js.native
  def autoComplete(array: js.Array[String], startString: String, returnAlternatives: Boolean, prefix: String): String = js.native
  @JSImport("terminal-kit", "autoComplete")
  @js.native
  def autoComplete(
    array: js.Array[String],
    startString: String,
    returnAlternatives: Boolean,
    prefix: String,
    postfix: String
  ): String = js.native
  
  @JSImport("terminal-kit", "createTerminal")
  @js.native
  def createTerminal(): Terminal = js.native
  @JSImport("terminal-kit", "createTerminal")
  @js.native
  def createTerminal(createOptions: CreateOptions): Terminal = js.native
  
  @JSImport("terminal-kit", "getDetectedTerminal")
  @js.native
  def getDetectedTerminal(calback: js.Function2[/* error */ js.Any, /* term */ Terminal, Unit]): Unit = js.native
  
  @JSImport("terminal-kit", "getParentTerminalInfo")
  @js.native
  def getParentTerminalInfo(
    callback: js.Function4[
      /* error */ js.Any, 
      /* codename */ js.UndefOr[String], 
      /* name */ js.UndefOr[String], 
      /* pid */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("terminal-kit", "realTerminal")
  @js.native
  val realTerminal: Terminal = js.native
  
  @JSImport("terminal-kit", "stringWidth")
  @js.native
  def stringWidth(str: String): Double = js.native
  
  @JSImport("terminal-kit", "stripEscapeSequences")
  @js.native
  def stripEscapeSequences(str: String): String = js.native
  
  @JSImport("terminal-kit", "terminal")
  @js.native
  val terminal: Terminal = js.native
  
  @JSImport("terminal-kit", "truncateString")
  @js.native
  def truncateString(str: String, maxWidth: Double): String = js.native
}
