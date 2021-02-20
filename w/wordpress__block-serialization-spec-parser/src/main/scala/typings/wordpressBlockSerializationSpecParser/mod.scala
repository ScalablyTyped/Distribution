package typings.wordpressBlockSerializationSpecParser

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/block-serialization-spec-parser", "parse")
  @js.native
  def parse(rawHtml: String): js.Array[Block] = js.native
  
  @js.native
  trait Block extends StObject {
    
    var attrs: Record[String, _] = js.native
    
    var blockName: String | Null = js.native
    
    var innerBlocks: js.Array[Block] = js.native
    
    var innerContent: js.Array[String] = js.native
    
    var innerHTML: String = js.native
  }
  object Block {
    
    @scala.inline
    def apply(
      attrs: Record[String, _],
      innerBlocks: js.Array[Block],
      innerContent: js.Array[String],
      innerHTML: String
    ): Block = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], innerBlocks = innerBlocks.asInstanceOf[js.Any], innerContent = innerContent.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: Record[String, _]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockNameNull: Self = StObject.set(x, "blockName", null)
      
      @scala.inline
      def setInnerBlocks(value: js.Array[Block]): Self = StObject.set(x, "innerBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerBlocksVarargs(value: Block*): Self = StObject.set(x, "innerBlocks", js.Array(value :_*))
      
      @scala.inline
      def setInnerContent(value: js.Array[String]): Self = StObject.set(x, "innerContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerContentVarargs(value: String*): Self = StObject.set(x, "innerContent", js.Array(value :_*))
      
      @scala.inline
      def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
    }
  }
}
