package typings.stylableBuildTools

import typings.std.Map
import typings.stylableBuildTools.anon.Config
import typings.stylableBuildTools.distCalcDepthMod.CalcDepthContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@stylable/build-tools/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcDepth[T](module: T, context: CalcDepthContext[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcDepth")(module.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calcDepth[T](module: T, context: CalcDepthContext[T], path: js.Array[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcDepth")(module.asInstanceOf[js.Any], context.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calcDepth[T](module: T, context: CalcDepthContext[T], path: js.Array[T], cache: Map[T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcDepth")(module.asInstanceOf[js.Any], context.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calcDepth[T](module: T, context: CalcDepthContext[T], path: Unit, cache: Map[T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcDepth")(module.asInstanceOf[js.Any], context.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getCSSViewModule[T](module: T, context: CalcDepthContext[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCSSViewModule")(module.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def hasImportedSideEffects(
    stylable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stylable */ Any,
    meta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StylableMeta */ Any,
    imported: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Imported */ Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasImportedSideEffects")(stylable.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], imported.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def loadStylableConfig[T](context: String, extract: js.Function1[/* config */ Any, T]): js.UndefOr[Config[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadStylableConfig")(context.asInstanceOf[js.Any], extract.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Config[T]]]
  
  inline def processUrlDependencies(
    meta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StylableMeta */ Any,
    rootContext: String
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("processUrlDependencies")(meta.asInstanceOf[js.Any], rootContext.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def processUrlDependencies(
    meta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StylableMeta */ Any,
    rootContext: String,
    filter: js.Function2[/* url */ String, /* context */ String, Boolean]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("processUrlDependencies")(meta.asInstanceOf[js.Any], rootContext.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def sortModulesByDepth[T](
    modules: js.Array[T],
    getDepth: js.Function1[/* m */ T, Double],
    getID: js.Function1[/* m */ T, String]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortModulesByDepth")(modules.asInstanceOf[js.Any], getDepth.asInstanceOf[js.Any], getID.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def sortModulesByDepth[T](
    modules: js.Array[T],
    getDepth: js.Function1[/* m */ T, Double],
    getID: js.Function1[/* m */ T, String],
    factor: Double
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortModulesByDepth")(modules.asInstanceOf[js.Any], getDepth.asInstanceOf[js.Any], getID.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
