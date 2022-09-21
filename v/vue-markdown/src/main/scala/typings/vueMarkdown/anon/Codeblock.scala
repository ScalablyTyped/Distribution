package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Codeblock extends StObject {
  
  var code_block: scala.Any
  
  var code_inline: scala.Any
  
  var fence: scala.Any
  
  var hardbreak: scala.Any
  
  var html_block: scala.Any
  
  var html_inline: scala.Any
  
  var image: scala.Any
  
  var softbreak: scala.Any
  
  var text: scala.Any
}
object Codeblock {
  
  inline def apply(
    code_block: scala.Any,
    code_inline: scala.Any,
    fence: scala.Any,
    hardbreak: scala.Any,
    html_block: scala.Any,
    html_inline: scala.Any,
    image: scala.Any,
    softbreak: scala.Any,
    text: scala.Any
  ): Codeblock = {
    val __obj = js.Dynamic.literal(code_block = code_block.asInstanceOf[js.Any], code_inline = code_inline.asInstanceOf[js.Any], fence = fence.asInstanceOf[js.Any], hardbreak = hardbreak.asInstanceOf[js.Any], html_block = html_block.asInstanceOf[js.Any], html_inline = html_inline.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], softbreak = softbreak.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codeblock]
  }
  
  extension [Self <: Codeblock](x: Self) {
    
    inline def setCode_block(value: scala.Any): Self = StObject.set(x, "code_block", value.asInstanceOf[js.Any])
    
    inline def setCode_inline(value: scala.Any): Self = StObject.set(x, "code_inline", value.asInstanceOf[js.Any])
    
    inline def setFence(value: scala.Any): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
    
    inline def setHardbreak(value: scala.Any): Self = StObject.set(x, "hardbreak", value.asInstanceOf[js.Any])
    
    inline def setHtml_block(value: scala.Any): Self = StObject.set(x, "html_block", value.asInstanceOf[js.Any])
    
    inline def setHtml_inline(value: scala.Any): Self = StObject.set(x, "html_inline", value.asInstanceOf[js.Any])
    
    inline def setImage(value: scala.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setSoftbreak(value: scala.Any): Self = StObject.set(x, "softbreak", value.asInstanceOf[js.Any])
    
    inline def setText(value: scala.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
