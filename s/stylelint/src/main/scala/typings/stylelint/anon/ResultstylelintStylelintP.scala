package typings.stylelint.anon

import typings.postcss.libProcessorMod.default
import typings.postcss.libResultMod.Message
import typings.postcss.libResultMod.ResultOptions
import typings.postcss.libWarningMod.WarningOptions
import typings.postcss.mod.Root_
import typings.postcss.mod.SourceMap
import typings.postcss.mod.TransformCallback
import typings.postcss.mod.Warning
import typings.std.Document
import typings.std.Plugin
import typings.stylelint.mod.PostcssResult
import typings.stylelint.mod.StylelintPostcssResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined postcss.postcss.Result & {  stylelint :stylelint.stylelint.StylelintPostcssResult, warn (message : string, options : stylelint.stylelint.WarningOptions | undefined): void} */
@js.native
trait ResultstylelintStylelintP
  extends StObject
     with PostcssResult {
  
  /**
    * An alias for the `Result#css` property.
    * Use it with syntaxes that generate non-CSS output.
    *
    * ```js
    * result.css === result.content
    * ```
    */
  def content: String = js.native
  
  /**
    * A CSS string representing of `Result#root`.
    *
    * ```js
    * postcss.parse('a{}').toResult().css //=> "a{}"
    * ```
    */
  var css: String = js.native
  
  /**
    * Last runned PostCSS plugin.
    */
  var lastPlugin: Plugin | TransformCallback = js.native
  
  /**
    * An instance of `SourceMapGenerator` class from the `source-map` library,
    * representing changes to the `Result#root` instance.
    *
    * ```js
    * result.map.toJSON() //=> { version: 3, file: 'a.css', … }
    * ```
    *
    * ```js
    * if (result.map) {
    *   fs.writeFileSync(result.opts.to + '.map', result.map.toString())
    * }
    * ```
    */
  var map: SourceMap = js.native
  
  /**
    * Contains messages from plugins (e.g., warnings or custom messages).
    * Each message should have type and plugin properties.
    *
    * ```js
    * AtRule: {
    *   import: (atRule, { result }) {
    *     const importedFile = parseImport(atRule)
    *     result.messages.push({
    *       type: 'dependency',
    *       plugin: 'postcss-import',
    *       file: importedFile,
    *       parent: result.opts.from
    *     })
    *   }
    * }
    * ```
    */
  var messages: js.Array[Message] = js.native
  
  /**
    * Options from the `Processor#process` or `Root#toResult` call
    * that produced this Result instance.]
    *
    * ```js
    * root.toResult(opts).opts === opts
    * ```
    */
  var opts: ResultOptions = js.native
  
  /**
    * The Processor instance used for this transformation.
    *
    * ```js
    * for (const plugin of result.processor.plugins) {
    *   if (plugin.postcssPlugin === 'postcss-bad') {
    *     throw 'postcss-good is incompatible with postcss-bad'
    *   }
    * })
    * ```
    */
  var processor: default = js.native
  
  /**
    * Root node after all transformations.
    *
    * ```js
    * root.toResult().root === root
    * ```
    */
  var root: Root_ | Document = js.native
  
  var stylelint: StylelintPostcssResult = js.native
  
  def warn(message: String): Unit = js.native
  def warn(message: String, options: WarningOptions): Warning = js.native
  def warn(message: String, options: typings.stylelint.mod.WarningOptions): Unit = js.native
  /**
    * Creates an instance of `Warning` and adds it to `Result#messages`.
    *
    * ```js
    * if (decl.important) {
    *   result.warn('Avoid !important', { node: decl, word: '!important' })
    * }
    * ```
    *
    * @param text Warning message.
    * @param opts Warning options.
    * @return Created warning.
    */
  @JSName("warn")
  def warn_Warning(message: String): Warning = js.native
  
  /**
    * Returns warnings from plugins. Filters `Warning` instances
    * from `Result#messages`.
    *
    * ```js
    * result.warnings().forEach(warn => {
    *   console.warn(warn.toString())
    * })
    * ```
    *
    * @return Warnings from plugins.
    */
  def warnings(): js.Array[Warning] = js.native
}
