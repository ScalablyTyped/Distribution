package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Beatvalue extends js.Object {
  
  var beat_value: js.UndefOr[Double] = js.native
  
  var num_beats: js.UndefOr[Double] = js.native
  
  var resolution: js.UndefOr[Double] = js.native
}
object Beatvalue {
  
  @scala.inline
  def apply(): Beatvalue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Beatvalue]
  }
  
  @scala.inline
  implicit class BeatvalueOps[Self <: Beatvalue] (val x: Self) extends AnyVal {
    
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
    def setBeat_value(value: Double): Self = this.set("beat_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeat_value: Self = this.set("beat_value", js.undefined)
    
    @scala.inline
    def setNum_beats(value: Double): Self = this.set("num_beats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNum_beats: Self = this.set("num_beats", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
  }
}
