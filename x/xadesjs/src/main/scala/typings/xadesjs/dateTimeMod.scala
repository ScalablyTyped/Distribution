package typings.xadesjs

import typings.std.Date
import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/date_time", JSImport.Namespace)
@js.native
object dateTimeMod extends js.Object {
  @js.native
  class XadesDateTime () extends XmlObject {
    /**
      * Format of the datetime value
      *
      * Check [dateformat]{@link https://www.npmjs.com/package/dateformat} for supported formatting options.
      * If not specified, [Date#toISOString()]{@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString} is used.
      */
    var Format: js.UndefOr[String] = js.native
    var Value: Date = js.native
  }
  
}

