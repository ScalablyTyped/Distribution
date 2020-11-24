package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery.Event
import typings.wordpressCustomizeBrowser.controlMod.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/MediaControl", JSImport.Namespace)
@js.native
object mediaControlMod extends js.Object {
  
  @js.native
  class MediaControl () extends Control {
    
    def cleanupPlayer(): Unit = js.native
    
    def initFrame(): Unit = js.native
    
    def openFrame(event: Event): Unit = js.native
    
    def pausePlayer(): Unit = js.native
    
    def removeFile(event: Event): Unit = js.native
    
    def restoreDefault(event: Event): Unit = js.native
    
    def select(): Unit = js.native
  }
}
