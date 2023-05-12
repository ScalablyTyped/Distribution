package typings.workboxBuild

import typings.workboxBuild.buildTypesMod.FileDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibGetStringDetailsMod {
  
  @JSImport("workbox-build/build/lib/get-string-details", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStringDetails(url: String, str: String): FileDetails = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringDetails")(url.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[FileDetails]
}
