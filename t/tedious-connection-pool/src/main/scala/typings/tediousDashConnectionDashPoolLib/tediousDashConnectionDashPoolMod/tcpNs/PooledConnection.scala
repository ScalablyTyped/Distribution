package typings
package tediousDashConnectionDashPoolLib.tediousDashConnectionDashPoolMod.tcpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extends Tedious Connection with release function
  */
@js.native
trait PooledConnection
  extends tediousLib.tediousMod.Connection {
  /**
    * If the connection is issued from a connection pool returns the connection to the pool.
    */
  def release(): scala.Unit = js.native
}

