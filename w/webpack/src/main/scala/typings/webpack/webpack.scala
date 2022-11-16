package typings.webpack

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.webpack.anon.DependencyIdModuleId
import typings.webpack.anon.ModuleModuleId
import typings.webpack.webpackStrings.`self-declined`
import typings.webpack.webpackStrings.unaccepted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpack {
  
  trait ApplyOptions extends StObject {
    
    var ignoreDeclined: js.UndefOr[Boolean] = js.undefined
    
    var ignoreErrored: js.UndefOr[Boolean] = js.undefined
    
    var ignoreUnaccepted: js.UndefOr[Boolean] = js.undefined
    
    var onAccepted: js.UndefOr[js.Function1[/* callback */ js.Function1[/* info */ HotEvent, Unit], Unit]] = js.undefined
    
    var onDeclined: js.UndefOr[js.Function1[/* callback */ js.Function1[/* info */ HotEvent, Unit], Unit]] = js.undefined
    
    var onDisposed: js.UndefOr[js.Function1[/* callback */ js.Function1[/* info */ HotEvent, Unit], Unit]] = js.undefined
    
    var onErrored: js.UndefOr[js.Function1[/* callback */ js.Function1[/* info */ HotEvent, Unit], Unit]] = js.undefined
    
    var onUnaccepted: js.UndefOr[js.Function1[/* callback */ js.Function1[/* info */ HotEvent, Unit], Unit]] = js.undefined
  }
  object ApplyOptions {
    
    inline def apply(): ApplyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplyOptions]
    }
    
    extension [Self <: ApplyOptions](x: Self) {
      
      inline def setIgnoreDeclined(value: Boolean): Self = StObject.set(x, "ignoreDeclined", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDeclinedUndefined: Self = StObject.set(x, "ignoreDeclined", js.undefined)
      
      inline def setIgnoreErrored(value: Boolean): Self = StObject.set(x, "ignoreErrored", value.asInstanceOf[js.Any])
      
      inline def setIgnoreErroredUndefined: Self = StObject.set(x, "ignoreErrored", js.undefined)
      
      inline def setIgnoreUnaccepted(value: Boolean): Self = StObject.set(x, "ignoreUnaccepted", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnacceptedUndefined: Self = StObject.set(x, "ignoreUnaccepted", js.undefined)
      
      inline def setOnAccepted(value: /* callback */ js.Function1[/* info */ HotEvent, Unit] => Unit): Self = StObject.set(x, "onAccepted", js.Any.fromFunction1(value))
      
      inline def setOnAcceptedUndefined: Self = StObject.set(x, "onAccepted", js.undefined)
      
      inline def setOnDeclined(value: /* callback */ js.Function1[/* info */ HotEvent, Unit] => Unit): Self = StObject.set(x, "onDeclined", js.Any.fromFunction1(value))
      
      inline def setOnDeclinedUndefined: Self = StObject.set(x, "onDeclined", js.undefined)
      
      inline def setOnDisposed(value: /* callback */ js.Function1[/* info */ HotEvent, Unit] => Unit): Self = StObject.set(x, "onDisposed", js.Any.fromFunction1(value))
      
      inline def setOnDisposedUndefined: Self = StObject.set(x, "onDisposed", js.undefined)
      
      inline def setOnErrored(value: /* callback */ js.Function1[/* info */ HotEvent, Unit] => Unit): Self = StObject.set(x, "onErrored", js.Any.fromFunction1(value))
      
      inline def setOnErroredUndefined: Self = StObject.set(x, "onErrored", js.undefined)
      
      inline def setOnUnaccepted(value: /* callback */ js.Function1[/* info */ HotEvent, Unit] => Unit): Self = StObject.set(x, "onUnaccepted", js.Any.fromFunction1(value))
      
      inline def setOnUnacceptedUndefined: Self = StObject.set(x, "onUnaccepted", js.undefined)
    }
  }
  
  @js.native
  trait Context extends StObject {
    
    def apply(dependency: String): Any = js.native
    
    var id: String | Double = js.native
    
    def keys(): js.Array[String] = js.native
    
    def resolve(dependency: String): String | Double = js.native
  }
  
  trait ExportInfo extends StObject {
    
    var canMangle: Boolean
    
    var provideInfo: js.UndefOr[Boolean | Null] = js.undefined
    
    var useInfo: js.UndefOr[Boolean | Null] = js.undefined
    
    var used: Boolean
  }
  object ExportInfo {
    
    inline def apply(canMangle: Boolean, used: Boolean): ExportInfo = {
      val __obj = js.Dynamic.literal(canMangle = canMangle.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportInfo]
    }
    
    extension [Self <: ExportInfo](x: Self) {
      
      inline def setCanMangle(value: Boolean): Self = StObject.set(x, "canMangle", value.asInstanceOf[js.Any])
      
      inline def setProvideInfo(value: Boolean): Self = StObject.set(x, "provideInfo", value.asInstanceOf[js.Any])
      
      inline def setProvideInfoNull: Self = StObject.set(x, "provideInfo", null)
      
      inline def setProvideInfoUndefined: Self = StObject.set(x, "provideInfo", js.undefined)
      
      inline def setUseInfo(value: Boolean): Self = StObject.set(x, "useInfo", value.asInstanceOf[js.Any])
      
      inline def setUseInfoNull: Self = StObject.set(x, "useInfo", null)
      
      inline def setUseInfoUndefined: Self = StObject.set(x, "useInfo", js.undefined)
      
      inline def setUsed(value: Boolean): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ExportsInfo = {[k: string] : webpack.webpack.ExportInfo & webpack.webpack.ExportsInfo}
  }}}
  to avoid circular code involving: 
  - webpack.webpack.ExportsInfo
  */
  trait ExportsInfo
    extends StObject
       with /* k */ StringDictionary[ExportInfo & ExportsInfo]
  object ExportsInfo {
    
    inline def apply(): ExportsInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportsInfo]
    }
  }
  
  @js.native
  trait Hot extends StObject {
    
    def accept(): Unit = js.native
    def accept(errorHandler: js.Function2[/* err */ js.Error, /* ids */ ModuleModuleId, Unit]): Unit = js.native
    def accept(modules: String): Unit = js.native
    def accept(modules: String, callback: js.Function1[/* outdatedDependencies */ js.Array[String], Unit]): Unit = js.native
    def accept(
      modules: String,
      callback: js.Function1[/* outdatedDependencies */ js.Array[String], Unit],
      errorHandler: js.Function2[/* err */ js.Error, /* context */ DependencyIdModuleId, Unit]
    ): Unit = js.native
    def accept(
      modules: String,
      callback: Unit,
      errorHandler: js.Function2[/* err */ js.Error, /* context */ DependencyIdModuleId, Unit]
    ): Unit = js.native
    def accept(modules: js.Array[String]): Unit = js.native
    def accept(
      modules: js.Array[String],
      callback: js.Function1[/* outdatedDependencies */ js.Array[String], Unit]
    ): Unit = js.native
    def accept(
      modules: js.Array[String],
      callback: js.Function1[/* outdatedDependencies */ js.Array[String], Unit],
      errorHandler: js.Function2[/* err */ js.Error, /* context */ DependencyIdModuleId, Unit]
    ): Unit = js.native
    def accept(
      modules: js.Array[String],
      callback: Unit,
      errorHandler: js.Function2[/* err */ js.Error, /* context */ DependencyIdModuleId, Unit]
    ): Unit = js.native
    
    def addDisposeHandler(callback: js.Function1[/* data */ js.Object, Unit]): Unit = js.native
    
    def addStatusHandler(callback: js.Function1[/* status */ HotUpdateStatus, Unit]): Unit = js.native
    
    @JSName("apply")
    def apply(): js.Promise[(js.Array[String | Double]) | Null] = js.native
    @JSName("apply")
    def apply(options: ApplyOptions): js.Promise[(js.Array[String | Double]) | Null] = js.native
    
    def check(): js.Promise[(js.Array[String | Double]) | Null] = js.native
    def check(autoApply: Boolean): js.Promise[(js.Array[String | Double]) | Null] = js.native
    def check(autoApply: ApplyOptions): js.Promise[(js.Array[String | Double]) | Null] = js.native
    
    var data: js.Object = js.native
    
    def decline(): Unit = js.native
    def decline(module: String): Unit = js.native
    def decline(module: js.Array[String]): Unit = js.native
    
    def dispose(callback: js.Function1[/* data */ js.Object, Unit]): Unit = js.native
    
    def invalidate(): Unit = js.native
    
    def removeDisposeHandler(callback: js.Function1[/* data */ js.Object, Unit]): Unit = js.native
    
    def removeStatusHandler(callback: js.Function1[/* status */ HotUpdateStatus, Unit]): Unit = js.native
    
    def status(): HotUpdateStatus = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpack.anon.ModuleId
    - typings.webpack.anon.Chain
    - typings.webpack.anon.ParentId
    - typings.webpack.anon.OutdatedDependencies
    - typings.webpack.anon.DependencyId
    - typings.webpack.anon.Error
    - typings.webpack.anon.Type
    - typings.webpack.anon.ErrorModuleId
  */
  trait HotEvent extends StObject
  object HotEvent {
    
    inline def Chain(chain: js.Array[Double], moduleId: Double, `type`: `self-declined` | unaccepted): typings.webpack.anon.Chain = {
      val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.webpack.anon.Chain]
    }
    
    inline def DependencyId(dependencyId: Double, error: js.Error, moduleId: Double, originalError: js.Error): typings.webpack.anon.DependencyId = {
      val __obj = js.Dynamic.literal(dependencyId = dependencyId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("accept-error-handler-errored")
      __obj.asInstanceOf[typings.webpack.anon.DependencyId]
    }
    
    inline def Error(error: js.Error, moduleId: Double, originalError: js.Error): typings.webpack.anon.Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("self-accept-error-handler-errored")
      __obj.asInstanceOf[typings.webpack.anon.Error]
    }
    
    inline def ErrorModuleId(error: js.Error, moduleId: Double): typings.webpack.anon.ErrorModuleId = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("self-accept-errored")
      __obj.asInstanceOf[typings.webpack.anon.ErrorModuleId]
    }
    
    inline def ModuleId(moduleId: Double): typings.webpack.anon.ModuleId = {
      val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("disposed")
      __obj.asInstanceOf[typings.webpack.anon.ModuleId]
    }
    
    inline def OutdatedDependencies(
      chain: js.Array[Double],
      moduleId: Double,
      outdatedDependencies: NumberDictionary[js.Array[Double]],
      outdatedModules: js.Array[Double]
    ): typings.webpack.anon.OutdatedDependencies = {
      val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], outdatedDependencies = outdatedDependencies.asInstanceOf[js.Any], outdatedModules = outdatedModules.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("accepted")
      __obj.asInstanceOf[typings.webpack.anon.OutdatedDependencies]
    }
    
    inline def ParentId(chain: js.Array[Double], moduleId: Double, parentId: Double): typings.webpack.anon.ParentId = {
      val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("declined")
      __obj.asInstanceOf[typings.webpack.anon.ParentId]
    }
    
    inline def Type(dependencyId: Double, error: js.Error, moduleId: Double): typings.webpack.anon.Type = {
      val __obj = js.Dynamic.literal(dependencyId = dependencyId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("accept-errored")
      __obj.asInstanceOf[typings.webpack.anon.Type]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpack.webpackStrings.idle
    - typings.webpack.webpackStrings.check
    - typings.webpack.webpackStrings.prepare
    - typings.webpack.webpackStrings.ready
    - typings.webpack.webpackStrings.dispose
    - typings.webpack.webpackStrings.apply
    - typings.webpack.webpackStrings.abort
    - typings.webpack.webpackStrings.fail
  */
  trait HotUpdateStatus extends StObject
  object HotUpdateStatus {
    
    inline def abort: typings.webpack.webpackStrings.abort = "abort".asInstanceOf[typings.webpack.webpackStrings.abort]
    
    inline def apply: typings.webpack.webpackStrings.apply = "apply".asInstanceOf[typings.webpack.webpackStrings.apply]
    
    inline def check: typings.webpack.webpackStrings.check = "check".asInstanceOf[typings.webpack.webpackStrings.check]
    
    inline def dispose: typings.webpack.webpackStrings.dispose = "dispose".asInstanceOf[typings.webpack.webpackStrings.dispose]
    
    inline def fail: typings.webpack.webpackStrings.fail = "fail".asInstanceOf[typings.webpack.webpackStrings.fail]
    
    inline def idle: typings.webpack.webpackStrings.idle = "idle".asInstanceOf[typings.webpack.webpackStrings.idle]
    
    inline def prepare: typings.webpack.webpackStrings.prepare = "prepare".asInstanceOf[typings.webpack.webpackStrings.prepare]
    
    inline def ready: typings.webpack.webpackStrings.ready = "ready".asInstanceOf[typings.webpack.webpackStrings.ready]
  }
}
