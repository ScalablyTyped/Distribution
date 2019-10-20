package typings.watsonDashDeveloperDashCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object assistantV1Mod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.axios.axiosMod.AxiosResponse

  /** The callback for a service request. */
  type Callback[T] = js.Function3[
    /* error */ js.Any, 
    /* body */ js.UndefOr[T], 
    /* response */ js.UndefOr[AxiosResponse[T]], 
    Unit
  ]
  /** For internal use only. */
  type SystemResponse = /** SystemResponse accepts additional properties. */
  StringDictionary[js.Any]
}
