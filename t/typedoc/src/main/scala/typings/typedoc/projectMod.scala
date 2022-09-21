package typings.typedoc

import org.scalablytyped.runtime.NumberDictionary
import typings.typedoc.abstractMod.Reflection
import typings.typedoc.commentMod.CommentDisplayPart
import typings.typedoc.containerMod.ContainerReflection
import typings.typedoc.kindMod.ReflectionKind
import typings.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectMod {
  
  @JSImport("typedoc/dist/lib/models/reflections/project", "ProjectReflection")
  @js.native
  open class ProjectReflection protected () extends ContainerReflection {
    def this(name: String) = this()
    
    /* private */ var getReferenceGraph: Any = js.native
    
    /**
      * Gets the reflection registered for the given reflection ID, or undefined if it is not present
      * in the project.
      */
    def getReflectionById(id: Double): js.UndefOr[Reflection] = js.native
    
    /**
      * Gets the reflection associated with the given symbol, if it exists.
      * @internal
      */
    def getReflectionFromSymbol(symbol: Symbol): js.UndefOr[Reflection] = js.native
    
    /**
      * Return a list of all reflections in this project of a certain kind.
      *
      * @param kind  The desired kind of reflection.
      * @returns     An array containing all reflections with the desired kind.
      */
    def getReflectionsByKind(kind: ReflectionKind): js.Array[Reflection] = js.native
    
    /** @internal */
    def getSymbolFromReflection(reflection: Reflection): js.UndefOr[Symbol] = js.native
    
    /**
      * The contents of the readme.md file of the project when found.
      */
    var readme: js.UndefOr[js.Array[CommentDisplayPart]] = js.native
    
    /* private */ var referenceGraph: Any = js.native
    
    /* private */ var reflectionIdToSymbolMap: Any = js.native
    
    /**
      * A list of all reflections within the project. DO NOT MUTATE THIS OBJECT.
      * All mutation should be done via {@link registerReflection} and {@link removeReflection}
      * to ensure that links to reflections remain valid.
      *
      * This may be replaced with a `Map<number, Reflection>` someday.
      */
    var reflections: NumberDictionary[Reflection] = js.native
    
    /**
      * Registers the given reflection so that it can be quickly looked up by helper methods.
      * Should be called for *every* reflection added to the project.
      */
    def registerReflection(reflection: Reflection): Unit = js.native
    def registerReflection(reflection: Reflection, symbol: Symbol): Unit = js.native
    
    /**
      * When excludeNotExported is set, if a symbol is exported only under a different name
      * there will be a reference which points to the symbol, but the symbol will not be converted
      * and the rename will point to nothing. Warn the user if this happens.
      */
    def removeDanglingReferences(): Unit = js.native
    
    /**
      * Removes a reflection from the documentation. Can be used by plugins to filter reflections
      * out of the generated documentation. Has no effect if the reflection is not present in the
      * project.
      */
    def removeReflection(reflection: Reflection): Unit = js.native
    
    /* private */ var symbolToReflectionIdMap: Any = js.native
  }
}
