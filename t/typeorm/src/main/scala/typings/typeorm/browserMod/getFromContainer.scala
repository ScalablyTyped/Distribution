package typings.typeorm.browserMod

import typings.typeorm.containerMod.ContainedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "getFromContainer")
@js.native
object getFromContainer extends js.Object {
  
  def apply[T](someClass: ContainedType[T]): T = js.native
}
