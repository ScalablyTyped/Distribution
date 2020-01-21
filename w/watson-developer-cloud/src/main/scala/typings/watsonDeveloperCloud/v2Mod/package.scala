package typings.watsonDeveloperCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object v2Mod {
  /** The callback for a service request. */
  type Callback[T] = js.Function3[
    /* error */ js.Any, 
    /* body */ js.UndefOr[T], 
    /* response */ js.UndefOr[typings.axios.mod.AxiosResponse[T]], 
    scala.Unit
  ]
  /** Information specific to particular skills used by the Assistant. **Note:** Currently, only a single property named `main skill` is supported. This object contains variables that apply to the dialog skill used by the assistant. */
  type MessageContextSkills = /** MessageContextSkills accepts additional properties. */
  org.scalablytyped.runtime.StringDictionary[js.Any]
}
