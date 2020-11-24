package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clef extends js.Object {
  
  var auto_stem: js.UndefOr[Boolean] = js.native
  
  var clef: js.UndefOr[String] = js.native
  
  var dots: js.UndefOr[Double] = js.native
  
  var duration: String = js.native
  
  var keys: js.Array[String] = js.native
  
  var octave_shift: js.UndefOr[Double] = js.native
  
  var stem_direction: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Clef {
  
  @scala.inline
  def apply(duration: String, keys: js.Array[String]): Clef = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clef]
  }
  
  @scala.inline
  implicit class ClefOps[Self <: Clef] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_stem(value: Boolean): Self = this.set("auto_stem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto_stem: Self = this.set("auto_stem", js.undefined)
    
    @scala.inline
    def setClef(value: String): Self = this.set("clef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClef: Self = this.set("clef", js.undefined)
    
    @scala.inline
    def setDots(value: Double): Self = this.set("dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    
    @scala.inline
    def setOctave_shift(value: Double): Self = this.set("octave_shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOctave_shift: Self = this.set("octave_shift", js.undefined)
    
    @scala.inline
    def setStem_direction(value: Double): Self = this.set("stem_direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStem_direction: Self = this.set("stem_direction", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
