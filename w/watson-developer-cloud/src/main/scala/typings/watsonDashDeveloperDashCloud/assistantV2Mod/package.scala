package typings.watsonDashDeveloperDashCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object assistantV2Mod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.axios.axiosMod.AxiosResponse

  /** The callback for a service request. */
  type Callback[T] = js.Function3[
    /* error */ js.Any, 
    /* body */ js.UndefOr[T], 
    /* response */ js.UndefOr[AxiosResponse[T]], 
    Unit
  ]
  /** Information specific to particular skills used by the Assistant. **Note:** Currently, only a single property named `main skill` is supported. This object contains variables that apply to the dialog skill used by the assistant. */
  type MessageContextSkills = /** MessageContextSkills accepts additional properties. */
  StringDictionary[js.Any]
}
