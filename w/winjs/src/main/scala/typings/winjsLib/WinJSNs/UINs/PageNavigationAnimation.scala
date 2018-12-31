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
  
  val continuum: continuum with java.lang.String = js.native
  val enterPage: enterPage with java.lang.String = js.native
  val slide: slide with java.lang.String = js.native
  val turnstile: turnstile with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winjsLib.WinJSNs.UINs.PageNavigationAnimation with java.lang.String] = js.native
}

