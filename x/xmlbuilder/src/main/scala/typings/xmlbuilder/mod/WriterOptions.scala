package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the options passed to the XML writer.
  */
@js.native
trait WriterOptions extends StObject {
  
  /**
    * Whether to output closing tags for empty element nodes
    */
  var allowEmpty: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to pretty print text nodes
    */
  var dontPrettyTextNodes: js.UndefOr[Boolean] = js.native
  
  /**
    * Indentation string for pretty printing
    */
  var indent: js.UndefOr[String] = js.native
  
  /**
    * Newline string for pretty printing
    */
  var newline: js.UndefOr[String] = js.native
  
  /**
    * A fixed number of indents to offset strings
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * Pretty print the XML tree
    */
  var pretty: js.UndefOr[Boolean] = js.native
  
  /**
    * A string to insert before closing slash character
    */
  var spaceBeforeSlash: js.UndefOr[String | Boolean] = js.native
  
  /**
    * The current state of the writer
    */
  var state: js.UndefOr[WriterState_] = js.native
  
  /**
    * User state object that is saved between writer functions
    */
  var user: js.UndefOr[js.Any] = js.native
  
  /**
    * Maximum column width
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * Writer function overrides
    */
  var writer: js.UndefOr[XMLWriter] = js.native
}
object WriterOptions {
  
  @scala.inline
  def apply(): WriterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriterOptions]
  }
  
  @scala.inline
  implicit class WriterOptionsMutableBuilder[Self <: WriterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    @scala.inline
    def setDontPrettyTextNodes(value: Boolean): Self = StObject.set(x, "dontPrettyTextNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontPrettyTextNodesUndefined: Self = StObject.set(x, "dontPrettyTextNodes", js.undefined)
    
    @scala.inline
    def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    @scala.inline
    def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    
    @scala.inline
    def setSpaceBeforeSlash(value: String | Boolean): Self = StObject.set(x, "spaceBeforeSlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBeforeSlashUndefined: Self = StObject.set(x, "spaceBeforeSlash", js.undefined)
    
    @scala.inline
    def setState(value: WriterState_): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUser(value: js.Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWriter(value: XMLWriter): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
  }
}
