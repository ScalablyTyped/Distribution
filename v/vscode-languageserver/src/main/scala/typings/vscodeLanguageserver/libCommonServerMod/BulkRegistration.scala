package typings.vscodeLanguageserver.libCommonServerMod

import typings.vscodeLanguageserverProtocol.mod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.mod.ProtocolNotificationType0
import typings.vscodeLanguageserverProtocol.mod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.mod.ProtocolRequestType0
import typings.vscodeLanguageserverProtocol.mod.RegistrationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkRegistration extends StObject {
  
  /**
    * Adds a single registration.
    * @param type the notification type to register for.
    * @param registerParams special registration parameters.
    */
  def add[RO](`type`: ProtocolNotificationType0[RO], registerParams: RO): Unit = js.native
  /**
    * Adds a single registration.
    * @param type the notification type to register for.
    * @param registerParams special registration parameters.
    */
  def add[RO](`type`: RegistrationType[RO], registerParams: RO): Unit = js.native
  def add[P, RO](`type`: ProtocolNotificationType[P, RO], registerParams: RO): Unit = js.native
  /**
    * Adds a single registration.
    * @param type the request type to register for.
    * @param registerParams special registration parameters.
    */
  def add[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO], registerParams: RO): Unit = js.native
  def add[P, PR, R, E, RO](`type`: ProtocolRequestType[P, PR, R, E, RO], registerParams: RO): Unit = js.native
}
object BulkRegistration {
  
  @JSImport("vscode-languageserver/lib/common/server", "BulkRegistration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new bulk registration.
    * @return an empty bulk registration.
    */
  inline def create(): BulkRegistration = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BulkRegistration]
}
