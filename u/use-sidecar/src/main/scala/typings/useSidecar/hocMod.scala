package typings.useSidecar

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.useSidecar.typesMod.Importer
import typings.useSidecar.typesMod.SideCarHOC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hocMod {
  
  @JSImport("use-sidecar/dist/es5/hoc", "sidecar")
  @js.native
  def sidecar[T](importer: Importer[T]): FunctionComponent[T with SideCarHOC] = js.native
  @JSImport("use-sidecar/dist/es5/hoc", "sidecar")
  @js.native
  def sidecar[T](importer: Importer[T], errorComponent: ReactNode): FunctionComponent[T with SideCarHOC] = js.native
}
