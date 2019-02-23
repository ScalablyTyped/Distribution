package typings
package webdriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebDriverNs {
  type ClientAsync = webdriverLib.AsyncClient
  type FirefoxLogLevels = webdriverLib.webdriverLibStrings.trace | webdriverLib.webdriverLibStrings.debug | webdriverLib.webdriverLibStrings.config | webdriverLib.webdriverLibStrings.info | webdriverLib.webdriverLibStrings.warn | webdriverLib.webdriverLibStrings.error | webdriverLib.webdriverLibStrings.fatal
  type LoggingPreferenceType = webdriverLib.webdriverLibStrings.OFF | webdriverLib.webdriverLibStrings.SEVERE | webdriverLib.webdriverLibStrings.WARNING | webdriverLib.webdriverLibStrings.INFO | webdriverLib.webdriverLibStrings.CONFIG | webdriverLib.webdriverLibStrings.FINE | webdriverLib.webdriverLibStrings.FINER | webdriverLib.webdriverLibStrings.FINEST | webdriverLib.webdriverLibStrings.ALL
  type PageLoadingStrategy = webdriverLib.webdriverLibStrings.none | webdriverLib.webdriverLibStrings.eager | webdriverLib.webdriverLibStrings.normal
  type ProxyTypes = webdriverLib.webdriverLibStrings.pac | webdriverLib.webdriverLibStrings.noproxy | webdriverLib.webdriverLibStrings.autodetect | webdriverLib.webdriverLibStrings.system | webdriverLib.webdriverLibStrings.manual
  type Timeouts = webdriverLib.webdriverLibStrings.script | webdriverLib.webdriverLibStrings.pageLoad | webdriverLib.webdriverLibStrings.`implicit`
  type WebDriverLogTypes = webdriverLib.webdriverLibStrings.trace | webdriverLib.webdriverLibStrings.debug | webdriverLib.webdriverLibStrings.info | webdriverLib.webdriverLibStrings.warn | webdriverLib.webdriverLibStrings.error | webdriverLib.webdriverLibStrings.silent
}
