package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Errors")
@js.native
class Errors ()
  extends typescriptDashServicesLib.TypeScriptNs.Errors

/* static members */
@JSImport("typescript-services", "Errors")
@js.native
object Errors extends js.Object {
  def `abstract`(): stdLib.Error = js.native
  def argument(argument: java.lang.String): stdLib.Error = js.native
  def argument(argument: java.lang.String, message: java.lang.String): stdLib.Error = js.native
  def argumentNull(argument: java.lang.String): stdLib.Error = js.native
  def argumentOutOfRange(argument: java.lang.String): stdLib.Error = js.native
  def invalidOperation(): stdLib.Error = js.native
  def invalidOperation(message: java.lang.String): stdLib.Error = js.native
  def notYetImplemented(): stdLib.Error = js.native
}

