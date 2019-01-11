package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcomb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Any: tcombLib.tcombMod.Irreducible[js.Any] = js.native
  var Array: tcombLib.tcombMod.Irreducible[js.Array[js.Any]] = js.native
  var Boolean: tcombLib.tcombMod.Irreducible[scala.Boolean] = js.native
  var Date: tcombLib.tcombMod.Irreducible[stdLib.Date] = js.native
  var Error: tcombLib.tcombMod.Irreducible[stdLib.Error] = js.native
  var Function: tcombLib.tcombMod.Irreducible[js.Function] = js.native
  var Integer: tcombLib.tcombMod.Irreducible[scala.Double] = js.native
  var Nil: tcombLib.tcombMod.Irreducible[scala.Unit | scala.Null] = js.native
  var Number: tcombLib.tcombMod.Irreducible[scala.Double] = js.native
  var Object: tcombLib.tcombMod.Irreducible[js.Object] = js.native
  var RegExp: tcombLib.tcombMod.Irreducible[stdLib.RegExp] = js.native
  var String: tcombLib.tcombMod.Irreducible[java.lang.String] = js.native
  var enums: tcombLib.tcombMod.EnumsFunction = js.native
  var update: tcombLib.Update[js.Object] = js.native
  def assert(guard: scala.Boolean): scala.Unit = js.native
  def assert(guard: scala.Boolean, message: java.lang.String): scala.Unit = js.native
  def assert(guard: scala.Boolean, message: tcombLib.LazyMessage): scala.Unit = js.native
  def declare[T](): tcombLib.tcombMod.Declare[T] = js.native
  def declare[T](name: java.lang.String): tcombLib.tcombMod.Declare[T] = js.native
  def dict[T](domain: tcombLib.Constructor[java.lang.String], codomain: tcombLib.Constructor[T]): tcombLib.tcombMod.Dict[T] = js.native
  def dict[T](
    domain: tcombLib.Constructor[java.lang.String],
    codomain: tcombLib.Constructor[T],
    name: java.lang.String
  ): tcombLib.tcombMod.Dict[T] = js.native
  def fail(message: java.lang.String): scala.Unit = js.native
  def getTypeName[T](x: tcombLib.Constructor[T]): java.lang.String = js.native
  def interface[T](props: tcombLib.StructProps): tcombLib.tcombMod.Interface[T] = js.native
  def interface[T](props: tcombLib.StructProps, name: java.lang.String): tcombLib.tcombMod.Interface[T] = js.native
  def interface[T](props: tcombLib.StructProps, name: tcombLib.StructOptions): tcombLib.tcombMod.Interface[T] = js.native
  def intersection[T](types: js.Array[tcombLib.Constructor[_]]): tcombLib.tcombMod.Intersection[T] = js.native
  def intersection[T](types: js.Array[tcombLib.Constructor[_]], name: java.lang.String): tcombLib.tcombMod.Intersection[T] = js.native
  def irreducible[T](name: java.lang.String, predicate: tcombLib.Predicate[_]): tcombLib.tcombMod.Irreducible[T] = js.native
  def is[T](x: js.Any, `type`: tcombLib.Constructor[T]): scala.Boolean = js.native
  def isType[T](x: tcombLib.Constructor[T]): scala.Boolean = js.native
  def list[T](`type`: tcombLib.Constructor[T]): tcombLib.tcombMod.List[T] = js.native
  def list[T](`type`: tcombLib.Constructor[T], name: java.lang.String): tcombLib.tcombMod.List[T] = js.native
  def `match`(x: js.Any, clauses: tcombLib.Clause*): js.Any = js.native
  def maybe[T](`type`: tcombLib.Constructor[T]): tcombLib.tcombMod.Maybe[T] = js.native
  def maybe[T](`type`: tcombLib.Constructor[T], name: java.lang.String): tcombLib.tcombMod.Maybe[T] = js.native
  def mixin[T, S](target: T, source: S): T with S = js.native
  def mixin[T, S](target: T, source: S, overwrite: scala.Boolean): T with S = js.native
  def refinement[T](`type`: tcombLib.Constructor[T], predicate: tcombLib.Predicate[T]): tcombLib.tcombMod.Refinement[T] = js.native
  def refinement[T](`type`: tcombLib.Constructor[T], predicate: tcombLib.Predicate[T], name: java.lang.String): tcombLib.tcombMod.Refinement[T] = js.native
  def struct[T](props: tcombLib.StructProps): tcombLib.tcombMod.Struct[T] = js.native
  def struct[T](props: tcombLib.StructProps, name: java.lang.String): tcombLib.tcombMod.Struct[T] = js.native
  def struct[T](props: tcombLib.StructProps, name: tcombLib.StructOptions): tcombLib.tcombMod.Struct[T] = js.native
  def tuple[T](types: js.Array[tcombLib.Constructor[_]]): tcombLib.tcombMod.Tuple[T] = js.native
  def tuple[T](types: js.Array[tcombLib.Constructor[_]], name: java.lang.String): tcombLib.tcombMod.Tuple[T] = js.native
  def union[T](types: js.Array[tcombLib.Constructor[T]]): tcombLib.tcombMod.Union[T] = js.native
  def union[T](types: js.Array[tcombLib.Constructor[T]], name: java.lang.String): tcombLib.tcombMod.Union[T] = js.native
}

