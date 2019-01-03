package typings
package typedocLib.distLibModelsReflectionsAbstractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/abstract", "Reflection")
@js.native
abstract class Reflection protected () extends js.Object {
  def this(name: java.lang.String, kind: ReflectionKind) = this()
  def this(name: java.lang.String, kind: ReflectionKind, parent: Reflection) = this()
  var _alias: js.UndefOr[js.Any] = js.native
  var _aliases: js.UndefOr[js.Any] = js.native
  var anchor: js.UndefOr[java.lang.String] = js.native
  var comment: js.UndefOr[typedocLib.distLibModelsCommentsCommentMod.Comment] = js.native
  var cssClasses: js.UndefOr[java.lang.String] = js.native
  var decorates: js.UndefOr[js.Array[typedocLib.distLibModelsTypesMod.Type]] = js.native
  var decorators: js.UndefOr[js.Array[Decorator]] = js.native
  var flags: ReflectionFlags = js.native
  var hasOwnDocument: js.UndefOr[scala.Boolean] = js.native
  var id: scala.Double = js.native
  var kind: ReflectionKind = js.native
  var kindString: js.UndefOr[java.lang.String] = js.native
  var name: java.lang.String = js.native
  var originalName: java.lang.String = js.native
  var parent: js.UndefOr[Reflection] = js.native
  var sources: js.UndefOr[js.Array[typedocLib.distLibModelsSourcesFileMod.SourceReference]] = js.native
  var url: js.UndefOr[java.lang.String] = js.native
  def findReflectionByName(arg: java.lang.String): js.UndefOr[Reflection] = js.native
  def findReflectionByName(arg: js.Array[java.lang.String]): js.UndefOr[Reflection] = js.native
  def getAlias(): java.lang.String = js.native
  def getChildByName(name: java.lang.String): Reflection = js.native
  def getChildByName(names: js.Array[java.lang.String]): Reflection = js.native
  def getFullName(): java.lang.String = js.native
  def getFullName(separator: java.lang.String): java.lang.String = js.native
  def hasComment(): scala.Boolean = js.native
  def hasGetterOrSetter(): scala.Boolean = js.native
  def isProject(): scala.Boolean = js.native
  def kindOf(kind: js.Array[ReflectionKind]): scala.Boolean = js.native
  def kindOf(kind: ReflectionKind): scala.Boolean = js.native
  def setFlag(flag: ReflectionFlag): scala.Unit = js.native
  def setFlag(flag: ReflectionFlag, value: scala.Boolean): scala.Unit = js.native
  def toObject(): js.Any = js.native
  def toStringHierarchy(): java.lang.String = js.native
  def toStringHierarchy(indent: java.lang.String): java.lang.String = js.native
  def traverse(callback: TraverseCallback): scala.Unit = js.native
}

