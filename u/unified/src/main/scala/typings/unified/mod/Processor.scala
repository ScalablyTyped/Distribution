package typings.unified.mod

import org.scalablytyped.runtime.StringDictionary
import typings.unist.mod.Node
import typings.vfile.mod.VFile
import typings.vfile.mod.VFileCompatible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Processor allows plugins, parsers, and compilers to be chained together to transform content.
  *
  * @typeParam P Processor settings. Useful when packaging unified with a preset parser and compiler.
  */
@js.native
trait Processor[P] extends js.Object {
  
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
