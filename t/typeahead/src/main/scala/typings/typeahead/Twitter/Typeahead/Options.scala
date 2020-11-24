package typings.typeahead.Twitter.Typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Used for overriding the default class names.
    */
  var classNames: js.UndefOr[ClassNames] = js.native
  
  /**
    * If true, when suggestions are rendered, pattern matches for the current query in text nodes will be wrapped in a strong element with its class set to {{classNames.highlight}}.
    * Defaults to false.
    */
  var highlight: js.UndefOr[Boolean] = js.native
  
  /**
    * If false, the typeahead will not show a hint.
    * Defaults to true.
    */
  var hint: js.UndefOr[Boolean] = js.native
  
  /**
    * The minimum character length needed before suggestions start getting rendered.
    * Defaults to 1.
    */
  var minLength: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setClassNames(value: ClassNames): Self = this.set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setHint(value: Boolean): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
  }
}
