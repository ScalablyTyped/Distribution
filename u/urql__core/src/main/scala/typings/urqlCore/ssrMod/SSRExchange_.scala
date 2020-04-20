package typings.urqlCore.ssrMod

import typings.urqlCore.typesMod.Exchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSRExchange_ extends Exchange {
  /** Extracts cached data */
  def extractData(): SSRData = js.native
  /** Rehydrates cached data */
  def restoreData(data: SSRData): Unit = js.native
}

