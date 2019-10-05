package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiCreateFile")
@js.native
object nlapiCreateFile extends js.Object {
  /**
    * Instantiate a file object (specifying the name, type, and contents which are base-64 encoded for binary types.)
    * @restriction Server SuiteScript only
    *
    * @param {string} name file name
    * @param {string} type file type i.e. plainText, htmlDoc, pdf, word (see documentation for the list of supported file types)
    * @param {string} contents string containing file contents (must be base-64 encoded for binary types)
    * @return {nlobjFile}
    *
    * @since 2009.1
    * @param name
    * @param type
    * @param contents
    * @return
    */
  def apply(name: String, `type`: String, contents: String): nlobjFile = js.native
}

