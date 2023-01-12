package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distPlatformsPlatformMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEnvironmentMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/environment", "ENV")
  @js.native
  def ENV_ : Environment = js.native
  
  inline def ENV__=(x: Environment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENV")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-core/dist/environment", "Environment")
  @js.native
  open class Environment protected () extends StObject {
    def this(global: Any) = this()
    
    /* private */ var evaluateFlag: Any = js.native
    
    def features: Flags = js.native
    
    /* private */ var flagRegistry: Any = js.native
    
    /* private */ var flags: Any = js.native
    
    def get(flagName: String): FlagValue = js.native
    
    def getAsync(flagName: String): js.Promise[FlagValue] = js.native
    
    def getBool(flagName: String): Boolean = js.native
    
    def getFlags(): Flags = js.native
    
    def getNumber(flagName: String): Double = js.native
    
    def getQueryParams(queryString: String): StringDictionary[String] = js.native
    @JSName("getQueryParams")
    var getQueryParams_Original: js.Function1[/* queryString */ String, StringDictionary[String]] = js.native
    
    var global: Any = js.native
    
    var platform: Platform = js.native
    
    var platformName: String = js.native
    
    /* private */ var populateURLFlags: Any = js.native
    
    def registerFlag(flagName: String, evaluationFn: FlagEvaluationFn): Unit = js.native
    def registerFlag(
      flagName: String,
      evaluationFn: FlagEvaluationFn,
      setHook: js.Function1[/* value */ FlagValue, Unit]
    ): Unit = js.native
    
    def reset(): Unit = js.native
    
    def set(flagName: String, value: FlagValue): Unit = js.native
    
    def setFlags(flags: Flags): Unit = js.native
    
    def setPlatform(platformName: String, platform: Platform): Unit = js.native
    
    /* private */ var urlFlags: Any = js.native
  }
  
  inline def env(): Environment = ^.asInstanceOf[js.Dynamic].applyDynamic("env")().asInstanceOf[Environment]
  
  inline def getQueryParams(queryString: String): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryParams")(queryString.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  inline def setEnvironmentGlobal(environment: Environment): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnvironmentGlobal")(environment.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type FlagEvaluationFn = js.Function0[FlagValue | js.Promise[FlagValue]]
  
  trait FlagRegistryEntry extends StObject {
    
    var evaluationFn: FlagEvaluationFn
    
    var setHook: js.UndefOr[js.Function1[/* value */ FlagValue, Unit]] = js.undefined
  }
  object FlagRegistryEntry {
    
    inline def apply(evaluationFn: () => FlagValue | js.Promise[FlagValue]): FlagRegistryEntry = {
      val __obj = js.Dynamic.literal(evaluationFn = js.Any.fromFunction0(evaluationFn))
      __obj.asInstanceOf[FlagRegistryEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlagRegistryEntry] (val x: Self) extends AnyVal {
      
      inline def setEvaluationFn(value: () => FlagValue | js.Promise[FlagValue]): Self = StObject.set(x, "evaluationFn", js.Any.fromFunction0(value))
      
      inline def setSetHook(value: /* value */ FlagValue => Unit): Self = StObject.set(x, "setHook", js.Any.fromFunction1(value))
      
      inline def setSetHookUndefined: Self = StObject.set(x, "setHook", js.undefined)
    }
  }
  
  type FlagValue = Double | Boolean
  
  type Flags = StringDictionary[FlagValue]
}
