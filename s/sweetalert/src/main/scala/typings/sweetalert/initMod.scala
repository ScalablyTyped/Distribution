package typings.sweetalert

import typings.sweetalert.optionsMod.SwalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initMod {
  
  @JSImport("sweetalert/typings/modules/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(opts: SwalOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def init(opts: SwalOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
