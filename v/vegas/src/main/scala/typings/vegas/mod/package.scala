package typings.vegas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegas.vegasStrings.center
    - typings.vegas.vegasStrings.top
    - typings.vegas.vegasStrings.right
    - typings.vegas.vegasStrings.bottom
    - typings.vegas.vegasStrings.left
    - scala.Double
  */
  type AlignType = typings.vegas.mod._AlignType | scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegas.mod.Animation
    - typings.vegas.vegasStrings.random
    - js.Array[typings.vegas.mod.Animation]
  */
  type AnimationType = typings.vegas.mod._AnimationType | js.Array[typings.vegas.mod.Animation]
  
  type Duration = typings.vegas.vegasStrings.auto | scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegas.mod.Transition
    - typings.vegas.vegasStrings.random
    - js.Array[typings.vegas.mod.Transition]
  */
  type TransitionType = typings.vegas.mod._TransitionType | js.Array[typings.vegas.mod.Transition]
  
  type VegasEnd = typings.vegas.vegasStrings.vegasend
  
  type VegasInitEvent = typings.vegas.vegasStrings.vegasinit
  
  type VegasInitHnalder[TElement] = typings.jquery.JQuery.TriggeredEvent[TElement, js.UndefOr[scala.Nothing], typings.std.HTMLElement, typings.std.HTMLElement]
  
  type VegasPause = typings.vegas.vegasStrings.vegaspause
  
  type VegasPlay = typings.vegas.vegasStrings.vegasplay
  
  type VegasWalk = typings.vegas.vegasStrings.vegaswalk
}
