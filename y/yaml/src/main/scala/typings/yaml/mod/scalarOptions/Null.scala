package typings.yaml.mod.scalarOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Null extends js.Object {
  
  /**
    * String representation for `null`. With the core schema, use `'null' | 'Null' | 'NULL' | '~' | ''`.
    *
    * Default: `'null'`
    */
  var nullStr: String = js.native
}
object Null {
  
  @scala.inline
  def apply(nullStr: String): Null = {
    val __obj = js.Dynamic.literal(nullStr = nullStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Null]
  }
  
  @scala.inline
  implicit class NullOps[Self <: Null] (val x: Self) extends AnyVal {
    
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
    def setNullStr(value: String): Self = this.set("nullStr", value.asInstanceOf[js.Any])
  }
}
