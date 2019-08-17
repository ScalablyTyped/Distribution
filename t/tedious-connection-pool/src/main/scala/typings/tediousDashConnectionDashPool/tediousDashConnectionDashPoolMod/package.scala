package typings.tediousDashConnectionDashPool

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tediousDashConnectionDashPoolMod {
  import typings.std.Error

  /**
    * Provides a connection or an error
    * @param err error if any
    * @param connection issued from the pool
    */
  type ConnectionCallback = js.Function2[/* err */ Error, /* connection */ PooledConnection, Unit]
}
