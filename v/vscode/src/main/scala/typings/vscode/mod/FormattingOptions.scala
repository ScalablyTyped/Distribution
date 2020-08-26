package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattingOptions
  extends /**
  * Signature for further properties.
  */
/* key */ StringDictionary[Boolean | Double | String] {
  /**
    * Prefer spaces over tabs.
    */
  var insertSpaces: Boolean = js.native
  /**
    * Size of a tab in spaces.
    */
  var tabSize: Double = js.native
}

object FormattingOptions {
  @scala.inline
  def apply(insertSpaces: Boolean, tabSize: Double): FormattingOptions = {
    val __obj = js.Dynamic.literal(insertSpaces = insertSpaces.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattingOptions]
  }
  @scala.inline
  implicit class FormattingOptionsOps[Self <: FormattingOptions] (val x: Self) extends AnyVal {
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
    def setInsertSpaces(value: Boolean): Self = this.set("insertSpaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
  }
  
}

