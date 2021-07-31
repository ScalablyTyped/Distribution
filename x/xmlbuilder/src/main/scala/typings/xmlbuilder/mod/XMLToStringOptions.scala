package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the settings used when converting the XML document to string.
  */
trait XMLToStringOptions extends StObject {
  
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
    * Maximum column width
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /** 
    * The default XML writer to use for converting nodes to string. 
    * If the default writer is not set, the built-in `XMLStringWriter` 
    * will be used instead. 
    */
  var writer: js.UndefOr[XMLWriter] = js.undefined
}
object XMLToStringOptions {
  
  @scala.inline
  def apply(): XMLToStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLToStringOptions]
  }
  
  @scala.inline
  implicit class XMLToStringOptionsMutableBuilder[Self <: XMLToStringOptions] (val x: Self) extends AnyVal {
    
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
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWriter(value: XMLWriter): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
  }
}
