package typings.stylableCore

import typings.stylableCore.cachedProcessFileMod.MinimalFS
import typings.stylableCore.typesMod.ModuleResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleResolverMod {
  
  @JSImport("@stylable/core/cjs/module-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createDefaultResolver(fileSystem: MinimalFS, resolveOptions: js.Any): ModuleResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultResolver")(fileSystem.asInstanceOf[js.Any], resolveOptions.asInstanceOf[js.Any])).asInstanceOf[ModuleResolver]
}
