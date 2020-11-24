package typings.superError.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuperError
  extends Error
     with /* k */ StringDictionary[js.Any] {
  
  def causedBy(err: Error): this.type = js.native
}
object SuperError {
  
  @scala.inline
  def apply(causedBy: Error => SuperError, message: String, name: String): SuperError = {
    val __obj = js.Dynamic.literal(causedBy = js.Any.fromFunction1(causedBy), message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuperError]
  }
  
  @scala.inline
  implicit class SuperErrorOps[Self <: SuperError] (val x: Self) extends AnyVal {
    
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
    def setCausedBy(value: Error => SuperError): Self = this.set("causedBy", js.Any.fromFunction1(value))
  }
}
