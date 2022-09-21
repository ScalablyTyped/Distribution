package typings.yogBigpipe

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.std.Record
import typings.yogBigpipe.anon.Default
import typings.yogBigpipe.anon.Dictkey
import typings.yogBigpipe.mod.Pagelet.mode
import typings.yogBigpipe.mod.Pagelet.status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(option: BigPipeOption): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(option.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("yog-bigpipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yog-bigpipe", "BigPipe")
  @js.native
  open class BigPipe () extends Readable {
    def this(option: BigPipeOption) = this()
    
    var Pagelet: PageletConstructor[typings.yogBigpipe.mod.Pagelet] = js.native
    
    def _checkFinish(): Unit = js.native
    
    def _markPageletRendered(pagelet: Pagelet): Unit = js.native
    
    def _onPageletDone(pagelet: Pagelet): Unit = js.native
    
    def addPagelet(obj: AddPageletConfig): Unit = js.native
    
    def addQuicklingPagelets(pagelets: js.Array[String]): Unit = js.native
    
    def bind(id: String, fn: Callback): BigPipe = js.native
    
    def bindPageOnly(fn: Callback): Unit = js.native
    
    def format(pagelet: Pagelet): String = js.native
    
    def isQuickingMode(): Boolean = js.native
    
    def isQuicklingMode(): Boolean = js.native
    
    def isQuicklingWidget(item: Dictkey): Unit = js.native
    
    var map: StringDictionary[Pagelet] = js.native
    
    def outputPagelet(pagelet: Pagelet): Unit = js.native
    
    var pagelets: js.Array[Pagelet] = js.native
    
    var parentQuicklings: js.Array[String] = js.native
    
    var pipelines: js.Array[Pagelet] = js.native
    
    def prepareAllSources(): js.Promise[Any] = js.native
    
    def preparePageOnly(): js.Promise[Any] = js.native
    
    def render(): Unit = js.native
    
    def renderPagelet(pagelet: Pagelet): Unit = js.native
    
    var rendered: js.Array[Pagelet] = js.native
    
    var state: status = js.native
  }
  
  @JSImport("yog-bigpipe", "Pagelet")
  @js.native
  open class Pagelet protected () extends EventEmitter {
    def this(obj: PageletOption) = this()
    
    def addCss(css: String): Unit = js.native
    def addCss(css: js.Array[String]): Unit = js.native
    
    def addCsses(css: String): Unit = js.native
    def addCsses(css: js.Array[String]): Unit = js.native
    
    def addJs(css: String): Unit = js.native
    def addJs(css: js.Array[String]): Unit = js.native
    
    def addJses(css: String): Unit = js.native
    def addJses(css: js.Array[String]): Unit = js.native
    
    def addScript(css: String): Unit = js.native
    def addScript(css: js.Array[String]): Unit = js.native
    
    def addScripts(css: String): Unit = js.native
    def addScripts(css: js.Array[String]): Unit = js.native
    
    def addStyle(css: String): Unit = js.native
    def addStyle(css: js.Array[String]): Unit = js.native
    
    def addStyles(css: String): Unit = js.native
    def addStyles(css: js.Array[String]): Unit = js.native
    
    var compiled: Boolean = js.native
    
    var container: String = js.native
    
    var css: js.Array[String] = js.native
    
    def destroy(): Unit = js.native
    
    var html: String = js.native
    
    var id: String = js.native
    
    @JSName("js")
    var js_ : js.Array[String] = js.native
    
    var mode: mode = js.native
    
    var reqID: String = js.native
    
    var scripts: js.Array[String] = js.native
    
    var skipAnalysis: Boolean = js.native
    
    def start(provider: js.Promise[Any], sync: Boolean): Unit = js.native
    
    var state: status = js.native
    
    var styles: js.Array[String] = js.native
    
    def toJson(): PageletData = js.native
  }
  object Pagelet {
    
    /* Rewritten from type alias, can be one of: 
      - typings.yogBigpipe.yogBigpipeStrings.async
      - typings.yogBigpipe.yogBigpipeStrings.pipeline
      - typings.yogBigpipe.yogBigpipeStrings.quickling
    */
    trait mode extends StObject
    object mode {
      
      inline def async: typings.yogBigpipe.yogBigpipeStrings.async = "async".asInstanceOf[typings.yogBigpipe.yogBigpipeStrings.async]
      
      inline def pipeline: typings.yogBigpipe.yogBigpipeStrings.pipeline = "pipeline".asInstanceOf[typings.yogBigpipe.yogBigpipeStrings.pipeline]
      
      inline def quickling: typings.yogBigpipe.yogBigpipeStrings.quickling = "quickling".asInstanceOf[typings.yogBigpipe.yogBigpipeStrings.quickling]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.yogBigpipe.yogBigpipeStrings.pending
      - typings.yogBigpipe.yogBigpipeStrings.rendering
      - typings.yogBigpipe.yogBigpipeStrings.fulfilled
      - typings.yogBigpipe.yogBigpipeStrings.failed
    */
    trait status extends StObject
    object status {
      
      inline def failed: typings.yogBigpipe.yogBigpipeStrings.failed = "failed".asInstanceOf[typings.yogBigpipe.yogBigpipeStrings.failed]
      
      inline def fulfilled: typings.yogBigpipe.yogBigpipeStrings.fulfilled = "fulfilled".asInstanceOf[typings.yogBigpipe.yogBigpipeStrings.fulfilled]
      
      inline def pending: typings.yogBigpipe.yogBigpipeStrings.pending = "pending".asInstanceOf[typings.yogBigpipe.yogBigpipeStrings.pending]
      
      inline def rendering: typings.yogBigpipe.yogBigpipeStrings.rendering = "rendering".asInstanceOf[typings.yogBigpipe.yogBigpipeStrings.rendering]
    }
  }
  
  trait AddPageletConfig extends StObject {
    
    var id: String
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[typings.yogBigpipe.mod.Pagelet.mode] = js.undefined
  }
  object AddPageletConfig {
    
    inline def apply(id: String): AddPageletConfig = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddPageletConfig]
    }
    
    extension [Self <: AddPageletConfig](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait BigPipeOption extends StObject {
    
    var skipAnalysis: js.UndefOr[Boolean] = js.undefined
    
    var tpl: js.UndefOr[Default] = js.undefined
  }
  object BigPipeOption {
    
    inline def apply(): BigPipeOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BigPipeOption]
    }
    
    extension [Self <: BigPipeOption](x: Self) {
      
      inline def setSkipAnalysis(value: Boolean): Self = StObject.set(x, "skipAnalysis", value.asInstanceOf[js.Any])
      
      inline def setSkipAnalysisUndefined: Self = StObject.set(x, "skipAnalysis", js.undefined)
      
      inline def setTpl(value: Default): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
      
      inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
    }
  }
  
  type Callback = js.Function1[/* done */ js.Function2[/* err */ Any, /* data */ Any, Any], Any]
  
  type PageletConstructor[T] = Instantiable1[/* obj */ PageletOption, T]
  
  trait PageletData extends StObject {
    
    var container: String
    
    var css: js.Array[String]
    
    var html: String
    
    var id: String
    
    @JSName("js")
    var js_ : js.Array[String]
    
    var reqID: String
    
    var scripts: js.Array[String]
    
    var styles: js.Array[String]
  }
  object PageletData {
    
    inline def apply(
      container: String,
      css: js.Array[String],
      html: String,
      id: String,
      js_ : js.Array[String],
      reqID: String,
      scripts: js.Array[String],
      styles: js.Array[String]
    ): PageletData = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reqID = reqID.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageletData]
    }
    
    extension [Self <: PageletData](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value*))
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJs_(value: js.Array[String]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Varargs(value: String*): Self = StObject.set(x, "js", js.Array(value*))
      
      inline def setReqID(value: String): Self = StObject.set(x, "reqID", value.asInstanceOf[js.Any])
      
      inline def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value*))
      
      inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    }
  }
  
  trait PageletOption extends StObject {
    
    var compiled: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[String] = js.undefined
    
    var `for`: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var locals: js.UndefOr[js.Object] = js.undefined
    
    var mode: js.UndefOr[typings.yogBigpipe.mod.Pagelet.mode] = js.undefined
    
    var reqID: String
    
    var skipAnalysis: Boolean
  }
  object PageletOption {
    
    inline def apply(id: String, reqID: String, skipAnalysis: Boolean): PageletOption = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], reqID = reqID.asInstanceOf[js.Any], skipAnalysis = skipAnalysis.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageletOption]
    }
    
    extension [Self <: PageletOption](x: Self) {
      
      inline def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
      
      inline def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setLocals(value: js.Object): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setReqID(value: String): Self = StObject.set(x, "reqID", value.asInstanceOf[js.Any])
      
      inline def setSkipAnalysis(value: Boolean): Self = StObject.set(x, "skipAnalysis", value.asInstanceOf[js.Any])
    }
  }
}
