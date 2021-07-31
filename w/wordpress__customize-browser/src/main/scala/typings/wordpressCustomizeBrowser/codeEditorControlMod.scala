package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.controlMod.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeEditorControlMod {
  
  @JSImport("@wordpress/customize-browser/CodeEditorControl", "CodeEditorControl")
  @js.native
  class CodeEditorControl protected () extends Control {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def initEditor(): Unit = js.native
    
    // TODO
    def initPlainTextareaEditor(): Unit = js.native
    
    // TODO
    def initSyntaxHighlightingEditor(codeEditorSettings: js.Any): Unit = js.native
    
    // TODO
    def onTabNext(): Unit = js.native
    
    def onTabPrevious(): Unit = js.native
    
    def onUpdateErrorNotice(errorAnnotations: js.Array[js.Any]): Unit = js.native
  }
}
