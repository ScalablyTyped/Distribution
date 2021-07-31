package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PageNavigationAnimation extends StObject
/**
  * Specifies what animation type should be returned by WinJS.UI.Animation.createPageNavigationAnimations.
  **/
@JSGlobal("WinJS.UI.PageNavigationAnimation")
@js.native
object PageNavigationAnimation extends StObject {
  
  /**
    * The pages will exit and enter using a continuum animation.
    **/
  @js.native
  sealed trait continuum
    extends StObject
       with PageNavigationAnimation
  
  /**
    * The pages will enter using an enterPage animation, and exit with no animation.
    **/
  @js.native
  sealed trait enterPage
    extends StObject
       with PageNavigationAnimation
  
  /**
    * The pages will exit and enter using an animation that slides up/down.
    **/
  @js.native
  sealed trait slide
    extends StObject
       with PageNavigationAnimation
  
  /**
    * The pages will exit and enter using a turnstile animation.
    **/
  @js.native
  sealed trait turnstile
    extends StObject
       with PageNavigationAnimation
}
