package typings.vscodeLanguageserver.serverMod

import typings.vscodeJsonrpc.disposableMod.Disposable
import typings.vscodeLanguageserverProtocol.mod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.mod.ProtocolNotificationType0
import typings.vscodeLanguageserverProtocol.mod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.mod.ProtocolRequestType0
import typings.vscodeLanguageserverProtocol.mod.RegistrationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteClient
  extends StObject
     with FeatureBase {
  
  /**
    * The connection this remote is attached to.
    */
  var connection: Connection = js.native
  
  /**
    * Registers a set of listeners.
    * @param registrations the bulk registration
    * @return a `Disposable` to unregister the listeners again.
    */
  def register(registrations: BulkRegistration): js.Promise[BulkUnregistration] = js.native
  def register[RO](`type`: ProtocolNotificationType0[RO]): js.Promise[Disposable] = js.native
  def register[RO](`type`: ProtocolNotificationType0[RO], registerParams: RO): js.Promise[Disposable] = js.native
  /**
    * Registers a listener for the given registration type.
    *
    * @param type the registration type.
    * @param registerParams special registration parameters.
    * @return a `Disposable` to unregister the listener again.
    */
  def register[RO](`type`: RegistrationType[RO]): js.Promise[Disposable] = js.native
  def register[RO](`type`: RegistrationType[RO], registerParams: RO): js.Promise[Disposable] = js.native
  def register[RO](unregisteration: BulkUnregistration, `type`: ProtocolNotificationType0[RO]): js.Promise[Disposable] = js.native
  def register[RO](unregisteration: BulkUnregistration, `type`: ProtocolNotificationType0[RO], registerParams: RO): js.Promise[Disposable] = js.native
  /**
    * Registers a listener for the given registration type.
    *
    * @param unregisteration the unregistration to add a corresponding unregister action to.
    * @param type the registration type.
    * @param registerParams special registration parameters.
    * @return the updated unregistration.
    */
  def register[RO](unregisteration: BulkUnregistration, `type`: RegistrationType[RO]): js.Promise[Disposable] = js.native
  def register[RO](unregisteration: BulkUnregistration, `type`: RegistrationType[RO], registerParams: RO): js.Promise[Disposable] = js.native
  /**
    * Registers a listener for the given request.
    *
    * @param type the request type to register for.
    * @param registerParams special registration parameters.
    * @return a `Disposable` to unregister the listener again.
    */
  def register[P, RO](`type`: ProtocolNotificationType[P, RO]): js.Promise[Disposable] = js.native
  def register[P, RO](`type`: ProtocolNotificationType[P, RO], registerParams: RO): js.Promise[Disposable] = js.native
  /**
    * Registers a listener for the given request.
    *
    * @param unregisteration the unregistration to add a corresponding unregister action to.
    * @param type the request type to register for.
    * @param registerParams special registration parameters.
    * @return the updated unregistration.
    */
  def register[P, RO](unregisteration: BulkUnregistration, `type`: ProtocolNotificationType[P, RO]): js.Promise[Disposable] = js.native
  def register[P, RO](unregisteration: BulkUnregistration, `type`: ProtocolNotificationType[P, RO], registerParams: RO): js.Promise[Disposable] = js.native
  def register[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO]): js.Promise[Disposable] = js.native
  def register[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO], registerParams: RO): js.Promise[Disposable] = js.native
  def register[R, PR, E, RO](unregisteration: BulkUnregistration, `type`: ProtocolRequestType0[R, PR, E, RO]): js.Promise[Disposable] = js.native
  def register[R, PR, E, RO](
    unregisteration: BulkUnregistration,
    `type`: ProtocolRequestType0[R, PR, E, RO],
    registerParams: RO
  ): js.Promise[Disposable] = js.native
  /**
    * Registers a listener for the given request.
    *
    * @param type the request type to register for.
    * @param registerParams special registration parameters.
    * @return a `Disposable` to unregister the listener again.
    */
  def register[P, R, PR, E, RO](`type`: ProtocolRequestType[P, R, PR, E, RO]): js.Promise[Disposable] = js.native
  def register[P, R, PR, E, RO](`type`: ProtocolRequestType[P, R, PR, E, RO], registerParams: RO): js.Promise[Disposable] = js.native
  /**
    * Registers a listener for the given request.
    *
    * @param unregisteration the unregistration to add a corresponding unregister action to.
    * @param type the request type to register for.
    * @param registerParams special registration parameters.
    * @return the updated unregistration.
    */
  def register[P, R, PR, E, RO](unregisteration: BulkUnregistration, `type`: ProtocolRequestType[P, R, PR, E, RO]): js.Promise[Disposable] = js.native
  def register[P, R, PR, E, RO](
    unregisteration: BulkUnregistration,
    `type`: ProtocolRequestType[P, R, PR, E, RO],
    registerParams: RO
  ): js.Promise[Disposable] = js.native
}
