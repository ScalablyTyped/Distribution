package typings.webgme

import org.scalablytyped.runtime.Shortcut
import typings.webgme.GmeUtil.Canon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canonMod extends Shortcut {
  
  @JSImport("common/util/canon", JSImport.Namespace)
  @js.native
  val ^ : Canon = js.native
  
  type _To = Canon
  
  /* This means you don't have to write `^`, but can instead just say `canonMod.foo` */
  override def _to: Canon = ^
}
