package typings.tediousConnectionPool.mod

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
  var acquireTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Idle timeout
    */
  var idleTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Defines if logging is activated
    */
  var log: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum concurrent connections
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Minimum concurrent connections
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Retry delay
    */
  var retryDelay: js.UndefOr[Double] = js.undefined
}

object PoolConfig {
  @scala.inline
  def apply(
    acquireTimeout: Int | Double = null,
    idleTimeout: Int | Double = null,
    log: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    retryDelay: Int | Double = null
  ): PoolConfig = {
    val __obj = js.Dynamic.literal()
    if (acquireTimeout != null) __obj.updateDynamic("acquireTimeout")(acquireTimeout.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(retryDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolConfig]
  }
}

