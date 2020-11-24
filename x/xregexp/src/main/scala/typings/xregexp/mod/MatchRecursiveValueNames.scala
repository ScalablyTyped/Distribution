package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Value names for recursive matching parts.
  */
@js.native
trait MatchRecursiveValueNames extends js.Object {
  
  /**
    * Name for the unmatched portion of string leading up to `left` delimiter.
    */
  var `0`: String | Null = js.native
  
  /**
    * Name for the `left` delimiter.
    */
  var `1`: String | Null = js.native
  
  /**
    * Name for the portion of the string inside the `left` and `right` delimiters.
    */
  var `2`: String | Null = js.native
  
  /**
    * Name for the `right` delimiter.
    */
  var `3`: String | Null = js.native
}
object MatchRecursiveValueNames {
  
  @scala.inline
  def apply(): MatchRecursiveValueNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchRecursiveValueNames]
  }
  
  @scala.inline
  implicit class MatchRecursiveValueNamesOps[Self <: MatchRecursiveValueNames] (val x: Self) extends AnyVal {
    
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
    def set0(value: String): Self = this.set("0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set0Null: Self = this.set("0", null)
    
    @scala.inline
    def set1(value: String): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1Null: Self = this.set("1", null)
    
    @scala.inline
    def set2(value: String): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2Null: Self = this.set("2", null)
    
    @scala.inline
    def set3(value: String): Self = this.set("3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3Null: Self = this.set("3", null)
  }
}
