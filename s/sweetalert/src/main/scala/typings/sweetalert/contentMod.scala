package typings.sweetalert

import typings.sweetalert.optionsContentMod.ContentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentMod {
  
  @JSImport("sweetalert/typings/modules/init/content", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(opts: ContentOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
