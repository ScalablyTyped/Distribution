package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Utility {
  import org.scalablytyped.runtime.StringDictionary

  /**
    * Interface use to provide parameters when opening new entiy forms
    */
  type OpenParameters = /**
    * Additional parameters can be provided to the request, by overloading
    * this object with additional key and value pairs. This can only be used
    * to provide default field values for the form, or pass data to custom
    * parameters that have been customized for the form.
    */
  StringDictionary[js.UndefOr[String]]
}
