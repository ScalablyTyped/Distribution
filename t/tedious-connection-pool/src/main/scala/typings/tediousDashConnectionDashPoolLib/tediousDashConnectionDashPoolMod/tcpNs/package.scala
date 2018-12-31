package typings
package tediousDashConnectionDashPoolLib.tediousDashConnectionDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tcpNs {
  /**
    * Provides a connection or an error
    * @param err error if any
    * @param connection issued from the pool
    */
  type ConnectionCallback = js.Function2[/* err */ nodeLib.Error, /* connection */ PooledConnection, scala.Unit]
}
