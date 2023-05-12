package typings.vegaEmbed

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.Expression
import typings.estree.mod.SequenceExpression
import typings.fastJsonPatch.moduleCoreMod.Operation
import typings.std.ArrayLike
import typings.std.Extract
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.PropertyKey
import typings.std.ReadonlySet
import typings.std.Record
import typings.std.Set
import typings.vega.mod.View
import typings.vegaEmbed.anon.Bottom
import typings.vegaEmbed.anon.PartialCLICKTOVIEWACTIONS
import typings.vegaEmbed.anon.Png
import typings.vegaEmbed.anon.PngSvg
import typings.vegaEmbed.anon.Svg
import typings.vegaEmbed.anon.TypeofexpressionInterpret
import typings.vegaEmbed.vegaEmbedBooleans.`false`
import typings.vegaEmbed.vegaEmbedBooleans.`true`
import typings.vegaEmbed.vegaEmbedInts.`0`
import typings.vegaEmbed.vegaEmbedInts.`1`
import typings.vegaEmbed.vegaEmbedStrings.DEBUG
import typings.vegaEmbed.vegaEmbedStrings.ERROR
import typings.vegaEmbed.vegaEmbedStrings.INFO
import typings.vegaEmbed.vegaEmbedStrings.WARN
import typings.vegaEmbed.vegaEmbedStrings.center
import typings.vegaEmbed.vegaEmbedStrings.dark
import typings.vegaEmbed.vegaEmbedStrings.datum
import typings.vegaEmbed.vegaEmbedStrings.datumDotdatum
import typings.vegaEmbed.vegaEmbedStrings.error_
import typings.vegaEmbed.vegaEmbedStrings.excel
import typings.vegaEmbed.vegaEmbedStrings.ggplot2
import typings.vegaEmbed.vegaEmbedStrings.left
import typings.vegaEmbed.vegaEmbedStrings.log
import typings.vegaEmbed.vegaEmbedStrings.parent
import typings.vegaEmbed.vegaEmbedStrings.quartz
import typings.vegaEmbed.vegaEmbedStrings.right
import typings.vegaEmbed.vegaEmbedStrings.vox
import typings.vegaEmbed.vegaEmbedStrings.warn_
import typings.vegaExpression.anon.Code
import typings.vegaExpression.mod.CodegenOptions
import typings.vegaLite.anon.Normalized
import typings.vegaLite.buildSrcCompileCompileMod.CompileOptions
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcLogicalMod.LogicalComposition
import typings.vegaLite.buildSrcSpecBaseMod.LayoutSizeMixins
import typings.vegaLite.buildSrcSpecMod.NormalizedSpec
import typings.vegaLite.buildSrcSpecMod.TopLevelSpec
import typings.vegaLite.buildSrcSpecToplevelMod.TopLevel
import typings.vegaLite.buildSrcUtilMod.DeepPartial
import typings.vegaLite.buildSrcUtilMod.Dict
import typings.vegaTooltip.mod.Options
import typings.vegaTypings.anon.Ast
import typings.vegaTypings.typesRuntimeDataflowMod.Changeset_
import typings.vegaTypings.typesRuntimeMod.Item
import typings.vegaTypings.typesRuntimeMod.LoaderOptions
import typings.vegaTypings.typesRuntimeMod.Loader_
import typings.vegaTypings.typesRuntimeMod.TooltipHandler
import typings.vegaTypings.typesRuntimeMod.TypeInference
import typings.vegaTypings.typesRuntimeMod.ViewOptions
import typings.vegaTypings.typesRuntimeRendererMod.RenderModule_
import typings.vegaTypings.typesRuntimeRendererMod.Renderers
import typings.vegaTypings.typesRuntimeRuntimeMod.Runtime
import typings.vegaTypings.typesRuntimeSceneMod.Scene
import typings.vegaTypings.typesRuntimeSceneMod.SceneGroup
import typings.vegaTypings.typesRuntimeSceneMod.SceneItem
import typings.vegaTypings.typesSpecDataMod.Format
import typings.vegaTypings.typesSpecEncodeMod.EncodeEntryName
import typings.vegaTypings.typesSpecMod.Spec
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaUtil.mod.AccessorFn
import typings.vegaUtil.mod.FastMap_
import typings.vegaUtil.mod.Fn
import typings.vegaUtil.mod.LoggerInterface
import typings.vegaUtil.mod.Order
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
  
  /* was `typeof vegaImport` */
  object vega {
    
    @JSImport("vega-embed", "vega")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-embed", "vega.Bounds")
    @js.native
    open class Bounds ()
      extends typings.vega.mod.Bounds
    
    @JSImport("vega-embed", "vega.CanvasHandler")
    @js.native
    open class CanvasHandler ()
      extends typings.vega.mod.CanvasHandler
    
    @JSImport("vega-embed", "vega.Debug")
    @js.native
    val Debug: Double = js.native
    
    @JSImport("vega-embed", "vega.Error")
    @js.native
    val Error_ : Double = js.native
    
    @JSImport("vega-embed", "vega.Handler")
    @js.native
    open class Handler ()
      extends typings.vega.mod.Handler
    
    @JSImport("vega-embed", "vega.Info")
    @js.native
    val Info: Double = js.native
    
    @JSImport("vega-embed", "vega.None")
    @js.native
    val None: Double = js.native
    
    @JSImport("vega-embed", "vega.Operator")
    @js.native
    open class Operator ()
      extends typings.vega.mod.Operator {
      def this(init: Any) = this()
      def this(init: Any, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any]) = this()
      def this(init: Unit, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any]) = this()
      def this(init: Any, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Any) = this()
      def this(init: Any, update: Unit, params: Any) = this()
      def this(init: Unit, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Any) = this()
      def this(init: Unit, update: Unit, params: Any) = this()
      def this(init: Any, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Any, react: Boolean) = this()
      def this(init: Any, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Unit, react: Boolean) = this()
      def this(init: Any, update: Unit, params: Any, react: Boolean) = this()
      def this(init: Any, update: Unit, params: Unit, react: Boolean) = this()
      def this(init: Unit, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Any, react: Boolean) = this()
      def this(
        init: Unit,
        update: js.Function2[/* obj */ Any, /* pulse */ Any, Any],
        params: Unit,
        react: Boolean
      ) = this()
      def this(init: Unit, update: Unit, params: Any, react: Boolean) = this()
      def this(init: Unit, update: Unit, params: Unit, react: Boolean) = this()
    }
    
    @JSImport("vega-embed", "vega.Renderer")
    @js.native
    open class Renderer protected ()
      extends typings.vega.mod.Renderer {
      def this(loader: Loader_) = this()
    }
    
    @JSImport("vega-embed", "vega.Transform")
    @js.native
    open class Transform ()
      extends typings.vega.mod.Transform {
      def this(init: Any) = this()
      def this(init: Any, params: Any) = this()
      def this(init: Unit, params: Any) = this()
    }
    
    @JSImport("vega-embed", "vega.View")
    @js.native
    open class View protected ()
      extends typings.vega.mod.View {
      def this(runtime: Runtime) = this()
      def this(runtime: Runtime, opt: ViewOptions) = this()
    }
    
    @JSImport("vega-embed", "vega.Warn")
    @js.native
    val Warn: Double = js.native
    
    inline def accessor[R](fn: Fn[R]): AccessorFn[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any]).asInstanceOf[AccessorFn[R]]
    inline def accessor[R](fn: Fn[R], fields: js.Array[String]): AccessorFn[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[R]]
    inline def accessor[R](fn: Fn[R], fields: js.Array[String], name: String): AccessorFn[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[R]]
    inline def accessor[R](fn: Fn[R], fields: Unit, name: String): AccessorFn[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[R]]
    
    inline def accessorFields(fn: AccessorFn[Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("accessorFields")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def accessorName(fn: AccessorFn[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("accessorName")(fn.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def array[T](v: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    inline def array[T](v: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    inline def ascending(a: Any, b: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ascending")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def changeset(): Changeset_ = ^.asInstanceOf[js.Dynamic].applyDynamic("changeset")().asInstanceOf[Changeset_]
    
    inline def clampRange(range: js.Array[Double], min: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("clampRange")(range.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def codegenExpression(options: CodegenOptions): js.Function1[/* ast */ Any, Code] = ^.asInstanceOf[js.Dynamic].applyDynamic("codegenExpression")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ast */ Any, Code]]
    
    inline def compare(fields: String): js.Function2[/* a */ Any, /* b */ Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
    inline def compare(fields: String, orders: js.Array[Order]): js.Function2[/* a */ Any, /* b */ Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
    inline def compare(fields: String, orders: Order): js.Function2[/* a */ Any, /* b */ Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
    inline def compare(fields: js.Array[AccessorFn[Any] | String]): js.Function2[/* a */ Any, /* b */ Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
    inline def compare(fields: js.Array[AccessorFn[Any] | String], orders: js.Array[Order]): js.Function2[/* a */ Any, /* b */ Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
    inline def compare(fields: js.Array[AccessorFn[Any] | String], orders: Order): js.Function2[/* a */ Any, /* b */ Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
    inline def compare(fields: AccessorFn[Any]): js.Function2[/* a */ Any, /* b */ Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
    inline def compare(fields: AccessorFn[Any], orders: js.Array[Order]): js.Function2[/* a */ Any, /* b */ Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
    inline def compare(fields: AccessorFn[Any], orders: Order): js.Function2[/* a */ Any, /* b */ Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
    
    inline def constant[V](v: V): js.Function0[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function0[V]]
    
    inline def debounce[F /* <: js.Function */](delay: Double, func: F): F = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(delay.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[F]
    
    inline def error(msg: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    
    inline def expressionFunction(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def expressionFunction(name: String, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def expressionFunction(name: String, fn: Any, visitor: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def expressionFunction(name: String, fn: Unit, visitor: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def extend[T](target: T, source: Partial[T]*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(scala.List(target.asInstanceOf[js.Any]).`++`(source.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
    
    inline def extent(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("extent")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def extent(array: js.Array[Double], accessor: AccessorFn[Any]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extent")(array.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def extentIndex(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("extentIndex")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def extentIndex(array: js.Array[Double], accessor: AccessorFn[Any]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extentIndex")(array.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def falsy(): `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("falsy")().asInstanceOf[`false`]
    
    inline def fastmap(): FastMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fastmap")().asInstanceOf[FastMap_]
    inline def fastmap(_underscore: js.Object): FastMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fastmap")(_underscore.asInstanceOf[js.Any]).asInstanceOf[FastMap_]
    
    inline def field(field: String): AccessorFn[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("field")(field.asInstanceOf[js.Any]).asInstanceOf[AccessorFn[Any]]
    inline def field(field: String, name: String): AccessorFn[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("field")(field.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[Any]]
    
    inline def flush[T /* <: Any */](range: js.Array[Double], value: Double, threshold: Double, left: T, right: T, center: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(range.asInstanceOf[js.Any], value.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def formatLocale(definition: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLocale")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def hasOwnProperty_(`object`: js.Object, property: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def id(_underscore: js.Object): js.Symbol = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(_underscore.asInstanceOf[js.Any]).asInstanceOf[js.Symbol]
    
    inline def identity[V](v: V): V = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(v.asInstanceOf[js.Any]).asInstanceOf[V]
    
    inline def inferType(values: js.Array[Any]): TypeInference = ^.asInstanceOf[js.Dynamic].applyDynamic("inferType")(values.asInstanceOf[js.Any]).asInstanceOf[TypeInference]
    inline def inferType(values: js.Array[Any], field: String): TypeInference = (^.asInstanceOf[js.Dynamic].applyDynamic("inferType")(values.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[TypeInference]
    
    inline def inferTypes(values: js.Array[Any], fields: js.Array[String]): StringDictionary[TypeInference] = (^.asInstanceOf[js.Dynamic].applyDynamic("inferTypes")(values.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[TypeInference]]
    
    inline def ingest(datum: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ingest")(datum.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P): C & P = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[C & P]
    inline def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P, members: js.Object): C & P = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[C & P]
    
    inline def inrange(value: Double, range: js.Array[Double], left: Boolean, right: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inrange")(value.asInstanceOf[js.Any], range.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isArray[T](a: js.Array[T]): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
    inline def isArray[T](a: Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
    
    inline def isBoolean(a: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(a.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
    
    inline def isDate(a: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    inline def isFunction(a: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
    
    inline def isIterable(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNumber(a: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(a.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    inline def isObject(a: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(a.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
    
    inline def isRegExp(a: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
    
    inline def isString(a: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(a.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    inline def isTuple(t: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTuple")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def key(fields: js.Array[String]): js.Function1[/* _ */ js.Object, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* _ */ js.Object, String]]
    inline def key(fields: js.Array[String], flat: Boolean): js.Function1[/* _ */ js.Object, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("key")(fields.asInstanceOf[js.Any], flat.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* _ */ js.Object, String]]
    
    inline def lerp(array: js.Array[Double], fraction: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(array.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def loader(): Loader_ = ^.asInstanceOf[js.Dynamic].applyDynamic("loader")().asInstanceOf[Loader_]
    inline def loader(opt: LoaderOptions): Loader_ = ^.asInstanceOf[js.Dynamic].applyDynamic("loader")(opt.asInstanceOf[js.Any]).asInstanceOf[Loader_]
    
    inline def log(
      method: error_ | warn_ | typings.vegaEmbed.vegaEmbedStrings.log,
      level: ERROR | WARN | INFO | DEBUG,
      input: js.Array[Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(method.asInstanceOf[js.Any], level.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logger(): LoggerInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")().asInstanceOf[LoggerInterface]
    inline def logger(_underscore: Double): LoggerInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any]).asInstanceOf[LoggerInterface]
    inline def logger(_underscore: Double, method: String): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
    inline def logger(
      _underscore: Double,
      method: String,
      handler: js.Function3[
          /* method */ error_ | warn_ | log, 
          /* level */ ERROR | WARN | INFO | DEBUG, 
          /* input */ js.Array[Any], 
          Unit
        ]
    ): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
    inline def logger(
      _underscore: Double,
      method: Unit,
      handler: js.Function3[
          /* method */ error_ | warn_ | log, 
          /* level */ ERROR | WARN | INFO | DEBUG, 
          /* input */ js.Array[Any], 
          Unit
        ]
    ): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
    inline def logger(_underscore: Unit, method: String): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
    inline def logger(
      _underscore: Unit,
      method: String,
      handler: js.Function3[
          /* method */ error_ | warn_ | log, 
          /* level */ ERROR | WARN | INFO | DEBUG, 
          /* input */ js.Array[Any], 
          Unit
        ]
    ): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
    inline def logger(
      _underscore: Unit,
      method: Unit,
      handler: js.Function3[
          /* method */ error_ | warn_ | log, 
          /* level */ ERROR | WARN | INFO | DEBUG, 
          /* input */ js.Array[Any], 
          Unit
        ]
    ): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
    
    inline def merge(
      compare: js.Function2[/* a */ Any, /* b */ Any, Double],
      array1: js.Array[Any],
      array2: js.Array[Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def merge(
      compare: js.Function2[/* a */ Any, /* b */ Any, Double],
      array1: js.Array[Any],
      array2: js.Array[Any],
      output: js.Array[Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def mergeConfig[C /* <: js.Object */](c: C*): C = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfig")(c.asInstanceOf[Seq[js.Any]]*).asInstanceOf[C]
    
    inline def merge_Array(
      compare: js.Function2[/* a */ Any, /* b */ Any, Double],
      array1: js.Array[Any],
      array2: js.Array[Any]
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def one(): `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("one")().asInstanceOf[`1`]
    
    inline def pad(str: String, len: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def pad(str: String, len: Double, char: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def pad(str: String, len: Double, char: String, align: left | center | right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def pad(str: String, len: Double, char: Unit, align: left | center | right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def panLinear(domain: js.Array[Double], delta: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panLinear")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def panLog(domain: js.Array[Double], delta: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panLog")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def panPow(domain: js.Array[Double], delta: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panPow")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def panSymlog(domain: js.Array[Double], delta: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panSymlog")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def parse(spec: Spec): Runtime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any]).asInstanceOf[Runtime]
    inline def parse(spec: Spec, config: Unit, opt: Ast): Runtime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Runtime]
    inline def parse(spec: Spec, config: typings.vegaTypings.typesSpecConfigMod.Config): Runtime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Runtime]
    inline def parse(spec: Spec, config: typings.vegaTypings.typesSpecConfigMod.Config, opt: Ast): Runtime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Runtime]
    
    inline def parseExpression(expression: String): Expression | SequenceExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[Expression | SequenceExpression]
    
    inline def parseSelector(selectorName: String, source: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelector")(selectorName.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def peek(array: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("peek")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def projection(`type`: String, projection: Any): typings.vegaTypings.typesRuntimeMod.View = (^.asInstanceOf[js.Dynamic].applyDynamic("projection")(`type`.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[typings.vegaTypings.typesRuntimeMod.View]
    
    inline def quarter(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def quarter(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def read(data: String, schema: Format): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
    inline def read(data: String, schema: Format, dateParse: js.Function1[/* dateString */ String, js.Date]): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], dateParse.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
    
    inline def renderModule(moduleName: String, renderModule: RenderModule_): RenderModule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("renderModule")(moduleName.asInstanceOf[js.Any], renderModule.asInstanceOf[js.Any])).asInstanceOf[RenderModule_]
    
    inline def repeat(str: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(str.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def scale(`type`: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("scale")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def scale(`type`: String, scale: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(`type`.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def sceneVisit(scene: SceneGroup, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sceneVisit")(scene.asInstanceOf[js.Any], itemCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sceneVisit(scene: Scene, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sceneVisit")(scene.asInstanceOf[js.Any], itemCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def scheme(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("scheme")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def scheme(name: String, scheme: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scheme")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def schemeDiscretized(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def schemeDiscretized(name: String, scheme: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def schemeDiscretized(name: String, scheme: Any, interpolator: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def schemeDiscretized(name: String, scheme: Unit, interpolator: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def span(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("span")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def splitAccessPath(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAccessPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def stringValue(a: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringValue")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def timeFormatLocale(definition: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeFormatLocale")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def toBoolean(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBoolean")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def toDate(a: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def toDate(a: Any, parser: js.Function1[/* _ */ Any, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(a.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def toNumber(a: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def toSet[T](array: js.Array[T]): StringDictionary[`true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSet")(array.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[`true`]]
    
    inline def toString_(a: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def truncate(a: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def truncate(a: String, length: Double, align: left | center | right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def truncate(a: String, length: Double, align: left | center | right, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def truncate(a: String, length: Double, align: Unit, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def truthy(): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("truthy")().asInstanceOf[`true`]
    
    inline def tupleid(t: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tupleid")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def utcquarter(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("utcquarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def utcquarter(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("utcquarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("vega-embed", "vega.version")
    @js.native
    val version: String = js.native
    
    inline def visitArray(
      array: js.Array[Any],
      filter: js.Function1[/* any */ Any, js.UndefOr[Boolean]],
      visitor: js.Function3[/* v */ Any, /* i */ Double, /* arr */ js.Array[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitArray")(array.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def visitArray(
      array: Unit,
      filter: js.Function1[/* any */ Any, js.UndefOr[Boolean]],
      visitor: js.Function3[/* v */ Any, /* i */ Double, /* arr */ js.Array[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitArray")(array.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def writeConfig[C /* <: js.Object */](c: C, key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeConfig[C /* <: js.Object */](c: C, key: String, value: Any, recurse: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeConfig[C /* <: js.Object */](c: C, key: String, value: Any, recurse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def zero(): `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[`0`]
    
    inline def zoomLinear(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLinear")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def zoomLinear(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLinear")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def zoomLog(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def zoomLog(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def zoomPow(domain: js.Array[Double], anchor: Double, scale: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomPow")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def zoomPow(domain: js.Array[Double], anchor: Null, scale: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomPow")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def zoomSymlog(domain: js.Array[Double], anchor: Double, scale: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomSymlog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def zoomSymlog(domain: js.Array[Double], anchor: Null, scale: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomSymlog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  }
  
  /* was `typeof vegaLiteImport` */
  object vegaLite {
    
    @JSImport("vega-embed", "vegaLite")
    @js.native
    val ^ : js.Any = js.native
    
    inline def accessPathDepth(path: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("accessPathDepth")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def accessPathWithDatum(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("accessPathWithDatum")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def accessPathWithDatum(path: String, datum: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("accessPathWithDatum")(path.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def compile(inputSpec: TopLevelSpec): Normalized = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(inputSpec.asInstanceOf[js.Any]).asInstanceOf[Normalized]
    inline def compile(inputSpec: TopLevelSpec, opt: CompileOptions): Normalized = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(inputSpec.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Normalized]
    
    inline def contains[T](array: js.Array[T], item: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def deepEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def deleteNestedProperty(obj: Any, orderedProps: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteNestedProperty")(obj.asInstanceOf[js.Any], orderedProps.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("vega-embed", "vegaLite.duplicate")
    @js.native
    val duplicate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof clone_ */ Any = js.native
    
    inline def entries(o: js.Object): js.Array[js.Tuple2[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String, Any]]]
    inline def entries[T](o: StringDictionary[T]): js.Array[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String, T]]]
    inline def entries[T](o: ArrayLike[T]): js.Array[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String, T]]]
    
    inline def every[T](
      arr: js.Array[T],
      f: js.Function3[/* d */ T, /* k */ js.UndefOr[Any], /* i */ js.UndefOr[Any], Boolean]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(arr.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fieldIntersection(a: ReadonlySet[String], b: ReadonlySet[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldIntersection")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def flatAccessWithDatum(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("flatAccessWithDatum")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def flatAccessWithDatum(path: String, datum: datum | parent | datumDotdatum): String = (^.asInstanceOf[js.Dynamic].applyDynamic("flatAccessWithDatum")(path.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getFirstDefined[T](args: T*): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDefined")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.UndefOr[T]]
    
    inline def hasIntersection[T](a: ReadonlySet[T], b: ReadonlySet[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasIntersection")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def hash(a: Any): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(a.asInstanceOf[js.Any]).asInstanceOf[String | Double]
    
    inline def internalField(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("internalField")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isBoolean(b: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(b.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
    
    inline def isEmpty(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isEqual[T](dict: Dict[T], other: Dict[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(dict.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isInternalField(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInternalField")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNullOrFalse(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrFalse")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNumeric(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isNumeric(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def keys[T](o: T): js.Array[Extract[/* keyof T */ String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[Extract[/* keyof T */ String, String]]]
    
    inline def logicalExpr[T](op: LogicalComposition[T], cb: js.Function1[/* repeated */ Any, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalExpr")(op.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def mergeDeep[T](dest: T, src: DeepPartial[T]*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDeep")(scala.List(dest.asInstanceOf[js.Any]).`++`(src.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
    
    inline def never(message: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("never")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
    
    inline def normalize(spec: TopLevelSpec & LayoutSizeMixins): TopLevel[NormalizedSpec] & LayoutSizeMixins = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(spec.asInstanceOf[js.Any]).asInstanceOf[TopLevel[NormalizedSpec] & LayoutSizeMixins]
    inline def normalize(
      spec: TopLevelSpec & LayoutSizeMixins,
      config: typings.vegaLite.buildSrcConfigMod.Config[SignalRef]
    ): TopLevel[NormalizedSpec] & LayoutSizeMixins = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[TopLevel[NormalizedSpec] & LayoutSizeMixins]
    
    inline def normalizeAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def omit[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, props: js.Array[K]): Omit[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Omit[T, K]]
    
    inline def pick[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, props: js.Array[K]): Pick[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(obj.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Pick[T, K]]
    
    inline def prefixGenerator(a: ReadonlySet[String]): ReadonlySet[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixGenerator")(a.asInstanceOf[js.Any]).asInstanceOf[ReadonlySet[String]]
    
    inline def removePathFromField(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removePathFromField")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def replaceAll(string: String, find: String, replacement: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceAll")(string.asInstanceOf[js.Any], find.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def replacePathInField(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replacePathInField")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def resetIdCounter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetIdCounter")().asInstanceOf[Unit]
    
    inline def setEqual[T](a: Set[T], b: Set[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def some[T](
      arr: js.Array[T],
      f: js.Function3[/* d */ T, /* k */ js.UndefOr[Any], /* i */ js.UndefOr[Any], Boolean]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("vega-embed", "vegaLite.stringify")
    @js.native
    val stringify: js.Function1[/* obj */ Any, String] = js.native
    
    inline def titleCase(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titleCase")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def unique[T](values: js.Array[T], f: js.Function1[/* item */ T, String | Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(values.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def uniqueId(): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")().asInstanceOf[String | Double]
    inline def uniqueId(prefix: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String | Double]
    
    inline def vals(o: js.Object): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("vals")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def vals[T](o: StringDictionary[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("vals")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    inline def vals[T](o: ArrayLike[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("vals")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    inline def varName(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("varName")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("vega-embed", "vegaLite.version")
    @js.native
    val version: String = js.native
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
      
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
    
    var scaleFactor: js.UndefOr[Double | PngSvg] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmbedOptions[?, ?], S, R] (val x: Self & (EmbedOptions[S, R])) extends AnyVal {
      
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
      
      inline def setScaleFactor(value: Double | PngSvg): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
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
  
  type ExpressionFunction = Record[String, Any | typings.vegaEmbed.anon.Fn]
  
  trait Hover extends StObject {
    
    var hoverSet: js.UndefOr[EncodeEntryName] = js.undefined
    
    var updateSet: js.UndefOr[EncodeEntryName] = js.undefined
  }
  object Hover {
    
    inline def apply(): Hover = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hover]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hover] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageData] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setEmbedOptions(value: EmbedOptions[String, Renderers]): Self = StObject.set(x, "embedOptions", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: VisualizationSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setVgSpec(value: Spec): Self = StObject.set(x, "vgSpec", value.asInstanceOf[js.Any])
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  type VisualizationSpec = TopLevelSpec | Spec
}
