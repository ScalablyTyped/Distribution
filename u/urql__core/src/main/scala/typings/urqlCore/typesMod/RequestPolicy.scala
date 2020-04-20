package typings.urqlCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.urqlCore.urqlCoreStrings.`cache-first`
  - typings.urqlCore.urqlCoreStrings.`cache-only`
  - typings.urqlCore.urqlCoreStrings.`network-only`
  - typings.urqlCore.urqlCoreStrings.`cache-and-network`
*/
trait RequestPolicy extends js.Object

object RequestPolicy {
  @scala.inline
  def `cache-and-network`: typings.urqlCore.urqlCoreStrings.`cache-and-network` = "cache-and-network".asInstanceOf[typings.urqlCore.urqlCoreStrings.`cache-and-network`]
  @scala.inline
  def `cache-first`: typings.urqlCore.urqlCoreStrings.`cache-first` = "cache-first".asInstanceOf[typings.urqlCore.urqlCoreStrings.`cache-first`]
  @scala.inline
  def `cache-only`: typings.urqlCore.urqlCoreStrings.`cache-only` = "cache-only".asInstanceOf[typings.urqlCore.urqlCoreStrings.`cache-only`]
  @scala.inline
  def `network-only`: typings.urqlCore.urqlCoreStrings.`network-only` = "network-only".asInstanceOf[typings.urqlCore.urqlCoreStrings.`network-only`]
}

