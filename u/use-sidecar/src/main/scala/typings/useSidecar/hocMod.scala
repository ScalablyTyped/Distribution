package typings.useSidecar

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.useSidecar.typesMod.Importer
import typings.useSidecar.typesMod.SideCarHOC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hocMod {
  
  @JSImport("use-sidecar/dist/es5/hoc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sidecar[T](importer: Importer[T]): FunctionComponent[T & SideCarHOC] = ^.asInstanceOf[js.Dynamic].applyDynamic("sidecar")(importer.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[T & SideCarHOC]]
  @scala.inline
  def sidecar[T](importer: Importer[T], errorComponent: ReactNode): FunctionComponent[T & SideCarHOC] = (^.asInstanceOf[js.Dynamic].applyDynamic("sidecar")(importer.asInstanceOf[js.Any], errorComponent.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[T & SideCarHOC]]
}
