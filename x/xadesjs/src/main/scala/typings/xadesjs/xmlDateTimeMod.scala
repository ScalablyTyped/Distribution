package typings.xadesjs

import typings.xadesjs.xmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlDateTimeMod {
  
  @JSImport("xadesjs/build/types/xml/date_time", "XadesDateTime")
  @js.native
  open class XadesDateTime () extends XadesObject {
    def this(properties: js.Object) = this()
    
    /**
      * Format of the datetime value
      *
      * Check [dateformat]{@link https://www.npmjs.com/package/dateformat} for supported formatting options.
      * If not specified, [Date#toISOString()]{@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString} is used.
      */
    var Format: js.UndefOr[String] = js.native
    
    var Value: js.Date = js.native
  }
}
