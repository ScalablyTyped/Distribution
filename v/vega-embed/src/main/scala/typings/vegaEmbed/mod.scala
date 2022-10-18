package typings.vegaEmbed

import org.scalablytyped.runtime.Instantiable1
import typings.fastJsonPatch.moduleCoreMod.Operation
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Record
import typings.vega.mod.View
import typings.vegaEmbed.anon.Bottom
import typings.vegaEmbed.anon.Fn
import typings.vegaEmbed.anon.PartialCLICKTOVIEWACTIONS
import typings.vegaEmbed.anon.Png
import typings.vegaEmbed.anon.Svg
import typings.vegaEmbed.anon.TypeofexpressionInterpret
import typings.vegaEmbed.vegaEmbedStrings.dark
import typings.vegaEmbed.vegaEmbedStrings.excel
import typings.vegaEmbed.vegaEmbedStrings.ggplot2
import typings.vegaEmbed.vegaEmbedStrings.quartz
import typings.vegaEmbed.vegaEmbedStrings.vox
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcSpecMod.TopLevelSpec
import typings.vegaTooltip.mod.Options
import typings.vegaTypings.typesRuntimeMod.Item
import typings.vegaTypings.typesRuntimeMod.LoaderOptions
import typings.vegaTypings.typesRuntimeMod.Loader_
import typings.vegaTypings.typesRuntimeMod.TooltipHandler
import typings.vegaTypings.typesRuntimeRendererMod.Renderers
import typings.vegaTypings.typesRuntimeRuntimeMod.Runtime
import typings.vegaTypings.typesSpecEncodeMod.EncodeEntryName
import typings.vegaTypings.typesSpecMod.Spec
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vega-embed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(el: String, spec: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def default(el: String, spec: String, opts: EmbedOptions[String, Renderers]): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def default(el: String, spec: VisualizationSpec): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def default(el: String, spec: VisualizationSpec, opts: EmbedOptions[String, Renderers]): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def default(el: HTMLElement, spec: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def default(el: HTMLElement, spec: String, opts: EmbedOptions[String, Renderers]): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  /**
    * Embed a Vega visualization component in a web page. This function returns a promise.
    *
    * @param el        DOM element in which to place component (DOM node or CSS selector).
    * @param spec      String : A URL string from which to load the Vega specification.
    *                  Object : The Vega/Vega-Lite specification as a parsed JSON object.
    * @param opts       A JavaScript object containing options for embedding.
    */
  inline def default(el: HTMLElement, spec: VisualizationSpec): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def default(el: HTMLElement, spec: VisualizationSpec, opts: EmbedOptions[String, Renderers]): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  object DEFAULT_ACTIONS {
    
    @JSImport("vega-embed", "DEFAULT_ACTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-embed", "DEFAULT_ACTIONS.compiled")
    @js.native
    def compiled: Boolean = js.native
    inline def compiled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compiled")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-embed", "DEFAULT_ACTIONS.editor")
    @js.native
    def editor: Boolean = js.native
    inline def editor_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-embed", "DEFAULT_ACTIONS.export")
    @js.native
    val `export`: Svg = js.native
    
    @JSImport("vega-embed", "DEFAULT_ACTIONS.source")
    @js.native
    def source: Boolean = js.native
    inline def source_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("source")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Try to guess the type of spec.
    *
    * @param spec Vega or Vega-Lite spec.
    */
  inline def guessMode(spec: VisualizationSpec): Mode = ^.asInstanceOf[js.Dynamic].applyDynamic("guessMode")(spec.asInstanceOf[js.Any]).asInstanceOf[Mode]
  inline def guessMode(spec: VisualizationSpec, providedMode: Mode): Mode = (^.asInstanceOf[js.Dynamic].applyDynamic("guessMode")(spec.asInstanceOf[js.Any], providedMode.asInstanceOf[js.Any])).asInstanceOf[Mode]
  
  @JSImport("vega-embed", "version")
  @js.native
  val version: String = js.native
  
  trait Actions extends StObject {
    
    var compiled: js.UndefOr[Boolean] = js.undefined
    
    var editor: js.UndefOr[Boolean] = js.undefined
    
    var `export`: js.UndefOr[Boolean | Png] = js.undefined
    
    var source: js.UndefOr[Boolean] = js.undefined
  }
  object Actions {
    
    inline def apply(): Actions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Actions]
    }
    
    extension [Self <: Actions](x: Self) {
      
      inline def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
      
      inline def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
      
      inline def setEditor(value: Boolean): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      inline def setExport(value: Boolean | Png): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      inline def setSource(value: Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  type Config = (typings.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef]) | typings.vegaTypings.typesSpecConfigMod.Config
  
  trait EmbedOptions[S, R] extends StObject {
    
    var actions: js.UndefOr[Boolean | Actions] = js.undefined
    
    var ast: js.UndefOr[Boolean] = js.undefined
    
    var bind: js.UndefOr[HTMLElement | String] = js.undefined
    
    var config: js.UndefOr[S | Config] = js.undefined
    
    var defaultStyle: js.UndefOr[Boolean | String] = js.undefined
    
    var downloadFileName: js.UndefOr[String] = js.undefined
    
    var editorUrl: js.UndefOr[String] = js.undefined
    
    var expr: js.UndefOr[TypeofexpressionInterpret] = js.undefined
    
    var expressionFunctions: js.UndefOr[ExpressionFunction] = js.undefined
    
    var formatLocale: js.UndefOr[Record[String, Any]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var hover: js.UndefOr[Boolean | Hover] = js.undefined
    
    var i18n: js.UndefOr[PartialCLICKTOVIEWACTIONS] = js.undefined
    
    var loader: js.UndefOr[Loader_ | LoaderOptions] = js.undefined
    
    var logLevel: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
    
    var padding: js.UndefOr[Double | Bottom] = js.undefined
    
    var patch: js.UndefOr[S | PatchFunc | js.Array[Operation]] = js.undefined
    
    var renderer: js.UndefOr[R] = js.undefined
    
    var scaleFactor: js.UndefOr[Double] = js.undefined
    
    var sourceFooter: js.UndefOr[String] = js.undefined
    
    var sourceHeader: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[excel | ggplot2 | quartz | vox | dark] = js.undefined
    
    var timeFormatLocale: js.UndefOr[Record[String, Any]] = js.undefined
    
    var tooltip: js.UndefOr[TooltipHandler | Options | Boolean] = js.undefined
    
    var viewClass: js.UndefOr[Instantiable1[/* runtime */ Runtime, View]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object EmbedOptions {
    
    inline def apply[S, R](): EmbedOptions[S, R] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmbedOptions[S, R]]
    }
    
    extension [Self <: EmbedOptions[?, ?], S, R](x: Self & (EmbedOptions[S, R])) {
      
      inline def setActions(value: Boolean | Actions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setAst(value: Boolean): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      inline def setBind(value: HTMLElement | String): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      inline def setConfig(value: S | Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDefaultStyle(value: Boolean | String): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      inline def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      inline def setDownloadFileName(value: String): Self = StObject.set(x, "downloadFileName", value.asInstanceOf[js.Any])
      
      inline def setDownloadFileNameUndefined: Self = StObject.set(x, "downloadFileName", js.undefined)
      
      inline def setEditorUrl(value: String): Self = StObject.set(x, "editorUrl", value.asInstanceOf[js.Any])
      
      inline def setEditorUrlUndefined: Self = StObject.set(x, "editorUrl", js.undefined)
      
      inline def setExpr(value: TypeofexpressionInterpret): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
      
      inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
      
      inline def setExpressionFunctions(value: ExpressionFunction): Self = StObject.set(x, "expressionFunctions", value.asInstanceOf[js.Any])
      
      inline def setExpressionFunctionsUndefined: Self = StObject.set(x, "expressionFunctions", js.undefined)
      
      inline def setFormatLocale(value: Record[String, Any]): Self = StObject.set(x, "formatLocale", value.asInstanceOf[js.Any])
      
      inline def setFormatLocaleUndefined: Self = StObject.set(x, "formatLocale", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHover(value: Boolean | Hover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setI18n(value: PartialCLICKTOVIEWACTIONS): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setLoader(value: Loader_ | LoaderOptions): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setLogLevel(value: Double): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPadding(value: Double | Bottom): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPatch(value: S | PatchFunc | js.Array[Operation]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchFunction1(value: /* spec */ Spec => Spec): Self = StObject.set(x, "patch", js.Any.fromFunction1(value))
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setPatchVarargs(value: Operation*): Self = StObject.set(x, "patch", js.Array(value*))
      
      inline def setRenderer(value: R): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
      
      inline def setSourceFooter(value: String): Self = StObject.set(x, "sourceFooter", value.asInstanceOf[js.Any])
      
      inline def setSourceFooterUndefined: Self = StObject.set(x, "sourceFooter", js.undefined)
      
      inline def setSourceHeader(value: String): Self = StObject.set(x, "sourceHeader", value.asInstanceOf[js.Any])
      
      inline def setSourceHeaderUndefined: Self = StObject.set(x, "sourceHeader", js.undefined)
      
      inline def setTheme(value: excel | ggplot2 | quartz | vox | dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTimeFormatLocale(value: Record[String, Any]): Self = StObject.set(x, "timeFormatLocale", value.asInstanceOf[js.Any])
      
      inline def setTimeFormatLocaleUndefined: Self = StObject.set(x, "timeFormatLocale", js.undefined)
      
      inline def setTooltip(value: TooltipHandler | Options | Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipFunction4(value: (/* handler */ Any, /* event */ MouseEvent, /* item */ Item[Any], /* value */ Any) => Unit): Self = StObject.set(x, "tooltip", js.Any.fromFunction4(value))
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setViewClass(value: Instantiable1[/* runtime */ Runtime, View]): Self = StObject.set(x, "viewClass", value.asInstanceOf[js.Any])
      
      inline def setViewClassUndefined: Self = StObject.set(x, "viewClass", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type ExpressionFunction = Record[String, Any | Fn]
  
  trait Hover extends StObject {
    
    var hoverSet: js.UndefOr[EncodeEntryName] = js.undefined
    
    var updateSet: js.UndefOr[EncodeEntryName] = js.undefined
  }
  object Hover {
    
    inline def apply(): Hover = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hover]
    }
    
    extension [Self <: Hover](x: Self) {
      
      inline def setHoverSet(value: EncodeEntryName): Self = StObject.set(x, "hoverSet", value.asInstanceOf[js.Any])
      
      inline def setHoverSetUndefined: Self = StObject.set(x, "hoverSet", js.undefined)
      
      inline def setUpdateSet(value: EncodeEntryName): Self = StObject.set(x, "updateSet", value.asInstanceOf[js.Any])
      
      inline def setUpdateSetUndefined: Self = StObject.set(x, "updateSet", js.undefined)
    }
  }
  
  trait MessageData extends StObject {
    
    var config: js.UndefOr[Config] = js.undefined
    
    var file: js.UndefOr[Any] = js.undefined
    
    var mode: Mode
    
    var renderer: js.UndefOr[Renderers] = js.undefined
    
    var spec: String
  }
  object MessageData {
    
    inline def apply(mode: Mode, spec: String): MessageData = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageData]
    }
    
    extension [Self <: MessageData](x: Self) {
      
      inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setFile(value: Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setRenderer(value: Renderers): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setSpec(value: String): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaEmbed.vegaEmbedStrings.vega
    - typings.vegaEmbed.vegaEmbedStrings.`vega-lite`
  */
  trait Mode extends StObject
  object Mode {
    
    inline def vega: typings.vegaEmbed.vegaEmbedStrings.vega = "vega".asInstanceOf[typings.vegaEmbed.vegaEmbedStrings.vega]
    
    inline def `vega-lite`: typings.vegaEmbed.vegaEmbedStrings.`vega-lite` = "vega-lite".asInstanceOf[typings.vegaEmbed.vegaEmbedStrings.`vega-lite`]
  }
  
  type PatchFunc = js.Function1[/* spec */ Spec, Spec]
  
  trait Result extends StObject {
    
    /** The Vega-Embed options. */
    var embedOptions: EmbedOptions[String, Renderers]
    
    /** The input specification. */
    var spec: VisualizationSpec
    
    /** The compiled and patched Vega specification. */
    var vgSpec: Spec
    
    /** The Vega view. */
    var view: View
  }
  object Result {
    
    inline def apply(embedOptions: EmbedOptions[String, Renderers], spec: VisualizationSpec, vgSpec: Spec, view: View): Result = {
      val __obj = js.Dynamic.literal(embedOptions = embedOptions.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], vgSpec = vgSpec.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setEmbedOptions(value: EmbedOptions[String, Renderers]): Self = StObject.set(x, "embedOptions", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: VisualizationSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setVgSpec(value: Spec): Self = StObject.set(x, "vgSpec", value.asInstanceOf[js.Any])
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  type VisualizationSpec = TopLevelSpec | Spec
  
  /* was `typeof vegaImport` */
  object vega {
    
    type Bounds = typings.vega.mod.Bounds
    
    type CanvasHandler = typings.vega.mod.CanvasHandler
    
    type Handler = typings.vega.mod.Handler
    
    type Operator = typings.vega.mod.Operator
    
    type Renderer = typings.vega.mod.Renderer
    
    type Transform = typings.vega.mod.Transform
    
    type View = typings.vega.mod.View
  }
}
