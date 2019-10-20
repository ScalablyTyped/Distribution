package typings.watsonDashDeveloperDashCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object languageDashTranslatorV3Mod {
  import typings.axios.axiosMod.AxiosResponse

  /** The callback for a service request. */
  type Callback[T] = js.Function3[
    /* error */ js.Any, 
    /* body */ js.UndefOr[T], 
    /* response */ js.UndefOr[AxiosResponse[T]], 
    Unit
  ]
}
