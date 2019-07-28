package typings.tediousDashConnectionDashPool.tediousDashConnectionDashPoolMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tedious Connection Pool Class
  */
@js.native
trait tcp extends EventEmitter {
  /**
    * acquires a connection from the pool
    * @param callback invoked when the connection is retrieved and ready
    */
  def acquire(callback: ConnectionCallback): Unit = js.native
  /**
    * closes opened connections
    */
  def drain(): Unit = js.native
}

