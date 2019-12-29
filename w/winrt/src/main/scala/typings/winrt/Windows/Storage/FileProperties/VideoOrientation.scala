package typings.winrt.Windows.Storage.FileProperties

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoOrientation extends js.Object

@JSGlobal("Windows.Storage.FileProperties.VideoOrientation")
@js.native
object VideoOrientation extends js.Object {
  @js.native
  sealed trait normal extends VideoOrientation
  
  @js.native
  sealed trait rotate180 extends VideoOrientation
  
  @js.native
  sealed trait rotate270 extends VideoOrientation
  
  @js.native
  sealed trait rotate90 extends VideoOrientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoOrientation with Double] = js.native
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 2 */ @js.native
  object rotate180 extends TopLevel[rotate180 with Double]
  
  /* 3 */ @js.native
  object rotate270 extends TopLevel[rotate270 with Double]
  
  /* 1 */ @js.native
  object rotate90 extends TopLevel[rotate90 with Double]
  
}

