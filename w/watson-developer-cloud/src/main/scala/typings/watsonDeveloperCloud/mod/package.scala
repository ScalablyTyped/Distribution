package typings.watsonDeveloperCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /* static member */
  @scala.inline
  def URL: java.lang.String = typings.watsonDeveloperCloud.mod.^.asInstanceOf[js.Dynamic].selectDynamic("URL").asInstanceOf[java.lang.String]
  @scala.inline
  def URL_=(x: java.lang.String): scala.Unit = typings.watsonDeveloperCloud.mod.^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
}
