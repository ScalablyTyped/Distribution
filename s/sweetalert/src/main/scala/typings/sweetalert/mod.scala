package typings.sweetalert

import org.scalablytyped.runtime.Shortcut
import typings.sweetalert.coreMod.SweetAlert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sweetalert", JSImport.Default)
  @js.native
  val default: SweetAlert = js.native
  
  object global {
    
    @JSGlobal("swal")
    @js.native
    val swal: SweetAlert = js.native
    
    @JSGlobal("sweetAlert")
    @js.native
    val sweetAlert: SweetAlert = js.native
  }
  
  type _To = SweetAlert
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: SweetAlert = default
}
