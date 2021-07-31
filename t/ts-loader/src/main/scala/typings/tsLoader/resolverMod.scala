package typings.tsLoader

import typings.tsLoader.interfacesMod.ResolveSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverMod {
  
  @JSImport("ts-loader/dist/resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def makeResolver(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
  ): ResolveSync = ^.asInstanceOf[js.Dynamic].applyDynamic("makeResolver")(options.asInstanceOf[js.Any]).asInstanceOf[ResolveSync]
}
