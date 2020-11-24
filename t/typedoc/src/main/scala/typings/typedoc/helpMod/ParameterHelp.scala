package typings.typedoc.helpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterHelp extends js.Object {
  
  var helps: js.Array[String] = js.native
  
  var margin: Double = js.native
  
  var names: js.Array[String] = js.native
}
object ParameterHelp {
  
  @scala.inline
  def apply(helps: js.Array[String], margin: Double, names: js.Array[String]): ParameterHelp = {
    val __obj = js.Dynamic.literal(helps = helps.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterHelp]
  }
  
  @scala.inline
  implicit class ParameterHelpOps[Self <: ParameterHelp] (val x: Self) extends AnyVal {
    
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
    def setHelpsVarargs(value: String*): Self = this.set("helps", js.Array(value :_*))
    
    @scala.inline
    def setHelps(value: js.Array[String]): Self = this.set("helps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
  }
}
