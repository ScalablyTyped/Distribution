package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteClient extends Remote {
  /**
    * Registers a set of listeners.
    * @param registrations the bulk registration
    * @return a `Disposable` to unregister the listeners again.
    */
  def register(registrations: BulkRegistration): Thenable[BulkUnregistration] = js.native
  /**
    * Registers a listener for the given notification.
    * @param type the notification type to register for.
    * @param registerParams special registration parameters.
    * @return a `Disposable` to unregister the listener again.
    */
  def register[RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType0[RO]): Thenable[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
  def register[RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType0[RO], registerParams: RO): Thenable[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
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
  ): Thenable[BulkUnregistration] = js.native
  def register[RO](
    unregisteration: BulkUnregistration,
    `type`: typings.vscodeLanguageserverProtocol.mod.NotificationType0[RO],
    registerParams: RO
  ): Thenable[BulkUnregistration] = js.native
  def register[P, RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType[P, RO]): Thenable[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
  def register[P, RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType[P, RO], registerParams: RO): Thenable[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
  def register[P, RO](
    unregisteration: BulkUnregistration,
    `type`: typings.vscodeLanguageserverProtocol.mod.NotificationType[P, RO]
  ): Thenable[BulkUnregistration] = js.native
  def register[P, RO](
    unregisteration: BulkUnregistration,
    `type`: typings.vscodeLanguageserverProtocol.mod.NotificationType[P, RO],
    registerParams: RO
  ): Thenable[BulkUnregistration] = js.native
  /**
    * Registers a listener for the given request.
    * @param type the request type to register for.
    * @param registerParams special registration parameters.
    * @return a `Disposable` to unregister the listener again.
    */
  def register[R, E, RO](`type`: typings.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO]): Thenable[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
  def register[R, E, RO](`type`: typings.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO], registerParams: RO): Thenable[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
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
  ): Thenable[BulkUnregistration] = js.native
  def register[R, E, RO](
    unregisteration: BulkUnregistration,
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO],
    registerParams: RO
  ): Thenable[BulkUnregistration] = js.native
  def register[P, R, E, RO](`type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO]): Thenable[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
  def register[P, R, E, RO](`type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO], registerParams: RO): Thenable[typings.vscodeJsonrpc.eventsMod.Disposable] = js.native
  def register[P, R, E, RO](
    unregisteration: BulkUnregistration,
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO]
  ): Thenable[BulkUnregistration] = js.native
  def register[P, R, E, RO](
    unregisteration: BulkUnregistration,
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO],
    registerParams: RO
  ): Thenable[BulkUnregistration] = js.native
}

