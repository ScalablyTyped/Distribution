package typings.toTitleCaseGouch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait String extends js.Object {
  
  def toTitleCase(): java.lang.String = js.native
}
object String {
  
  @scala.inline
  def apply(toTitleCase: () => java.lang.String): String = {
    val __obj = js.Dynamic.literal(toTitleCase = js.Any.fromFunction0(toTitleCase))
    __obj.asInstanceOf[String]
  }
  
  @scala.inline
  implicit class StringOps[Self <: String] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setToTitleCase(value: () => java.lang.String): Self = this.set("toTitleCase", js.Any.fromFunction0(value))
  }
}
