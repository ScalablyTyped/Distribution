package typings.yogDashRal

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.nodeDashRal.nodeDashRalMod.BalanceContextConstructor
import typings.nodeDashRal.nodeDashRalMod.LoggerFactory
import typings.nodeDashRal.nodeDashRalMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yog-ral", JSImport.Namespace)
@js.native
object yogDashRalMod extends js.Object {
  @js.native
  abstract class Balance ()
    extends typings.nodeDashRal.nodeDashRalMod.Balance
  
  @js.native
  abstract class ConfigNormalizer ()
    extends typings.nodeDashRal.nodeDashRalMod.ConfigNormalizer
  
  @js.native
  abstract class Converter ()
    extends typings.nodeDashRal.nodeDashRalMod.Converter
  
  @js.native
  abstract class Protocol ()
    extends typings.nodeDashRal.nodeDashRalMod.Protocol
  
  @js.native
  abstract class RalModule ()
    extends typings.nodeDashRal.nodeDashRalMod.RalModule
  
  val Config: typings.nodeDashRal.nodeDashRalMod.Config = js.native
  val Logger: LoggerFactory = js.native
  def Middleware(): js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* resp */ Response, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  def Middleware(options: Service): js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* resp */ Response, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  /* static members */
  @js.native
  object Balance extends js.Object {
    @js.native
    class BalanceContextClass protected ()
      extends typings.nodeDashRal.nodeDashRalMod.Balance.BalanceContextClass {
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
      extends typings.nodeDashRal.nodeDashRalMod.RAL.NormalizerManager
    
    @js.native
    class RalRunner protected ()
      extends typings.nodeDashRal.nodeDashRalMod.RAL.RalRunner {
      def this(serviceName: String) = this()
      def this(serviceName: String, options: js.Object) = this()
    }
    
    def apply(serviceName: String): typings.nodeDashRal.nodeDashRalMod.RAL.RalRunner = js.native
    def apply(serviceName: String, options: js.Object): typings.nodeDashRal.nodeDashRalMod.RAL.RalRunner = js.native
    def appendExtPath(extPath: String): Unit = js.native
    def getConf(name: String): typings.nodeDashRal.nodeDashRalMod.Config = js.native
    def getRawConf(name: String): typings.nodeDashRal.nodeDashRalMod.Config = js.native
    def init(): Unit = js.native
    def init(options: js.Object): Unit = js.native
    def reload(): Unit = js.native
    def reload(options: js.Object): Unit = js.native
    def setConfigNormalizer(normalizers: typings.nodeDashRal.nodeDashRalMod.ConfigNormalizer): Unit = js.native
  }
  
  @js.native
  object RALPromise extends js.Object {
    def apply[T](name: String): js.Promise[T] = js.native
    def apply[T](name: String, options: js.Object): js.Promise[T] = js.native
  }
  
  /* static members */
  @js.native
  object RalModule extends js.Object {
    var modules: StringDictionary[typings.nodeDashRal.nodeDashRalMod.RalModule] = js.native
    def clearCache(): Unit = js.native
    def load(pathOrModule: String): Unit = js.native
    def load(pathOrModule: typings.nodeDashRal.nodeDashRalMod.RalModule): Unit = js.native
  }
  
}

