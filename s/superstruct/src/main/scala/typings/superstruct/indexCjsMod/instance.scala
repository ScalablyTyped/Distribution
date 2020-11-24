package typings.superstruct.indexCjsMod

import typings.std.InstanceType
import typings.superstruct.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.cjs", "instance")
@js.native
object instance extends js.Object {
  
  /**
    * Validate that a value is an instance of a class.
    */
  def apply[T /* <: Instantiable */](Class: T): Struct_[InstanceType[T], _] = js.native
}
