package typings.victoryErrorbar

import org.scalablytyped.runtime.Instantiable0
import typings.victoryErrorbar.anon.AddGlobalListener
import typings.victoryErrorbar.anon.Instantiable
import typings.victoryErrorbar.anon.TypeofVictoryErrorBarBase
import typings.victoryErrorbar.libVictoryErrorbarMod.VictoryErrorBarBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("victory-errorbar/lib", "ErrorBar")
  @js.native
  val ErrorBar: Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("victory-errorbar/lib", "VictoryErrorBar")
  @js.native
  open class VictoryErrorBar protected ()
    extends StObject
       with AddGlobalListener {
    def this(props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any) = this()
  }
  @JSImport("victory-errorbar/lib", "VictoryErrorBar")
  @js.native
  val VictoryErrorBar: Instantiable & TypeofVictoryErrorBarBase & Instantiable0[VictoryErrorBarBase] = js.native
}
