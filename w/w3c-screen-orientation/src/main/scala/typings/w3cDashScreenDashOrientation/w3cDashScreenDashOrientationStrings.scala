package typings.w3cDashScreenDashOrientation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object w3cDashScreenDashOrientationStrings {
  @js.native
  sealed trait any extends ScreenOrientationLockType
  
  @js.native
  sealed trait change extends js.Object
  
  @js.native
  sealed trait landscape extends ScreenOrientationLockType
  
  @js.native
  sealed trait `landscape-primary`
    extends OrientationType
       with ScreenOrientationLockType
  
  @js.native
  sealed trait `landscape-secondary`
    extends OrientationType
       with ScreenOrientationLockType
  
  @js.native
  sealed trait natural extends ScreenOrientationLockType
  
  @js.native
  sealed trait portrait extends ScreenOrientationLockType
  
  @js.native
  sealed trait `portrait-primary`
    extends OrientationType
       with ScreenOrientationLockType
  
  @js.native
  sealed trait `portrait-secondary`
    extends OrientationType
       with ScreenOrientationLockType
  
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def landscape: landscape = "landscape".asInstanceOf[landscape]
  @scala.inline
  def `landscape-primary`: `landscape-primary` = "landscape-primary".asInstanceOf[`landscape-primary`]
  @scala.inline
  def `landscape-secondary`: `landscape-secondary` = "landscape-secondary".asInstanceOf[`landscape-secondary`]
  @scala.inline
  def natural: natural = "natural".asInstanceOf[natural]
  @scala.inline
  def portrait: portrait = "portrait".asInstanceOf[portrait]
  @scala.inline
  def `portrait-primary`: `portrait-primary` = "portrait-primary".asInstanceOf[`portrait-primary`]
  @scala.inline
  def `portrait-secondary`: `portrait-secondary` = "portrait-secondary".asInstanceOf[`portrait-secondary`]
}

