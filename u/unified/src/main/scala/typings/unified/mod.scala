package typings.unified

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.unist.mod.Node
import typings.vfile.mod.VFile
import typings.vfile.mod.VFileCompatible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Unified processor allows plugins, parsers, and compilers to be chained together to transform content.
    *
    * @typeParam P Processor settings. Useful when packaging unified with a preset parser and compiler.
    */
  @JSImport("unified", JSImport.Namespace)
  @js.native
  def apply[P](): Processor[P] = js.native
  
  /**
    * An attacher is the thing passed to `use`.
    * It configures the processor and in turn can receive options.
    *
    * Attachers can configure processors, such as by interacting with parsers and compilers, linking them to other processors, or by specifying how the syntax tree is handled.
    *
    * @param settings Configuration
    * @typeParam S Plugin settings
    * @typeParam P Processor settings
    * @returns Optional Transformer.
    */
  type Attacher[S /* <: js.Array[_] */, P] = js.ThisFunction1[/* this */ Processor[P], /* settings */ S, Transformer | Unit]
  
  /**
    * Transform an AST node/tree into text
    */
  @js.native
  trait Compiler extends StObject {
    
    /**
      * Transform an AST node/tree into text
      *
      * @returns Compiled text
      */
    def compile(): String = js.native
  }
  object Compiler {
    
    @scala.inline
    def apply(compile: () => String): Compiler = {
      val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile))
      __obj.asInstanceOf[Compiler]
    }
    
    @scala.inline
    implicit class CompilerMutableBuilder[Self <: Compiler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompile(value: () => String): Self = StObject.set(x, "compile", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A constructor function (a function with keys in its `prototype`) or class that implements a
    * `compile` method.
    */
  @js.native
  trait CompilerConstructor extends /**
    * Creates a Compiler
    *
    * @param node Node/tree to be stringified
    * @param file File associated with node
    */
  Instantiable2[/* node */ Node, /* file */ VFile, Compiler]
  
  /**
    * Transform an AST node/tree into text
    *
    * @param node Node/tree to be stringified
    * @param file File associated with node
    * @returns Compiled text
    */
  type CompilerFunction = js.Function2[/* node */ Node, /* file */ VFile, String]
  
  /**
    * Transform file contents into an AST
    */
  @js.native
  trait Parser extends StObject {
    
    /**
      * Transform file contents into an AST
      *
      * @returns Parsed AST node/tree
      */
    def parse(): Node = js.native
  }
  object Parser {
    
    @scala.inline
    def apply(parse: () => Node): Parser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse))
      __obj.asInstanceOf[Parser]
    }
    
    @scala.inline
    implicit class ParserMutableBuilder[Self <: Parser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: () => Node): Self = StObject.set(x, "parse", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A constructor function (a function with keys in its `prototype`) or class that implements a
    * `parse` method.
    */
  @js.native
  trait ParserConstructor extends /**
    * Creates a Parser
    *
    * @param text Text to transform into AST node(s)
    * @param file File associated with text
    */
  Instantiable2[/* text */ String, /* file */ VFile, Parser]
  
  /**
    * Transform file contents into an AST
    *
    * @param text Text to transform into AST node(s)
    * @param file File associated with text
    * @returns Parsed AST node/tree
    */
  type ParserFunction = js.Function2[/* text */ String, /* file */ VFile, Node]
  
  /**
    * A union of the different ways to add plugins to unified
    *
    * @typeParam S Plugin settings
    * @typeParam P Processor settings
    */
  type Pluggable[S /* <: js.Array[_] */, P] = (Plugin[S, P]) | (Preset[S, P]) | (PluginTuple[S, P])
  
  /**
    * A list of plugins and presets
    *
    * @typeParam P Processor settings
    */
  type PluggableList[P] = js.Array[Pluggable[js.Array[js.UndefOr[js.Any]], P]]
  
  /**
    * A Plugin (Attacher) is the thing passed to `use`.
    * It configures the processor and in turn can receive options.
    *
    * Attachers can configure processors, such as by interacting with parsers and compilers, linking them to other processors, or by specifying how the syntax tree is handled.
    *
    * @param settings Configuration
    * @typeParam S Plugin settings
    * @typeParam P Processor settings
    * @returns Optional Transformer.
    */
  type Plugin[S /* <: js.Array[_] */, P] = Attacher[S, P]
  
  /**
    * A pairing of a plugin with its settings
    *
    * @typeParam S Plugin settings
    * @typeParam P Processor settings
    */
  type PluginTuple[S /* <: js.Array[_] */, P] = Array[(Plugin[S, P]) | js.Any]
  
  /**
    * Presets provide a potentially sharable way to configure processors.
    * They can contain multiple plugins and optionally settings as well.
    *
    * @typeParam P Processor settings
    */
  @js.native
  trait Preset[S, P] extends StObject {
    
    var plugins: PluggableList[P] = js.native
    
    var settings: js.UndefOr[Settings] = js.native
  }
  object Preset {
    
    @scala.inline
    def apply[S, P](plugins: PluggableList[P]): Preset[S, P] = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Preset[S, P]]
    }
    
    @scala.inline
    implicit class PresetMutableBuilder[Self <: Preset[_, _], S, P] (val x: Self with (Preset[S, P])) extends AnyVal {
      
      @scala.inline
      def setPlugins(value: PluggableList[P]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsVarargs(value: (Pluggable[js.Array[js.UndefOr[js.Any]], P])*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
  
  /**
    * Access results from transforms
    *
    * @param error Error if any occurred
    * @param vfile File with updated content
    */
  type ProcessCallback = js.Function2[/* error */ Error | Null, /* file */ VFile, Unit]
  
  /**
    * Processor allows plugins, parsers, and compilers to be chained together to transform content.
    *
    * @typeParam P Processor settings. Useful when packaging unified with a preset parser and compiler.
    */
  @js.native
  trait Processor[P] extends StObject {
    
    /**
      * Clone current processor
      *
      * @returns New unfrozen processor which is configured to function the same as its ancestor.
      * But when the descendant processor is configured in the future it does not affect the ancestral processor.
      */
    def apply(): Processor[P] = js.native
    
    /**
      * Function handling the compilation of syntax tree to a text.
      * Used in the stringify phase in the process and invoked with a `Node` and `VFile` representation of the document to stringify.
      *
      * `Compiler` can be a normal function in which case it must return a `string`: the text representation of the given syntax tree.
      *
      * `Compiler` can also be a constructor function (a function with keys in its `prototype`) in which case it’s invoked with `new`.
      * Instances must have a `compile` method which is invoked without arguments and must return a `string`.
      */
    var Compiler: CompilerConstructor | CompilerFunction = js.native
    
    /**
      * Function handling the parsing of text to a syntax tree.
      * Used in the parse phase in the process and invoked with a `string` and `VFile` representation of the document to parse.
      *
      * `Parser` can be a normal function in which case it must return a `Node`: the syntax tree representation of the given file.
      *
      * `Parser` can also be a constructor function (a function with keys in its `prototype`) in which case it’s invoked with `new`.
      * Instances must have a parse method which is invoked without arguments and must return a `Node`.
      */
    var Parser: ParserConstructor | ParserFunction = js.native
    
    /**
      * Get or set information in an in-memory key-value store accessible to all phases of the process.
      * An example is a list of HTML elements which are self-closing, which is needed when parsing, transforming, and compiling HTML.
      *
      * @returns key-value store object
      */
    def data(): StringDictionary[js.Any] = js.native
    /**
      * @param key Identifier
      * @returns If getting, the value at key
      */
    def data(key: String): js.Any = js.native
    /**
      * @param value Value to set. Omit if getting key
      * @returns If setting, the processor on which data is invoked
      */
    def data(key: String, value: js.Any): Processor[P] = js.native
    
    /**
      * Freeze a processor. Frozen processors are meant to be extended and not to be configured or processed directly.
      *
      * Once a processor is frozen it cannot be unfrozen. New processors functioning just like it can be created by invoking the processor.
      *
      * It’s possible to freeze processors explicitly, by calling `.freeze()`, but `.parse()`, `.run()`, `.stringify()`, and `.process()` call `.freeze()` to freeze a processor too.
      *
      * @returns The processor on which freeze is invoked.
      */
    def freeze(): Processor[P] = js.native
    
    /**
      * Parse text to a syntax tree.
      *
      * @param file VFile or anything which can be given to vfile()
      * @returns Syntax tree representation of input.
      */
    def parse(file: VFileCompatible): Node = js.native
    
    /**
      * Process the given representation of a file as configured on the processor. The process invokes `parse`, `run`, and `stringify` internally.
      * @param file `VFile` or anything which can be given to `vfile()`
      * @returns `Promise` if `done` is not given.
      * Rejected with an error or resolved with the resulting file.
      */
    def process(file: VFileCompatible): js.Promise[VFile] = js.native
    /**
      * Process the given representation of a file as configured on the processor. The process invokes `parse`, `run`, and `stringify` internally.
      * @param file `VFile` or anything which can be given to `vfile()`
      * @param done Invoked when the process is complete. Invoked with a fatal error, if any, and the VFile.
      */
    def process(file: VFileCompatible, done: ProcessCallback): Unit = js.native
    
    /**
      * Process the given representation of a file as configured on the processor. The process invokes `parse`, `run`, and `stringify` internally.
      *
      * If asynchronous plugins are configured an error is thrown.
      *
      * @param file `VFile` or anything which can be given to `vfile()`
      * @returns Virtual file with modified contents.
      */
    def processSync(file: VFileCompatible): VFile = js.native
    
    /**
      * Transform a syntax tree by applying plugins to it.
      *
      * @param node Node to transform
      * @returns `Promise` if `done` is not given. Rejected with an error, or resolved with the resulting syntax tree.
      */
    def run(node: Node): js.Promise[Node] = js.native
    /**
      * Transform a syntax tree by applying plugins to it.
      *
      * @param node Node to transform
      * @param done Invoked when transformation is complete.
      */
    def run(node: Node, done: RunCallback): Unit = js.native
    /**
      * Transform a syntax tree by applying plugins to it.
      *
      * @param node Node to transform
      * @param file `VFile` or anything which can be given to `vfile()`
      * @returns `Promise` if `done` is not given. Rejected with an error, or resolved with the resulting syntax tree.
      */
    def run(node: Node, file: VFileCompatible): js.Promise[Node] = js.native
    /**
      * Transform a syntax tree by applying plugins to it.
      *
      * @param node Node to transform
      * @param file `VFile` or anything which can be given to `vfile()`
      * @param done Invoked when transformation is complete.
      */
    def run(node: Node, file: VFileCompatible, done: RunCallback): Unit = js.native
    
    /**
      * Transform a syntax tree by applying plugins to it.
      *
      * If asynchronous plugins are configured an error is thrown.
      *
      * @param node Node to transform
      * @param file `VFile` or anything which can be given to `vfile()`
      * @returns The given syntax tree.
      */
    def runSync(node: Node): Node = js.native
    def runSync(node: Node, file: VFileCompatible): Node = js.native
    
    /**
      * Compile a syntax tree to text.
      *
      * @param node unist node
      * @param file `VFile` or anything which can be given to `vfile()`
      * @returns String representation of the syntax tree file
      */
    def stringify(node: Node): String = js.native
    def stringify(node: Node, file: VFileCompatible): String = js.native
    
    /**
      * A list of plugins and presets to be applied to processor
      *
      * @param list List of plugins, presets, and pairs
      */
    def use(list: PluggableList[P]): Processor[P] = js.native
    /**
      * Configuration passed to a frozen processor
      *
      * @param processorSettings Settings passed to processor
      */
    def use(processorSettings: ProcessorSettings[P]): Processor[P] = js.native
    /**
      * Configure using a tuple of plugin and setting(s)
      *
      * @param pluginTuple pairs, plugin and settings in an array
      * @typeParam S Plugin settings
      */
    def use[S /* <: js.Array[_] */](pluginTuple: PluginTuple[S, P]): Processor[P] = js.native
    /**
      * Configure the processor to use a plugin and optionally configure that plugin with options.
      *
      * @param plugin unified plugin
      * @param settings Configuration for plugin
      * @typeParam S Plugin settings
      * @returns The processor on which use is invoked
      */
    def use[S /* <: js.Array[_] */](
      plugin: Plugin[S, P],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param settings because its type S is not an array type */ settings: S
    ): Processor[P] = js.native
    /**
      * Configure the processor with a preset to use
      *
      * @param preset `Object` with an plugins (set to list), and/or an optional settings object
      */
    def use[S /* <: js.Array[_] */](preset: Preset[S, P]): Processor[P] = js.native
  }
  
  /**
    * Settings can be passed directly to the processor
    *
    * @typeParam P Settings applied to a processor. Useful when packaging unified with a preset parser and compiler.
    */
  @js.native
  trait ProcessorSettings[P] extends StObject {
    
    var settings: P = js.native
  }
  object ProcessorSettings {
    
    @scala.inline
    def apply[P](settings: P): ProcessorSettings[P] = {
      val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessorSettings[P]]
    }
    
    @scala.inline
    implicit class ProcessorSettingsMutableBuilder[Self <: ProcessorSettings[_], P] (val x: Self with ProcessorSettings[P]) extends AnyVal {
      
      @scala.inline
      def setSettings(value: P): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Access results from transforms
    *
    * @param error Error if any occurred
    * @param node Transformed AST tree/node
    * @param vfile File associated with node
    */
  type RunCallback = js.Function3[/* error */ Error | Null, /* node */ Node, /* file */ VFile, Unit]
  
  /**
    * Configuration passed to a Plugin or Processor
    */
  type Settings = StringDictionary[js.Any]
  
  /**
    * Transformers modify the syntax tree or metadata of a file. A transformer is a function which is invoked each time a file is passed through the transform phase.
    * If an error occurs (either because it’s thrown, returned, rejected, or passed to `next`), the process stops.
    *
    * The transformation process in unified is handled by `trough`, see it’s documentation for the exact semantics of transformers.
    *
    * @param node Node or tree to be transformed
    * @param file File associated with node or tree
    * @param next If the signature of a transformer includes `next` (third argument), the function may finish asynchronous, and must invoke `next()`.
    * @returns
    * - `void` — If nothing is returned, the next transformer keeps using same tree.
    * - `Error` — Can be returned to stop the process
    * - `Node` — Can be returned and results in further transformations and `stringify`s to be performed on the new tree
    * - `Promise` — If a promise is returned, the function is asynchronous, and must be resolved (optionally with a `Node`) or rejected (optionally with an `Error`)
    */
  type Transformer = js.Function3[
    /* node */ Node, 
    /* file */ VFile, 
    /* next */ js.UndefOr[
      js.Function3[/* error */ Error | Null, /* tree */ Node, /* file */ VFile, js.Object]
    ], 
    Error | Node | (js.Promise[Node | Unit]) | Unit
  ]
}
