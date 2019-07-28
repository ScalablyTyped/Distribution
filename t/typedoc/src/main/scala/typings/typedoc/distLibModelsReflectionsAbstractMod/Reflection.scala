package typings.typedoc.distLibModelsReflectionsAbstractMod

import typings.typedoc.distLibModelsCommentsCommentMod.Comment
import typings.typedoc.distLibModelsSourcesFileMod.SourceReference
import typings.typedoc.distLibModelsTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/abstract", "Reflection")
@js.native
abstract class Reflection protected () extends js.Object {
  def this(name: String, kind: ReflectionKind) = this()
  def this(name: String, kind: ReflectionKind, parent: Reflection) = this()
  var _alias: js.UndefOr[js.Any] = js.native
  var _aliases: js.UndefOr[js.Any] = js.native
  var anchor: js.UndefOr[String] = js.native
  var comment: js.UndefOr[Comment] = js.native
  var cssClasses: js.UndefOr[String] = js.native
  var decorates: js.UndefOr[js.Array[Type]] = js.native
  var decorators: js.UndefOr[js.Array[Decorator]] = js.native
  var flags: ReflectionFlags = js.native
  var hasOwnDocument: js.UndefOr[Boolean] = js.native
  var id: Double = js.native
  var kind: ReflectionKind = js.native
  var kindString: js.UndefOr[String] = js.native
  var name: String = js.native
  var originalName: String = js.native
  var parent: js.UndefOr[Reflection] = js.native
  var sources: js.UndefOr[js.Array[SourceReference]] = js.native
  var url: js.UndefOr[String] = js.native
  def findReflectionByName(arg: String): js.UndefOr[Reflection] = js.native
  def findReflectionByName(arg: js.Array[String]): js.UndefOr[Reflection] = js.native
  def getAlias(): String = js.native
  def getChildByName(name: String): Reflection = js.native
  def getChildByName(names: js.Array[String]): Reflection = js.native
  def getFullName(): String = js.native
  def getFullName(separator: String): String = js.native
  def hasComment(): Boolean = js.native
  def hasGetterOrSetter(): Boolean = js.native
  def isProject(): Boolean = js.native
  def kindOf(kind: js.Array[ReflectionKind]): Boolean = js.native
  def kindOf(kind: ReflectionKind): Boolean = js.native
  def setFlag(flag: ReflectionFlag): Unit = js.native
  def setFlag(flag: ReflectionFlag, value: Boolean): Unit = js.native
  def toObject(): js.Any = js.native
  def toStringHierarchy(): String = js.native
  def toStringHierarchy(indent: String): String = js.native
  def traverse(callback: TraverseCallback): Unit = js.native
}

