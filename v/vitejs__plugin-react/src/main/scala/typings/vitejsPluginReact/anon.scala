package typings.vitejsPluginReact

import typings.babelParser.mod.ParserPlugin
import typings.std.Extract
import typings.vite.mod.ResolvedConfig
import typings.vitejsPluginReact.mod.ReactBabelHook
import typings.vitejsPluginReact.mod.ReactBabelHookContext
import typings.vitejsPluginReact.mod.ReactBabelOptions
import typings.vitejsPluginReact.vitejsPluginReactStrings.module
import typings.vitejsPluginReact.vitejsPluginReactStrings.script
import typings.vitejsPluginReact.vitejsPluginReactStrings.unambiguous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @babel/core.@babel/core.ParserOptions & {  plugins :std.Extract<@babel/core.@babel/core.ParserOptions['plugins'], std.Array<any>>} */
  trait ParserOptionspluginsExtra extends StObject {
    
    /**
      * By default, await use is not allowed outside of an async function.
      * Set this to true to accept such code.
      */
    var allowAwaitOutsideFunction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, import and export declarations can only appear at a program's top level.
      * Setting this option to true allows them anywhere where a statement is allowed.
      */
    var allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, a return statement at the top level raises an error.
      * Set this to true to accept such code.
      */
    var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined
    
    var allowSuperOutsideMethod: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, exported identifiers must refer to a declared variable.
      * Set this to true to allow export statements to reference undeclared variables.
      */
    var allowUndeclaredExports: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, Babel attaches comments to adjacent AST nodes.
      * When this option is set to false, comments are not attached.
      * It can provide up to 30% performance improvement when the input code has many comments.
      * @babel/eslint-parser will set it for you.
      * It is not recommended to use attachComment: false with Babel transform,
      * as doing so removes all the comments in output code, and renders annotations such as
      * / * istanbul ignore next *\/ nonfunctional.
      */
    var attachComment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, the parser adds information about parentheses by setting
      * `extra.parenthesized` to `true` as needed.
      * When this option is `true` the parser creates `ParenthesizedExpression`
      * AST nodes instead of using the `extra` property.
      */
    var createParenthesizedExpressions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, Babel always throws an error when it finds some invalid code.
      * When this option is set to true, it will store the parsing error and
      * try to continue parsing the invalid input file.
      */
    var errorRecovery: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array containing the plugins that you want to enable.
      */
    var plugins: js.UndefOr[js.Array[ParserPlugin]] & (Extract[js.UndefOr[js.Array[ParserPlugin]], js.Array[Any]])
    
    /**
      * Adds a ranges property to each node: [node.start, node.end]
      */
    var ranges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Correlate output AST nodes with their source filename.
      * Useful when generating code and source maps from the ASTs of multiple input files.
      */
    var sourceFilename: js.UndefOr[String] = js.undefined
    
    /**
      * Indicate the mode the code should be parsed in.
      * Can be one of "script", "module", or "unambiguous". Defaults to "script".
      * "unambiguous" will make @babel/parser attempt to guess, based on the presence
      * of ES6 import or export statements.
      * Files with ES6 imports and exports are considered "module" and are otherwise "script".
      */
    var sourceType: js.UndefOr[script | module | unambiguous] = js.undefined
    
    /**
      * By default, the parsed code is treated as if it starts from line 1, column 0.
      * You can provide a column number to alternatively start with.
      * Useful for integration with other source tools.
      */
    var startColumn: js.UndefOr[Double] = js.undefined
    
    /**
      * By default, the first line of code parsed is treated as line 1.
      * You can provide a line number to alternatively start with.
      * Useful for integration with other source tools.
      */
    var startLine: js.UndefOr[Double] = js.undefined
    
    /**
      * Should the parser work in strict mode.
      * Defaults to true if sourceType === 'module'. Otherwise, false.
      */
    var strictMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds all parsed tokens to a tokens property on the File node.
      */
    var tokens: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptionspluginsExtra {
    
    inline def apply(): ParserOptionspluginsExtra = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptionspluginsExtra]
    }
    
    extension [Self <: ParserOptionspluginsExtra](x: Self) {
      
      inline def setAllowAwaitOutsideFunction(value: Boolean): Self = StObject.set(x, "allowAwaitOutsideFunction", value.asInstanceOf[js.Any])
      
      inline def setAllowAwaitOutsideFunctionUndefined: Self = StObject.set(x, "allowAwaitOutsideFunction", js.undefined)
      
      inline def setAllowImportExportEverywhere(value: Boolean): Self = StObject.set(x, "allowImportExportEverywhere", value.asInstanceOf[js.Any])
      
      inline def setAllowImportExportEverywhereUndefined: Self = StObject.set(x, "allowImportExportEverywhere", js.undefined)
      
      inline def setAllowReturnOutsideFunction(value: Boolean): Self = StObject.set(x, "allowReturnOutsideFunction", value.asInstanceOf[js.Any])
      
      inline def setAllowReturnOutsideFunctionUndefined: Self = StObject.set(x, "allowReturnOutsideFunction", js.undefined)
      
      inline def setAllowSuperOutsideMethod(value: Boolean): Self = StObject.set(x, "allowSuperOutsideMethod", value.asInstanceOf[js.Any])
      
      inline def setAllowSuperOutsideMethodUndefined: Self = StObject.set(x, "allowSuperOutsideMethod", js.undefined)
      
      inline def setAllowUndeclaredExports(value: Boolean): Self = StObject.set(x, "allowUndeclaredExports", value.asInstanceOf[js.Any])
      
      inline def setAllowUndeclaredExportsUndefined: Self = StObject.set(x, "allowUndeclaredExports", js.undefined)
      
      inline def setAttachComment(value: Boolean): Self = StObject.set(x, "attachComment", value.asInstanceOf[js.Any])
      
      inline def setAttachCommentUndefined: Self = StObject.set(x, "attachComment", js.undefined)
      
      inline def setCreateParenthesizedExpressions(value: Boolean): Self = StObject.set(x, "createParenthesizedExpressions", value.asInstanceOf[js.Any])
      
      inline def setCreateParenthesizedExpressionsUndefined: Self = StObject.set(x, "createParenthesizedExpressions", js.undefined)
      
      inline def setErrorRecovery(value: Boolean): Self = StObject.set(x, "errorRecovery", value.asInstanceOf[js.Any])
      
      inline def setErrorRecoveryUndefined: Self = StObject.set(x, "errorRecovery", js.undefined)
      
      inline def setPlugins(
        value: js.UndefOr[js.Array[ParserPlugin]] & (Extract[js.UndefOr[js.Array[ParserPlugin]], js.Array[Any]])
      ): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: ParserPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setSourceFilename(value: String): Self = StObject.set(x, "sourceFilename", value.asInstanceOf[js.Any])
      
      inline def setSourceFilenameUndefined: Self = StObject.set(x, "sourceFilename", js.undefined)
      
      inline def setSourceType(value: script | module | unambiguous): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
      
      inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
      
      inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
      
      inline def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
      
      inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
      
      inline def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
      
      inline def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  trait ReactBabel extends StObject {
    
    /**
      * Manipulate the Babel options of `@vitejs/plugin-react`
      */
    var reactBabel: js.UndefOr[ReactBabelHook] = js.undefined
  }
  object ReactBabel {
    
    inline def apply(): ReactBabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactBabel]
    }
    
    extension [Self <: ReactBabel](x: Self) {
      
      inline def setReactBabel(
        value: (/* babelConfig */ ReactBabelOptions, /* context */ ReactBabelHookContext, /* config */ ResolvedConfig) => Unit
      ): Self = StObject.set(x, "reactBabel", js.Any.fromFunction3(value))
      
      inline def setReactBabelUndefined: Self = StObject.set(x, "reactBabel", js.undefined)
    }
  }
  
  trait Ssr extends StObject {
    
    var ssr: js.UndefOr[Boolean] = js.undefined
  }
  object Ssr {
    
    inline def apply(): Ssr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ssr]
    }
    
    extension [Self <: Ssr](x: Self) {
      
      inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    }
  }
}
