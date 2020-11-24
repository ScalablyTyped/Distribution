package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An effective date. */
@js.native
trait EffectiveDates extends js.Object {
  
  /** The confidence level in the identification of the effective date. */
  var confidence_level: js.UndefOr[String] = js.native
  
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.native
  
  /** The effective date, listed as a string. */
  var text: js.UndefOr[String] = js.native
}
object EffectiveDates {
  
  @scala.inline
  def apply(): EffectiveDates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectiveDates]
  }
  
  @scala.inline
  implicit class EffectiveDatesOps[Self <: EffectiveDates] (val x: Self) extends AnyVal {
    
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
    def setConfidence_level(value: String): Self = this.set("confidence_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence_level: Self = this.set("confidence_level", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
