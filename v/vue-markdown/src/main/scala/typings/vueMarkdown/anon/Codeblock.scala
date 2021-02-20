package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Codeblock extends StObject {
  
  var code_block: js.Any = js.native
  
  var code_inline: js.Any = js.native
  
  var fence: js.Any = js.native
  
  var hardbreak: js.Any = js.native
  
  var html_block: js.Any = js.native
  
  var html_inline: js.Any = js.native
  
  var image: js.Any = js.native
  
  var softbreak: js.Any = js.native
  
  var text: js.Any = js.native
}
object Codeblock {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CodeblockMutableBuilder[Self <: Codeblock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode_block(value: js.Any): Self = StObject.set(x, "code_block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode_inline(value: js.Any): Self = StObject.set(x, "code_inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFence(value: js.Any): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardbreak(value: js.Any): Self = StObject.set(x, "hardbreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_block(value: js.Any): Self = StObject.set(x, "html_block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_inline(value: js.Any): Self = StObject.set(x, "html_inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: js.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftbreak(value: js.Any): Self = StObject.set(x, "softbreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
