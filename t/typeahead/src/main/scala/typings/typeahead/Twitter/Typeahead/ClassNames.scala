package typings.typeahead.Twitter.Typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for overriding the default class names.
  */
@js.native
trait ClassNames extends js.Object {
  
  /**
    * Added to suggestion element when menu cursor moves to said suggestion.Defaults to tt- cursor.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Added to dataset elements.to Defaults to tt- dataset.
    */
  var dataset: js.UndefOr[String] = js.native
  
  /**
    * Added to menu element when it contains no content.Defaults to tt- empty.
    */
  var empty: js.UndefOr[String] = js.native
  
  /**
    * Added to the element that wraps highlighted text.Defaults to tt- highlight.
    */
  var highlight: js.UndefOr[String] = js.native
  
  /**
    * Added to hint input.Defaults to tt- hint.
    */
  var hint: js.UndefOr[String] = js.native
  
  /**
    * Added to input that's initialized into a typeahead. Defaults to tt-input.
    */
  var input: js.UndefOr[String] = js.native
  
  /**
    * Added to menu element.Defaults to tt- menu.
    */
  var menu: js.UndefOr[String] = js.native
  
  /**
    * Added to menu element when it is opened.Defaults to tt- open.
    */
  var open: js.UndefOr[String] = js.native
  
  /**
    * Added to suggestion elements.Defaults to tt- suggestion.
    */
  var suggestion: js.UndefOr[String] = js.native
}
object ClassNames {
  
  @scala.inline
  def apply(): ClassNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassNames]
  }
  
  @scala.inline
  implicit class ClassNamesOps[Self <: ClassNames] (val x: Self) extends AnyVal {
    
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
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setDataset(value: String): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setHighlight(value: String): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setMenu(value: String): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setOpen(value: String): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setSuggestion(value: String): Self = this.set("suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestion: Self = this.set("suggestion", js.undefined)
  }
}
