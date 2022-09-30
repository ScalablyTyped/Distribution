package typings.victoryCore

import typings.victoryCore.propTypesMod.AnimatePropTypeInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultTransitionsMod {
  
  @JSImport("victory-core/lib/victory-util/default-transitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def continuousPolarTransitions(): AnimatePropTypeInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("continuousPolarTransitions")().asInstanceOf[AnimatePropTypeInterface]
  
  inline def continuousTransitions(): AnimatePropTypeInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("continuousTransitions")().asInstanceOf[AnimatePropTypeInterface]
  
  inline def discreteTransitions(): AnimatePropTypeInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("discreteTransitions")().asInstanceOf[AnimatePropTypeInterface]
}
