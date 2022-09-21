package typings.tinycolor2

import org.scalablytyped.runtime.Shortcut
import typings.tinycolor2.mod.ColorInput
import typings.tinycolor2.mod.Constructor
import typings.tinycolor2.mod.ConstructorOptions
import typings.tinycolor2.mod.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object tinycolor extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tinycolor")
    @js.native
    /**
      * Create a tinycolor instance of the color named.
      *
      * @param color - the color as one of the valid color input format.
      */
    open class ^ ()
      extends StObject
         with Instance {
      def this(color: ColorInput) = this()
      def this(color: Unit, opts: ConstructorOptions) = this()
      def this(color: ColorInput, opts: ConstructorOptions) = this()
    }
    
    @JSGlobal("tinycolor")
    @js.native
    val ^ : js.Object & Constructor = js.native
    
    type _To = js.Object & Constructor
    
    /* This means you don't have to write `^`, but can instead just say `tinycolor.foo` */
    override def _to: js.Object & Constructor = ^
  }
}
