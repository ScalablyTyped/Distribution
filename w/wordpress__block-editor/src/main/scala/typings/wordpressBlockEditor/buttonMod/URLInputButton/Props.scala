package typings.wordpressBlockEditor.buttonMod.URLInputButton

import typings.wordpressBlockEditor.urlInputMod.URLInput.PostType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<@wordpress/block-editor.@wordpress/block-editor/components/url-input.default.Props, 'onChange'> */
@js.native
trait Props extends js.Object {
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  var onChange: js.Function2[/* url */ String, /* post */ PostType | Null, Unit] = js.native
  
  /**
    * This should be set to the attribute (or component state) property used to store the URL.
    */
  var url: String = js.native
}
object Props {
  
  @scala.inline
  def apply(onChange: (/* url */ String, /* post */ PostType | Null) => Unit, url: String): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnChange(value: (/* url */ String, /* post */ PostType | Null) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
