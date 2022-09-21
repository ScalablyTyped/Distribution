package typings.windowSize

import typings.node.fsMod.WriteStream
import typings.std.Record
import typings.windowSize.anon.GetWindowSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined window-size.window-size.Size & {get (options : window-size.window-size.WindowSizeOptions | undefined): window-size.window-size.Size, env (): window-size.window-size.Size, tty (options : window-size.window-size.TtySizeOptions): window-size.window-size.Size, tput (): window-size.window-size.Size, win (): window-size.window-size.Size} */
object mod {
  
  @JSImport("window-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Get terminal window's size with `process.env.COLUMNS` and `process.env.ROWS`. */
  inline def env(): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("env")().asInstanceOf[Size]
  
  /** Get terminal window's size with available channels. */
  inline def get(): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Size]
  inline def get(options: WindowSizeOptions): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[Size]
  
  @JSImport("window-size", "height")
  @js.native
  def height: Double = js.native
  inline def height_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
  
  inline def tput(): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("tput")().asInstanceOf[Size]
  
  /** Get terminal window's size with `tty` module */
  inline def tty(options: TtySizeOptions): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("tty")(options.asInstanceOf[js.Any]).asInstanceOf[Size]
  
  @JSImport("window-size", "type")
  @js.native
  val `type`: String = js.native
  
  @JSImport("window-size", "width")
  @js.native
  def width: Double = js.native
  inline def width_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
  
  inline def win(): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("win")().asInstanceOf[Size]
  
  trait Size extends StObject {
    
    var height: Double
    
    var `type`: String
    
    var width: Double
  }
  object Size {
    
    inline def apply(height: Double, `type`: String, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /** Options of inner function `streamSize`. */
  type StreamSizeOptions = Record[String, WriteStream]
  
  /** Options of function `windowSize.tty`. */
  trait TtySizeOptions extends StObject {
    
    var tty: js.UndefOr[GetWindowSize] = js.undefined
  }
  object TtySizeOptions {
    
    inline def apply(): TtySizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TtySizeOptions]
    }
    
    extension [Self <: TtySizeOptions](x: Self) {
      
      inline def setTty(value: GetWindowSize): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
      
      inline def setTtyUndefined: Self = StObject.set(x, "tty", js.undefined)
    }
  }
  
  /** Options of function `windowSize.get` */
  type WindowSizeOptions = StreamSizeOptions & TtySizeOptions
}
