package typings.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* static member */
@scala.inline
def URL: java.lang.String = typings.watsonDeveloperCloud.v2Mod.^.asInstanceOf[js.Dynamic].selectDynamic("URL").asInstanceOf[java.lang.String]
@scala.inline
def URL_=(x: java.lang.String): scala.Unit = typings.watsonDeveloperCloud.v2Mod.^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])

/** The callback for a service request. */
type Callback[T] = js.Function3[
/* error */ js.Any, 
/* body */ js.UndefOr[T], 
/* response */ js.UndefOr[typings.axios.mod.AxiosResponse[T]], 
scala.Unit]

/** Information specific to particular skills used by the Assistant. **Note:** Currently, only a single property named `main skill` is supported. This object contains variables that apply to the dialog skill used by the assistant. */
type MessageContextSkills = /** MessageContextSkills accepts additional properties. */
org.scalablytyped.runtime.StringDictionary[js.Any]
