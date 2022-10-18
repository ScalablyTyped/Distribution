package typings.webpackConfigUtils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-config-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIfUtils[E /* <: EnvVars | String */](env: E): IfUtils = ^.asInstanceOf[js.Dynamic].applyDynamic("getIfUtils")(env.asInstanceOf[js.Any]).asInstanceOf[IfUtils]
  inline def getIfUtils[E /* <: EnvVars | String */](env: E, vars: js.Array[EnvVars | String]): IfUtils = (^.asInstanceOf[js.Dynamic].applyDynamic("getIfUtils")(env.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[IfUtils]
  inline def getIfUtils[E /* <: EnvVars | String */](
    env: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in E ]: boolean | string} */ js.Any
  ): IfUtils = ^.asInstanceOf[js.Dynamic].applyDynamic("getIfUtils")(env.asInstanceOf[js.Any]).asInstanceOf[IfUtils]
  inline def getIfUtils[E /* <: EnvVars | String */](
    env: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in E ]: boolean | string} */ js.Any,
    vars: js.Array[EnvVars | String]
  ): IfUtils = (^.asInstanceOf[js.Dynamic].applyDynamic("getIfUtils")(env.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[IfUtils]
  
  inline def propIf[E](a: Falsy, value: Any, alternate: E): E = (^.asInstanceOf[js.Dynamic].applyDynamic("propIf")(a.asInstanceOf[js.Any], value.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any])).asInstanceOf[E]
  
  inline def propIfNot[E](a: Any, value: Any, alternate: E): E = (^.asInstanceOf[js.Dynamic].applyDynamic("propIfNot")(a.asInstanceOf[js.Any], value.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any])).asInstanceOf[E]
  
  inline def propIfNot_I_I[I](a: Falsy, value: I, alternate: Any): I = (^.asInstanceOf[js.Dynamic].applyDynamic("propIfNot")(a.asInstanceOf[js.Any], value.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any])).asInstanceOf[I]
  
  inline def propIf_I_I[I](a: Any, value: I, alternate: Any): I = (^.asInstanceOf[js.Dynamic].applyDynamic("propIf")(a.asInstanceOf[js.Any], value.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any])).asInstanceOf[I]
  
  inline def removeEmpty[T](
    input: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P]} */ js.Any
  ): NonEmptyObject[T, DefinedObjKeys[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEmpty")(input.asInstanceOf[js.Any]).asInstanceOf[NonEmptyObject[T, DefinedObjKeys[T]]]
  inline def removeEmpty[T](input: js.Array[js.UndefOr[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEmpty")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  type DefinedObjKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] extends undefined? never : P}[keyof T] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpackConfigUtils.webpackConfigUtilsStrings.production
    - typings.webpackConfigUtils.webpackConfigUtilsStrings.prod
    - typings.webpackConfigUtils.webpackConfigUtilsStrings.test
    - typings.webpackConfigUtils.webpackConfigUtilsStrings.development
    - typings.webpackConfigUtils.webpackConfigUtilsStrings.dev
  */
  trait EnvVars extends StObject
  object EnvVars {
    
    inline def dev: typings.webpackConfigUtils.webpackConfigUtilsStrings.dev = "dev".asInstanceOf[typings.webpackConfigUtils.webpackConfigUtilsStrings.dev]
    
    inline def development: typings.webpackConfigUtils.webpackConfigUtilsStrings.development = "development".asInstanceOf[typings.webpackConfigUtils.webpackConfigUtilsStrings.development]
    
    inline def prod: typings.webpackConfigUtils.webpackConfigUtilsStrings.prod = "prod".asInstanceOf[typings.webpackConfigUtils.webpackConfigUtilsStrings.prod]
    
    inline def production: typings.webpackConfigUtils.webpackConfigUtilsStrings.production = "production".asInstanceOf[typings.webpackConfigUtils.webpackConfigUtilsStrings.production]
    
    inline def test: typings.webpackConfigUtils.webpackConfigUtilsStrings.test = "test".asInstanceOf[typings.webpackConfigUtils.webpackConfigUtilsStrings.test]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpackConfigUtils.webpackConfigUtilsBooleans.`false`
    - typings.webpackConfigUtils.webpackConfigUtilsStrings._empty
    - typings.webpackConfigUtils.webpackConfigUtilsStrings.`false`
    - scala.Unit
    - scala.Null
    - typings.webpackConfigUtils.webpackConfigUtilsInts.`0`
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  
  trait IfUtils
    extends StObject
       with /* key */ StringDictionary[IfUtilsFn] {
    
    def ifDev(): Boolean
    def ifDev[Y, N](value: Y): Y | N
    def ifDev[Y, N](value: Y, alternate: N): Y | N
    @JSName("ifDev")
    var ifDev_Original: IfUtilsFn
    
    def ifDevelopment(): Boolean
    def ifDevelopment[Y, N](value: Y): Y | N
    def ifDevelopment[Y, N](value: Y, alternate: N): Y | N
    @JSName("ifDevelopment")
    var ifDevelopment_Original: IfUtilsFn
    
    def ifNotDev(): Boolean
    def ifNotDev[Y, N](value: Y): Y | N
    def ifNotDev[Y, N](value: Y, alternate: N): Y | N
    @JSName("ifNotDev")
    var ifNotDev_Original: IfUtilsFn
    
    def ifNotDevelopment(): Boolean
    def ifNotDevelopment[Y, N](value: Y): Y | N
    def ifNotDevelopment[Y, N](value: Y, alternate: N): Y | N
    @JSName("ifNotDevelopment")
    var ifNotDevelopment_Original: IfUtilsFn
    
    def ifNotProd(): Boolean
    def ifNotProd[Y, N](value: Y): Y | N
    def ifNotProd[Y, N](value: Y, alternate: N): Y | N
    @JSName("ifNotProd")
    var ifNotProd_Original: IfUtilsFn
    
    def ifNotProduction(): Boolean
    def ifNotProduction[Y, N](value: Y): Y | N
    def ifNotProduction[Y, N](value: Y, alternate: N): Y | N
    @JSName("ifNotProduction")
    var ifNotProduction_Original: IfUtilsFn
    
    def ifNotTest(): Boolean
    def ifNotTest[Y, N](value: Y): Y | N
    def ifNotTest[Y, N](value: Y, alternate: N): Y | N
    @JSName("ifNotTest")
    var ifNotTest_Original: IfUtilsFn
    
    def ifProd(): Boolean
    def ifProd[Y, N](value: Y): Y | N
    def ifProd[Y, N](value: Y, alternate: N): Y | N
    @JSName("ifProd")
    var ifProd_Original: IfUtilsFn
    
    def ifProduction(): Boolean
    def ifProduction[Y, N](value: Y): Y | N
    def ifProduction[Y, N](value: Y, alternate: N): Y | N
    @JSName("ifProduction")
    var ifProduction_Original: IfUtilsFn
    
    def ifTest(): Boolean
    def ifTest[Y, N](value: Y): Y | N
    def ifTest[Y, N](value: Y, alternate: N): Y | N
    @JSName("ifTest")
    var ifTest_Original: IfUtilsFn
  }
  object IfUtils {
    
    inline def apply(
      ifDev: IfUtilsFn,
      ifDevelopment: IfUtilsFn,
      ifNotDev: IfUtilsFn,
      ifNotDevelopment: IfUtilsFn,
      ifNotProd: IfUtilsFn,
      ifNotProduction: IfUtilsFn,
      ifNotTest: IfUtilsFn,
      ifProd: IfUtilsFn,
      ifProduction: IfUtilsFn,
      ifTest: IfUtilsFn
    ): IfUtils = {
      val __obj = js.Dynamic.literal(ifDev = ifDev.asInstanceOf[js.Any], ifDevelopment = ifDevelopment.asInstanceOf[js.Any], ifNotDev = ifNotDev.asInstanceOf[js.Any], ifNotDevelopment = ifNotDevelopment.asInstanceOf[js.Any], ifNotProd = ifNotProd.asInstanceOf[js.Any], ifNotProduction = ifNotProduction.asInstanceOf[js.Any], ifNotTest = ifNotTest.asInstanceOf[js.Any], ifProd = ifProd.asInstanceOf[js.Any], ifProduction = ifProduction.asInstanceOf[js.Any], ifTest = ifTest.asInstanceOf[js.Any])
      __obj.asInstanceOf[IfUtils]
    }
    
    extension [Self <: IfUtils](x: Self) {
      
      inline def setIfDev(value: IfUtilsFn): Self = StObject.set(x, "ifDev", value.asInstanceOf[js.Any])
      
      inline def setIfDevelopment(value: IfUtilsFn): Self = StObject.set(x, "ifDevelopment", value.asInstanceOf[js.Any])
      
      inline def setIfNotDev(value: IfUtilsFn): Self = StObject.set(x, "ifNotDev", value.asInstanceOf[js.Any])
      
      inline def setIfNotDevelopment(value: IfUtilsFn): Self = StObject.set(x, "ifNotDevelopment", value.asInstanceOf[js.Any])
      
      inline def setIfNotProd(value: IfUtilsFn): Self = StObject.set(x, "ifNotProd", value.asInstanceOf[js.Any])
      
      inline def setIfNotProduction(value: IfUtilsFn): Self = StObject.set(x, "ifNotProduction", value.asInstanceOf[js.Any])
      
      inline def setIfNotTest(value: IfUtilsFn): Self = StObject.set(x, "ifNotTest", value.asInstanceOf[js.Any])
      
      inline def setIfProd(value: IfUtilsFn): Self = StObject.set(x, "ifProd", value.asInstanceOf[js.Any])
      
      inline def setIfProduction(value: IfUtilsFn): Self = StObject.set(x, "ifProduction", value.asInstanceOf[js.Any])
      
      inline def setIfTest(value: IfUtilsFn): Self = StObject.set(x, "ifTest", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IfUtilsFn extends StObject {
    
    def apply(): Boolean = js.native
    def apply[Y, N](value: Y): Y | N = js.native
    def apply[Y, N](value: Y, alternate: N): Y | N = js.native
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ PP in P ]: T[PP]}
    }}}
    */
  type NonEmptyObject[T, P /* <: DefinedObjKeys[T] */] = T
  
  trait _Falsy extends StObject
}
