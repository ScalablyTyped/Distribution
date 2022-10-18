package typings.useGestureCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.GestureKey
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.UserGestureConfig
import typings.useGestureCore.distDeclarationsSrcTypesInternalConfigMod.InternalConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcConfigResolverMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/config/resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(newConfig: UserGestureConfig): InternalConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(newConfig.asInstanceOf[js.Any]).asInstanceOf[InternalConfig]
  inline def parse(newConfig: UserGestureConfig, gestureKey: Unit, _config: Any): InternalConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(newConfig.asInstanceOf[js.Any], gestureKey.asInstanceOf[js.Any], _config.asInstanceOf[js.Any])).asInstanceOf[InternalConfig]
  inline def parse(newConfig: UserGestureConfig, gestureKey: GestureKey): InternalConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(newConfig.asInstanceOf[js.Any], gestureKey.asInstanceOf[js.Any])).asInstanceOf[InternalConfig]
  inline def parse(newConfig: UserGestureConfig, gestureKey: GestureKey, _config: Any): InternalConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(newConfig.asInstanceOf[js.Any], gestureKey.asInstanceOf[js.Any], _config.asInstanceOf[js.Any])).asInstanceOf[InternalConfig]
  
  inline def resolveWith[T /* <: StringDictionary[Any] */, V /* <: StringDictionary[Any] */](config: Unit, resolvers: ResolverMap): V = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveWith")(config.asInstanceOf[js.Any], resolvers.asInstanceOf[js.Any])).asInstanceOf[V]
  inline def resolveWith[T /* <: StringDictionary[Any] */, V /* <: StringDictionary[Any] */](config: Partial[T], resolvers: ResolverMap): V = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveWith")(config.asInstanceOf[js.Any], resolvers.asInstanceOf[js.Any])).asInstanceOf[V]
  
  type Resolver = js.Function3[/* x */ Any, /* key */ String, /* obj */ Any, Any]
  
  trait ResolverMap
    extends StObject
       with /* k */ StringDictionary[Resolver | ResolverMap | Boolean]
  object ResolverMap {
    
    inline def apply(): ResolverMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolverMap]
    }
  }
}
