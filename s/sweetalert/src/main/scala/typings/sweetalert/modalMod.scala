package typings.sweetalert

import typings.std.HTMLElement
import typings.sweetalert.optionsMod.SwalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("sweetalert/typings/modules/init/modal", JSImport.Default)
  @js.native
  def default(): Unit = js.native
  
  @JSImport("sweetalert/typings/modules/init/modal", "initModalContent")
  @js.native
  def initModalContent(opts: SwalOptions): Unit = js.native
  
  @JSImport("sweetalert/typings/modules/init/modal", "injectElIntoModal")
  @js.native
  def injectElIntoModal(markup: String): HTMLElement = js.native
}
