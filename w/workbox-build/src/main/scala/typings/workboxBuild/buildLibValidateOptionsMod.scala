package typings.workboxBuild

import typings.std.Error
import typings.workboxBuild.buildTypesMod.GenerateSWOptions
import typings.workboxBuild.buildTypesMod.GetManifestOptions
import typings.workboxBuild.buildTypesMod.InjectManifestOptions
import typings.workboxBuild.buildTypesMod.WebpackGenerateSWOptions
import typings.workboxBuild.buildTypesMod.WebpackInjectManifestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibValidateOptionsMod {
  
  @JSImport("workbox-build/build/lib/validate-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("workbox-build/build/lib/validate-options", "WorkboxConfigError")
  @js.native
  open class WorkboxConfigError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def validateGenerateSWOptions(input: Any): GenerateSWOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("validateGenerateSWOptions")(input.asInstanceOf[js.Any]).asInstanceOf[GenerateSWOptions]
  
  inline def validateGetManifestOptions(input: Any): GetManifestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("validateGetManifestOptions")(input.asInstanceOf[js.Any]).asInstanceOf[GetManifestOptions]
  
  inline def validateInjectManifestOptions(input: Any): InjectManifestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("validateInjectManifestOptions")(input.asInstanceOf[js.Any]).asInstanceOf[InjectManifestOptions]
  
  inline def validateWebpackGenerateSWOptions(input: Any): WebpackGenerateSWOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("validateWebpackGenerateSWOptions")(input.asInstanceOf[js.Any]).asInstanceOf[WebpackGenerateSWOptions]
  
  inline def validateWebpackInjectManifestOptions(input: Any): WebpackInjectManifestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("validateWebpackInjectManifestOptions")(input.asInstanceOf[js.Any]).asInstanceOf[WebpackInjectManifestOptions]
}
