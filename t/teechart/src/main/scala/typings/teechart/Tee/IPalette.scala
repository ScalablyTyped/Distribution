package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPalette extends js.Object {
  
  var colors: js.Array[String] = js.native
  
  def get(index: Double): String = js.native
}
object IPalette {
  
  @scala.inline
  def apply(colors: js.Array[String], get: Double => String): IPalette = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[IPalette]
  }
  
  @scala.inline
  implicit class IPaletteOps[Self <: IPalette] (val x: Self) extends AnyVal {
    
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
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: Double => String): Self = this.set("get", js.Any.fromFunction1(value))
  }
}
