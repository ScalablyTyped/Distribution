package typings.terminalKit

import typings.terminalKit.anon.Blending
import typings.terminalKit.anon.DstRect
import typings.terminalKit.anon.Shrink
import typings.terminalKit.anon.TransparencyChar
import typings.terminalKit.anon.`0`
import typings.terminalKit.rectMod.AbsoluteOptions
import typings.terminalKit.rectMod.Region
import typings.terminalKit.screenBufferMod.Attributes
import typings.terminalKit.screenBufferMod.Options
import typings.terminalKit.terminalMod.CreateOptions
import typings.terminalKit.terminalMod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("terminal-kit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("terminal-kit", "Rect")
  @js.native
  open class Rect protected ()
    extends typings.terminalKit.rectMod.^ {
    def this(options: AbsoluteOptions) = this()
    def this(options: typings.terminalKit.rectMod.Rect) = this()
    def this(options: Region) = this()
    def this(options: typings.terminalKit.screenBufferMod.^) = this()
    def this(options: Terminal) = this()
    def this(options: typings.terminalKit.textBufferMod.^) = this()
    def this(xmin: Double, xmax: Double, ymin: Double, ymax: Double) = this()
  }
  object Rect {
    
    @JSImport("terminal-kit", "Rect")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def wrappingRect(params: DstRect): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("wrappingRect")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("terminal-kit", "ScreenBuffer")
  @js.native
  open class ScreenBuffer protected ()
    extends typings.terminalKit.screenBufferMod.^ {
    def this(options: Options) = this()
  }
  object ScreenBuffer {
    
    @JSImport("terminal-kit", "ScreenBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def attr2object(attrFlags: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attr2object")(attrFlags.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def create(options: Options): typings.terminalKit.screenBufferMod.ScreenBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.terminalKit.screenBufferMod.ScreenBuffer]
    
    /* static member */
    inline def createFromString(options: TransparencyChar, str: String): typings.terminalKit.screenBufferMod.ScreenBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromString")(options.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[typings.terminalKit.screenBufferMod.ScreenBuffer]
    
    /* static member */
    inline def loadImage(
      url: String,
      calback: js.Function2[
          /* error */ js.UndefOr[Any], 
          /* image */ js.UndefOr[typings.terminalKit.screenBufferHDMod.^], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(url.asInstanceOf[js.Any], calback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* static member */
    inline def loadImage(
      url: String,
      options: Shrink,
      calback: js.Function2[/* error */ Any, /* image */ typings.terminalKit.screenBufferHDMod.^, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], calback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def loadSync(filepath: String): typings.terminalKit.screenBufferMod.ScreenBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filepath.asInstanceOf[js.Any]).asInstanceOf[typings.terminalKit.screenBufferMod.ScreenBuffer]
    
    /* static member */
    inline def object2attr(attrObject: Attributes): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("object2attr")(attrObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("terminal-kit", "ScreenBufferHD")
  @js.native
  open class ScreenBufferHD protected ()
    extends typings.terminalKit.screenBufferHDMod.^ {
    def this(options: Blending) = this()
    def this(options: Options) = this()
  }
  object ScreenBufferHD {
    
    @JSImport("terminal-kit", "ScreenBufferHD")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def loadImage(
      url: String,
      calback: js.Function2[
          /* error */ js.UndefOr[Any], 
          /* image */ js.UndefOr[typings.terminalKit.screenBufferHDMod.ScreenBufferHD], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(url.asInstanceOf[js.Any], calback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* static member */
    inline def loadImage(
      url: String,
      options: `0`,
      callback: js.Function2[
          /* error */ Any, 
          /* image */ typings.terminalKit.screenBufferHDMod.ScreenBufferHD, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object Terminal_ {
    
    @JSImport("terminal-kit", "Terminal.AutocompletionArray")
    @js.native
    open class AutocompletionArray[T] ()
      extends typings.terminalKit.terminalMod.AutocompletionArray[T]
  }
  
  @JSImport("terminal-kit", "TextBuffer")
  @js.native
  open class TextBuffer protected ()
    extends typings.terminalKit.textBufferMod.^ {
    def this(options: typings.terminalKit.textBufferMod.Options) = this()
  }
  
  inline def autoComplete(array: js.Array[String], startString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoComplete")(array.asInstanceOf[js.Any], startString.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def autoComplete(array: js.Array[String], startString: String, returnAlternatives: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoComplete")(array.asInstanceOf[js.Any], startString.asInstanceOf[js.Any], returnAlternatives.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def autoComplete(array: js.Array[String], startString: String, returnAlternatives: Boolean, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoComplete")(array.asInstanceOf[js.Any], startString.asInstanceOf[js.Any], returnAlternatives.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def autoComplete(
    array: js.Array[String],
    startString: String,
    returnAlternatives: Boolean,
    prefix: String,
    postfix: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoComplete")(array.asInstanceOf[js.Any], startString.asInstanceOf[js.Any], returnAlternatives.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], postfix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def autoComplete(
    array: js.Array[String],
    startString: String,
    returnAlternatives: Boolean,
    prefix: Unit,
    postfix: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoComplete")(array.asInstanceOf[js.Any], startString.asInstanceOf[js.Any], returnAlternatives.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], postfix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def autoComplete(array: js.Array[String], startString: String, returnAlternatives: Unit, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoComplete")(array.asInstanceOf[js.Any], startString.asInstanceOf[js.Any], returnAlternatives.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def autoComplete(
    array: js.Array[String],
    startString: String,
    returnAlternatives: Unit,
    prefix: String,
    postfix: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoComplete")(array.asInstanceOf[js.Any], startString.asInstanceOf[js.Any], returnAlternatives.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], postfix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def autoComplete(
    array: js.Array[String],
    startString: String,
    returnAlternatives: Unit,
    prefix: Unit,
    postfix: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("autoComplete")(array.asInstanceOf[js.Any], startString.asInstanceOf[js.Any], returnAlternatives.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], postfix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createTerminal(): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")().asInstanceOf[Terminal]
  inline def createTerminal(createOptions: CreateOptions): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(createOptions.asInstanceOf[js.Any]).asInstanceOf[Terminal]
  
  inline def getDetectedTerminal(calback: js.Function2[/* error */ Any, /* term */ Terminal, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetectedTerminal")(calback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getParentTerminalInfo(
    callback: js.Function4[
      /* error */ Any, 
      /* codename */ js.UndefOr[String], 
      /* name */ js.UndefOr[String], 
      /* pid */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentTerminalInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("terminal-kit", "realTerminal")
  @js.native
  val realTerminal: Terminal = js.native
  
  inline def stringWidth(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stringWidth")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def stripEscapeSequences(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripEscapeSequences")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("terminal-kit", "terminal")
  @js.native
  val terminal: Terminal = js.native
  
  inline def truncateString(str: String, maxWidth: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateString")(str.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any])).asInstanceOf[String]
}
