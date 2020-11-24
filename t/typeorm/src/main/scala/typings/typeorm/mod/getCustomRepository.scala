package typings.typeorm.mod

import typings.typeorm.commonObjectTypeMod.ObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "getCustomRepository")
@js.native
object getCustomRepository extends js.Object {
  
  def apply[T](customRepository: ObjectType[T]): T = js.native
  def apply[T](customRepository: ObjectType[T], connectionName: String): T = js.native
}
