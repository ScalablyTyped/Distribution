package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkRegistration extends js.Object {
  
  /**
    * Adds a single registration.
    * @param type the notification type to register for.
    * @param registerParams special registration parameters.
    */
  def add[RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType0[RO], registerParams: RO): Unit = js.native
  def add[P, RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType[P, RO], registerParams: RO): Unit = js.native
  /**
    * Adds a single registration.
    * @param type the request type to register for.
    * @param registerParams special registration parameters.
    */
  def add[R, E, RO](`type`: typings.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO], registerParams: RO): Unit = js.native
  def add[P, R, E, RO](`type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO], registerParams: RO): Unit = js.native
}
@JSImport("vscode-languageserver", "BulkRegistration")
@js.native
object BulkRegistration extends js.Object {
  
  /**
    * Creates a new bulk registration.
    * @return an empty bulk registration.
    */
  def create(): BulkRegistration = js.native
}
