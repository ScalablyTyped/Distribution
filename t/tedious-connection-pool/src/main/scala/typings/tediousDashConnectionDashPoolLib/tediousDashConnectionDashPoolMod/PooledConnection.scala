package typings
package tediousDashConnectionDashPoolLib.tediousDashConnectionDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extends Tedious Connection with release function
  */
@JSImport("tedious-connection-pool", "PooledConnection")
@js.native
class PooledConnection ()
  extends tediousLib.tediousMod.Connection {
  /**
    * If the connection is issued from a connection pool returns the connection to the pool.
    */
  def release(): scala.Unit = js.native
}

