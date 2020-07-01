package typings.superstruct

import typings.superstruct.structErrorMod.Branch
import typings.superstruct.structErrorMod.Path
import typings.superstruct.structMod.Struct
import typings.superstruct.superstructMod.Superstruct_
import typings.superstruct.typesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/index", JSImport.Namespace)
@js.native
object indexMod extends js.Object {
  def createArray(schema: js.Array[_], defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createDynamic(
    schema: js.Function3[/* value */ js.Any, /* branch */ Branch, /* path */ Path, Struct],
    defaults: js.Any,
    struct: Superstruct_
  ): Struct = js.native
  def createEnum(schema: js.Array[_], defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createFunction(schema: Validator, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createInstance(schema: js.Any, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createInterface(schema: js.Any, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createIntersection(schema: js.Array[_], defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createLazy(schema: js.Function0[Struct], defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createLiteral(schema: js.Any, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createObject(schema: js.Object, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createPartial(schema: js.Object, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createPick(schema: js.Object, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createRecord(schema: js.Tuple2[_, _], defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createScalar(schema: String, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createShorthand(schema: js.Any, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createSize(schema: js.Tuple2[Double, Double], defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createTuple(schema: js.Array[_], defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createUnion(schema: js.Array[_], defaults: js.Any, struct: Superstruct_): Struct = js.native
}

