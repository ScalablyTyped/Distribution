package typings
package webdriverioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebdriverIONs {
  type Axis = webdriverioLib.webdriverioLibStrings.x | webdriverioLib.webdriverioLibStrings.y
  type ElementId = java.lang.String
  type LocatorStrategy = (webdriverioLib.webdriverioLibStrings.`css selector`) | (webdriverioLib.webdriverioLibStrings.`link text`) | (webdriverioLib.webdriverioLibStrings.`partial link text`) | (webdriverioLib.webdriverioLibStrings.`tag name`) | webdriverioLib.webdriverioLibStrings.xpath
  type LoggingPreferenceType = webdriverioLib.webdriverioLibStrings.OFF | webdriverioLib.webdriverioLibStrings.SEVERE | webdriverioLib.webdriverioLibStrings.WARNING | webdriverioLib.webdriverioLibStrings.INFO | webdriverioLib.webdriverioLibStrings.CONFIG | webdriverioLib.webdriverioLibStrings.FINE | webdriverioLib.webdriverioLibStrings.FINER | webdriverioLib.webdriverioLibStrings.FINEST | webdriverioLib.webdriverioLibStrings.ALL
  type Method = webdriverioLib.webdriverioLibStrings.POST | webdriverioLib.webdriverioLibStrings.GET | webdriverioLib.webdriverioLibStrings.DELETE
  type PageLoadingStrategy = webdriverioLib.webdriverioLibStrings.none | webdriverioLib.webdriverioLibStrings.eager | webdriverioLib.webdriverioLibStrings.normal
  type Timeouts = webdriverioLib.webdriverioLibStrings.script | webdriverioLib.webdriverioLibStrings.pageLoad | webdriverioLib.webdriverioLibStrings.`implicit`
}
