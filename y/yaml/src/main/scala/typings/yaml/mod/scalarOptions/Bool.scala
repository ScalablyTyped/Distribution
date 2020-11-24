package typings.yaml.mod.scalarOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bool extends js.Object {
  
  /**
    * String representation for `false`. With the core schema, use `'false' | 'False' | 'FALSE'`.
    *
    * Default: `'false'`
    */
  var falseStr: String = js.native
  
  /**
    * String representation for `true`. With the core schema, use `'true' | 'True' | 'TRUE'`.
    *
    * Default: `'true'`
    */
  var trueStr: String = js.native
}
object Bool {
  
  @scala.inline
  def apply(falseStr: String, trueStr: String): Bool = {
    val __obj = js.Dynamic.literal(falseStr = falseStr.asInstanceOf[js.Any], trueStr = trueStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bool]
  }
  
  @scala.inline
  implicit class BoolOps[Self <: Bool] (val x: Self) extends AnyVal {
    
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
    def setFalseStr(value: String): Self = this.set("falseStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueStr(value: String): Self = this.set("trueStr", value.asInstanceOf[js.Any])
  }
}
