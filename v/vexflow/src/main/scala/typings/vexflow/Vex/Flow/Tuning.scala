package typings.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tuning extends js.Object {
  
  def getNoteForFret(fretNum: String, stringNum: String): String = js.native
  
  def getValueForFret(fretNum: String, stringNum: String): Double = js.native
  
  def getValueForString(stringNum: String): Double = js.native
  
  def noteToInteger(noteString: String): Double = js.native
  
  def setTuning(tuningString: String): Unit = js.native
}
object Tuning {
  
  @scala.inline
  def apply(
    getNoteForFret: (String, String) => String,
    getValueForFret: (String, String) => Double,
    getValueForString: String => Double,
    noteToInteger: String => Double,
    setTuning: String => Unit
  ): Tuning = {
    val __obj = js.Dynamic.literal(getNoteForFret = js.Any.fromFunction2(getNoteForFret), getValueForFret = js.Any.fromFunction2(getValueForFret), getValueForString = js.Any.fromFunction1(getValueForString), noteToInteger = js.Any.fromFunction1(noteToInteger), setTuning = js.Any.fromFunction1(setTuning))
    __obj.asInstanceOf[Tuning]
  }
  
  @scala.inline
  implicit class TuningOps[Self <: Tuning] (val x: Self) extends AnyVal {
    
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
    def setGetNoteForFret(value: (String, String) => String): Self = this.set("getNoteForFret", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetValueForFret(value: (String, String) => Double): Self = this.set("getValueForFret", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetValueForString(value: String => Double): Self = this.set("getValueForString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNoteToInteger(value: String => Double): Self = this.set("noteToInteger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTuning(value: String => Unit): Self = this.set("setTuning", js.Any.fromFunction1(value))
  }
}
