package typings.videojsHlsQualitySelector

import typings.videojsHlsQualitySelector.mod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcConcreteButtonMod {
  
  @JSImport("videojs-hls-quality-selector/src/ConcreteButton", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ConcreteButton {
    /**
      * Button constructor.
      *
      * @param player - videojs player instance
      */
    def this(player: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify videojs.Player */ Any) = this()
    
    /**
      * Creates button items.
      *
      * @return  Button items
      */
    /* CompleteClass */
    override def createItems(): js.Array[Item] = js.native
    
    /**
      * Create the menu and add all items to it.
      *
      * @return
      *         The constructed menu
      */
    /* CompleteClass */
    override def createMenu(): Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify videojs.Button * / any */ trait ConcreteButton extends StObject {
    
    /**
      * Creates button items.
      *
      * @return  Button items
      */
    def createItems(): js.Array[Item]
    
    /**
      * Create the menu and add all items to it.
      *
      * @return
      *         The constructed menu
      */
    def createMenu(): Any
  }
  object ConcreteButton {
    
    inline def apply(createItems: () => js.Array[Item], createMenu: () => Any): ConcreteButton = {
      val __obj = js.Dynamic.literal(createItems = js.Any.fromFunction0(createItems), createMenu = js.Any.fromFunction0(createMenu))
      __obj.asInstanceOf[ConcreteButton]
    }
    
    extension [Self <: ConcreteButton](x: Self) {
      
      inline def setCreateItems(value: () => js.Array[Item]): Self = StObject.set(x, "createItems", js.Any.fromFunction0(value))
      
      inline def setCreateMenu(value: () => Any): Self = StObject.set(x, "createMenu", js.Any.fromFunction0(value))
    }
  }
}
