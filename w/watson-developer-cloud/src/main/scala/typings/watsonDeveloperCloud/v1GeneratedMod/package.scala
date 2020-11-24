package typings.watsonDeveloperCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object v1GeneratedMod {
  
  /** The callback for a service request. */
  type Callback[T] = js.Function3[
    /* error */ js.Any, 
    /* body */ js.UndefOr[T], 
    /* response */ js.UndefOr[typings.axios.mod.AxiosResponse[T]], 
    scala.Unit
  ]
  
  /** An object that indicates the Categories enrichment will be applied to the specified field. */
  type NluEnrichmentCategories = /** NluEnrichmentCategories accepts additional properties. */
  org.scalablytyped.runtime.StringDictionary[js.Any]
}
