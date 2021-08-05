package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Family
import typings.vexflow.anon.Firstindices
import typings.vexflow.anon.Firstxpx
import typings.vexflow.anon.Lastindices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabSlide
  extends StObject
     with TabTie
object TabSlide {
  
  inline def apply(
    createHammeron: Firstindices => TabTie,
    createPulloff: Firstindices => TabTie,
    draw: () => Boolean,
    isPartial: () => Boolean,
    renderText: (Double, Double) => Unit,
    renderTie: Firstxpx => Unit,
    setContext: IRenderContext => StaveTie,
    setFont: Family => StaveTie,
    setNotes: Lastindices => StaveTie
  ): TabSlide = {
    val __obj = js.Dynamic.literal(createHammeron = js.Any.fromFunction1(createHammeron), createPulloff = js.Any.fromFunction1(createPulloff), draw = js.Any.fromFunction0(draw), isPartial = js.Any.fromFunction0(isPartial), renderText = js.Any.fromFunction2(renderText), renderTie = js.Any.fromFunction1(renderTie), setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction1(setFont), setNotes = js.Any.fromFunction1(setNotes))
    __obj.asInstanceOf[TabSlide]
  }
}
