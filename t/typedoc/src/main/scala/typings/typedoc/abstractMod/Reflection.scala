package typings.typedoc.abstractMod

import typings.typedoc.commentsCommentMod.Comment
import typings.typedoc.fileMod.SourceReference
import typings.typedoc.modelsTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/reflections/abstract", "Reflection")
@js.native
abstract class Reflection protected () extends js.Object {
  def this(name: String, kind: ReflectionKind) = this()
  def this(name: String, kind: ReflectionKind, parent: Reflection) = this()
  
  var _alias: js.Any = js.native
  
  var _aliases: js.Any = js.native
  
  var anchor: js.UndefOr[String] = js.native
  
  var comment: js.UndefOr[Comment] = js.native
  
  var cssClasses: js.UndefOr[String] = js.native
  
  var decorates: js.UndefOr[js.Array[Type]] = js.native
  
  var decorators: js.UndefOr[js.Array[Decorator]] = js.native
  
  def findReflectionByName(arg: String): js.UndefOr[Reflection] = js.native
  def findReflectionByName(arg: js.Array[String]): js.UndefOr[Reflection] = js.native
  
  var flags: ReflectionFlags = js.native
  
  def getAlias(): String = js.native
  
  def getChildByName(arg: String): js.UndefOr[Reflection] = js.native
  def getChildByName(arg: js.Array[String]): js.UndefOr[Reflection] = js.native
  
  def getFullName(): String = js.native
  def getFullName(separator: String): String = js.native
  
  def hasComment(): Boolean = js.native
  
  def hasGetterOrSetter(): Boolean = js.native
  
  var hasOwnDocument: js.UndefOr[Boolean] = js.native
  
  var id: Double = js.native
  
  def isProject(): /* is typedoc.typedoc/dist/lib/models/reflections/project.ProjectReflection */ Boolean = js.native
  
  var kind: ReflectionKind = js.native
  
  def kindOf(kind: js.Array[ReflectionKind]): Boolean = js.native
  def kindOf(kind: ReflectionKind): Boolean = js.native
  
  var kindString: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var originalName: String = js.native
  
  var parent: js.UndefOr[Reflection] = js.native
  
  def setFlag(flag: ReflectionFlag): Unit = js.native
  def setFlag(flag: ReflectionFlag, value: Boolean): Unit = js.native
  
  var sources: js.UndefOr[js.Array[SourceReference]] = js.native
  
  def toStringHierarchy(): String = js.native
  def toStringHierarchy(indent: String): String = js.native
  
  def traverse(callback: TraverseCallback): Unit = js.native
  
  var url: js.UndefOr[String] = js.native
}
