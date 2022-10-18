package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StringDictionary
import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* static member */
inline def URL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("URL").asInstanceOf[String]
inline def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])

/** The callback for a service request. */
type Callback[T] = js.Function3[
/* error */ Any, 
/* body */ js.UndefOr[T], 
/* response */ js.UndefOr[AxiosResponse[T, Any]], 
Unit]

/** An object that indicates the Categories enrichment will be applied to the specified field. */
type NluEnrichmentCategories = /** NluEnrichmentCategories accepts additional properties. */
StringDictionary[Any]
