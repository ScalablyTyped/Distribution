package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesOptionsMod.SimplifySitelinkOptions
import typings.wikibaseSdk.distSrcTypesSitelinksMod.SimplifiedSitelinks
import typings.wikibaseSdk.distSrcTypesSitelinksMod.Sitelinks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersSimplifySitelinksMod {
  
  @JSImport("wikibase-sdk/dist/src/helpers/simplify_sitelinks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def simplifySitelinks(sitelinks: Sitelinks): SimplifiedSitelinks = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifySitelinks")(sitelinks.asInstanceOf[js.Any]).asInstanceOf[SimplifiedSitelinks]
  inline def simplifySitelinks(sitelinks: Sitelinks, options: SimplifySitelinkOptions): SimplifiedSitelinks = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifySitelinks")(sitelinks.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedSitelinks]
}
