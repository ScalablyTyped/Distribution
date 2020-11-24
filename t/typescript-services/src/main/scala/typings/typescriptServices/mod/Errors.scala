package typings.typescriptServices.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Errors")
@js.native
class Errors ()
  extends typings.typescriptServices.TypeScript.Errors
/* static members */
@JSImport("typescript-services", "Errors")
@js.native
object Errors extends js.Object {
  
  def `abstract`(): Error = js.native
  
  def argument(argument: String): Error = js.native
  def argument(argument: String, message: String): Error = js.native
  
  def argumentNull(argument: String): Error = js.native
  
  def argumentOutOfRange(argument: String): Error = js.native
  
  def invalidOperation(): Error = js.native
  def invalidOperation(message: String): Error = js.native
  
  def notYetImplemented(): Error = js.native
}
