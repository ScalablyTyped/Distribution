package typings.twig.mod

import typings.twig.mod.^
import typings.twig.twigBooleans.`false`
import typings.twig.twigStrings.TwigDotexpressionDottypeDotarrayDotend
import typings.twig.twigStrings.TwigDotexpressionDottypeDotarrayDotstart
import typings.twig.twigStrings.TwigDotexpressionDottypeDotbool
import typings.twig.twigStrings.TwigDotexpressionDottypeDotnull
import typings.twig.twigStrings.TwigDotexpressionDottypeDotnumber
import typings.twig.twigStrings.TwigDotexpressionDottypeDotobjectDotend
import typings.twig.twigStrings.TwigDotexpressionDottypeDotobjectDotstart
import typings.twig.twigStrings.TwigDotexpressionDottypeDotstring
import typings.twig.twigStrings.TwigDotexpressionDottypeDotvariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def cache(value: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def compile(markup: String, options: CompileOptions): js.Function1[/* context */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(markup.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* context */ Any, Any]]

inline def express(
  path: String,
  options: CompileOptions,
  fn: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__express")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def extend(`extension`: js.Function1[/* twig */ Twig_, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def extendFilter_false(
  name: String,
  definition: js.Function2[/* left */ Any, /* params */ js.Array[Any] | `false`, String]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendFilter")(name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def extendFunction(name: String, definition: js.Function1[/* repeated */ Any, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendFunction")(name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def extendTag(definition: ExtendTagOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendTag")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def extendTest(name: String, definition: js.Function1[/* value */ Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendTest")(name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def renderFile(path: String, fn: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def renderFile(path: String, options: RenderOptions, fn: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def twig(params: Parameters): Template = ^.asInstanceOf[js.Dynamic].applyDynamic("twig")(params.asInstanceOf[js.Any]).asInstanceOf[Template]

type CompiledToken = (CompiledTokenWithoutMatch[
TwigDotexpressionDottypeDotbool | TwigDotexpressionDottypeDotstring | TwigDotexpressionDottypeDotnull]) | (CompiledTokenWithMatch[
TwigDotexpressionDottypeDotnumber | TwigDotexpressionDottypeDotvariable | TwigDotexpressionDottypeDotarrayDotstart | TwigDotexpressionDottypeDotarrayDotend | TwigDotexpressionDottypeDotobjectDotstart | TwigDotexpressionDottypeDotobjectDotend]) | CompiledSubexpressionToken | CompiledBinaryOperatorToken[BinaryOperator]

type CompiledTokenWithMatch[TType /* <: TwigDotexpressionDottypeDotnumber | TwigDotexpressionDottypeDotvariable | TwigDotexpressionDottypeDotarrayDotstart | TwigDotexpressionDottypeDotarrayDotend | TwigDotexpressionDottypeDotobjectDotstart | TwigDotexpressionDottypeDotobjectDotend */] = CompiledGenericTokenWithMatch[
TType, 
/* import warning: importer.ImportType#apply Failed type conversion: twig.twig.CompiledTokenTypesWithMatchMap[TType] */ js.Any]

type CompiledTokenWithoutMatch[TType /* <: TwigDotexpressionDottypeDotbool | TwigDotexpressionDottypeDotstring | TwigDotexpressionDottypeDotnull */] = CompiledGenericToken[
TType, 
/* import warning: importer.ImportType#apply Failed type conversion: twig.twig.CompiledTokenTypesWithoutMatchMap[TType] */ js.Any]
