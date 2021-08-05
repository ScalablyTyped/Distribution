package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.backendMod.KernelBackend
import typings.tensorflowTfjsCore.environmentMod.Environment
import typings.tensorflowTfjsCore.environmentMod.Flags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmineUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "ALL_ENVS")
  @js.native
  val ALL_ENVS: Constraints = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "BROWSER_ENVS")
  @js.native
  val BROWSER_ENVS: Constraints = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "CHROME_ENVS")
  @js.native
  val CHROME_ENVS: Constraints = js.native
  
  object HAS_NODE_WORKER {
    
    @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "HAS_NODE_WORKER")
    @js.native
    val ^ : js.Any = js.native
    
    inline def predicate(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("predicate")().asInstanceOf[Boolean]
  }
  
  object HAS_WORKER {
    
    @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "HAS_WORKER")
    @js.native
    val ^ : js.Any = js.native
    
    inline def predicate(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("predicate")().asInstanceOf[Boolean]
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "NODE_ENVS")
  @js.native
  val NODE_ENVS: Constraints = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "SYNC_BACKEND_ENVS")
  @js.native
  val SYNC_BACKEND_ENVS: Constraints = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "TEST_ENVS")
  @js.native
  val TEST_ENVS: js.Array[TestEnv] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "TestKernelBackend")
  @js.native
  class TestKernelBackend () extends KernelBackend
  
  inline def describeWithFlags(name: String, constraints: Constraints, tests: js.Function1[/* env */ TestEnv, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeWithFlags")(name.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], tests.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def envSatisfiesConstraints(env: Environment, testEnv: TestEnv, constraints: Constraints): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("envSatisfiesConstraints")(env.asInstanceOf[js.Any], testEnv.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseTestEnvFromKarmaFlags(args: js.Array[String], registeredTestEnvs: js.Array[TestEnv]): TestEnv = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTestEnvFromKarmaFlags")(args.asInstanceOf[js.Any], registeredTestEnvs.asInstanceOf[js.Any])).asInstanceOf[TestEnv]
  
  inline def registerTestEnv(testEnv: TestEnv): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTestEnv")(testEnv.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setTestEnvs(testEnvs: js.Array[TestEnv]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTestEnvs")(testEnvs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setupTestFilters(testFilters: js.Array[TestFilter], customInclude: js.Function1[/* name */ String, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestFilters")(testFilters.asInstanceOf[js.Any], customInclude.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Constraints extends StObject {
    
    var flags: js.UndefOr[Flags] = js.undefined
    
    var predicate: js.UndefOr[js.Function1[/* testEnv */ TestEnv, Boolean]] = js.undefined
  }
  object Constraints {
    
    inline def apply(): Constraints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Constraints]
    }
    
    extension [Self <: Constraints](x: Self) {
      
      inline def setFlags(value: Flags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setPredicate(value: /* testEnv */ TestEnv => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    }
  }
  
  trait TestEnv extends StObject {
    
    var backendName: String
    
    var flags: js.UndefOr[Flags] = js.undefined
    
    var isDataSync: js.UndefOr[Boolean] = js.undefined
    
    var name: String
  }
  object TestEnv {
    
    inline def apply(backendName: String, name: String): TestEnv = {
      val __obj = js.Dynamic.literal(backendName = backendName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestEnv]
    }
    
    extension [Self <: TestEnv](x: Self) {
      
      inline def setBackendName(value: String): Self = StObject.set(x, "backendName", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Flags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setIsDataSync(value: Boolean): Self = StObject.set(x, "isDataSync", value.asInstanceOf[js.Any])
      
      inline def setIsDataSyncUndefined: Self = StObject.set(x, "isDataSync", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestFilter extends StObject {
    
    var excludes: js.UndefOr[js.Array[String]] = js.undefined
    
    var include: js.UndefOr[String] = js.undefined
    
    var startsWith: js.UndefOr[String] = js.undefined
  }
  object TestFilter {
    
    inline def apply(): TestFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestFilter]
    }
    
    extension [Self <: TestFilter](x: Self) {
      
      inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value :_*))
      
      inline def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setStartsWith(value: String): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
      
      inline def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
    }
  }
}
