package typings.stylableBuildTools

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calcDepthMod {
  
  @JSImport("@stylable/build-tools/dist/calc-depth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcDepth[T](module: T, context: CalcDepthContext[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcDepth")(module.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calcDepth[T](module: T, context: CalcDepthContext[T], path: js.Array[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcDepth")(module.asInstanceOf[js.Any], context.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calcDepth[T](module: T, context: CalcDepthContext[T], path: js.Array[T], cache: Map[T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcDepth")(module.asInstanceOf[js.Any], context.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calcDepth[T](module: T, context: CalcDepthContext[T], path: Unit, cache: Map[T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcDepth")(module.asInstanceOf[js.Any], context.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getCSSViewModule[T](module: T, context: CalcDepthContext[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCSSViewModule")(module.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  trait CalcDepthContext[T] extends StObject {
    
    def getDependencies(module: T): js.Iterable[T]
    
    def getImporters(module: T): js.Iterable[T]
    
    def getModulePathNoExt(module: T): String
    
    def isStylableModule(module: T): Boolean
  }
  object CalcDepthContext {
    
    inline def apply[T](
      getDependencies: T => js.Iterable[T],
      getImporters: T => js.Iterable[T],
      getModulePathNoExt: T => String,
      isStylableModule: T => Boolean
    ): CalcDepthContext[T] = {
      val __obj = js.Dynamic.literal(getDependencies = js.Any.fromFunction1(getDependencies), getImporters = js.Any.fromFunction1(getImporters), getModulePathNoExt = js.Any.fromFunction1(getModulePathNoExt), isStylableModule = js.Any.fromFunction1(isStylableModule))
      __obj.asInstanceOf[CalcDepthContext[T]]
    }
    
    extension [Self <: CalcDepthContext[?], T](x: Self & CalcDepthContext[T]) {
      
      inline def setGetDependencies(value: T => js.Iterable[T]): Self = StObject.set(x, "getDependencies", js.Any.fromFunction1(value))
      
      inline def setGetImporters(value: T => js.Iterable[T]): Self = StObject.set(x, "getImporters", js.Any.fromFunction1(value))
      
      inline def setGetModulePathNoExt(value: T => String): Self = StObject.set(x, "getModulePathNoExt", js.Any.fromFunction1(value))
      
      inline def setIsStylableModule(value: T => Boolean): Self = StObject.set(x, "isStylableModule", js.Any.fromFunction1(value))
    }
  }
}
