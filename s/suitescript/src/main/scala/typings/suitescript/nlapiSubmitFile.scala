package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSubmitFile")
@js.native
object nlapiSubmitFile extends js.Object {
  /**
    * Add/update a file in the file cabinet.
    * @governance 20 units
    * @restriction Server SuiteScript only
    *
    * @param {nlobjFile} file a file object to submit
    * @return {int} return internal ID of file
    *
    * @since 2009.1
    * @param file
    * @return
    */
  def apply(file: nlobjFile): js.Any = js.native
}

