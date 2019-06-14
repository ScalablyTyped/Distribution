package typings
package winjsLib.WinJSNs.UINs

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
  sealed trait continuum
    extends winjsLib.WinJSNs.UINs.PageNavigationAnimation
  
  /**
    * The pages will enter using an enterPage animation, and exit with no animation.
    **/
  @js.native
  sealed trait enterPage
    extends winjsLib.WinJSNs.UINs.PageNavigationAnimation
  
  /**
    * The pages will exit and enter using an animation that slides up/down.
    **/
  @js.native
  sealed trait slide
    extends winjsLib.WinJSNs.UINs.PageNavigationAnimation
  
  /**
    * The pages will exit and enter using a turnstile animation.
    **/
  @js.native
  sealed trait turnstile
    extends winjsLib.WinJSNs.UINs.PageNavigationAnimation
  
  /* 3 */ val continuum: continuum with scala.Double = js.native
  /* 2 */ val enterPage: enterPage with scala.Double = js.native
  /* 1 */ val slide: slide with scala.Double = js.native
  /* 0 */ val turnstile: turnstile with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.PageNavigationAnimation with scala.Double] = js.native
}

