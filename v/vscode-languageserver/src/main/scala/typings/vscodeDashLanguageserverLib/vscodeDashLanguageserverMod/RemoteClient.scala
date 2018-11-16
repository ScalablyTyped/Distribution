package typings
package vscodeDashLanguageserverLib.vscodeDashLanguageserverMod

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
  def register(registrations: BulkRegistration): vscodeDashLanguageserverLib.Thenable[BulkUnregistration] = js.native
  /**
       * Registers a listener for the given notification.
       * @param type the notification type to register for.
       * @param registerParams special registration parameters.
       * @return a `Disposable` to unregister the listener again.
       */
  def register[RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType0[RO]
  ): vscodeDashLanguageserverLib.Thenable[vscodeDashJsonrpcLib.libEventsMod.Disposable] = js.native
  /**
       * Registers a listener for the given notification.
       * @param type the notification type to register for.
       * @param registerParams special registration parameters.
       * @return a `Disposable` to unregister the listener again.
       */
  def register[RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType0[RO],
    registerParams: RO
  ): vscodeDashLanguageserverLib.Thenable[vscodeDashJsonrpcLib.libEventsMod.Disposable] = js.native
  /**
       * Registers a listener for the given notification.
       * @param unregisteration the unregistration to add a corresponding unregister action to.
       * @param type the notification type to register for.
       * @param registerParams special registration parameters.
       * @return the updated unregistration.
       */
  def register[RO](
    unregisteration: BulkUnregistration,
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType0[RO]
  ): vscodeDashLanguageserverLib.Thenable[BulkUnregistration] = js.native
  /**
       * Registers a listener for the given notification.
       * @param unregisteration the unregistration to add a corresponding unregister action to.
       * @param type the notification type to register for.
       * @param registerParams special registration parameters.
       * @return the updated unregistration.
       */
  def register[RO](
    unregisteration: BulkUnregistration,
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType0[RO],
    registerParams: RO
  ): vscodeDashLanguageserverLib.Thenable[BulkUnregistration] = js.native
  def register[P, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType[P, RO]
  ): vscodeDashLanguageserverLib.Thenable[vscodeDashJsonrpcLib.libEventsMod.Disposable] = js.native
  def register[P, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType[P, RO],
    registerParams: RO
  ): vscodeDashLanguageserverLib.Thenable[vscodeDashJsonrpcLib.libEventsMod.Disposable] = js.native
  def register[P, RO](
    unregisteration: BulkUnregistration,
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType[P, RO]
  ): vscodeDashLanguageserverLib.Thenable[BulkUnregistration] = js.native
  def register[P, RO](
    unregisteration: BulkUnregistration,
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType[P, RO],
    registerParams: RO
  ): vscodeDashLanguageserverLib.Thenable[BulkUnregistration] = js.native
  /**
       * Registers a listener for the given request.
       * @param type the request type to register for.
       * @param registerParams special registration parameters.
       * @return a `Disposable` to unregister the listener again.
       */
  def register[R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO]
  ): vscodeDashLanguageserverLib.Thenable[vscodeDashJsonrpcLib.libEventsMod.Disposable] = js.native
  /**
       * Registers a listener for the given request.
       * @param type the request type to register for.
       * @param registerParams special registration parameters.
       * @return a `Disposable` to unregister the listener again.
       */
  def register[R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO],
    registerParams: RO
  ): vscodeDashLanguageserverLib.Thenable[vscodeDashJsonrpcLib.libEventsMod.Disposable] = js.native
  /**
       * Registers a listener for the given request.
       * @param unregisteration the unregistration to add a corresponding unregister action to.
       * @param type the request type to register for.
       * @param registerParams special registration parameters.
       * @return the updated unregistration.
       */
  def register[R, E, RO](
    unregisteration: BulkUnregistration,
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO]
  ): vscodeDashLanguageserverLib.Thenable[BulkUnregistration] = js.native
  /**
       * Registers a listener for the given request.
       * @param unregisteration the unregistration to add a corresponding unregister action to.
       * @param type the request type to register for.
       * @param registerParams special registration parameters.
       * @return the updated unregistration.
       */
  def register[R, E, RO](
    unregisteration: BulkUnregistration,
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO],
    registerParams: RO
  ): vscodeDashLanguageserverLib.Thenable[BulkUnregistration] = js.native
  def register[P, R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO]
  ): vscodeDashLanguageserverLib.Thenable[vscodeDashJsonrpcLib.libEventsMod.Disposable] = js.native
  def register[P, R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO],
    registerParams: RO
  ): vscodeDashLanguageserverLib.Thenable[vscodeDashJsonrpcLib.libEventsMod.Disposable] = js.native
  def register[P, R, E, RO](
    unregisteration: BulkUnregistration,
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO]
  ): vscodeDashLanguageserverLib.Thenable[BulkUnregistration] = js.native
  def register[P, R, E, RO](
    unregisteration: BulkUnregistration,
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO],
    registerParams: RO
  ): vscodeDashLanguageserverLib.Thenable[BulkUnregistration] = js.native
}

