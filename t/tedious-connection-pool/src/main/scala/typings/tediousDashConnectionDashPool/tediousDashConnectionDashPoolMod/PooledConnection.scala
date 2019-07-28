package typings.tediousDashConnectionDashPool.tediousDashConnectionDashPoolMod

import typings.tedious.tediousMod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extends Tedious Connection with release function
  */
@JSImport("tedious-connection-pool", "PooledConnection")
@js.native
class PooledConnection () extends Connection {
  /**
    * If the connection is issued from a connection pool returns the connection to the pool.
    */
  def release(): Unit = js.native
}

