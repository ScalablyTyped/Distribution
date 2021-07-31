package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserPictureSize extends StObject
/** Represents user picture sizes. */
@JSGlobal("Windows.System.UserPictureSize")
@js.native
object UserPictureSize extends StObject {
  
  /** The picture size is 1080x1080. */
  @js.native
  sealed trait size1080x1080
    extends StObject
       with UserPictureSize
  
  /** The picture size is 208x208. */
  @js.native
  sealed trait size208x208
    extends StObject
       with UserPictureSize
  
  /** The picture size is 424x424. */
  @js.native
  sealed trait size424x424
    extends StObject
       with UserPictureSize
  
  /** The picture size is 64x64. */
  @js.native
  sealed trait size64x64
    extends StObject
       with UserPictureSize
}
