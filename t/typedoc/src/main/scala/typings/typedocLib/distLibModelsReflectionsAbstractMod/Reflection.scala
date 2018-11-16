package typings
package typedocLib.distLibModelsReflectionsAbstractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/abstract", "Reflection")
@js.native
abstract class Reflection () extends js.Object {
  def this(parent: Reflection) = this()
  def this(parent: Reflection, name: java.lang.String) = this()
  def this(parent: Reflection, name: java.lang.String, kind: ReflectionKind) = this()
  var _alias: js.Any = js.native
  var _aliases: js.Any = js.native
  var anchor: java.lang.String = js.native
  var comment: typedocLib.distLibModelsCommentsCommentMod.Comment = js.native
  var cssClasses: java.lang.String = js.native
  var decorates: js.Array[typedocLib.distLibModelsTypesMod.Type] = js.native
  var decorators: js.Array[Decorator] = js.native
  var flags: ReflectionFlags = js.native
  var hasOwnDocument: scala.Boolean = js.native
  var id: scala.Double = js.native
  var kind: ReflectionKind = js.native
  var kindString: java.lang.String = js.native
  var name: java.lang.String = js.native
  var originalName: java.lang.String = js.native
  var parent: Reflection = js.native
  var sources: js.Array[typedocLib.distLibModelsSourcesFileMod.SourceReference] = js.native
  var url: java.lang.String = js.native
  def findReflectionByName(name: java.lang.String): Reflection = js.native
  def findReflectionByName(names: js.Array[java.lang.String]): Reflection = js.native
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

