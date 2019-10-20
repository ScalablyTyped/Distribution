package typings.watsonDashDeveloperDashCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object discoveryV1DashGeneratedMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.axios.axiosMod.AxiosResponse

  /** The callback for a service request. */
  type Callback[T] = js.Function3[
    /* error */ js.Any, 
    /* body */ js.UndefOr[T], 
    /* response */ js.UndefOr[AxiosResponse[T]], 
    Unit
  ]
  /** An object that indicates the Categories enrichment will be applied to the specified field. */
  type NluEnrichmentCategories = /** NluEnrichmentCategories accepts additional properties. */
  StringDictionary[js.Any]
}
