package typings.winrt.global.Windows.Graphics.Printing

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Graphics.Printing.PrintPageDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Graphics.Printing.PrintTaskOptions")
@js.native
class PrintTaskOptions ()
  extends StObject
     with typings.winrt.Windows.Graphics.Printing.PrintTaskOptions {
  
  /* CompleteClass */
  var binding: typings.winrt.Windows.Graphics.Printing.PrintBinding = js.native
  
  /* CompleteClass */
  var collation: typings.winrt.Windows.Graphics.Printing.PrintCollation = js.native
  
  /* CompleteClass */
  var colorMode: typings.winrt.Windows.Graphics.Printing.PrintColorMode = js.native
  
  /* CompleteClass */
  var displayedOptions: IVector[String] = js.native
  
  /* CompleteClass */
  var duplex: typings.winrt.Windows.Graphics.Printing.PrintDuplex = js.native
  
  /* CompleteClass */
  override def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
  
  /* CompleteClass */
  var holePunch: typings.winrt.Windows.Graphics.Printing.PrintHolePunch = js.native
  
  /* CompleteClass */
  var maxCopies: Double = js.native
  
  /* CompleteClass */
  var mediaSize: typings.winrt.Windows.Graphics.Printing.PrintMediaSize = js.native
  
  /* CompleteClass */
  var mediaType: typings.winrt.Windows.Graphics.Printing.PrintMediaType = js.native
  
  /* CompleteClass */
  var minCopies: Double = js.native
  
  /* CompleteClass */
  var numberOfCopies: Double = js.native
  
  /* CompleteClass */
  var orientation: typings.winrt.Windows.Graphics.Printing.PrintOrientation = js.native
  
  /* CompleteClass */
  var printQuality: typings.winrt.Windows.Graphics.Printing.PrintQuality = js.native
  
  /* CompleteClass */
  var staple: typings.winrt.Windows.Graphics.Printing.PrintStaple = js.native
}
