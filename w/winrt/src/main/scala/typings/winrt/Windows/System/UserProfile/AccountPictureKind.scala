package typings.winrt.Windows.System.UserProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AccountPictureKind extends js.Object
@JSGlobal("Windows.System.UserProfile.AccountPictureKind")
@js.native
object AccountPictureKind extends js.Object {
  
  @js.native
  sealed trait largeImage extends AccountPictureKind
  
  @js.native
  sealed trait smallImage extends AccountPictureKind
  
  @js.native
  sealed trait video extends AccountPictureKind
}
