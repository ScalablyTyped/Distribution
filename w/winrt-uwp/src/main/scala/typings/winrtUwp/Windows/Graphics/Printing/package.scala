package typings.winrtUwp.Windows.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Printing {
  
  /** Occurs when a print task requests the document to print. The supplied print document must implement the IPrintDocumentSource interface. */
  type PrintTaskSourceRequestedHandler = js.Function1[
    /* args */ typings.winrtUwp.Windows.Graphics.Printing.PrintTaskSourceRequestedArgs, 
    scala.Unit
  ]
}
