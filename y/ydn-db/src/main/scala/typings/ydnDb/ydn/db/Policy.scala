package typings.ydnDb.ydn.db

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Policy extends js.Object

@JSGlobal("ydn.db.Policy")
@js.native
object Policy extends js.Object {
  @js.native
  sealed trait all extends Policy
  
  @js.native
  sealed trait atomic extends Policy
  
  @js.native
  sealed trait multi extends Policy
  
  @js.native
  sealed trait repeat extends Policy
  
  @js.native
  sealed trait single extends Policy
  
}

