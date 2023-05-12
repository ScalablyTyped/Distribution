package typings.workboxWebpackPlugin

import typings.webpack.mod.Compilation
import typings.workboxBuild.buildTypesMod.WebpackGenerateSWOptions
import typings.workboxBuild.buildTypesMod.WebpackInjectManifestOptions
import typings.workboxWebpackPlugin.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibGetManifestEntriesFromCompilationMod {
  
  @JSImport("workbox-webpack-plugin/build/lib/get-manifest-entries-from-compilation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getManifestEntriesFromCompilation(compilation: Compilation, config: WebpackGenerateSWOptions): js.Promise[Size] = (^.asInstanceOf[js.Dynamic].applyDynamic("getManifestEntriesFromCompilation")(compilation.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Size]]
  inline def getManifestEntriesFromCompilation(compilation: Compilation, config: WebpackInjectManifestOptions): js.Promise[Size] = (^.asInstanceOf[js.Dynamic].applyDynamic("getManifestEntriesFromCompilation")(compilation.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Size]]
}
