package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PrintingNs {
  /** Occurs when a print task requests the document to print. The supplied print document must implement the IPrintDocumentSource interface. */
  type PrintTaskSourceRequestedHandler = js.Function1[/* args */ PrintTaskSourceRequestedArgs, scala.Unit]
}
