package typings.watsonDeveloperCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** The callback for a service request. */
  type Callback[T] = js.Function3[
    /* error */ js.Any, 
    /* body */ js.UndefOr[T], 
    /* response */ js.UndefOr[typings.axios.mod.AxiosResponse[T]], 
    scala.Unit
  ]
  /** For internal use only. */
  type SystemResponse = /** SystemResponse accepts additional properties. */
  org.scalablytyped.runtime.StringDictionary[js.Any]
}
