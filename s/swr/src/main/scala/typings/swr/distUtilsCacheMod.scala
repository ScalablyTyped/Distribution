package typings.swr

import typings.swr.anon.PartialProviderConfigurat
import typings.swr.distTypesMod.Cache
import typings.swr.distTypesMod.ScopedMutator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsCacheMod {
  
  @JSImport("swr/dist/utils/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initCache[Data](provider: Cache[Data]): js.UndefOr[
    (js.Tuple3[Cache[Data], ScopedMutator[Data], js.Function0[Unit]]) | (js.Tuple2[Cache[Data], ScopedMutator[Data]])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("initCache")(provider.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    (js.Tuple3[Cache[Data], ScopedMutator[Data], js.Function0[Unit]]) | (js.Tuple2[Cache[Data], ScopedMutator[Data]])
  ]]
  inline def initCache[Data](provider: Cache[Data], options: PartialProviderConfigurat): js.UndefOr[
    (js.Tuple3[Cache[Data], ScopedMutator[Data], js.Function0[Unit]]) | (js.Tuple2[Cache[Data], ScopedMutator[Data]])
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("initCache")(provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    (js.Tuple3[Cache[Data], ScopedMutator[Data], js.Function0[Unit]]) | (js.Tuple2[Cache[Data], ScopedMutator[Data]])
  ]]
}
