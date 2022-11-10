package typings.unified

import typings.std.Record
import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.vfile.libMod.Compatible
import typings.vfile.mod.VFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unified", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("unified", "CompilerClass")
  @js.native
  open class CompilerClass[Tree /* <: Node[Data] */, Result] protected () extends StObject {
    /**
      * Constructor.
      *
      * @param tree
      *   Tree to compile.
      * @param file
      *   File associated with `tree`.
      * @returns
      *   Instance.
      */
    def this(tree: Tree, file: VFile) = this()
  }
  
  @JSImport("unified", "ParserClass")
  @js.native
  open class ParserClass[Tree /* <: Node[Data] */] protected () extends StObject {
    /**
      * Constructor.
      *
      * @param document
      *   Document to parse.
      * @param file
      *   File associated with `document`.
      * @returns
      *   Instance.
      */
    def this(document: String, file: VFile) = this()
  }
  
  inline def unified(): Processor[Unit, Unit, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unified")().asInstanceOf[Processor[Unit, Unit, Unit, Unit]]
  
  type Attacher[PluginParameters /* <: js.Array[Any] */, Input, Output] = Plugin[PluginParameters, Input, Output]
  
  type Compiler[Tree /* <: Node[Data] */, Result] = (CompilerClass[Tree, Result]) | (CompilerFunction[Tree, Result])
  
  type CompilerFunction[Tree /* <: Node[Data] */, Result] = js.Function2[/* tree */ Tree, /* file */ VFile, Result]
  
  @js.native
  trait FrozenProcessor[ParseTree /* <: Node[Data] | Unit */, CurrentTree /* <: Node[Data] | Unit */, CompileTree /* <: Node[Data] | Unit */, CompileResult] extends StObject {
    
    /**
      * Clone current processor
      *
      * @returns
      *   New unfrozen processor that is configured to function the same as its
      *   ancestor.
      *   But when the descendant processor is configured it does not affect the
      *   ancestral processor.
      */
    def apply(): Processor[ParseTree, CurrentTree, CompileTree, CompileResult] = js.native
    
    var Compiler: js.UndefOr[
        typings.unified.mod.Compiler[Specific[Node[Data], CompileTree], Specific[Any, CompileResult]]
      ] = js.native
    
    var Parser: js.UndefOr[typings.unified.mod.Parser[Specific[Node[Data], ParseTree]]] = js.native
    
    /**
      * Internal list of configured plugins.
      *
      * @private
      */
    var attachers: js.Array[Array[(Plugin[js.Array[Any], Node[Data], Node[Data]]) | Any]] = js.native
    
    /**
      * Get an in-memory key-value store accessible to all phases of the process.
      *
      * @returns
      *   Key-value store.
      */
    def data(): Record[String, Any] = js.native
    /**
      * Set an in-memory key-value store accessible to all phases of the process.
      *
      * @param data
      *   Key-value store.
      * @returns
      *   Current processor.
      */
    def data(data: Record[String, Any]): Processor[ParseTree, CurrentTree, CompileTree, CompileResult] = js.native
    /**
      * Get an in-memory value by key.
      *
      * @param key
      *   Key to get.
      * @returns
      *   The value at `key`.
      */
    def data(key: String): Any = js.native
    /**
      * Set an in-memory value by key.
      *
      * @param key
      *   Key to set.
      * @param value
      *   Value to set.
      * @returns
      *   Current processor.
      */
    def data(key: String, value: Any): Processor[ParseTree, CurrentTree, CompileTree, CompileResult] = js.native
    
    /**
      * Freeze a processor.
      * Frozen processors are meant to be extended and not to be configured or
      * processed directly.
      *
      * Once a processor is frozen it cannot be unfrozen.
      * New processors working just like it can be created by calling the
      * processor.
      *
      * It’s possible to freeze processors explicitly, by calling `.freeze()`, but
      * `.parse()`, `.run()`, `.stringify()`, and `.process()` call `.freeze()` to
      * freeze a processor too.
      *
      * @returns
      *   Frozen processor.
      */
    def freeze(): FrozenProcessor[ParseTree, CurrentTree, CompileTree, CompileResult] = js.native
    
    /**
      * Parse a file.
      *
      * @param file
      *   File to parse.
      *   `VFile` or anything that can be given to `new VFile()`, optional.
      * @returns
      *   Resulting tree.
      */
    def parse(): Specific[Node[Data], ParseTree] = js.native
    def parse(file: Compatible): Specific[Node[Data], ParseTree] = js.native
    
    def process(file: Unit, callback: ProcessCallback[VFileWithOutput[CompileResult]]): Unit = js.native
    /**
      * Process a file.
      *
      * This performs all phases of the processor:
      *
      * 1.  Parse a file into a unist node using the configured `Parser`
      * 2.  Run transforms on that node
      * 3.  Compile the resulting node using the `Compiler`
      *
      * The result from the compiler is stored on the file.
      * What the result is depends on which plugins you use.
      * The result is typically text (`string` or `Buffer`), which can be retrieved
      * with `file.toString()` (or `String(file)`).
      * In some cases, such as when using `rehypeReact` to create a React node,
      * the result is stored on `file.result`.
      *
      * @param file
      *   `VFile` or anything that can be given to `new VFile()`.
      * @returns
      *   Promise that resolves to the resulting `VFile`.
      */
    def process(file: Compatible): js.Promise[VFileWithOutput[CompileResult]] = js.native
    /**
      * Process a file.
      *
      * This performs all phases of the processor:
      *
      * 1.  Parse a file into a unist node using the configured `Parser`
      * 2.  Run transforms on that node
      * 3.  Compile the resulting node using the `Compiler`
      *
      * The result from the compiler is stored on the file.
      * What the result is depends on which plugins you use.
      * The result is typically text (`string` or `Buffer`), which can be retrieved
      * with `file.toString()` (or `String(file)`).
      * In some cases, such as when using `rehypeReact` to create a React node,
      * the result is stored on `file.result`.
      *
      * @param file
      *   `VFile` or anything that can be given to `new VFile()`.
      * @param callback
      *   Callback called with an error or the resulting file.
      * @returns
      *   Nothing.
      */
    def process(file: Compatible, callback: ProcessCallback[VFileWithOutput[CompileResult]]): Unit = js.native
    
    /**
      * Process a file, synchronously.
      * Throws when asynchronous transforms are configured.
      *
      * This performs all phases of the processor:
      *
      * 1.  Parse a file into a unist node using the configured `Parser`
      * 2.  Run transforms on that node
      * 3.  Compile the resulting node using the `Compiler`
      *
      * The result from the compiler is stored on the file.
      * What the result is depends on which plugins you use.
      * The result is typically text (`string` or `Buffer`), which can be retrieved
      * with `file.toString()` (or `String(file)`).
      * In some cases, such as when using `rehypeReact` to create a React node,
      * the result is stored on `file.result`.
      *
      * @param file
      *   `VFile` or anything that can be given to `new VFile()`, optional.
      * @returns
      *   Resulting file.
      */
    def processSync(): VFileWithOutput[CompileResult] = js.native
    def processSync(file: Compatible): VFileWithOutput[CompileResult] = js.native
    
    /**
      * Run transforms on the given node.
      *
      * @param node
      *   Tree to transform.
      * @param file
      *   File associated with `node`.
      *   `VFile` or anything that can be given to `new VFile()`.
      * @returns
      *   Promise that resolves to the resulting tree.
      */
    def run(node: Specific[Node[Data], ParseTree]): js.Promise[Specific[Node[Data], CompileTree]] = js.native
    /**
      * Run transforms on the given tree.
      *
      * @param node
      *   Tree to transform.
      * @param callback
      *   Callback called with an error or the resulting node.
      * @returns
      *   Nothing.
      */
    def run(node: Specific[Node[Data], ParseTree], callback: RunCallback[Specific[Node[Data], CompileTree]]): Unit = js.native
    def run(
      node: Specific[Node[Data], ParseTree],
      file: Unit,
      callback: RunCallback[Specific[Node[Data], CompileTree]]
    ): Unit = js.native
    def run(node: Specific[Node[Data], ParseTree], file: Compatible): js.Promise[Specific[Node[Data], CompileTree]] = js.native
    /**
      * Run transforms on the given node.
      *
      * @param node
      *   Tree to transform.
      * @param file
      *   File associated with `node`.
      *   `VFile` or anything that can be given to `new VFile()`.
      * @param callback
      *   Callback called with an error or the resulting node.
      * @returns
      *   Nothing.
      */
    def run(
      node: Specific[Node[Data], ParseTree],
      file: Compatible,
      callback: RunCallback[Specific[Node[Data], CompileTree]]
    ): Unit = js.native
    
    /**
      * Run transforms on the given node, synchronously.
      * Throws when asynchronous transforms are configured.
      *
      * @param node
      *   Tree to transform.
      * @param file
      *   File associated with `node`.
      *   `VFile` or anything that can be given to `new VFile()`, optional.
      * @returns
      *   Resulting tree.
      */
    def runSync(node: Specific[Node[Data], ParseTree]): Specific[Node[Data], CompileTree] = js.native
    def runSync(node: Specific[Node[Data], ParseTree], file: Compatible): Specific[Node[Data], CompileTree] = js.native
    
    /**
      * Compile a file.
      *
      * @param node
      *   Node to compile.
      * @param file
      *   `VFile` or anything that can be given to `new VFile()`, optional.
      * @returns
      *   New content: compiled text (`string` or `Buffer`) or something else.
      *   This depends on which plugins you use: typically text, but could for
      *   example be a React node.
      */
    def stringify(node: Specific[Node[Data], CompileTree]): /* import warning: importer.ImportType#apply Failed type conversion: CompileTree extends unist.unist.Node<unist.unist.Data> ? CompileResult : unknown */ js.Any = js.native
    def stringify(node: Specific[Node[Data], CompileTree], file: Compatible): /* import warning: importer.ImportType#apply Failed type conversion: CompileTree extends unist.unist.Node<unist.unist.Data> ? CompileResult : unknown */ js.Any = js.native
  }
  
  type Parser[Tree /* <: Node[Data] */] = ParserClass[Tree] | ParserFunction[Tree]
  
  type ParserFunction[Tree /* <: Node[Data] */] = js.Function2[/* document */ String, /* file */ VFile, Tree]
  
  type Pluggable[PluginParameters /* <: js.Array[Any] */] = (PluginTuple[PluginParameters, Any, Any]) | (Plugin[PluginParameters, Any, Any]) | Preset
  
  type PluggableList = js.Array[Pluggable[js.Array[Any]]]
  
  type Plugin[PluginParameters /* <: js.Array[Any] */, Input, Output] = js.ThisFunction1[
    /* import warning: importer.ImportType#apply Failed type conversion: Input extends unist.unist.Node<unist.unist.Data> ? Output extends unist.unist.Node<unist.unist.Data> ? // This is a transform, so define `Input` as the current tree.
  unified.unified.Processor<void, Input, void, void> : // Compiler.
  unified.unified.Processor<void, Input, Input, Output> : Output extends unist.unist.Node<unist.unist.Data> ? // Parser.
  unified.unified.Processor<Output, Output, void, void> : // No clue.
  unified.unified.Processor<void, void, void, void> */ /* this */ js.Any, 
    /* settings */ PluginParameters, 
    /* import warning: importer.ImportType#apply Failed type conversion: // If both `Input` and `Output` are `Node`, expect an optional `Transformer`.
  Input extends unist.unist.Node<unist.unist.Data> ? Output extends unist.unist.Node<unist.unist.Data> ? unified.unified.Transformer<Input, Output> | void : void : void */ js.Any
  ]
  
  type PluginTuple[PluginParameters /* <: js.Array[Any] */, Input, Output] = /* import warning: importer.ImportType#apply c repeated non-array type: PluginParameters */ js.Array[PluginParameters]
  
  trait Preset extends StObject {
    
    var plugins: js.UndefOr[PluggableList] = js.undefined
    
    var settings: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object Preset {
    
    inline def apply(): Preset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Preset]
    }
    
    extension [Self <: Preset](x: Self) {
      
      inline def setPlugins(value: PluggableList): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Pluggable[js.Array[Any]]*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setSettings(value: Record[String, Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
  
  type ProcessCallback[File /* <: VFile */] = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* file */ js.UndefOr[File], Unit]
  
  @js.native
  trait Processor[ParseTree /* <: Node[Data] | Unit */, CurrentTree /* <: Node[Data] | Unit */, CompileTree /* <: Node[Data] | Unit */, CompileResult]
    extends StObject
       with FrozenProcessor[ParseTree, CurrentTree, CompileTree, CompileResult] {
    
    def use(presetOrList: PluggableList): Processor[ParseTree, CurrentTree, CompileTree, CompileResult] = js.native
    /**
      * Configure the processor with a preset or list of plugins and presets.
      *
      * @param presetOrList
      *   Either a list of plugins, presets, and tuples, or a single preset: an
      *   object with a `plugins` (list) and/or `settings`
      *   (`Record<string, unknown>`).
      * @returns
      *   Current processor.
      */
    def use(presetOrList: Preset): Processor[ParseTree, CurrentTree, CompileTree, CompileResult] = js.native
    /**
      * Configure the processor to use a plugin.
      *
      * @typeParam PluginParameters
      *   Plugin settings.
      * @typeParam Input
      *   Value that is accepted by the plugin.
      *
      *   *   If the plugin returns a transformer, then this should be the node
      *       type that the transformer expects.
      *   *   If the plugin sets a parser, then this should be `string`.
      *   *   If the plugin sets a compiler, then this should be the node type that
      *       the compiler expects.
      * @typeParam Output
      *   Value that the plugin yields.
      *
      *   *   If the plugin returns a transformer, then this should be the node
      *       type that the transformer yields, and defaults to `Input`.
      *   *   If the plugin sets a parser, then this should be the node type that
      *       the parser yields.
      *   *   If the plugin sets a compiler, then this should be the result that
      *       the compiler yields (`string`, `Buffer`, or something else).
      * @param plugin
      *   Plugin (function) to use.
      *   Plugins are deduped based on identity: passing a function in twice will
      *   cause it to run only once.
      * @param settings
      *   Configuration for plugin, optional.
      *   Plugins typically receive one options object, but could receive other and
      *   more values.
      *   It’s also possible to pass a boolean instead of settings: `true` (to turn
      *   a plugin on) or `false` (to turn a plugin off).
      * @returns
      *   Current processor.
      */
    def use[PluginParameters /* <: js.Array[Any] */, Input, Output](
      plugin: Plugin[PluginParameters, Input, Output],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param settings because its type PluginParameters | [boolean] is not an array type */ settings: PluginParameters
    ): UsePlugin[ParseTree, CurrentTree, CompileTree, CompileResult, Input, Output] = js.native
    def use[PluginParameters /* <: js.Array[Any] */, Input, Output](
      plugin: Plugin[PluginParameters, Input, Output],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param settings because its type PluginParameters | [boolean] is not an array type */ settings: js.Array[Boolean]
    ): UsePlugin[ParseTree, CurrentTree, CompileTree, CompileResult, Input, Output] = js.native
    def use[PluginParameters /* <: js.Array[Any] */, Input, Output](tuple: js.Tuple2[Plugin[PluginParameters, Input, Output], Boolean]): UsePlugin[ParseTree, CurrentTree, CompileTree, CompileResult, Input, Output] = js.native
    /**
      * Configure the processor with a tuple of a plugin and setting(s).
      *
      * @typeParam PluginParameters
      *   Plugin settings.
      * @typeParam Input
      *   Value that is accepted by the plugin.
      *
      *   *   If the plugin returns a transformer, then this should be the node
      *       type that the transformer expects.
      *   *   If the plugin sets a parser, then this should be `string`.
      *   *   If the plugin sets a compiler, then this should be the node type that
      *       the compiler expects.
      * @typeParam Output
      *   Value that the plugin yields.
      *
      *   *   If the plugin returns a transformer, then this should be the node
      *       type that the transformer yields, and defaults to `Input`.
      *   *   If the plugin sets a parser, then this should be the node type that
      *       the parser yields.
      *   *   If the plugin sets a compiler, then this should be the result that
      *       the compiler yields (`string`, `Buffer`, or something else).
      * @param tuple
      *   A tuple where the first item is a plugin (function) to use and other
      *   items are options.
      *   Plugins are deduped based on identity: passing a function in twice will
      *   cause it to run only once.
      *   It’s also possible to pass a boolean instead of settings: `true` (to turn
      *   a plugin on) or `false` (to turn a plugin off).
      * @returns
      *   Current processor.
      */
    @JSName("use")
    def use_PluginParametersInputOutput_UsePlugin[PluginParameters /* <: js.Array[Any] */, Input, Output](tuple: PluginTuple[PluginParameters, Input, Output]): UsePlugin[ParseTree, CurrentTree, CompileTree, CompileResult, Input, Output] = js.native
  }
  
  type RunCallback[Tree /* <: Node[Data] */] = js.Function3[
    /* error */ js.UndefOr[js.Error | Null], 
    /* node */ js.UndefOr[Tree], 
    /* file */ js.UndefOr[VFile], 
    Unit
  ]
  
  // Get the right most non-void thing.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Right extends void ? Left : Right
    }}}
    */
  type Specific[Left, Right] = Left
  
  type TransformCallback[Tree /* <: Node[Data] */] = js.Function3[
    /* error */ js.UndefOr[js.Error | Null], 
    /* node */ js.UndefOr[Tree], 
    /* file */ js.UndefOr[VFile], 
    Unit
  ]
  
  type Transformer[Input /* <: Node[Data] */, Output /* <: Node[Data] */] = js.Function3[
    /* node */ Input, 
    /* file */ VFile, 
    /* next */ TransformCallback[Output], 
    js.UndefOr[(js.Promise[js.UndefOr[Output | Unit]]) | Output | js.Error | Unit]
  ]
  
  // Create a processor based on the input/output of a plugin.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Output extends unist.unist.Node<unist.unist.Data> ? Input extends string ? // If `Input` is `string` and `Output` is `Node`, then this plugin
  // defines a parser, so set `ParseTree`.
  unified.unified.Processor<Output, unified.unified.Specific<Output, CurrentTree>, unified.unified.Specific<Output, CompileTree>, CompileResult> : Input extends unist.unist.Node<unist.unist.Data> ? // If `Input` is `Node` and `Output` is `Node`, then this plugin defines a
  // transformer, its output defines the input of the next, so set
  // `CurrentTree`.
  unified.unified.Processor<unified.unified.Specific<Input, ParseTree>, Output, unified.unified.Specific<CompileTree, Output>, CompileResult> : // Else, `Input` is something else and `Output` is `Node`:
  never : Input extends unist.unist.Node<unist.unist.Data> ? // If `Input` is `Node` and `Output` is not a `Node`, then this plugin
  // defines a compiler, so set `CompileTree` and `CompileResult`
  unified.unified.Processor<unified.unified.Specific<Input, ParseTree>, unified.unified.Specific<Input, CurrentTree>, Input, Output> : // Else, `Input` is not a `Node` and `Output` is not a `Node`.
  // Maybe it’s untyped, or the plugin throws an error (`never`), so lets
  // just keep it as it was.
  unified.unified.Processor<ParseTree, CurrentTree, CompileTree, CompileResult>
    }}}
    */
  type UsePlugin[ParseTree /* <: Node[Data] | Unit */, CurrentTree /* <: Node[Data] | Unit */, CompileTree /* <: Node[Data] | Unit */, CompileResult, Input, Output] = // If `Input` is `string` and `Output` is `Node`, then this plugin
  // defines a parser, so set `ParseTree`.
  Processor[Output, Specific[Output, CurrentTree], Specific[Output, CompileTree], CompileResult]
  
  /* eslint-disable @typescript-eslint/naming-convention */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Result extends std.Uint8Array ? vfile.vfile.VFile : Result extends object ? vfile.vfile.VFile & {  result :Result} : vfile.vfile.VFile
    }}}
    */
  type VFileWithOutput[Result] = VFile
}
