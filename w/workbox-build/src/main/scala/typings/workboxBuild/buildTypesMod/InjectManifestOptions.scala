package typings.workboxBuild.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InjectManifestOptions
  extends StObject
     with BasePartial
     with GlobPartial
     with InjectPartial
     with RequiredSWDestPartial
     with RequiredGlobDirectoryPartial
object InjectManifestOptions {
  
  inline def apply(globDirectory: String, swDest: String, swSrc: String): InjectManifestOptions = {
    val __obj = js.Dynamic.literal(globDirectory = globDirectory.asInstanceOf[js.Any], swDest = swDest.asInstanceOf[js.Any], swSrc = swSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectManifestOptions]
  }
}
