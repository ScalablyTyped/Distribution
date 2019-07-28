package typings.typedoc.distLibModelsReflectionsAbstractMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/abstract", "ReflectionFlags")
@js.native
class ReflectionFlags () extends Array[String] {
  var flags: js.Any = js.native
  val hasExportAssignment: Boolean = js.native
  val isAbstract: Boolean = js.native
  val isConst: Boolean = js.native
  val isConstructorProperty: Boolean = js.native
  val isExported: Boolean = js.native
  val isExternal: Boolean = js.native
  val isLet: Boolean = js.native
  val isOptional: Boolean = js.native
  val isPrivate: Boolean = js.native
  val isProtected: Boolean = js.native
  val isPublic: Boolean = js.native
  val isRest: Boolean = js.native
  val isStatic: Boolean = js.native
  var setSingleFlag: js.Any = js.native
  def hasFlag(flag: ReflectionFlag): Boolean = js.native
  def setFlag(flag: ReflectionFlag, set: Boolean): Unit = js.native
}

