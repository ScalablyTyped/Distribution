package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTP request data. (copied from the puppeteer-core package as there is currently
  * no way to access these types otherwise)
  */
/* Rewritten from type alias, can be one of: 
  - typings.webdriverio.webdriverioStrings.VeryLow
  - typings.webdriverio.webdriverioStrings.Low
  - typings.webdriverio.webdriverioStrings.Medium
  - typings.webdriverio.webdriverioStrings.High
  - typings.webdriverio.webdriverioStrings.VeryHigh
*/
trait ResourcePriority extends js.Object

object ResourcePriority {
  @scala.inline
  def High: typings.webdriverio.webdriverioStrings.High = "High".asInstanceOf[typings.webdriverio.webdriverioStrings.High]
  @scala.inline
  def Low: typings.webdriverio.webdriverioStrings.Low = "Low".asInstanceOf[typings.webdriverio.webdriverioStrings.Low]
  @scala.inline
  def Medium: typings.webdriverio.webdriverioStrings.Medium = "Medium".asInstanceOf[typings.webdriverio.webdriverioStrings.Medium]
  @scala.inline
  def VeryHigh: typings.webdriverio.webdriverioStrings.VeryHigh = "VeryHigh".asInstanceOf[typings.webdriverio.webdriverioStrings.VeryHigh]
  @scala.inline
  def VeryLow: typings.webdriverio.webdriverioStrings.VeryLow = "VeryLow".asInstanceOf[typings.webdriverio.webdriverioStrings.VeryLow]
}

