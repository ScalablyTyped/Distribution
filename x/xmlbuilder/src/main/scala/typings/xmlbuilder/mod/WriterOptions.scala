package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the options passed to the XML writer.
  */
trait WriterOptions extends StObject {
  
  /**
    * Whether to output closing tags for empty element nodes
    */
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to pretty print text nodes
    */
  var dontPrettyTextNodes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indentation string for pretty printing
    */
  var indent: js.UndefOr[String] = js.undefined
  
  /**
    * Newline string for pretty printing
    */
  var newline: js.UndefOr[String] = js.undefined
  
  /**
    * A fixed number of indents to offset strings
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Pretty print the XML tree
    */
  var pretty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A string to insert before closing slash character
    */
  var spaceBeforeSlash: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * The current state of the writer
    */
  var state: js.UndefOr[WriterState_] = js.undefined
  
  /**
    * User state object that is saved between writer functions
    */
  var user: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Maximum column width
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * Writer function overrides
    */
  var writer: js.UndefOr[XMLWriter] = js.undefined
}
object WriterOptions {
  
  inline def apply(): WriterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriterOptions]
  }
  
  extension [Self <: WriterOptions](x: Self) {
    
    inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    inline def setDontPrettyTextNodes(value: Boolean): Self = StObject.set(x, "dontPrettyTextNodes", value.asInstanceOf[js.Any])
    
    inline def setDontPrettyTextNodesUndefined: Self = StObject.set(x, "dontPrettyTextNodes", js.undefined)
    
    inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
    
    inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    
    inline def setSpaceBeforeSlash(value: String | Boolean): Self = StObject.set(x, "spaceBeforeSlash", value.asInstanceOf[js.Any])
    
    inline def setSpaceBeforeSlashUndefined: Self = StObject.set(x, "spaceBeforeSlash", js.undefined)
    
    inline def setState(value: WriterState_): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUser(value: js.Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWriter(value: XMLWriter): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    
    inline def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
  }
}
