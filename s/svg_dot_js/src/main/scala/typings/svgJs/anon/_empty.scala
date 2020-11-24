package typings.svgJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _empty extends js.Object {
  
  @JSName(">")
  def Greaterthansign(pos: Double): Double = js.native
  
  @JSName("<")
  def Lessthansign(pos: Double): Double = js.native
  
  @JSName("<>")
  def LessthansignGreaterthansign(pos: Double): Double = js.native
  
  @JSName("-")
  def _dash(pos: Double): Double = js.native
}
object _empty {
  
  @scala.inline
  def apply(
    Greaterthansign: Double => Double,
    Lessthansign: Double => Double,
    LessthansignGreaterthansign: Double => Double,
    _dash: Double => Double
  ): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(">")(js.Any.fromFunction1(Greaterthansign))
    __obj.updateDynamic("<")(js.Any.fromFunction1(Lessthansign))
    __obj.updateDynamic("<>")(js.Any.fromFunction1(LessthansignGreaterthansign))
    __obj.updateDynamic("-")(js.Any.fromFunction1(_dash))
    __obj.asInstanceOf[_empty]
  }
  
  @scala.inline
  implicit class _emptyOps[Self <: _empty] (val x: Self) extends AnyVal {
    
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
    def setGreaterthansign(value: Double => Double): Self = this.set(">", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLessthansign(value: Double => Double): Self = this.set("<", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLessthansignGreaterthansign(value: Double => Double): Self = this.set("<>", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_dash(value: Double => Double): Self = this.set("-", js.Any.fromFunction1(value))
  }
}
