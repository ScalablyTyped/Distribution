package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Codeblock extends StObject {
  
  var code_block: js.Any
  
  var code_inline: js.Any
  
  var fence: js.Any
  
  var hardbreak: js.Any
  
  var html_block: js.Any
  
  var html_inline: js.Any
  
  var image: js.Any
  
  var softbreak: js.Any
  
  var text: js.Any
}
object Codeblock {
  
  inline def apply(
    code_block: js.Any,
    code_inline: js.Any,
    fence: js.Any,
    hardbreak: js.Any,
    html_block: js.Any,
    html_inline: js.Any,
    image: js.Any,
    softbreak: js.Any,
    text: js.Any
  ): Codeblock = {
    val __obj = js.Dynamic.literal(code_block = code_block.asInstanceOf[js.Any], code_inline = code_inline.asInstanceOf[js.Any], fence = fence.asInstanceOf[js.Any], hardbreak = hardbreak.asInstanceOf[js.Any], html_block = html_block.asInstanceOf[js.Any], html_inline = html_inline.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], softbreak = softbreak.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codeblock]
  }
  
  extension [Self <: Codeblock](x: Self) {
    
    inline def setCode_block(value: js.Any): Self = StObject.set(x, "code_block", value.asInstanceOf[js.Any])
    
    inline def setCode_inline(value: js.Any): Self = StObject.set(x, "code_inline", value.asInstanceOf[js.Any])
    
    inline def setFence(value: js.Any): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
    
    inline def setHardbreak(value: js.Any): Self = StObject.set(x, "hardbreak", value.asInstanceOf[js.Any])
    
    inline def setHtml_block(value: js.Any): Self = StObject.set(x, "html_block", value.asInstanceOf[js.Any])
    
    inline def setHtml_inline(value: js.Any): Self = StObject.set(x, "html_inline", value.asInstanceOf[js.Any])
    
    inline def setImage(value: js.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setSoftbreak(value: js.Any): Self = StObject.set(x, "softbreak", value.asInstanceOf[js.Any])
    
    inline def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
