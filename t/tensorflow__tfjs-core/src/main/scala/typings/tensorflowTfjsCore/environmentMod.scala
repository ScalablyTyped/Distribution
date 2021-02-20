package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.platformMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/environment", "ENV")
  @js.native
  def ENV_ : Environment = js.native
  
  @scala.inline
  def ENV__=(x: Environment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENV")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-core/dist/environment", "Environment")
  @js.native
  class Environment protected () extends StObject {
    def this(global: js.Any) = this()
    
    var evaluateFlag: js.Any = js.native
    
    val features: Flags = js.native
    
    var flagRegistry: js.Any = js.native
    
    var flags: js.Any = js.native
    
    def get(flagName: String): FlagValue = js.native
    
    def getAsync(flagName: String): js.Promise[FlagValue] = js.native
    
    def getBool(flagName: String): Boolean = js.native
    
    def getFlags(): Flags = js.native
    
    def getNumber(flagName: String): Double = js.native
    
    var global: js.Any = js.native
    
    var platform: Platform = js.native
    
    var platformName: String = js.native
    
    var populateURLFlags: js.Any = js.native
    
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
    
    var urlFlags: js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/environment", "env")
  @js.native
  def env(): Environment = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/environment", "getQueryParams")
  @js.native
  def getQueryParams(queryString: String): StringDictionary[String] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/environment", "setEnvironmentGlobal")
  @js.native
  def setEnvironmentGlobal(environment: Environment): Unit = js.native
  
  type FlagEvaluationFn = js.Function0[FlagValue | js.Promise[FlagValue]]
  
  @js.native
  trait FlagRegistryEntry extends StObject {
    
    var evaluationFn: FlagEvaluationFn = js.native
    
    var setHook: js.UndefOr[js.Function1[/* value */ FlagValue, Unit]] = js.native
  }
  object FlagRegistryEntry {
    
    @scala.inline
    def apply(evaluationFn: () => FlagValue | js.Promise[FlagValue]): FlagRegistryEntry = {
      val __obj = js.Dynamic.literal(evaluationFn = js.Any.fromFunction0(evaluationFn))
      __obj.asInstanceOf[FlagRegistryEntry]
    }
    
    @scala.inline
    implicit class FlagRegistryEntryMutableBuilder[Self <: FlagRegistryEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvaluationFn(value: () => FlagValue | js.Promise[FlagValue]): Self = StObject.set(x, "evaluationFn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetHook(value: /* value */ FlagValue => Unit): Self = StObject.set(x, "setHook", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHookUndefined: Self = StObject.set(x, "setHook", js.undefined)
    }
  }
  
  type FlagValue = Double | Boolean
  
  type Flags = StringDictionary[FlagValue]
}
