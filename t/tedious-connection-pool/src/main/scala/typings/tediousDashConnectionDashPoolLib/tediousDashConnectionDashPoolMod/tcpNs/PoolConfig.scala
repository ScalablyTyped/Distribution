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

object PoolConfig {
  @scala.inline
  def apply(
    acquireTimeout: scala.Int | scala.Double = null,
    idleTimeout: scala.Int | scala.Double = null,
    log: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    retryDelay: scala.Int | scala.Double = null
  ): PoolConfig = {
    val __obj = js.Dynamic.literal()
    if (acquireTimeout != null) __obj.updateDynamic("acquireTimeout")(acquireTimeout.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(retryDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolConfig]
  }
}

