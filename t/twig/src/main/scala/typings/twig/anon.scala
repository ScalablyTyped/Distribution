package typings.twig

import typings.std.Omit
import typings.twig.mod.CompileOptions
import typings.twig.mod.CompiledToken
import typings.twig.mod.ExtendTagOptions
import typings.twig.mod.Parameters
import typings.twig.mod.ParseContext
import typings.twig.mod.RenderOptions
import typings.twig.mod.Template
import typings.twig.twigBooleans.`false`
import typings.twig.twigStrings.TwigDotexpressionDottypeDot_function
import typings.twig.twigStrings.TwigDotexpressionDottypeDotarrayDotend
import typings.twig.twigStrings.TwigDotexpressionDottypeDotarrayDotstart
import typings.twig.twigStrings.TwigDotexpressionDottypeDotbool
import typings.twig.twigStrings.TwigDotexpressionDottypeDotcomma
import typings.twig.twigStrings.TwigDotexpressionDottypeDotcontext
import typings.twig.twigStrings.TwigDotexpressionDottypeDotfilter
import typings.twig.twigStrings.TwigDotexpressionDottypeDotkeyDotbrackets
import typings.twig.twigStrings.TwigDotexpressionDottypeDotkeyDotperiod
import typings.twig.twigStrings.TwigDotexpressionDottypeDotnull
import typings.twig.twigStrings.TwigDotexpressionDottypeDotnumber
import typings.twig.twigStrings.TwigDotexpressionDottypeDotobjectDotend
import typings.twig.twigStrings.TwigDotexpressionDottypeDotobjectDotstart
import typings.twig.twigStrings.TwigDotexpressionDottypeDotoperatorDotbinary
import typings.twig.twigStrings.TwigDotexpressionDottypeDotoperatorDotunary
import typings.twig.twigStrings.TwigDotexpressionDottypeDotparameterDotend
import typings.twig.twigStrings.TwigDotexpressionDottypeDotparameterDotstart
import typings.twig.twigStrings.TwigDotexpressionDottypeDotslice
import typings.twig.twigStrings.TwigDotexpressionDottypeDotstring
import typings.twig.twigStrings.TwigDotexpressionDottypeDotsubexpressionDotend
import typings.twig.twigStrings.TwigDotexpressionDottypeDotsubexpressionDotstart
import typings.twig.twigStrings.TwigDotexpressionDottypeDottest
import typings.twig.twigStrings.TwigDotexpressionDottypeDotvariable
import typings.twig.twigStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var end: TwigDotexpressionDottypeDotsubexpressionDotend
    
    var start: TwigDotexpressionDottypeDotsubexpressionDotstart
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(end = "Twig.expression.type.subexpression.end", start = "Twig.expression.type.subexpression.start")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setEnd(value: TwigDotexpressionDottypeDotsubexpressionDotend): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: TwigDotexpressionDottypeDotsubexpressionDotstart): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Array extends StObject {
    
    var _function: TwigDotexpressionDottypeDot_function
    
    var _null: TwigDotexpressionDottypeDotnull
    
    var array: End
    
    var bool: TwigDotexpressionDottypeDotbool
    
    var comma: TwigDotexpressionDottypeDotcomma
    
    var context: TwigDotexpressionDottypeDotcontext
    
    var filter: TwigDotexpressionDottypeDotfilter
    
    var key: Brackets
    
    var number: TwigDotexpressionDottypeDotnumber
    
    var `object`: Start
    
    var operator: Binary
    
    var parameter: EndStart
    
    var slice: TwigDotexpressionDottypeDotslice
    
    var string: TwigDotexpressionDottypeDotstring
    
    var subexpression: `0`
    
    var test: TwigDotexpressionDottypeDottest
    
    var variable: TwigDotexpressionDottypeDotvariable
  }
  object Array {
    
    inline def apply(
      array: End,
      key: Brackets,
      `object`: Start,
      operator: Binary,
      parameter: EndStart,
      subexpression: `0`
    ): Array = {
      val __obj = js.Dynamic.literal(_function = "Twig.expression.type._function", _null = "Twig.expression.type.null", array = array.asInstanceOf[js.Any], bool = "Twig.expression.type.bool", comma = "Twig.expression.type.comma", context = "Twig.expression.type.context", filter = "Twig.expression.type.filter", key = key.asInstanceOf[js.Any], number = "Twig.expression.type.number", operator = operator.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], slice = "Twig.expression.type.slice", string = "Twig.expression.type.string", subexpression = subexpression.asInstanceOf[js.Any], test = "Twig.expression.type.test", variable = "Twig.expression.type.variable")
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Array]
    }
    
    extension [Self <: Array](x: Self) {
      
      inline def setArray(value: End): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setBool(value: TwigDotexpressionDottypeDotbool): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setComma(value: TwigDotexpressionDottypeDotcomma): Self = StObject.set(x, "comma", value.asInstanceOf[js.Any])
      
      inline def setContext(value: TwigDotexpressionDottypeDotcontext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: TwigDotexpressionDottypeDotfilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Brackets): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: TwigDotexpressionDottypeDotnumber): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Start): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: Binary): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setParameter(value: EndStart): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
      
      inline def setSlice(value: TwigDotexpressionDottypeDotslice): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      inline def setString(value: TwigDotexpressionDottypeDotstring): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setSubexpression(value: `0`): Self = StObject.set(x, "subexpression", value.asInstanceOf[js.Any])
      
      inline def setTest(value: TwigDotexpressionDottypeDottest): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setVariable(value: TwigDotexpressionDottypeDotvariable): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
      
      inline def set_function(value: TwigDotexpressionDottypeDot_function): Self = StObject.set(x, "_function", value.asInstanceOf[js.Any])
      
      inline def set_null(value: TwigDotexpressionDottypeDotnull): Self = StObject.set(x, "_null", value.asInstanceOf[js.Any])
    }
  }
  
  trait Binary extends StObject {
    
    var binary: TwigDotexpressionDottypeDotoperatorDotbinary
    
    var unary: TwigDotexpressionDottypeDotoperatorDotunary
  }
  object Binary {
    
    inline def apply(): Binary = {
      val __obj = js.Dynamic.literal(binary = "Twig.expression.type.operator.binary", unary = "Twig.expression.type.operator.unary")
      __obj.asInstanceOf[Binary]
    }
    
    extension [Self <: Binary](x: Self) {
      
      inline def setBinary(value: TwigDotexpressionDottypeDotoperatorDotbinary): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setUnary(value: TwigDotexpressionDottypeDotoperatorDotunary): Self = StObject.set(x, "unary", value.asInstanceOf[js.Any])
    }
  }
  
  trait Brackets extends StObject {
    
    var brackets: TwigDotexpressionDottypeDotkeyDotbrackets
    
    var period: TwigDotexpressionDottypeDotkeyDotperiod
  }
  object Brackets {
    
    inline def apply(): Brackets = {
      val __obj = js.Dynamic.literal(brackets = "Twig.expression.type.key.brackets", period = "Twig.expression.type.key.period")
      __obj.asInstanceOf[Brackets]
    }
    
    extension [Self <: Brackets](x: Self) {
      
      inline def setBrackets(value: TwigDotexpressionDottypeDotkeyDotbrackets): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
      
      inline def setPeriod(value: TwigDotexpressionDottypeDotkeyDotperiod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cache extends StObject {
    
    def __express(
      path: String,
      options: CompileOptions,
      fn: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit
    @JSName("__express")
    var __express_Original: js.Function3[
        /* path */ String, 
        /* options */ CompileOptions, 
        /* fn */ js.Function2[/* err */ js.Error, /* result */ Any, Unit], 
        Unit
      ]
    
    def cache(value: Boolean): Unit
    @JSName("cache")
    var cache_Original: js.Function1[/* value */ Boolean, Unit]
    
    def compile(markup: String, options: CompileOptions): js.Function1[/* context */ Any, Any]
    @JSName("compile")
    var compile_Original: js.Function2[
        /* markup */ String, 
        /* options */ CompileOptions, 
        js.Function1[/* context */ Any, Any]
      ]
    
    def extend(`extension`: js.Function1[/* twig */ this.type, Unit]): Unit
    
    @JSName("extendFilter")
    var extendFilter_Original: js.Function2[
        /* name */ String, 
        /* definition */ js.Function2[/* left */ Any, /* params */ js.Array[Any] | `false`, String], 
        Unit
      ]
    @JSName("extendFilter")
    def extendFilter_false(
      name: String,
      definition: js.Function2[/* left */ Any, /* params */ js.Array[Any] | `false`, String]
    ): Unit
    
    def extendFunction(name: String, definition: js.Function1[/* repeated */ Any, String]): Unit
    @JSName("extendFunction")
    var extendFunction_Original: js.Function2[/* name */ String, /* definition */ js.Function1[/* repeated */ Any, String], Unit]
    
    def extendTag(definition: ExtendTagOptions): Unit
    @JSName("extendTag")
    var extendTag_Original: js.Function1[/* definition */ ExtendTagOptions, Unit]
    
    def extendTest(name: String, definition: js.Function1[/* value */ Any, Boolean]): Unit
    @JSName("extendTest")
    var extendTest_Original: js.Function2[/* name */ String, /* definition */ js.Function1[/* value */ Any, Boolean], Unit]
    
    @JSName("extend")
    var extend_Original: js.Function1[/* extension */ js.Function1[/* twig */ this.type, Unit], Unit]
    
    def renderFile(path: String, fn: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit
    def renderFile(path: String, options: RenderOptions, fn: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit
    @JSName("renderFile")
    var renderFile_Original: FnCall
    
    def twig(params: Parameters): Template
    @JSName("twig")
    var twig_Original: js.Function1[/* params */ Parameters, Template]
  }
  object Cache {
    
    inline def apply(
      __express: (/* path */ String, /* options */ CompileOptions, /* fn */ js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Unit,
      cache: /* value */ Boolean => Unit,
      compile: (/* markup */ String, /* options */ CompileOptions) => js.Function1[/* context */ Any, Any],
      extend: /* extension */ js.Function1[Cache, Unit] => Unit,
      extendFilter: (/* name */ String, /* definition */ js.Function2[/* left */ Any, /* params */ js.Array[Any] | `false`, String]) => Unit,
      extendFunction: (/* name */ String, /* definition */ js.Function1[/* repeated */ Any, String]) => Unit,
      extendTag: /* definition */ ExtendTagOptions => Unit,
      extendTest: (/* name */ String, /* definition */ js.Function1[/* value */ Any, Boolean]) => Unit,
      renderFile: FnCall,
      twig: /* params */ Parameters => Template
    ): Cache = {
      val __obj = js.Dynamic.literal(__express = js.Any.fromFunction3(__express), cache = js.Any.fromFunction1(cache), compile = js.Any.fromFunction2(compile), extend = js.Any.fromFunction1(extend), extendFilter = js.Any.fromFunction2(extendFilter), extendFunction = js.Any.fromFunction2(extendFunction), extendTag = js.Any.fromFunction1(extendTag), extendTest = js.Any.fromFunction2(extendTest), renderFile = renderFile.asInstanceOf[js.Any], twig = js.Any.fromFunction1(twig))
      __obj.asInstanceOf[Cache]
    }
    
    extension [Self <: Cache](x: Self) {
      
      inline def setCache(value: /* value */ Boolean => Unit): Self = StObject.set(x, "cache", js.Any.fromFunction1(value))
      
      inline def setCompile(value: (/* markup */ String, /* options */ CompileOptions) => js.Function1[/* context */ Any, Any]): Self = StObject.set(x, "compile", js.Any.fromFunction2(value))
      
      inline def setExtend(value: /* extension */ js.Function1[Cache, Unit] => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
      
      inline def setExtendFilter(
        value: (/* name */ String, /* definition */ js.Function2[/* left */ Any, /* params */ js.Array[Any] | `false`, String]) => Unit
      ): Self = StObject.set(x, "extendFilter", js.Any.fromFunction2(value))
      
      inline def setExtendFunction(value: (/* name */ String, /* definition */ js.Function1[/* repeated */ Any, String]) => Unit): Self = StObject.set(x, "extendFunction", js.Any.fromFunction2(value))
      
      inline def setExtendTag(value: /* definition */ ExtendTagOptions => Unit): Self = StObject.set(x, "extendTag", js.Any.fromFunction1(value))
      
      inline def setExtendTest(value: (/* name */ String, /* definition */ js.Function1[/* value */ Any, Boolean]) => Unit): Self = StObject.set(x, "extendTest", js.Any.fromFunction2(value))
      
      inline def setRenderFile(value: FnCall): Self = StObject.set(x, "renderFile", value.asInstanceOf[js.Any])
      
      inline def setTwig(value: /* params */ Parameters => Template): Self = StObject.set(x, "twig", js.Any.fromFunction1(value))
      
      inline def set__express(
        value: (/* path */ String, /* options */ CompileOptions, /* fn */ js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Unit
      ): Self = StObject.set(x, "__express", js.Any.fromFunction3(value))
    }
  }
  
  trait Compile extends StObject {
    
    /**
      * Compile an expression token.
      *
      * @param rawToken the uncompiled token
      *
      * @return The compiled token
      */
    def compile[T](rawToken: Value & T): Stack & (Omit[T, value])
    
    /**
      * Parse an RPN expression stack within a context.
      *
      * @param tokens An array of compiled expression tokens.
      * @param context The render context to parse the tokens with.
      *
      * @return The result of parsing all the tokens. The result
      *             can be anything, String, Array, Object, etc... based on
      *             the given expression.
      */
    def parse(tokens: js.Array[CompiledToken], context: ParseContext): Any
    
    var `type`: Array
  }
  object Compile {
    
    inline def apply(
      compile: Value & Any => Stack & (Omit[Any, value]),
      parse: (js.Array[CompiledToken], ParseContext) => Any,
      `type`: Array
    ): Compile = {
      val __obj = js.Dynamic.literal(compile = js.Any.fromFunction1(compile), parse = js.Any.fromFunction2(parse))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compile]
    }
    
    extension [Self <: Compile](x: Self) {
      
      inline def setCompile(value: Value & Any => Stack & (Omit[Any, value])): Self = StObject.set(x, "compile", js.Any.fromFunction1(value))
      
      inline def setParse(value: (js.Array[CompiledToken], ParseContext) => Any): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setType(value: Array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: TwigDotexpressionDottypeDotarrayDotend
    
    var start: TwigDotexpressionDottypeDotarrayDotstart
  }
  object End {
    
    inline def apply(): End = {
      val __obj = js.Dynamic.literal(end = "Twig.expression.type.array.end", start = "Twig.expression.type.array.start")
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: TwigDotexpressionDottypeDotarrayDotend): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: TwigDotexpressionDottypeDotarrayDotstart): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndStart extends StObject {
    
    var end: TwigDotexpressionDottypeDotparameterDotend
    
    var start: TwigDotexpressionDottypeDotparameterDotstart
  }
  object EndStart {
    
    inline def apply(): EndStart = {
      val __obj = js.Dynamic.literal(end = "Twig.expression.type.parameter.end", start = "Twig.expression.type.parameter.start")
      __obj.asInstanceOf[EndStart]
    }
    
    extension [Self <: EndStart](x: Self) {
      
      inline def setEnd(value: TwigDotexpressionDottypeDotparameterDotend): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: TwigDotexpressionDottypeDotparameterDotstart): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: String, fn: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit = js.native
    def apply(path: String, options: RenderOptions, fn: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit = js.native
  }
  
  trait Stack extends StObject {
    
    var stack: js.Array[CompiledToken]
  }
  object Stack {
    
    inline def apply(stack: js.Array[CompiledToken]): Stack = {
      val __obj = js.Dynamic.literal(stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stack]
    }
    
    extension [Self <: Stack](x: Self) {
      
      inline def setStack(value: js.Array[CompiledToken]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: CompiledToken*): Self = StObject.set(x, "stack", js.Array(value*))
    }
  }
  
  trait Start extends StObject {
    
    var end: TwigDotexpressionDottypeDotobjectDotend
    
    var start: TwigDotexpressionDottypeDotobjectDotstart
  }
  object Start {
    
    inline def apply(): Start = {
      val __obj = js.Dynamic.literal(end = "Twig.expression.type.object.end", start = "Twig.expression.type.object.start")
      __obj.asInstanceOf[Start]
    }
    
    extension [Self <: Start](x: Self) {
      
      inline def setEnd(value: TwigDotexpressionDottypeDotobjectDotend): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: TwigDotexpressionDottypeDotobjectDotstart): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Twigoptions extends StObject {
    
    var `twig options`: Any
    
    var views: Any
  }
  object Twigoptions {
    
    inline def apply(`twig options`: Any, views: Any): Twigoptions = {
      val __obj = js.Dynamic.literal(views = views.asInstanceOf[js.Any])
      __obj.updateDynamic("twig options")((`twig options`).asInstanceOf[js.Any])
      __obj.asInstanceOf[Twigoptions]
    }
    
    extension [Self <: Twigoptions](x: Self) {
      
      inline def `setTwig options`(value: Any): Self = StObject.set(x, "twig options", value.asInstanceOf[js.Any])
      
      inline def setViews(value: Any): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: Any
  }
  object Value {
    
    inline def apply(value: Any): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
