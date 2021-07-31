package typings.vueCompilerSfc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def compileScript(sfc: typings.vueCompilerSfc.mod.SFCDescriptor): typings.vueCompilerSfc.mod.SFCScriptBlock = typings.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compileScript")(sfc.asInstanceOf[js.Any]).asInstanceOf[typings.vueCompilerSfc.mod.SFCScriptBlock]
@scala.inline
def compileScript(
  sfc: typings.vueCompilerSfc.mod.SFCDescriptor,
  options: typings.vueCompilerSfc.mod.SFCScriptCompileOptions
): typings.vueCompilerSfc.mod.SFCScriptBlock = (typings.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compileScript")(sfc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueCompilerSfc.mod.SFCScriptBlock]

@scala.inline
def compileStyle(options: typings.vueCompilerSfc.mod.SFCStyleCompileOptions): typings.vueCompilerSfc.mod.SFCStyleCompileResults = typings.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compileStyle")(options.asInstanceOf[js.Any]).asInstanceOf[typings.vueCompilerSfc.mod.SFCStyleCompileResults]

@scala.inline
def compileStyleAsync(options: typings.vueCompilerSfc.mod.SFCAsyncStyleCompileOptions): js.Promise[typings.vueCompilerSfc.mod.SFCStyleCompileResults] = typings.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compileStyleAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.vueCompilerSfc.mod.SFCStyleCompileResults]]

@scala.inline
def compileTemplate(options: typings.vueCompilerSfc.mod.SFCTemplateCompileOptions): typings.vueCompilerSfc.mod.SFCTemplateCompileResults = typings.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compileTemplate")(options.asInstanceOf[js.Any]).asInstanceOf[typings.vueCompilerSfc.mod.SFCTemplateCompileResults]

@scala.inline
def generateCodeFrame(source: java.lang.String): java.lang.String = typings.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
@scala.inline
def generateCodeFrame(source: java.lang.String, start: scala.Double): java.lang.String = (typings.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def generateCodeFrame(source: java.lang.String, start: scala.Double, end: scala.Double): java.lang.String = (typings.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def generateCodeFrame(source: java.lang.String, start: scala.Unit, end: scala.Double): java.lang.String = (typings.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

@scala.inline
def parse(source: java.lang.String): typings.vueCompilerSfc.mod.SFCParseResult = typings.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[typings.vueCompilerSfc.mod.SFCParseResult]
@scala.inline
def parse(
  source: java.lang.String,
  hasSourceMapFilenameSourceRootPadCompiler: typings.vueCompilerSfc.mod.SFCParseOptions
): typings.vueCompilerSfc.mod.SFCParseResult = (typings.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], hasSourceMapFilenameSourceRootPadCompiler.asInstanceOf[js.Any])).asInstanceOf[typings.vueCompilerSfc.mod.SFCParseResult]

@scala.inline
def rewriteDefault(input: java.lang.String, as: java.lang.String): java.lang.String = (typings.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rewriteDefault")(input.asInstanceOf[js.Any], as.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def rewriteDefault(
  input: java.lang.String,
  as: java.lang.String,
  parserPlugins: js.Array[typings.babelParser.mod.ParserPlugin]
): java.lang.String = (typings.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rewriteDefault")(input.asInstanceOf[js.Any], as.asInstanceOf[js.Any], parserPlugins.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

type AssetURLTagConfig = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
