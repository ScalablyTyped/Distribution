package typings.vegaTypings.transformMod

import typings.vegaTypings.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceLink
  extends StObject
     with Force {
  
  var distance: js.UndefOr[Double | SignalRef | ExprRef] = js.undefined
  
  var force: link
  
  var id: js.UndefOr[FieldRef] = js.undefined
  
  var iterations: js.UndefOr[Double | SignalRef] = js.undefined
  
  var links: js.UndefOr[DataName] = js.undefined
  
  var strength: js.UndefOr[Double | SignalRef | ExprRef] = js.undefined
}
object ForceLink {
  
  @scala.inline
  def apply(): ForceLink = {
    val __obj = js.Dynamic.literal(force = "link")
    __obj.asInstanceOf[ForceLink]
  }
  
  @scala.inline
  implicit class ForceLinkMutableBuilder[Self <: ForceLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double | SignalRef | ExprRef): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setForce(value: link): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FieldRef): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIterations(value: Double | SignalRef): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    @scala.inline
    def setLinks(value: DataName): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setStrength(value: Double | SignalRef | ExprRef): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
  }
}
