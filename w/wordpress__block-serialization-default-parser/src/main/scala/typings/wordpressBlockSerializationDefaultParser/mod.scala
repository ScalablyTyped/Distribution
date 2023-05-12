package typings.wordpressBlockSerializationDefaultParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/block-serialization-default-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(doc: String): js.Array[ParsedBlock] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(doc.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParsedBlock]]
  
  type Attributes = js.Object | Null
  
  trait ParsedBlock extends StObject {
    
    /**
      * Block attributes.
      */
    var attrs: Attributes
    
    /**
      * Block name.
      */
    var blockName: String | Null
    
    /**
      * Inner blocks.
      */
    var innerBlocks: js.Array[ParsedBlock]
    
    /**
      * Inner content.
      */
    var innerContent: js.Array[String | Null]
    
    /**
      * Inner HTML.
      */
    var innerHTML: String
  }
  object ParsedBlock {
    
    inline def apply(innerBlocks: js.Array[ParsedBlock], innerContent: js.Array[String | Null], innerHTML: String): ParsedBlock = {
      val __obj = js.Dynamic.literal(innerBlocks = innerBlocks.asInstanceOf[js.Any], innerContent = innerContent.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any], attrs = null, blockName = null)
      __obj.asInstanceOf[ParsedBlock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedBlock] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: Attributes): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsNull: Self = StObject.set(x, "attrs", null)
      
      inline def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
      
      inline def setBlockNameNull: Self = StObject.set(x, "blockName", null)
      
      inline def setInnerBlocks(value: js.Array[ParsedBlock]): Self = StObject.set(x, "innerBlocks", value.asInstanceOf[js.Any])
      
      inline def setInnerBlocksVarargs(value: ParsedBlock*): Self = StObject.set(x, "innerBlocks", js.Array(value*))
      
      inline def setInnerContent(value: js.Array[String | Null]): Self = StObject.set(x, "innerContent", value.asInstanceOf[js.Any])
      
      inline def setInnerContentVarargs(value: (String | Null)*): Self = StObject.set(x, "innerContent", js.Array(value*))
      
      inline def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedFrame extends StObject {
    
    /**
      * Block.
      */
    var block: ParsedBlock
    
    /**
      * Leading HTML start.
      */
    var leadingHtmlStart: Double | Null
    
    /**
      * Previous offset.
      */
    var prevOffset: Double
    
    /**
      * Token length.
      */
    var tokenLength: Double
    
    /**
      * Token start.
      */
    var tokenStart: Double
  }
  object ParsedFrame {
    
    inline def apply(block: ParsedBlock, prevOffset: Double, tokenLength: Double, tokenStart: Double): ParsedFrame = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prevOffset = prevOffset.asInstanceOf[js.Any], tokenLength = tokenLength.asInstanceOf[js.Any], tokenStart = tokenStart.asInstanceOf[js.Any], leadingHtmlStart = null)
      __obj.asInstanceOf[ParsedFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedFrame] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: ParsedBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setLeadingHtmlStart(value: Double): Self = StObject.set(x, "leadingHtmlStart", value.asInstanceOf[js.Any])
      
      inline def setLeadingHtmlStartNull: Self = StObject.set(x, "leadingHtmlStart", null)
      
      inline def setPrevOffset(value: Double): Self = StObject.set(x, "prevOffset", value.asInstanceOf[js.Any])
      
      inline def setTokenLength(value: Double): Self = StObject.set(x, "tokenLength", value.asInstanceOf[js.Any])
      
      inline def setTokenStart(value: Double): Self = StObject.set(x, "tokenStart", value.asInstanceOf[js.Any])
    }
  }
  
  type Token = js.Tuple5[TokenType, String, Attributes, Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressBlockSerializationDefaultParser.wordpressBlockSerializationDefaultParserStrings.`no-more-tokens`
    - typings.wordpressBlockSerializationDefaultParser.wordpressBlockSerializationDefaultParserStrings.`void-block`
    - typings.wordpressBlockSerializationDefaultParser.wordpressBlockSerializationDefaultParserStrings.`block-opener`
    - typings.wordpressBlockSerializationDefaultParser.wordpressBlockSerializationDefaultParserStrings.`block-closer`
  */
  trait TokenType extends StObject
  object TokenType {
    
    inline def `block-closer`: typings.wordpressBlockSerializationDefaultParser.wordpressBlockSerializationDefaultParserStrings.`block-closer` = "block-closer".asInstanceOf[typings.wordpressBlockSerializationDefaultParser.wordpressBlockSerializationDefaultParserStrings.`block-closer`]
    
    inline def `block-opener`: typings.wordpressBlockSerializationDefaultParser.wordpressBlockSerializationDefaultParserStrings.`block-opener` = "block-opener".asInstanceOf[typings.wordpressBlockSerializationDefaultParser.wordpressBlockSerializationDefaultParserStrings.`block-opener`]
    
    inline def `no-more-tokens`: typings.wordpressBlockSerializationDefaultParser.wordpressBlockSerializationDefaultParserStrings.`no-more-tokens` = "no-more-tokens".asInstanceOf[typings.wordpressBlockSerializationDefaultParser.wordpressBlockSerializationDefaultParserStrings.`no-more-tokens`]
    
    inline def `void-block`: typings.wordpressBlockSerializationDefaultParser.wordpressBlockSerializationDefaultParserStrings.`void-block` = "void-block".asInstanceOf[typings.wordpressBlockSerializationDefaultParser.wordpressBlockSerializationDefaultParserStrings.`void-block`]
  }
}
