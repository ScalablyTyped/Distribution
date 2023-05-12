package typings.workboxBuild.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateSWOptions
  extends StObject
     with BasePartial
     with GlobPartial
     with GeneratePartial
     with RequiredSWDestPartial
     with OptionalGlobDirectoryPartial
object GenerateSWOptions {
  
  inline def apply(swDest: String): GenerateSWOptions = {
    val __obj = js.Dynamic.literal(swDest = swDest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateSWOptions]
  }
}
