package typings.xtermAddonFit

import typings.xterm.mod.ITerminalAddon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xterm-addon-fit", "FitAddon")
  @js.native
  /**
    * Creates a new fit addon.
    */
  class FitAddon () extends ITerminalAddon {
    
    /**
      * Resizes the terminal to the dimensions of its containing element.
      */
    def fit(): Unit = js.native
    
    /**
      * Gets the proposed dimensions that will be used for a fit.
      */
    def proposeDimensions(): ITerminalDimensions = js.native
  }
  
  @js.native
  trait ITerminalDimensions extends StObject {
    
    /**
      * The number of columns in the terminal.
      */
    var cols: Double = js.native
    
    /**
      * The number of rows in the terminal.
      */
    var rows: Double = js.native
  }
  object ITerminalDimensions {
    
    @scala.inline
    def apply(cols: Double, rows: Double): ITerminalDimensions = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITerminalDimensions]
    }
    
    @scala.inline
    implicit class ITerminalDimensionsMutableBuilder[Self <: ITerminalDimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
}
