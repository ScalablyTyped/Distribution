package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiLoadFile")
@js.native
object nlapiLoadFile extends js.Object {
  /**
    * Load a file from the file cabinet (via its internal ID or path).
    * @governance 10 units
    * @restriction Server SuiteScript only
    *
    * @param {string, int} id internal ID or relative path to file in the file cabinet (i.e. /SuiteScript/foo.js)
    * @return {nlobjFile}
    *
    * @since 2008.2
    * @param id
    * @return
    */
  def apply(id: js.Any): js.Any = js.native
}

