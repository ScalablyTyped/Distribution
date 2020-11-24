package typings.typeorm.browserMod

import typings.typeorm.objectTypeMod.ObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "getCustomRepository")
@js.native
object getCustomRepository extends js.Object {
  
  def apply[T](customRepository: ObjectType[T]): T = js.native
  def apply[T](customRepository: ObjectType[T], connectionName: String): T = js.native
}
