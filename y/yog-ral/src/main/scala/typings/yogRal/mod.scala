package typings.yogRal

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.nodeRal.mod.BalanceContextConstructor
import typings.nodeRal.mod.LoggerFactory
import typings.nodeRal.mod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yog-ral", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Config: typings.nodeRal.mod.Config = js.native
  
  val Logger: LoggerFactory = js.native
  
  def Middleware(): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* resp */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  def Middleware(options: Service): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* resp */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  
  @js.native
  abstract class Balance ()
    extends typings.nodeRal.mod.Balance
  /* static members */
  @js.native
  object Balance extends js.Object {
    
    var BalanceContext: BalanceContextConstructor = js.native
    
    @js.native
    class BalanceContextClass protected ()
      extends typings.nodeRal.mod.Balance.BalanceContextClass {
      def this(serviceID: String, service: Service) = this()
    }
  }
  
  @js.native
  abstract class ConfigNormalizer ()
    extends typings.nodeRal.mod.ConfigNormalizer
  
  @js.native
  abstract class Converter ()
    extends typings.nodeRal.mod.Converter
  
  @js.native
  abstract class Protocol ()
    extends typings.nodeRal.mod.Protocol
  /* static members */
  @js.native
  object Protocol extends js.Object {
    
    def beforeRequest(context: js.Any): js.Any = js.native
    
    def normalizeConfig(context: js.Any): js.Any = js.native
  }
  
  @js.native
  object RAL extends js.Object {
    
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
    
    @js.native
    class NormalizerManager ()
      extends typings.nodeRal.mod.RAL.NormalizerManager
    
    @js.native
    class RalRunner protected ()
      extends typings.nodeRal.mod.RAL.RalRunner {
      def this(serviceName: String) = this()
      def this(serviceName: String, options: js.Object) = this()
    }
  }
  
  @js.native
  object RALPromise extends js.Object {
    
    def apply[T](name: String): js.Promise[T] = js.native
    def apply[T](name: String, options: js.Object): js.Promise[T] = js.native
  }
  
  @js.native
  abstract class RalModule ()
    extends typings.nodeRal.mod.RalModule
  /* static members */
  @js.native
  object RalModule extends js.Object {
    
    def clearCache(): Unit = js.native
    
    def load(pathOrModule: String): Unit = js.native
    def load(pathOrModule: typings.nodeRal.mod.RalModule): Unit = js.native
    
    var modules: StringDictionary[typings.nodeRal.mod.RalModule] = js.native
  }
}
