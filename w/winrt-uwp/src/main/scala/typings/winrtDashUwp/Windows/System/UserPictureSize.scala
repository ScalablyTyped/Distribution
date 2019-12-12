package typings.winrtDashUwp.Windows.System

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.System.UserPictureSize.size1080x1080
import typings.winrtDashUwp.Windows.System.UserPictureSize.size208x208
import typings.winrtDashUwp.Windows.System.UserPictureSize.size424x424
import typings.winrtDashUwp.Windows.System.UserPictureSize.size64x64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserPictureSize extends js.Object

/** Represents user picture sizes. */
@JSGlobal("Windows.System.UserPictureSize")
@js.native
object UserPictureSize extends js.Object {
  /** The picture size is 1080x1080. */
  @js.native
  sealed trait size1080x1080 extends UserPictureSize
  
  /** The picture size is 208x208. */
  @js.native
  sealed trait size208x208 extends UserPictureSize
  
  /** The picture size is 424x424. */
  @js.native
  sealed trait size424x424 extends UserPictureSize
  
  /** The picture size is 64x64. */
  @js.native
  sealed trait size64x64 extends UserPictureSize
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserPictureSize with Double] = js.native
  /* 3 */ @js.native
  object size1080x1080 extends TopLevel[size1080x1080 with Double]
  
  /* 1 */ @js.native
  object size208x208 extends TopLevel[size208x208 with Double]
  
  /* 2 */ @js.native
  object size424x424 extends TopLevel[size424x424 with Double]
  
  /* 0 */ @js.native
  object size64x64 extends TopLevel[size64x64 with Double]
  
}

