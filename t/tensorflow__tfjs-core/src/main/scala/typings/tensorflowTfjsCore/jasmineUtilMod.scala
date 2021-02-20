package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.backendMod.KernelBackend
import typings.tensorflowTfjsCore.environmentMod.Environment
import typings.tensorflowTfjsCore.environmentMod.Flags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmineUtilMod {
  
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
    
    @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "HAS_NODE_WORKER.predicate")
    @js.native
    def predicate(): Boolean = js.native
  }
  
  object HAS_WORKER {
    
    @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "HAS_WORKER.predicate")
    @js.native
    def predicate(): Boolean = js.native
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
  
  @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "describeWithFlags")
  @js.native
  def describeWithFlags(name: String, constraints: Constraints, tests: js.Function1[/* env */ TestEnv, Unit]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "envSatisfiesConstraints")
  @js.native
  def envSatisfiesConstraints(env: Environment, testEnv: TestEnv, constraints: Constraints): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "parseTestEnvFromKarmaFlags")
  @js.native
  def parseTestEnvFromKarmaFlags(args: js.Array[String], registeredTestEnvs: js.Array[TestEnv]): TestEnv = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "registerTestEnv")
  @js.native
  def registerTestEnv(testEnv: TestEnv): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "setTestEnvs")
  @js.native
  def setTestEnvs(testEnvs: js.Array[TestEnv]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/jasmine_util", "setupTestFilters")
  @js.native
  def setupTestFilters(testFilters: js.Array[TestFilter], customInclude: js.Function1[/* name */ String, Boolean]): Unit = js.native
  
  @js.native
  trait Constraints extends StObject {
    
    var flags: js.UndefOr[Flags] = js.native
    
    var predicate: js.UndefOr[js.Function1[/* testEnv */ TestEnv, Boolean]] = js.native
  }
  object Constraints {
    
    @scala.inline
    def apply(): Constraints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Constraints]
    }
    
    @scala.inline
    implicit class ConstraintsMutableBuilder[Self <: Constraints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: Flags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setPredicate(value: /* testEnv */ TestEnv => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    }
  }
  
  @js.native
  trait TestEnv extends StObject {
    
    var backendName: String = js.native
    
    var flags: js.UndefOr[Flags] = js.native
    
    var isDataSync: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
  }
  object TestEnv {
    
    @scala.inline
    def apply(backendName: String, name: String): TestEnv = {
      val __obj = js.Dynamic.literal(backendName = backendName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestEnv]
    }
    
    @scala.inline
    implicit class TestEnvMutableBuilder[Self <: TestEnv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackendName(value: String): Self = StObject.set(x, "backendName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: Flags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setIsDataSync(value: Boolean): Self = StObject.set(x, "isDataSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDataSyncUndefined: Self = StObject.set(x, "isDataSync", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TestFilter extends StObject {
    
    var excludes: js.UndefOr[js.Array[String]] = js.native
    
    var include: js.UndefOr[String] = js.native
    
    var startsWith: js.UndefOr[String] = js.native
  }
  object TestFilter {
    
    @scala.inline
    def apply(): TestFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestFilter]
    }
    
    @scala.inline
    implicit class TestFilterMutableBuilder[Self <: TestFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      @scala.inline
      def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setStartsWith(value: String): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
    }
  }
}
