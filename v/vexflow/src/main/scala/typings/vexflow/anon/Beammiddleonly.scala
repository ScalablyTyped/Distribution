package typings.vexflow.anon

import typings.vexflow.Vex.Flow.Fraction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beammiddleonly extends StObject {
  
  var beam_middle_only: js.UndefOr[Boolean] = js.undefined
  
  var beam_rests: js.UndefOr[Boolean] = js.undefined
  
  var groups: js.UndefOr[js.Array[Fraction]] = js.undefined
  
  var maintain_stem_directions: js.UndefOr[Boolean] = js.undefined
  
  var show_stemlets: js.UndefOr[Boolean] = js.undefined
  
  var stem_direction: js.UndefOr[Double] = js.undefined
}
object Beammiddleonly {
  
  @scala.inline
  def apply(): Beammiddleonly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Beammiddleonly]
  }
  
  @scala.inline
  implicit class BeammiddleonlyMutableBuilder[Self <: Beammiddleonly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeam_middle_only(value: Boolean): Self = StObject.set(x, "beam_middle_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeam_middle_onlyUndefined: Self = StObject.set(x, "beam_middle_only", js.undefined)
    
    @scala.inline
    def setBeam_rests(value: Boolean): Self = StObject.set(x, "beam_rests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeam_restsUndefined: Self = StObject.set(x, "beam_rests", js.undefined)
    
    @scala.inline
    def setGroups(value: js.Array[Fraction]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: Fraction*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setMaintain_stem_directions(value: Boolean): Self = StObject.set(x, "maintain_stem_directions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintain_stem_directionsUndefined: Self = StObject.set(x, "maintain_stem_directions", js.undefined)
    
    @scala.inline
    def setShow_stemlets(value: Boolean): Self = StObject.set(x, "show_stemlets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_stemletsUndefined: Self = StObject.set(x, "show_stemlets", js.undefined)
    
    @scala.inline
    def setStem_direction(value: Double): Self = StObject.set(x, "stem_direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStem_directionUndefined: Self = StObject.set(x, "stem_direction", js.undefined)
  }
}
