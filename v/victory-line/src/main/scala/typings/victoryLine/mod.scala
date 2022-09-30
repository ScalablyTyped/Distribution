package typings.victoryLine

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.FC
import typings.victoryLine.anon.AddGlobalListener
import typings.victoryLine.anon.Instantiable
import typings.victoryLine.anon.TypeofVictoryLineBase
import typings.victoryLine.curveMod.CurveProps
import typings.victoryLine.victoryLineMod.VictoryLineBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("victory-line/lib", "Curve")
  @js.native
  val Curve: FC[CurveProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("victory-line/lib", "VictoryLine")
  @js.native
  open class VictoryLine protected ()
    extends StObject
       with AddGlobalListener {
    def this(props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any) = this()
  }
  @JSImport("victory-line/lib", "VictoryLine")
  @js.native
  val VictoryLine: Instantiable & TypeofVictoryLineBase & (Instantiable1[/* props */ Any, VictoryLineBase]) = js.native
}
