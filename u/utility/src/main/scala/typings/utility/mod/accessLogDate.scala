package typings.utility.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("utility", "accessLogDate")
@js.native
object accessLogDate extends js.Object {
  
  /**
    * Access log format date. format: `moment().format('DD/MMM/YYYY:HH:mm:ss ZZ')`
    *
    * @return {String}
    */
  def apply(d: Date): String = js.native
}
