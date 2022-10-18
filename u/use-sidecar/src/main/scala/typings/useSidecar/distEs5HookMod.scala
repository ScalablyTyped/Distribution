package typings.useSidecar

import typings.react.mod.ComponentType
import typings.useSidecar.distEs5TypesMod.Importer
import typings.useSidecar.distEs5TypesMod.SideMedium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5HookMod {
  
  @JSImport("use-sidecar/dist/es5/hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSidecar[T](importer: Importer[T]): js.Tuple2[ComponentType[T] | Null, js.Error | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSidecar")(importer.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[ComponentType[T] | Null, js.Error | Null]]
  inline def useSidecar[T](importer: Importer[T], effect: SideMedium[Any]): js.Tuple2[ComponentType[T] | Null, js.Error | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSidecar")(importer.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ComponentType[T] | Null, js.Error | Null]]
}
