package typings.wordpressBlockSerializationSpecParser

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/block-serialization-spec-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(rawHtml: String): js.Array[Block] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(rawHtml.asInstanceOf[js.Any]).asInstanceOf[js.Array[Block]]
  
  trait Block extends StObject {
    
    var attrs: Record[String, js.Any]
    
    var blockName: String | Null
    
    var innerBlocks: js.Array[Block]
    
    var innerContent: js.Array[String]
    
    var innerHTML: String
  }
  object Block {
    
    @scala.inline
    def apply(
      attrs: Record[String, js.Any],
      innerBlocks: js.Array[Block],
      innerContent: js.Array[String],
      innerHTML: String
    ): Block = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], innerBlocks = innerBlocks.asInstanceOf[js.Any], innerContent = innerContent.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any], blockName = null)
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: Record[String, js.Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
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
