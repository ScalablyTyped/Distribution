package typings.workboxBuild

import typings.workboxBuild.buildTypesMod.FileDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibGetCompositeDetailsMod {
  
  @JSImport("workbox-build/build/lib/get-composite-details", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCompositeDetails(compositeURL: String, dependencyDetails: js.Array[FileDetails]): FileDetails = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompositeDetails")(compositeURL.asInstanceOf[js.Any], dependencyDetails.asInstanceOf[js.Any])).asInstanceOf[FileDetails]
}
