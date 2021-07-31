package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locked extends StObject {
  
  var builtIn: scala.Double
  
  var disabled: scala.Double
  
  var locked: scala.Double
  
  var multiVersion: scala.Double
  
  var none: scala.Double
  
  var paid: scala.Double
  
  var preview: scala.Double
  
  var public: scala.Double
  
  var system: scala.Double
  
  var trial: scala.Double
  
  var trusted: scala.Double
  
  var unpublished: scala.Double
  
  var validated: scala.Double
}
object Locked {
  
  @scala.inline
  def apply(
    builtIn: scala.Double,
    disabled: scala.Double,
    locked: scala.Double,
    multiVersion: scala.Double,
    none: scala.Double,
    paid: scala.Double,
    preview: scala.Double,
    public: scala.Double,
    system: scala.Double,
    trial: scala.Double,
    trusted: scala.Double,
    unpublished: scala.Double,
    validated: scala.Double
  ): Locked = {
    val __obj = js.Dynamic.literal(builtIn = builtIn.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], multiVersion = multiVersion.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], trial = trial.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], unpublished = unpublished.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locked]
  }
  
  @scala.inline
  implicit class LockedMutableBuilder[Self <: Locked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuiltIn(value: scala.Double): Self = StObject.set(x, "builtIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: scala.Double): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: scala.Double): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiVersion(value: scala.Double): Self = StObject.set(x, "multiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaid(value: scala.Double): Self = StObject.set(x, "paid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview(value: scala.Double): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic(value: scala.Double): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: scala.Double): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrial(value: scala.Double): Self = StObject.set(x, "trial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrusted(value: scala.Double): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpublished(value: scala.Double): Self = StObject.set(x, "unpublished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidated(value: scala.Double): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
  }
}
