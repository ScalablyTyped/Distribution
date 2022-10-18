package typings.typedoc.anon

import typings.typedoc.distLibModelsCommentsCommentMod.Comment
import typings.typedoc.distLibModelsMod.TypeParameterReflection
import typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag
import typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlags
import typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseCallback
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
import typings.typedoc.distLibModelsSourcesFileMod.SourceReference
import typings.typedoc.distLibSerializationMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typedoc.typedoc/dist/lib/models.Reflection & {  typeParameters :std.Array<typedoc.typedoc/dist/lib/models.TypeParameterReflection>} */
@js.native
trait ReflectiontypeParametersA extends StObject {
  
  /**
    * Url safe alias for this reflection.
    *
    * @see {@link BaseReflection.getAlias}
    */
  /* private */ var _alias: Any = js.native
  
  /* private */ var _aliases: Any = js.native
  
  /**
    * The name of the anchor of this child.
    * TODO: Reflections shouldn't know anchors exist. Move this to a serializer.
    */
  var anchor: js.UndefOr[String] = js.native
  
  /**
    * The parsed documentation comment attached to this reflection.
    */
  var comment: js.UndefOr[Comment] = js.native
  
  /**
    * A list of generated css classes that should be applied to representations of this
    * reflection in the generated markup.
    * TODO: Reflections shouldn't know about CSS. Move this property to the correct serializer.
    */
  var cssClasses: js.UndefOr[String] = js.native
  
  /**
    * Try to find a reflection by its name.
    *
    * @return The found reflection or null.
    * @deprecated This method not be used, it naively splits the name by a `.` and searches recursively up
    * the parent tree, which is not how any other name resolver works. If you are currently using this and
    * need another method, please open an issue. For tests {@link getChildByName} should generally be sufficient.
    */
  def findReflectionByName(arg: String): js.UndefOr[Reflection] = js.native
  def findReflectionByName(arg: js.Array[String]): js.UndefOr[Reflection] = js.native
  
  var flags: ReflectionFlags = js.native
  
  /**
    * Return an url safe alias for this reflection.
    */
  def getAlias(): String = js.native
  
  /**
    * Return a child by its name.
    *
    * @param names The name hierarchy of the child to look for.
    * @returns The found child or undefined.
    */
  def getChildByName(arg: String): js.UndefOr[Reflection] = js.native
  def getChildByName(arg: js.Array[String]): js.UndefOr[Reflection] = js.native
  
  /**
    * Return the full name of this reflection, with signature names dropped if possible without
    * introducing ambiguity in the name.
    */
  def getFriendlyFullName(): String = js.native
  
  /**
    * Return the full name of this reflection. Intended for use in debugging. For log messages
    * intended to be displayed to the user for them to fix, prefer {@link getFriendlyFullName} instead.
    *
    * The full name contains the name of this reflection and the names of all parent reflections.
    *
    * @param separator  Separator used to join the names of the reflections.
    * @returns The full name of this reflection.
    */
  def getFullName(): String = js.native
  def getFullName(separator: String): String = js.native
  
  /**
    * Has this reflection a visible comment?
    *
    * @returns TRUE when this reflection has a visible comment.
    */
  def hasComment(): Boolean = js.native
  
  def hasGetterOrSetter(): Boolean = js.native
  
  /**
    * Is the url pointing to an individual document?
    *
    * When FALSE, the url points to an anchor tag on a page of a different reflection.
    * TODO: Reflections shouldn't know how they are rendered. Move this to the correct serializer.
    */
  var hasOwnDocument: js.UndefOr[Boolean] = js.native
  
  /**
    * Unique id of this reflection.
    */
  var id: Double = js.native
  
  /**
    * Check if this reflection has been marked with the `@deprecated` tag.
    */
  def isDeprecated(): Boolean = js.native
  
  /**
    * Return whether this reflection is the root / project reflection.
    */
  def isProject(): /* is typedoc.typedoc/dist/lib/models/reflections/project.ProjectReflection */ Boolean = js.native
  
  /**
    * The kind of this reflection.
    */
  var kind: ReflectionKind = js.native
  
  def kindOf(kind: js.Array[ReflectionKind]): Boolean = js.native
  /**
    * Test whether this reflection is of the given kind.
    */
  def kindOf(kind: ReflectionKind): Boolean = js.native
  
  /**
    * The human readable string representation of the kind of this reflection.
    * Set during the resolution phase by GroupPlugin
    */
  var kindString: js.UndefOr[String] = js.native
  
  /**
    * Label associated with this reflection, if any (https://tsdoc.org/pages/tags/label/)
    * Added by the CommentPlugin during resolution.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The symbol name of this reflection.
    */
  var name: String = js.native
  
  /**
    * The original name of the TypeScript declaration.
    */
  var originalName: String = js.native
  
  /**
    * The reflection this reflection is a child of.
    */
  var parent: js.UndefOr[Reflection] = js.native
  
  def project: ProjectReflection = js.native
  
  /**
    * Set a flag on this reflection.
    */
  def setFlag(flag: ReflectionFlag): Unit = js.native
  def setFlag(flag: ReflectionFlag, value: Boolean): Unit = js.native
  
  /**
    * A list of all source files that contributed to this reflection.
    */
  var sources: js.UndefOr[js.Array[SourceReference]] = js.native
  
  def toObject(serializer: Serializer): typings.typedoc.distLibSerializationSchemaMod.Reflection = js.native
  
  /**
    * Return a string representation of this reflection and all of its children.
    *
    * @param indent  Used internally to indent child reflections.
    */
  def toStringHierarchy(): String = js.native
  def toStringHierarchy(indent: String): String = js.native
  
  /**
    * Traverse all potential child reflections of this reflection.
    *
    * The given callback will be invoked for all children, signatures and type parameters
    * attached to this reflection.
    *
    * @param callback  The callback function that should be applied for each child reflection.
    */
  def traverse(_callback: TraverseCallback): Unit = js.native
  
  var typeParameters: js.Array[TypeParameterReflection] = js.native
  
  /**
    * The url of this reflection in the generated documentation.
    * TODO: Reflections shouldn't know urls exist. Move this to a serializer.
    */
  var url: js.UndefOr[String] = js.native
}
