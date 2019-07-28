package typings.winjs.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageNavigationAnimation extends js.Object

/**
  * Specifies what animation type should be returned by WinJS.UI.Animation.createPageNavigationAnimations.
  **/
@JSGlobal("WinJS.UI.PageNavigationAnimation")
@js.native
object PageNavigationAnimation extends js.Object {
  /**
    * The pages will exit and enter using a continuum animation.
    **/
  @js.native
  sealed trait continuum extends PageNavigationAnimation
  
  /**
    * The pages will enter using an enterPage animation, and exit with no animation.
    **/
  @js.native
  sealed trait enterPage extends PageNavigationAnimation
  
  /**
    * The pages will exit and enter using an animation that slides up/down.
    **/
  @js.native
  sealed trait slide extends PageNavigationAnimation
  
  /**
    * The pages will exit and enter using a turnstile animation.
    **/
  @js.native
  sealed trait turnstile extends PageNavigationAnimation
  
  /* 3 */ val continuum: typings.winjs.WinJSNs.UINs.PageNavigationAnimation.continuum with Double = js.native
  /* 2 */ val enterPage: typings.winjs.WinJSNs.UINs.PageNavigationAnimation.enterPage with Double = js.native
  /* 1 */ val slide: typings.winjs.WinJSNs.UINs.PageNavigationAnimation.slide with Double = js.native
  /* 0 */ val turnstile: typings.winjs.WinJSNs.UINs.PageNavigationAnimation.turnstile with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageNavigationAnimation with Double] = js.native
}

