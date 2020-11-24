package typings.stylelintWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  timestamp :number}> */
@js.native
trait Partialtimestampnumber extends js.Object {
  
  var timestamp: js.UndefOr[Double] = js.native
}
object Partialtimestampnumber {
  
  @scala.inline
  def apply(): Partialtimestampnumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialtimestampnumber]
  }
  
  @scala.inline
  implicit class PartialtimestampnumberOps[Self <: Partialtimestampnumber] (val x: Self) extends AnyVal {
    
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
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}
