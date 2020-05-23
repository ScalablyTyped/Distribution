package typings.urqlCore

import typings.urqlCore.typesMod.CacheOutcome
import typings.urqlCore.typesMod.OperationType
import typings.urqlCore.typesMod.RequestPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object urqlCoreStrings {
  @js.native
  sealed trait `cache-and-network` extends RequestPolicy
  
  @js.native
  sealed trait `cache-first` extends RequestPolicy
  
  @js.native
  sealed trait `cache-only` extends RequestPolicy
  
  @js.native
  sealed trait cacheHit extends js.Object
  
  @js.native
  sealed trait cacheInvalidation extends js.Object
  
  @js.native
  sealed trait fetchError extends js.Object
  
  @js.native
  sealed trait fetchRequest extends js.Object
  
  @js.native
  sealed trait fetchSuccess extends js.Object
  
  @js.native
  sealed trait hit extends CacheOutcome
  
  @js.native
  sealed trait miss extends CacheOutcome
  
  @js.native
  sealed trait mutation extends OperationType
  
  @js.native
  sealed trait `network-only` extends RequestPolicy
  
  @js.native
  sealed trait partial extends CacheOutcome
  
  @js.native
  sealed trait query extends OperationType
  
  @js.native
  sealed trait retryRetrying extends js.Object
  
  @js.native
  sealed trait subscription extends OperationType
  
  @js.native
  sealed trait teardown extends OperationType
  
  @scala.inline
  def `cache-and-network`: `cache-and-network` = "cache-and-network".asInstanceOf[`cache-and-network`]
  @scala.inline
  def `cache-first`: `cache-first` = "cache-first".asInstanceOf[`cache-first`]
  @scala.inline
  def `cache-only`: `cache-only` = "cache-only".asInstanceOf[`cache-only`]
  @scala.inline
  def cacheHit: cacheHit = "cacheHit".asInstanceOf[cacheHit]
  @scala.inline
  def cacheInvalidation: cacheInvalidation = "cacheInvalidation".asInstanceOf[cacheInvalidation]
  @scala.inline
  def fetchError: fetchError = "fetchError".asInstanceOf[fetchError]
  @scala.inline
  def fetchRequest: fetchRequest = "fetchRequest".asInstanceOf[fetchRequest]
  @scala.inline
  def fetchSuccess: fetchSuccess = "fetchSuccess".asInstanceOf[fetchSuccess]
  @scala.inline
  def hit: hit = "hit".asInstanceOf[hit]
  @scala.inline
  def miss: miss = "miss".asInstanceOf[miss]
  @scala.inline
  def mutation: mutation = "mutation".asInstanceOf[mutation]
  @scala.inline
  def `network-only`: `network-only` = "network-only".asInstanceOf[`network-only`]
  @scala.inline
  def partial: partial = "partial".asInstanceOf[partial]
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  @scala.inline
  def retryRetrying: retryRetrying = "retryRetrying".asInstanceOf[retryRetrying]
  @scala.inline
  def subscription: subscription = "subscription".asInstanceOf[subscription]
  @scala.inline
  def teardown: teardown = "teardown".asInstanceOf[teardown]
}

