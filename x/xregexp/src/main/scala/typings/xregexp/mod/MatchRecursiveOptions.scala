package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for when doing recursive matching.
  */
@js.native
trait MatchRecursiveOptions extends js.Object {
  
  /**
    * The escape character to use.
    *
    * **Must be exactly one character long.**
    */
  var escapeChar: js.UndefOr[String | Null] = js.native
  
  /**
    * The value names to associate with the matches.
    *
    * Specifying a value here will cause the `XRegExp.matchRecursive` method to
    * return and array of `XRegExp.MatchRecursiveValueNameMatch`
    */
  var valueNames: js.UndefOr[MatchRecursiveValueNames | Null] = js.native
}
object MatchRecursiveOptions {
  
  @scala.inline
  def apply(): MatchRecursiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchRecursiveOptions]
  }
  
  @scala.inline
  implicit class MatchRecursiveOptionsOps[Self <: MatchRecursiveOptions] (val x: Self) extends AnyVal {
    
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
    def setEscapeChar(value: String): Self = this.set("escapeChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeChar: Self = this.set("escapeChar", js.undefined)
    
    @scala.inline
    def setEscapeCharNull: Self = this.set("escapeChar", null)
    
    @scala.inline
    def setValueNames(value: MatchRecursiveValueNames): Self = this.set("valueNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueNames: Self = this.set("valueNames", js.undefined)
    
    @scala.inline
    def setValueNamesNull: Self = this.set("valueNames", null)
  }
}
