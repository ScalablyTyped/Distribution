package typings.winrt.Windows.UI.Core.AnimationMetrics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PropertyAnimationType extends StObject
@JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimationType")
@js.native
object PropertyAnimationType extends StObject {
  
  @js.native
  sealed trait opacity
    extends StObject
       with PropertyAnimationType
  
  @js.native
  sealed trait scale
    extends StObject
       with PropertyAnimationType
  
  @js.native
  sealed trait translation
    extends StObject
       with PropertyAnimationType
}
