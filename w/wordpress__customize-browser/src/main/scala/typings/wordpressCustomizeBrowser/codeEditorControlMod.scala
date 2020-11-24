package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.controlMod.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/CodeEditorControl", JSImport.Namespace)
@js.native
object codeEditorControlMod extends js.Object {
  
  @js.native
  class CodeEditorControl () extends Control {
    
    def initEditor(): Unit = js.native
    
     // TODO
    def initPlainTextareaEditor(): Unit = js.native
    
     // TODO
    def initSyntaxHighlightingEditor(codeEditorSettings: js.Any): Unit = js.native
    
     // TODO
    def onTabNext(): Unit = js.native
    
    def onTabPrevious(): Unit = js.native
    
    def onUpdateErrorNotice(errorAnnotations: js.Array[_]): Unit = js.native
  }
}
