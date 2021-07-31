package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery.Event
import typings.wordpressCustomizeBrowser.controlMod.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaControlMod {
  
  @JSImport("@wordpress/customize-browser/MediaControl", "MediaControl")
  @js.native
  class MediaControl protected () extends Control {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def cleanupPlayer(): Unit = js.native
    
    def initFrame(): Unit = js.native
    
    def openFrame(event: Event): Unit = js.native
    
    def pausePlayer(): Unit = js.native
    
    def removeFile(event: Event): Unit = js.native
    
    def restoreDefault(event: Event): Unit = js.native
    
    def select(): Unit = js.native
  }
}
