package typings.useSidecar

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.useSidecar.typesMod.Importer
import typings.useSidecar.typesMod.SideCarHOC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-sidecar/dist/es5/hoc", JSImport.Namespace)
@js.native
object hocMod extends js.Object {
  
  def sidecar[T](importer: Importer[T]): FunctionComponent[T with SideCarHOC] = js.native
  def sidecar[T](importer: Importer[T], errorComponent: ReactNode): FunctionComponent[T with SideCarHOC] = js.native
}
