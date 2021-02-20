package typings.useSidecar

import typings.react.mod.ComponentType
import typings.std.Error
import typings.useSidecar.typesMod.Importer
import typings.useSidecar.typesMod.SideMedium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hookMod {
  
  @JSImport("use-sidecar/dist/es5/hook", "useSidecar")
  @js.native
  def useSidecar[T](importer: Importer[T]): js.Tuple2[ComponentType[T] | Null, Error | Null] = js.native
  @JSImport("use-sidecar/dist/es5/hook", "useSidecar")
  @js.native
  def useSidecar[T](importer: Importer[T], effect: SideMedium[_]): js.Tuple2[ComponentType[T] | Null, Error | Null] = js.native
}
