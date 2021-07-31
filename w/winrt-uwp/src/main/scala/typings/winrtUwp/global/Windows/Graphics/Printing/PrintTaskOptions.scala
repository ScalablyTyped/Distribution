package typings.winrtUwp.global.Windows.Graphics.Printing

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Graphics.Printing.PrintPageDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of methods and properties for managing the options which define how the content is to be printed. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskOptions")
@js.native
abstract class PrintTaskOptions ()
  extends StObject
     with typings.winrtUwp.Windows.Graphics.Printing.PrintTaskOptions {
  
  /** Gets or sets the binding option for the print task. */
  /* CompleteClass */
  var binding: typings.winrtUwp.Windows.Graphics.Printing.PrintBinding = js.native
  
  /** Gets or sets the collation option of the print tasks. */
  /* CompleteClass */
  var collation: typings.winrtUwp.Windows.Graphics.Printing.PrintCollation = js.native
  
  /** Gets or sets the color mode option of the print task. */
  /* CompleteClass */
  var colorMode: typings.winrtUwp.Windows.Graphics.Printing.PrintColorMode = js.native
  
  /** Gets the list of options displayed for the print experience. */
  /* CompleteClass */
  var displayedOptions: IVector[String] = js.native
  
  /** Gets or sets the duplex option of the print task. */
  /* CompleteClass */
  var duplex: typings.winrtUwp.Windows.Graphics.Printing.PrintDuplex = js.native
  
  /**
    * Retrieves the physical dimensions of the printed page.
    * @param jobPageNumber The page number.
    * @return The page description data.
    */
  /* CompleteClass */
  override def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
  
  /** Gets or sets the hole punch option of the print task. */
  /* CompleteClass */
  var holePunch: typings.winrtUwp.Windows.Graphics.Printing.PrintHolePunch = js.native
  
  /** Gets the maximum number of copies supported for the print task. */
  /* CompleteClass */
  var maxCopies: Double = js.native
  
  /** Gets or sets the media size option of the print task. */
  /* CompleteClass */
  var mediaSize: typings.winrtUwp.Windows.Graphics.Printing.PrintMediaSize = js.native
  
  /** Gets or sets the media type option for the print task. */
  /* CompleteClass */
  var mediaType: typings.winrtUwp.Windows.Graphics.Printing.PrintMediaType = js.native
  
  /** Gets the minimum number of copies allowed for the print task. */
  /* CompleteClass */
  var minCopies: Double = js.native
  
  /** Gets or sets the value for the number of copies for the print task. */
  /* CompleteClass */
  var numberOfCopies: Double = js.native
  
  /** Gets or sets the orientation option for the print task. */
  /* CompleteClass */
  var orientation: typings.winrtUwp.Windows.Graphics.Printing.PrintOrientation = js.native
  
  /** Gets or sets the print quality option for the print task. */
  /* CompleteClass */
  var printQuality: typings.winrtUwp.Windows.Graphics.Printing.PrintQuality = js.native
  
  /** Gets or sets the staple option for the print task. */
  /* CompleteClass */
  var staple: typings.winrtUwp.Windows.Graphics.Printing.PrintStaple = js.native
}
