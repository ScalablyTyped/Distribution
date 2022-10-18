package typings.typedoc

import typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibModelsReflectionsReferenceMod {
  
  @JSImport("typedoc/dist/lib/models/reflections/reference", "ReferenceReflection")
  @js.native
  open class ReferenceReflection protected () extends DeclarationReflection {
    /**
      * Creates a reference reflection. Should only be used within the factory function.
      * @param name
      * @param state
      * @param parent
      *
      * @internal
      */
    def this(
      name: String,
      state: /* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/models/reflections/reference.ReferenceReflection['_target'] */ js.Any
    ) = this()
    def this(
      name: String,
      state: /* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/models/reflections/reference.ReferenceReflection['_target'] */ js.Any,
      parent: Reflection
    ) = this()
    
    /* private */ var _ensureProject: Any = js.native
    
    /* private */ var _project: Any = js.native
    
    /* private */ var _target: Any = js.native
    
    /**
      * Gets the reflection that is referenced. This may be another reference reflection.
      * To fully resolve any references, use {@link getTargetReflectionDeep}.
      */
    def getTargetReflection(): Reflection = js.native
    
    /**
      * Gets the reflection that is referenced, this will fully resolve references.
      * To only resolve one reference, use {@link getTargetReflection}.
      */
    def getTargetReflectionDeep(): Reflection = js.native
    
    /**
      * Tries to get the reflection that is referenced. This may be another reference reflection.
      * To fully resolve any references, use {@link tryGetTargetReflectionDeep}.
      */
    def tryGetTargetReflection(): js.UndefOr[Reflection] = js.native
    
    /**
      * Tries to get the reflection that is referenced, this will fully resolve references.
      * To only resolve one reference, use {@link tryGetTargetReflection}.
      */
    def tryGetTargetReflectionDeep(): js.UndefOr[Reflection] = js.native
  }
}
