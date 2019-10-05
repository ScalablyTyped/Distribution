package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSearchGlobal")
@js.native
object nlapiSearchGlobal extends js.Object {
  /**
    * Perform a global record search across the system.
    * @governance 10 units
    * @restriction returns the first 1000 rows in the search
    *
    * @param {string} keywords Global search keywords string or expression.
    * @return {nlobjSearchResult[]} Returns an Array of nlobjSearchResult objects containing the following four columns: name, type (as shown in the UI), info1, and info2.
    *
    * @since    2008.1
    * @param keywords
    */
  def apply(keywords: String): js.Array[nlobjSearchResult] = js.native
}

