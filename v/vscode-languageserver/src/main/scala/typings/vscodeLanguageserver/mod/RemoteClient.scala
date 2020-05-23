package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteClient extends js.Object {
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection = js.native
  /**
    * Registers a set of listeners.
    * @param registrations the bulk registration
    * @return a `Disposable` to unregister the listeners again.
    */
  def register(registrations: BulkRegistration): js.Promise[BulkUnregistration] = js.native
  /**
    * Registers a listener for the given notification.
    * @param type the notification type to register for.
    * @param registerParams special registration parameters.
    * @return a `Disposable` to unregister the listener again.
    */
  def register[RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType0[RO]): js.Promise[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
  def register[RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType0[RO], registerParams: RO): js.Promise[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
  /**
    * Registers a listener for the given notification.
    * @param unregisteration the unregistration to add a corresponding unregister action to.
    * @param type the notification type to register for.
    * @param registerParams special registration parameters.
    * @return the updated unregistration.
    */
  def register[RO](
    unregisteration: BulkUnregistration,
    `type`: typings.vscodeLanguageserverProtocol.mod.NotificationType0[RO]
  ): js.Promise[BulkUnregistration] = js.native
  def register[RO](
    unregisteration: BulkUnregistration,
    `type`: typings.vscodeLanguageserverProtocol.mod.NotificationType0[RO],
    registerParams: RO
  ): js.Promise[BulkUnregistration] = js.native
  def register[P, RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType[P, RO]): js.Promise[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
  def register[P, RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType[P, RO], registerParams: RO): js.Promise[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
  def register[P, RO](
    unregisteration: BulkUnregistration,
    `type`: typings.vscodeLanguageserverProtocol.mod.NotificationType[P, RO]
  ): js.Promise[BulkUnregistration] = js.native
  def register[P, RO](
    unregisteration: BulkUnregistration,
    `type`: typings.vscodeLanguageserverProtocol.mod.NotificationType[P, RO],
    registerParams: RO
  ): js.Promise[BulkUnregistration] = js.native
  /**
    * Registers a listener for the given request.
    * @param type the request type to register for.
    * @param registerParams special registration parameters.
    * @return a `Disposable` to unregister the listener again.
    */
  def register[R, E, RO](`type`: typings.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO]): js.Promise[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
  def register[R, E, RO](`type`: typings.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO], registerParams: RO): js.Promise[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
  /**
    * Registers a listener for the given request.
    * @param unregisteration the unregistration to add a corresponding unregister action to.
    * @param type the request type to register for.
    * @param registerParams special registration parameters.
    * @return the updated unregistration.
    */
  def register[R, E, RO](
    unregisteration: BulkUnregistration,
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO]
  ): js.Promise[BulkUnregistration] = js.native
  def register[R, E, RO](
    unregisteration: BulkUnregistration,
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO],
    registerParams: RO
  ): js.Promise[BulkUnregistration] = js.native
  def register[P, R, E, RO](`type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO]): js.Promise[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
  def register[P, R, E, RO](`type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO], registerParams: RO): js.Promise[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
  def register[P, R, E, RO](
    unregisteration: BulkUnregistration,
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO]
  ): js.Promise[BulkUnregistration] = js.native
  def register[P, R, E, RO](
    unregisteration: BulkUnregistration,
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO],
    registerParams: RO
  ): js.Promise[BulkUnregistration] = js.native
}

