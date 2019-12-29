package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageNavigationAnimation with Double] = js.native
  /* 3 */ @js.native
  object continuum extends TopLevel[continuum with Double]
  
  /* 2 */ @js.native
  object enterPage extends TopLevel[enterPage with Double]
  
  /* 1 */ @js.native
  object slide extends TopLevel[slide with Double]
  
  /* 0 */ @js.native
  object turnstile extends TopLevel[turnstile with Double]
  
}

