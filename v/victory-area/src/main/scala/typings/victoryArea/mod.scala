package typings.victoryArea

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.FC
import typings.victoryArea.anon.AddGlobalListener
import typings.victoryArea.anon.Instantiable
import typings.victoryArea.anon.TypeofVictoryAreaBase
import typings.victoryArea.areaMod.AreaProps
import typings.victoryArea.victoryAreaMod.VictoryAreaBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("victory-area/lib", "Area")
  @js.native
  val Area: FC[AreaProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("victory-area/lib", "VictoryArea")
  @js.native
  open class VictoryArea protected ()
    extends StObject
       with AddGlobalListener {
    def this(props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any) = this()
  }
  @JSImport("victory-area/lib", "VictoryArea")
  @js.native
  val VictoryArea: Instantiable & TypeofVictoryAreaBase & Instantiable0[VictoryAreaBase] = js.native
}
