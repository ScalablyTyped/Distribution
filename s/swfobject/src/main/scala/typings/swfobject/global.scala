package typings.swfobject

import org.scalablytyped.runtime.Shortcut
import typings.swfobject.swfobject.SwfObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object swfobject extends Shortcut {
    
    @JSGlobal("swfobject")
    @js.native
    val ^ : SwfObject = js.native
    
    type _To = SwfObject
    
    /* This means you don't have to write `^`, but can instead just say `swfobject.foo` */
    override def _to: SwfObject = ^
  }
}
