package typings.useSidecar

import typings.react.mod.ComponentType
import typings.std.Error
import typings.useSidecar.typesMod.Importer
import typings.useSidecar.typesMod.SideMedium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hookMod {
  
  @JSImport("use-sidecar/dist/es5/hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useSidecar[T](importer: Importer[T]): js.Tuple2[ComponentType[T] | Null, Error | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSidecar")(importer.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[ComponentType[T] | Null, Error | Null]]
  @scala.inline
  def useSidecar[T](importer: Importer[T], effect: SideMedium[js.Any]): js.Tuple2[ComponentType[T] | Null, Error | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSidecar")(importer.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ComponentType[T] | Null, Error | Null]]
}
