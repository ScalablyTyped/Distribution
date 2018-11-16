package typings
package tediousDashConnectionDashPoolLib.tediousDashConnectionDashPoolMod.tcpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *  Pool Configuration interface
     */

trait PoolConfig extends js.Object {
  /**
           * Acquire timeout
           */
  var acquireTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
           * Idle timeout
           */
  var idleTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
           * Defines if logging is activated
           */
  var log: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Maximum concurrent connections
           */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
           * Minimum concurrent connections
           */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
           * Retry delay
           */
  var retryDelay: js.UndefOr[scala.Double] = js.undefined
}

