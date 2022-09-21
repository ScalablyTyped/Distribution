package typings.videojsContribQualityLevels

import typings.std.ArrayLike
import typings.videojsContribQualityLevels.mod.Representation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qualityLevelListMod {
  
  @JSImport("videojs-contrib-quality-levels/src/quality-level-list", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with QualityLevelList {
    
    /* CompleteClass */
    override def addQualityLevel(representation: Representation): typings.videojsContribQualityLevels.qualityLevelMod.default = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def getQualityLevelById(id: String): typings.videojsContribQualityLevels.qualityLevelMod.default | Null = js.native
    
    /* standard es5 */
    /* CompleteClass */
    override val length: Double = js.native
    
    /* CompleteClass */
    override def removeQualityLevel(representation: Representation): typings.videojsContribQualityLevels.qualityLevelMod.default | Null = js.native
    
    /* CompleteClass */
    override val selectedIndex: Double = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify videojs.EventTarget * / any */ trait QualityLevelList
    extends StObject
       with ArrayLike[typings.videojsContribQualityLevels.qualityLevelMod.default] {
    
    def addQualityLevel(representation: Representation): typings.videojsContribQualityLevels.qualityLevelMod.default
    
    def dispose(): Unit
    
    def getQualityLevelById(id: String): typings.videojsContribQualityLevels.qualityLevelMod.default | Null
    
    def removeQualityLevel(representation: Representation): typings.videojsContribQualityLevels.qualityLevelMod.default | Null
    
    val selectedIndex: Double
  }
  object QualityLevelList {
    
    inline def apply(
      addQualityLevel: Representation => typings.videojsContribQualityLevels.qualityLevelMod.default,
      dispose: () => Unit,
      getQualityLevelById: String => typings.videojsContribQualityLevels.qualityLevelMod.default | Null,
      length: Double,
      removeQualityLevel: Representation => typings.videojsContribQualityLevels.qualityLevelMod.default | Null,
      selectedIndex: Double
    ): QualityLevelList = {
      val __obj = js.Dynamic.literal(addQualityLevel = js.Any.fromFunction1(addQualityLevel), dispose = js.Any.fromFunction0(dispose), getQualityLevelById = js.Any.fromFunction1(getQualityLevelById), length = length.asInstanceOf[js.Any], removeQualityLevel = js.Any.fromFunction1(removeQualityLevel), selectedIndex = selectedIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[QualityLevelList]
    }
    
    extension [Self <: QualityLevelList](x: Self) {
      
      inline def setAddQualityLevel(value: Representation => typings.videojsContribQualityLevels.qualityLevelMod.default): Self = StObject.set(x, "addQualityLevel", js.Any.fromFunction1(value))
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setGetQualityLevelById(value: String => typings.videojsContribQualityLevels.qualityLevelMod.default | Null): Self = StObject.set(x, "getQualityLevelById", js.Any.fromFunction1(value))
      
      inline def setRemoveQualityLevel(value: Representation => typings.videojsContribQualityLevels.qualityLevelMod.default | Null): Self = StObject.set(x, "removeQualityLevel", js.Any.fromFunction1(value))
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    }
  }
}
