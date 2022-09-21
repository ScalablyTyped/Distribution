package typings.videojsContribQualityLevels

import typings.videojsContribQualityLevels.mod.Representation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qualityLevelMod {
  
  @JSImport("videojs-contrib-quality-levels/src/quality-level", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with QualityLevel {
    def this(representation: Representation) = this()
    
    /* CompleteClass */
    override val bitrate: Double = js.native
    
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /* CompleteClass */
    override val id: String = js.native
    
    /* CompleteClass */
    override val label: String = js.native
  }
  
  trait QualityLevel extends StObject {
    
    val bitrate: Double
    
    var enabled: Boolean
    
    val height: js.UndefOr[Double] = js.undefined
    
    val id: String
    
    val label: String
    
    val width: js.UndefOr[Double] = js.undefined
  }
  object QualityLevel {
    
    inline def apply(bitrate: Double, enabled: Boolean, id: String, label: String): QualityLevel = {
      val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[QualityLevel]
    }
    
    extension [Self <: QualityLevel](x: Self) {
      
      inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
