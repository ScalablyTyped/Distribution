package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region Error Classes
@JSGlobal("tableau.TableauException")
@js.native
class TableauException ()
  extends stdLib.Error {
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var tableauSoftwareErrorCode: ErrorCode = js.native
}

