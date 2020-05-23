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
    acquireTimeout: js.UndefOr[Double] = js.undefined,
    idleTimeout: js.UndefOr[Double] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    retryDelay: js.UndefOr[Double] = js.undefined
  ): PoolConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acquireTimeout)) __obj.updateDynamic("acquireTimeout")(acquireTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(idleTimeout)) __obj.updateDynamic("idleTimeout")(idleTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryDelay)) __obj.updateDynamic("retryDelay")(retryDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolConfig]
  }
}

