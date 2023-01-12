package typings.xtermAddonFit

import typings.xterm.mod.ITerminalAddon
import typings.xterm.mod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xterm-addon-fit", "FitAddon")
  @js.native
  /**
    * Creates a new fit addon.
    */
  open class FitAddon ()
    extends StObject
       with ITerminalAddon {
    
    /**
      * This is called when the addon is activated.
      */
    /* CompleteClass */
    override def activate(terminal: Terminal): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Resizes the terminal to the dimensions of its containing element.
      */
    def fit(): Unit = js.native
    
    /**
      * Gets the proposed dimensions that will be used for a fit.
      */
    def proposeDimensions(): js.UndefOr[ITerminalDimensions] = js.native
  }
  
  trait ITerminalDimensions extends StObject {
    
    /**
      * The number of columns in the terminal.
      */
    var cols: Double
    
    /**
      * The number of rows in the terminal.
      */
    var rows: Double
  }
  object ITerminalDimensions {
    
    inline def apply(cols: Double, rows: Double): ITerminalDimensions = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITerminalDimensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITerminalDimensions] (val x: Self) extends AnyVal {
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
}
