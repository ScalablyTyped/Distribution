package typings.umami

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // Based on https://umami.is/docs/tracker-functions
  object umami extends Shortcut {
    
    @JSGlobal("umami")
    @js.native
    val ^ : typings.umami.umami.umami = js.native
    
    type _To = typings.umami.umami.umami
    
    /* This means you don't have to write `^`, but can instead just say `umami.foo` */
    override def _to: typings.umami.umami.umami = ^
  }
}
