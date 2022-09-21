package typings.yandexMaps.mod.control

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "control.FullscreenControl")
@js.native
open class FullscreenControl () extends Button {
  def this(parameters: IFullscreenControlParameters) = this()
  
  def enterFullscreen(): Unit = js.native
  
  def exitFullscreen(): Unit = js.native
}
