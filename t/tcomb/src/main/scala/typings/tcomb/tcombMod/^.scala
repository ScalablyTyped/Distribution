package typings.tcomb.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcomb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Any: Irreducible[js.Any] = js.native
  var Array: Irreducible[js.Array[js.Any]] = js.native
  var Boolean: Irreducible[scala.Boolean] = js.native
  var Date: Irreducible[typings.std.Date] = js.native
  var Error: Irreducible[typings.std.Error] = js.native
  var Function: Irreducible[js.Function] = js.native
  var Integer: Irreducible[Double] = js.native
  var Nil: Irreducible[Unit | Null] = js.native
  var Number: Irreducible[Double] = js.native
  var Object: Irreducible[js.Object] = js.native
  var RegExp: Irreducible[typings.std.RegExp] = js.native
  var String: Irreducible[java.lang.String] = js.native
  var enums: EnumsFunction = js.native
  var update: Update[js.Object] = js.native
  def assert(guard: Boolean): Unit = js.native
  def assert(guard: Boolean, message: String): Unit = js.native
  def assert(guard: Boolean, message: LazyMessage): Unit = js.native
  def declare[T](): Declare[T] = js.native
  def declare[T](name: String): Declare[T] = js.native
  def dict[T](domain: Constructor[String], codomain: Constructor[T]): Dict[T] = js.native
  def dict[T](domain: Constructor[String], codomain: Constructor[T], name: String): Dict[T] = js.native
  def fail(message: String): Unit = js.native
  def getTypeName[T](x: Constructor[T]): String = js.native
  def interface[T](props: StructProps): Interface[T] = js.native
  def interface[T](props: StructProps, name: String): Interface[T] = js.native
  def interface[T](props: StructProps, name: StructOptions): Interface[T] = js.native
  def intersection[T](types: js.Array[Constructor[_]]): Intersection[T] = js.native
  def intersection[T](types: js.Array[Constructor[_]], name: String): Intersection[T] = js.native
  def irreducible[T](name: String, predicate: Predicate[_]): Irreducible[T] = js.native
  def is[T](x: js.Any, `type`: Constructor[T]): Boolean = js.native
  def isType[T](x: Constructor[T]): Boolean = js.native
  def list[T](`type`: Constructor[T]): List[T] = js.native
  def list[T](`type`: Constructor[T], name: String): List[T] = js.native
  def `match`(x: js.Any, clauses: Clause*): js.Any = js.native
  def maybe[T](`type`: Constructor[T]): Maybe[T] = js.native
  def maybe[T](`type`: Constructor[T], name: String): Maybe[T] = js.native
  def mixin[T, S](target: T, source: S): T with S = js.native
  def mixin[T, S](target: T, source: S, overwrite: Boolean): T with S = js.native
  def refinement[T](`type`: Constructor[T], predicate: Predicate[T]): Refinement[T] = js.native
  def refinement[T](`type`: Constructor[T], predicate: Predicate[T], name: String): Refinement[T] = js.native
  def struct[T](props: StructProps): Struct[T] = js.native
  def struct[T](props: StructProps, name: String): Struct[T] = js.native
  def struct[T](props: StructProps, name: StructOptions): Struct[T] = js.native
  def tuple[T](types: js.Array[Constructor[_]]): Tuple[T] = js.native
  def tuple[T](types: js.Array[Constructor[_]], name: String): Tuple[T] = js.native
  def union[T](types: js.Array[Constructor[T]]): Union[T] = js.native
  def union[T](types: js.Array[Constructor[T]], name: String): Union[T] = js.native
}

