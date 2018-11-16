package typings
package tediousDashConnectionDashPoolLib.tediousDashConnectionDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Tedious Connection Pool Class
 */
@js.native
trait tcp
  extends nodeLib.eventsMod.EventEmitter {
  /**
       * acquires a connection from the pool
       * @param callback invoked when the connection is retrieved and ready
       */
  def acquire(
    callback: tediousDashConnectionDashPoolLib.tediousDashConnectionDashPoolMod.tcpNs.ConnectionCallback
  ): scala.Unit = js.native
  /**
       * closes opened connections
       */
  def drain(): scala.Unit = js.native
}

