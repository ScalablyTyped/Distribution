package typings.yogRal

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.nodeRal.mod.BalanceContextConstructor
import typings.nodeRal.mod.LoggerFactory
import typings.nodeRal.mod.Service
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yog-ral", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yog-ral", "Balance")
  @js.native
  abstract class Balance ()
    extends typings.nodeRal.mod.Balance
  /* static members */
  object Balance {
    
    @JSImport("yog-ral", "Balance")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yog-ral", "Balance.BalanceContext")
    @js.native
    def BalanceContext: BalanceContextConstructor = js.native
    
    @JSImport("yog-ral", "Balance.BalanceContextClass")
    @js.native
    open class BalanceContextClass protected ()
      extends typings.nodeRal.mod.Balance.BalanceContextClass {
      def this(serviceID: String, service: Service) = this()
    }
    
    inline def BalanceContext_=(x: BalanceContextConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BalanceContext")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("yog-ral", "Config")
  @js.native
  val Config: typings.nodeRal.mod.Config = js.native
  
  @JSImport("yog-ral", "ConfigNormalizer")
  @js.native
  abstract class ConfigNormalizer ()
    extends typings.nodeRal.mod.ConfigNormalizer
  
  @JSImport("yog-ral", "Converter")
  @js.native
  abstract class Converter ()
    extends typings.nodeRal.mod.Converter
  
  @JSImport("yog-ral", "Logger")
  @js.native
  val Logger: LoggerFactory = js.native
  
  inline def Middleware(): js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resp */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Middleware")().asInstanceOf[js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resp */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ]]
  inline def Middleware(options: Service): js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resp */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Middleware")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resp */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ]]
  
  @JSImport("yog-ral", "Protocol")
  @js.native
  abstract class Protocol ()
    extends typings.nodeRal.mod.Protocol
  /* static members */
  object Protocol {
    
    @JSImport("yog-ral", "Protocol")
    @js.native
    val ^ : js.Any = js.native
    
    inline def beforeRequest(context: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeRequest")(context.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def normalizeConfig(context: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeConfig")(context.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  object RAL {
    
    inline def apply(serviceName: String): typings.nodeRal.mod.RAL.RalRunner = ^.asInstanceOf[js.Dynamic].apply(serviceName.asInstanceOf[js.Any]).asInstanceOf[typings.nodeRal.mod.RAL.RalRunner]
    inline def apply(serviceName: String, options: js.Object): typings.nodeRal.mod.RAL.RalRunner = (^.asInstanceOf[js.Dynamic].apply(serviceName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeRal.mod.RAL.RalRunner]
    
    @JSImport("yog-ral", "RAL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yog-ral", "RAL.NormalizerManager")
    @js.native
    open class NormalizerManager ()
      extends typings.nodeRal.mod.RAL.NormalizerManager
    
    @JSImport("yog-ral", "RAL.RalRunner")
    @js.native
    open class RalRunner protected ()
      extends typings.nodeRal.mod.RAL.RalRunner {
      def this(serviceName: String) = this()
      def this(serviceName: String, options: js.Object) = this()
    }
    
    inline def appendExtPath(extPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("appendExtPath")(extPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getConf(name: String): typings.nodeRal.mod.Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getConf")(name.asInstanceOf[js.Any]).asInstanceOf[typings.nodeRal.mod.Config]
    
    inline def getRawConf(name: String): typings.nodeRal.mod.Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawConf")(name.asInstanceOf[js.Any]).asInstanceOf[typings.nodeRal.mod.Config]
    
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    inline def init(options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def reload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")().asInstanceOf[Unit]
    inline def reload(options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setConfigNormalizer(normalizers: typings.nodeRal.mod.ConfigNormalizer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfigNormalizer")(normalizers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def RALPromise[T](name: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("RALPromise")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def RALPromise[T](name: String, options: js.Object): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("RALPromise")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("yog-ral", "RalModule")
  @js.native
  abstract class RalModule ()
    extends typings.nodeRal.mod.RalModule
  /* static members */
  object RalModule {
    
    @JSImport("yog-ral", "RalModule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
    
    inline def load(pathOrModule: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(pathOrModule.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def load(pathOrModule: typings.nodeRal.mod.RalModule): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(pathOrModule.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("yog-ral", "RalModule.modules")
    @js.native
    def modules: StringDictionary[typings.nodeRal.mod.RalModule] = js.native
    inline def modules_=(x: StringDictionary[typings.nodeRal.mod.RalModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
  }
}
