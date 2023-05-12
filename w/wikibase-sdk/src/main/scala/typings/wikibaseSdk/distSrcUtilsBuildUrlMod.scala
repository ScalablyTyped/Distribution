package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesOptionsMod.ApiQueryParameters
import typings.wikibaseSdk.distSrcTypesOptionsMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsBuildUrlMod {
  
  @JSImport("wikibase-sdk/dist/src/utils/build_url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildUrlFactory(instanceApiEndpoint: Url): BuildUrlFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("buildUrlFactory")(instanceApiEndpoint.asInstanceOf[js.Any]).asInstanceOf[BuildUrlFunction]
  
  type BuildUrlFunction = js.Function1[/* options */ ApiQueryParameters, Url]
}
