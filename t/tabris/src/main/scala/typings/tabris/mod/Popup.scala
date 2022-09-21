package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Popup")
@js.native
/**
  * Base class for all pop-up UI elements. Pop-ups are placed on top of all other UI, but are not
  * widgets. Some pop-ups can be opened only once.
  * 
  * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
  * object which may include (in addition to the properties) children, event listeners and layout
  * shorthands.
  */
/* protected */ open class Popup () extends NativeObject {
  
  /**
    * Hides the popup.
    */
  def close(): this.type = js.native
  
  /**
    * Makes the popup visible.
    */
  def open(): this.type = js.native
}
