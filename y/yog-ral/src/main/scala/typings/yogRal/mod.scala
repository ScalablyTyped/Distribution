package typings.yogRal

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.nodeRal.mod.BalanceContextConstructor
import typings.nodeRal.mod.LoggerFactory
import typings.nodeRal.mod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yog-ral", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  abstract class Balance ()
    extends typings.nodeRal.mod.Balance
  
  @js.native
  abstract class ConfigNormalizer ()
    extends typings.nodeRal.mod.ConfigNormalizer
  
  @js.native
  abstract class Converter ()
    extends typings.nodeRal.mod.Converter
  
  @js.native
  abstract class Protocol ()
    extends typings.nodeRal.mod.Protocol
  
  @js.native
  abstract class RalModule ()
    extends typings.nodeRal.mod.RalModule
  
  val Config: typings.nodeRal.mod.Config = js.native
  val Logger: LoggerFactory = js.native
  def Middleware(): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* resp */ Response_, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  def Middleware(options: Service): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* resp */ Response_, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  /* static members */
  @js.native
  object Balance extends js.Object {
    @js.native
    class BalanceContextClass protected ()
      extends typings.nodeRal.mod.Balance.BalanceContextClass {
      def this(serviceID: String, service: Service) = this()
    }
    
    var BalanceContext: BalanceContextConstructor = js.native
  }
  
  /* static members */
  @js.native
  object Protocol extends js.Object {
    def beforeRequest(context: js.Any): js.Any = js.native
    def normalizeConfig(context: js.Any): js.Any = js.native
  }
  
  @js.native
  object RAL extends js.Object {
    @js.native
    class NormalizerManager ()
      extends typings.nodeRal.mod.RAL.NormalizerManager
    
    @js.native
    class RalRunner protected ()
      extends typings.nodeRal.mod.RAL.RalRunner {
      def this(serviceName: String) = this()
      def this(serviceName: String, options: js.Object) = this()
    }
    
    def apply(serviceName: String): typings.nodeRal.mod.RAL.RalRunner = js.native
    def apply(serviceName: String, options: js.Object): typings.nodeRal.mod.RAL.RalRunner = js.native
    def appendExtPath(extPath: String): Unit = js.native
    def getConf(name: String): typings.nodeRal.mod.Config = js.native
    def getRawConf(name: String): typings.nodeRal.mod.Config = js.native
    def init(): Unit = js.native
    def init(options: js.Object): Unit = js.native
    def reload(): Unit = js.native
    def reload(options: js.Object): Unit = js.native
    def setConfigNormalizer(normalizers: typings.nodeRal.mod.ConfigNormalizer): Unit = js.native
  }
  
  @js.native
  object RALPromise extends js.Object {
    def apply[T](name: String): js.Promise[T] = js.native
    def apply[T](name: String, options: js.Object): js.Promise[T] = js.native
  }
  
  /* static members */
  @js.native
  object RalModule extends js.Object {
    var modules: StringDictionary[typings.nodeRal.mod.RalModule] = js.native
    def clearCache(): Unit = js.native
    def load(pathOrModule: String): Unit = js.native
    def load(pathOrModule: typings.nodeRal.mod.RalModule): Unit = js.native
  }
  
}

