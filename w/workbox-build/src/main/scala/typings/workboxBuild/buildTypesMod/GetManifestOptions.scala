package typings.workboxBuild.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManifestOptions
  extends StObject
     with BasePartial
     with GlobPartial
     with RequiredGlobDirectoryPartial
object GetManifestOptions {
  
  inline def apply(globDirectory: String): GetManifestOptions = {
    val __obj = js.Dynamic.literal(globDirectory = globDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManifestOptions]
  }
}
