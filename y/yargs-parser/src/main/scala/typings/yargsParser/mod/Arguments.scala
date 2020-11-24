package typings.yargsParser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arguments
  extends /** All remaining options */
/* argName */ StringDictionary[js.Any] {
  
  /** The script name or node command */
  @JSName("$0")
  var $0: String = js.native
  
  /** Non-option arguments */
  @JSName("_")
  var _underscore: js.Array[String] = js.native
}
object Arguments {
  
  @scala.inline
  def apply($0: String, _underscore: js.Array[String]): Arguments = {
    val __obj = js.Dynamic.literal($0 = $0.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arguments]
  }
  
  @scala.inline
  implicit class ArgumentsOps[Self <: Arguments] (val x: Self) extends AnyVal {
    
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
    def set$0(value: String): Self = this.set("$0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_underscoreVarargs(value: String*): Self = this.set("_", js.Array(value :_*))
    
    @scala.inline
    def set_underscore(value: js.Array[String]): Self = this.set("_", value.asInstanceOf[js.Any])
  }
}
