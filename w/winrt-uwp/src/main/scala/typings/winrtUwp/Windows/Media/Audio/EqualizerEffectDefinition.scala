package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an equalizer effect definition supported by the audio graph. */
@js.native
trait EqualizerEffectDefinition extends StObject {
  
  /** Gets the activatable class ID for the equalizer effect definition object. */
  var activatableClassId: String = js.native
  
  /** Gets the bands included in the equalizer effect definition. */
  var bands: IVectorView[EqualizerBand] = js.native
  
  /** Gets the properties supported by the equalizer effect definition. */
  var properties: IPropertySet = js.native
}
object EqualizerEffectDefinition {
  
  @scala.inline
  def apply(activatableClassId: String, bands: IVectorView[EqualizerBand], properties: IPropertySet): EqualizerEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], bands = bands.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqualizerEffectDefinition]
  }
  
  @scala.inline
  implicit class EqualizerEffectDefinitionMutableBuilder[Self <: EqualizerEffectDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBands(value: IVectorView[EqualizerBand]): Self = StObject.set(x, "bands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
