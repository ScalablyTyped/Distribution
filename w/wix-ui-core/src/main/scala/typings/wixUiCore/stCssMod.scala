package typings.wixUiCore

import org.scalablytyped.runtime.Shortcut
import typings.stylableRuntime.typesMod.RuntimeStylesheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stCssMod extends Shortcut {
  
  @JSImport("*.st.css", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RuntimeStylesheet = js.native
  
  type _To = js.Object & RuntimeStylesheet
  
  /* This means you don't have to write `^`, but can instead just say `stCssMod.foo` */
  override def _to: js.Object & RuntimeStylesheet = ^
}
