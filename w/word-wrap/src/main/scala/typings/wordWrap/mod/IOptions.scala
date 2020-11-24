package typings.wordWrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends js.Object {
  
  /**
    * Break a word between any two letters when the word is longer
    * than the specified width.
    * @default false
    */
  var cut: js.UndefOr[Boolean] = js.native
  
  /**
    * An escape function to run on each line after splitting them.
    * @default (str: string) => string;
    */
  var escape: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
  
  /**
    * The string to use at the beginning of each line.
    * @default ´  ´ (two spaces)
    */
  var indent: js.UndefOr[String] = js.native
  
  /**
    * The string to use at the end of each line.
    * @default ´\n´
    */
  var newline: js.UndefOr[String] = js.native
  
  /**
    * Trim trailing whitespace from the returned string.
    * This option is included since .trim() would also strip
    * the leading indentation from the first line.
    * @default true
    */
  var trim: js.UndefOr[Boolean] = js.native
  
  /**
    * The width of the text before wrapping to a new line.
    * @default ´50´
    */
  var width: js.UndefOr[Double] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setCut(value: Boolean): Self = this.set("cut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCut: Self = this.set("cut", js.undefined)
    
    @scala.inline
    def setEscape(value: /* str */ String => String): Self = this.set("escape", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setNewline(value: String): Self = this.set("newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewline: Self = this.set("newline", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
