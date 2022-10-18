package typings.typedoc

import typings.std.Array
import typings.typedoc.distLibModelsCommentsCommentMod.Comment
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
import typings.typedoc.distLibModelsSourcesFileMod.SourceReference
import typings.typedoc.distLibSerializationMod.Serializer
import typings.typedoc.distLibUtilsGeneralMod.NeverIfInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibModelsReflectionsAbstractMod {
  
  @JSImport("typedoc/dist/lib/models/reflections/abstract", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("typedoc/dist/lib/models/reflections/abstract", "Reflection")
  @js.native
  open class Reflection protected () extends StObject {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: Reflection) = this()
    
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
    
    /**
      * The url of this reflection in the generated documentation.
      * TODO: Reflections shouldn't know urls exist. Move this to a serializer.
      */
    var url: js.UndefOr[String] = js.native
  }
  
  @js.native
  sealed trait ReflectionFlag extends StObject
  @JSImport("typedoc/dist/lib/models/reflections/abstract", "ReflectionFlag")
  @js.native
  object ReflectionFlag extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReflectionFlag & Double] = js.native
    
    @js.native
    sealed trait Abstract
      extends StObject
         with ReflectionFlag
    /* 512 */ val Abstract: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Abstract & Double = js.native
    
    @js.native
    sealed trait Const
      extends StObject
         with ReflectionFlag
    /* 1024 */ val Const: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Const & Double = js.native
    
    @js.native
    sealed trait DefaultValue
      extends StObject
         with ReflectionFlag
    /* 128 */ val DefaultValue: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.DefaultValue & Double = js.native
    
    @js.native
    sealed trait ExportAssignment
      extends StObject
         with ReflectionFlag
    /* 16 */ val ExportAssignment: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.ExportAssignment & Double = js.native
    
    @js.native
    sealed trait External
      extends StObject
         with ReflectionFlag
    /* 32 */ val External: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.External & Double = js.native
    
    @js.native
    sealed trait Let
      extends StObject
         with ReflectionFlag
    /* 2048 */ val Let: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Let & Double = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with ReflectionFlag
    /* 0 */ val None: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.None & Double = js.native
    
    @js.native
    sealed trait Optional
      extends StObject
         with ReflectionFlag
    /* 64 */ val Optional: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Optional & Double = js.native
    
    @js.native
    sealed trait Private
      extends StObject
         with ReflectionFlag
    /* 1 */ val Private: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Private & Double = js.native
    
    @js.native
    sealed trait Protected
      extends StObject
         with ReflectionFlag
    /* 2 */ val Protected: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Protected & Double = js.native
    
    @js.native
    sealed trait Public
      extends StObject
         with ReflectionFlag
    /* 4 */ val Public: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Public & Double = js.native
    
    @js.native
    sealed trait Readonly
      extends StObject
         with ReflectionFlag
    /* 4096 */ val Readonly: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Readonly & Double = js.native
    
    @js.native
    sealed trait Rest
      extends StObject
         with ReflectionFlag
    /* 256 */ val Rest: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Rest & Double = js.native
    
    @js.native
    sealed trait Static
      extends StObject
         with ReflectionFlag
    /* 8 */ val Static: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Static & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections/abstract", "ReflectionFlags")
  @js.native
  open class ReflectionFlags ()
    extends StObject
       with Array[String] {
    
    /* private */ var flags: Any = js.native
    
    def hasExportAssignment: Boolean = js.native
    
    def hasFlag(flag: ReflectionFlag): Boolean = js.native
    
    def isAbstract: Boolean = js.native
    
    def isConst: Boolean = js.native
    
    /**
      * Is this a declaration from an external document?
      */
    def isExternal: Boolean = js.native
    
    /**
      * Whether this reflection is an optional component or not.
      *
      * Applies to function parameters and object members.
      */
    def isOptional: Boolean = js.native
    
    /**
      * Is this a private member?
      */
    def isPrivate: Boolean = js.native
    
    /**
      * Is this a protected member?
      */
    def isProtected: Boolean = js.native
    
    /**
      * Is this a public member?
      */
    def isPublic: Boolean = js.native
    
    def isReadonly: Boolean = js.native
    
    /**
      * Whether it's a rest parameter, like `foo(...params);`.
      */
    def isRest: Boolean = js.native
    
    /**
      * Is this a static member?
      */
    def isStatic: Boolean = js.native
    
    def setFlag(flag: ReflectionFlag, set: Boolean): Unit = js.native
    
    /* private */ var setSingleFlag: Any = js.native
    
    def toObject(): typings.typedoc.distLibSerializationSchemaMod.ReflectionFlags = js.native
  }
  /* static members */
  object ReflectionFlags {
    
    @JSImport("typedoc/dist/lib/models/reflections/abstract", "ReflectionFlags")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/models/reflections/abstract", "ReflectionFlags.serializedFlags")
    @js.native
    def serializedFlags: Any = js.native
    inline def serializedFlags_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serializedFlags")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait TraverseProperty extends StObject
  @JSImport("typedoc/dist/lib/models/reflections/abstract", "TraverseProperty")
  @js.native
  object TraverseProperty extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TraverseProperty & Double] = js.native
    
    @js.native
    sealed trait Children
      extends StObject
         with TraverseProperty
    /* 0 */ val Children: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Children & Double = js.native
    
    @js.native
    sealed trait GetSignature
      extends StObject
         with TraverseProperty
    /* 6 */ val GetSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.GetSignature & Double = js.native
    
    @js.native
    sealed trait IndexSignature
      extends StObject
         with TraverseProperty
    /* 5 */ val IndexSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.IndexSignature & Double = js.native
    
    @js.native
    sealed trait Parameters
      extends StObject
         with TraverseProperty
    /* 1 */ val Parameters: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Parameters & Double = js.native
    
    @js.native
    sealed trait SetSignature
      extends StObject
         with TraverseProperty
    /* 7 */ val SetSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.SetSignature & Double = js.native
    
    @js.native
    sealed trait Signatures
      extends StObject
         with TraverseProperty
    /* 4 */ val Signatures: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Signatures & Double = js.native
    
    @js.native
    sealed trait TypeLiteral
      extends StObject
         with TraverseProperty
    /* 2 */ val TypeLiteral: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.TypeLiteral & Double = js.native
    
    @js.native
    sealed trait TypeParameter
      extends StObject
         with TraverseProperty
    /* 3 */ val TypeParameter: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.TypeParameter & Double = js.native
  }
  
  inline def resetReflectionID(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetReflectionID")().asInstanceOf[Unit]
  
  type TraverseCallback = js.Function2[
    /* reflection */ Reflection, 
    /* property */ TraverseProperty, 
    Boolean | NeverIfInternal[Unit]
  ]
}
