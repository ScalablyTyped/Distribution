package typings.typedoc.distLibModelsMod

import typings.typedoc.distLibConverterMod.Context
import typings.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models", "ReferenceType")
@js.native
/* private */ open class ReferenceType ()
  extends typings.typedoc.distLibModelsTypesMod.ReferenceType
/* static members */
object ReferenceType {
  
  @JSImport("typedoc/dist/lib/models", "ReferenceType")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal this is used for type parameters, which don't actually point to something */
  inline def createBrokenReference(name: String, project: typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection): typings.typedoc.distLibModelsTypesMod.ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createBrokenReference")(name.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[typings.typedoc.distLibModelsTypesMod.ReferenceType]
  
  inline def createResolvedReference(
    name: String,
    target: Double,
    project: typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
  ): typings.typedoc.distLibModelsTypesMod.ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createResolvedReference")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[typings.typedoc.distLibModelsTypesMod.ReferenceType]
  inline def createResolvedReference(
    name: String,
    target: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection,
    project: typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
  ): typings.typedoc.distLibModelsTypesMod.ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createResolvedReference")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[typings.typedoc.distLibModelsTypesMod.ReferenceType]
  
  inline def createSymbolReference(symbol: Symbol, context: Context): typings.typedoc.distLibModelsTypesMod.ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymbolReference")(symbol.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.typedoc.distLibModelsTypesMod.ReferenceType]
  inline def createSymbolReference(symbol: Symbol, context: Context, name: String): typings.typedoc.distLibModelsTypesMod.ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymbolReference")(symbol.asInstanceOf[js.Any], context.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.typedoc.distLibModelsTypesMod.ReferenceType]
}
