package typings.swig

import typings.std.Error
import typings.swig.anon.Typeofloaders
import typings.swig.mod.lexer.TYPES
import typings.swig.mod.parser.ParseReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("swig", "Swig")
  @js.native
  class Swig () extends StObject {
    def this(options: SwigOptions) = this()
    
    def compile(source: String): js.Function1[/* locals */ js.UndefOr[js.Any], String] = js.native
    def compile(source: String, options: SwigOptions): js.Function1[/* locals */ js.UndefOr[js.Any], String] = js.native
    
    def compileFile(pathname: String): js.Function1[/* locals */ js.UndefOr[js.Any], String] = js.native
    def compileFile(pathname: String, options: SwigOptions): js.Function1[/* locals */ js.UndefOr[js.Any], String] = js.native
    def compileFile(
      pathname: String,
      options: SwigOptions,
      cb: js.Function2[
          /* err */ Error, 
          /* compiledRender */ js.Function1[/* locals */ js.UndefOr[js.Any], String], 
          Unit
        ]
    ): Unit = js.native
    
    def invalidateCache(): Unit = js.native
    
    var loaders: Typeofloaders = js.native
    
    def parseFile(pathName: String): ParseReturn = js.native
    def parseFile(pathName: String, options: js.Any): ParseReturn = js.native
    
    def precompile(source: String): js.Any = js.native
    def precompile(source: String, options: SwigOptions): js.Any = js.native
    
    def render(source: String): String = js.native
    def render(source: String, options: SwigOptions): String = js.native
    
    def renderFile(pathName: String): String = js.native
    def renderFile(pathName: String, locals: js.Any): String = js.native
    def renderFile(pathName: String, locals: js.Any, cb: js.Function2[/* err */ Error, /* output */ String, Unit]): Unit = js.native
    
    def run(templateFn: js.Function): String = js.native
    def run(templateFn: js.Function, locals: js.UndefOr[scala.Nothing], filePath: String): String = js.native
    def run(templateFn: js.Function, locals: js.Any): String = js.native
    def run(templateFn: js.Function, locals: js.Any, filePath: String): String = js.native
    
    def setExtension(name: String, `object`: js.Any): Unit = js.native
    
    def setFilter(name: String, method: js.Function2[/* input */ js.Any, /* repeated */ js.Any, String]): Unit = js.native
    
    def setTag(
      name: String,
      parse: js.Function7[
          /* str */ js.UndefOr[String], 
          /* line */ js.UndefOr[String], 
          /* parser */ js.UndefOr[js.Object], 
          /* types */ js.UndefOr[TYPES], 
          /* stack */ js.UndefOr[js.Any], 
          /* opts */ js.UndefOr[js.Object], 
          /* swig */ js.UndefOr[this.type], 
          Boolean
        ],
      compile: js.Function6[
          /* compiler */ js.UndefOr[
            js.Function4[
              /* content */ js.UndefOr[String], 
              /* parents */ js.UndefOr[js.Any], 
              /* options */ js.UndefOr[js.Any], 
              /* blockName */ js.UndefOr[String], 
              String
            ]
          ], 
          /* args */ js.UndefOr[js.Array[_]], 
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          /* blockName */ js.UndefOr[String], 
          String
        ]
    ): Unit = js.native
    def setTag(
      name: String,
      parse: js.Function7[
          /* str */ js.UndefOr[String], 
          /* line */ js.UndefOr[String], 
          /* parser */ js.UndefOr[js.Object], 
          /* types */ js.UndefOr[TYPES], 
          /* stack */ js.UndefOr[js.Any], 
          /* opts */ js.UndefOr[js.Object], 
          /* swig */ js.UndefOr[this.type], 
          Boolean
        ],
      compile: js.Function6[
          /* compiler */ js.UndefOr[
            js.Function4[
              /* content */ js.UndefOr[String], 
              /* parents */ js.UndefOr[js.Any], 
              /* options */ js.UndefOr[js.Any], 
              /* blockName */ js.UndefOr[String], 
              String
            ]
          ], 
          /* args */ js.UndefOr[js.Array[_]], 
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          /* blockName */ js.UndefOr[String], 
          String
        ],
      ends: js.UndefOr[scala.Nothing],
      blockLevel: Boolean
    ): Unit = js.native
    def setTag(
      name: String,
      parse: js.Function7[
          /* str */ js.UndefOr[String], 
          /* line */ js.UndefOr[String], 
          /* parser */ js.UndefOr[js.Object], 
          /* types */ js.UndefOr[TYPES], 
          /* stack */ js.UndefOr[js.Any], 
          /* opts */ js.UndefOr[js.Object], 
          /* swig */ js.UndefOr[this.type], 
          Boolean
        ],
      compile: js.Function6[
          /* compiler */ js.UndefOr[
            js.Function4[
              /* content */ js.UndefOr[String], 
              /* parents */ js.UndefOr[js.Any], 
              /* options */ js.UndefOr[js.Any], 
              /* blockName */ js.UndefOr[String], 
              String
            ]
          ], 
          /* args */ js.UndefOr[js.Array[_]], 
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          /* blockName */ js.UndefOr[String], 
          String
        ],
      ends: Boolean
    ): Unit = js.native
    def setTag(
      name: String,
      parse: js.Function7[
          /* str */ js.UndefOr[String], 
          /* line */ js.UndefOr[String], 
          /* parser */ js.UndefOr[js.Object], 
          /* types */ js.UndefOr[TYPES], 
          /* stack */ js.UndefOr[js.Any], 
          /* opts */ js.UndefOr[js.Object], 
          /* swig */ js.UndefOr[this.type], 
          Boolean
        ],
      compile: js.Function6[
          /* compiler */ js.UndefOr[
            js.Function4[
              /* content */ js.UndefOr[String], 
              /* parents */ js.UndefOr[js.Any], 
              /* options */ js.UndefOr[js.Any], 
              /* blockName */ js.UndefOr[String], 
              String
            ]
          ], 
          /* args */ js.UndefOr[js.Array[_]], 
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          /* blockName */ js.UndefOr[String], 
          String
        ],
      ends: Boolean,
      blockLevel: Boolean
    ): Unit = js.native
  }
  
  @JSImport("swig", "compile")
  @js.native
  def compile(source: String): js.Function1[/* locals */ js.UndefOr[js.Any], String] = js.native
  @JSImport("swig", "compile")
  @js.native
  def compile(source: String, options: SwigOptions): js.Function1[/* locals */ js.UndefOr[js.Any], String] = js.native
  
  @JSImport("swig", "compileFile")
  @js.native
  def compileFile(pathname: String): js.Function1[/* locals */ js.UndefOr[js.Any], String] = js.native
  @JSImport("swig", "compileFile")
  @js.native
  def compileFile(pathname: String, options: SwigOptions): js.Function1[/* locals */ js.UndefOr[js.Any], String] = js.native
  @JSImport("swig", "compileFile")
  @js.native
  def compileFile(
    pathname: String,
    options: SwigOptions,
    cb: js.Function2[
      /* err */ Error, 
      /* compiledRender */ js.Function1[/* locals */ js.UndefOr[js.Any], String], 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("swig", "invalidateCache")
  @js.native
  def invalidateCache(): Unit = js.native
  
  object lexer {
    
    @js.native
    sealed trait TYPES extends StObject
    @JSImport("swig", "lexer.TYPES")
    @js.native
    object TYPES extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[TYPES with Double] = js.native
      
      /** Start of an array */
      @js.native
      sealed trait ARRAYOPEN extends TYPES
      /* 15 */ val ARRAYOPEN: typings.swig.mod.lexer.TYPES.ARRAYOPEN with Double = js.native
      
      /** Variable assignment */
      @js.native
      sealed trait ASSIGNMENT extends TYPES
      /* 24 */ val ASSIGNMENT: typings.swig.mod.lexer.TYPES.ASSIGNMENT with Double = js.native
      
      /** true or false */
      @js.native
      sealed trait BOOL extends TYPES
      /* 23 */ val BOOL: typings.swig.mod.lexer.TYPES.BOOL with Double = js.native
      
      /** Close square bracket */
      @js.native
      sealed trait BRACKETCLOSE extends TYPES
      /* 13 */ val BRACKETCLOSE: typings.swig.mod.lexer.TYPES.BRACKETCLOSE with Double = js.native
      
      /** Open square bracket */
      @js.native
      sealed trait BRACKETOPEN extends TYPES
      /* 12 */ val BRACKETOPEN: typings.swig.mod.lexer.TYPES.BRACKETOPEN with Double = js.native
      
      /** Colon (:) */
      @js.native
      sealed trait COLON extends TYPES
      /* 19 */ val COLON: typings.swig.mod.lexer.TYPES.COLON with Double = js.native
      
      /** Comma */
      @js.native
      sealed trait COMMA extends TYPES
      /* 8 */ val COMMA: typings.swig.mod.lexer.TYPES.COMMA with Double = js.native
      
      /** JavaScript-valid comparator */
      @js.native
      sealed trait COMPARATOR extends TYPES
      /* 20 */ val COMPARATOR: typings.swig.mod.lexer.TYPES.COMPARATOR with Double = js.native
      
      /** Close curly brace */
      @js.native
      sealed trait CURLYCLOSE extends TYPES
      /* 18 */ val CURLYCLOSE: typings.swig.mod.lexer.TYPES.CURLYCLOSE with Double = js.native
      
      /** End of an array
        * Currently unused
        ARRAYCLOSE = 16, */
      /** Open curly brace */
      @js.native
      sealed trait CURLYOPEN extends TYPES
      /* 17 */ val CURLYOPEN: typings.swig.mod.lexer.TYPES.CURLYOPEN with Double = js.native
      
      /** Key on an object using dot-notation */
      @js.native
      sealed trait DOTKEY extends TYPES
      /* 14 */ val DOTKEY: typings.swig.mod.lexer.TYPES.DOTKEY with Double = js.native
      
      /** Variable filter */
      @js.native
      sealed trait FILTER extends TYPES
      /* 2 */ val FILTER: typings.swig.mod.lexer.TYPES.FILTER with Double = js.native
      
      /** Empty variable filter */
      @js.native
      sealed trait FILTEREMPTY extends TYPES
      /* 3 */ val FILTEREMPTY: typings.swig.mod.lexer.TYPES.FILTEREMPTY with Double = js.native
      
      /** Function */
      @js.native
      sealed trait FUNCTION extends TYPES
      /* 4 */ val FUNCTION: typings.swig.mod.lexer.TYPES.FUNCTION with Double = js.native
      
      /** Function with no arguments */
      @js.native
      sealed trait FUNCTIONEMPTY extends TYPES
      /* 5 */ val FUNCTIONEMPTY: typings.swig.mod.lexer.TYPES.FUNCTIONEMPTY with Double = js.native
      
      /** Boolean logic */
      @js.native
      sealed trait LOGIC extends TYPES
      /* 21 */ val LOGIC: typings.swig.mod.lexer.TYPES.LOGIC with Double = js.native
      
      /** Start of a method */
      @js.native
      sealed trait METHODOPEN extends TYPES
      /* 25 */ val METHODOPEN: typings.swig.mod.lexer.TYPES.METHODOPEN with Double = js.native
      
      /** Boolean logic "not" */
      @js.native
      sealed trait NOT extends TYPES
      /* 22 */ val NOT: typings.swig.mod.lexer.TYPES.NOT with Double = js.native
      
      /** Number */
      @js.native
      sealed trait NUMBER extends TYPES
      /* 10 */ val NUMBER: typings.swig.mod.lexer.TYPES.NUMBER with Double = js.native
      
      /** Math operator */
      @js.native
      sealed trait OPERATOR extends TYPES
      /* 11 */ val OPERATOR: typings.swig.mod.lexer.TYPES.OPERATOR with Double = js.native
      
      /** Close parenthesis */
      @js.native
      sealed trait PARENCLOSE extends TYPES
      /* 7 */ val PARENCLOSE: typings.swig.mod.lexer.TYPES.PARENCLOSE with Double = js.native
      
      /** Open parenthesis */
      @js.native
      sealed trait PARENOPEN extends TYPES
      /* 6 */ val PARENOPEN: typings.swig.mod.lexer.TYPES.PARENOPEN with Double = js.native
      
      /** Plain string */
      @js.native
      sealed trait STRING extends TYPES
      /* 1 */ val STRING: typings.swig.mod.lexer.TYPES.STRING with Double = js.native
      
      /** End of a method
        * Currently unused
        METHODEND = 26, */
      /** Unknown type */
      @js.native
      sealed trait UNKNOWN extends TYPES
      /* 100 */ val UNKNOWN: typings.swig.mod.lexer.TYPES.UNKNOWN with Double = js.native
      
      /** Variable */
      @js.native
      sealed trait VAR extends TYPES
      /* 9 */ val VAR: typings.swig.mod.lexer.TYPES.VAR with Double = js.native
      
      /** Whitespace */
      @js.native
      sealed trait WHITESPACE extends TYPES
      /* 0 */ val WHITESPACE: typings.swig.mod.lexer.TYPES.WHITESPACE with Double = js.native
    }
    
    @JSImport("swig", "lexer.read")
    @js.native
    def read(str: String): js.Array[String] = js.native
  }
  
  object loaders {
    
    @JSImport("swig", "loaders.fs")
    @js.native
    def fs(): TemplateLoader = js.native
    @JSImport("swig", "loaders.fs")
    @js.native
    def fs(basepath: js.UndefOr[scala.Nothing], encoding: String): TemplateLoader = js.native
    @JSImport("swig", "loaders.fs")
    @js.native
    def fs(basepath: String): TemplateLoader = js.native
    @JSImport("swig", "loaders.fs")
    @js.native
    def fs(basepath: String, encoding: String): TemplateLoader = js.native
    
    @JSImport("swig", "loaders.memory")
    @js.native
    def memory(mapping: js.Any): TemplateLoader = js.native
    @JSImport("swig", "loaders.memory")
    @js.native
    def memory(mapping: js.Any, basepath: String): TemplateLoader = js.native
  }
  
  @JSImport("swig", "parseFile")
  @js.native
  def parseFile(pathName: String): ParseReturn = js.native
  @JSImport("swig", "parseFile")
  @js.native
  def parseFile(pathName: String, options: js.Any): ParseReturn = js.native
  
  @JSImport("swig", "precompile")
  @js.native
  def precompile(source: String): js.Any = js.native
  @JSImport("swig", "precompile")
  @js.native
  def precompile(source: String, options: SwigOptions): js.Any = js.native
  
  @JSImport("swig", "render")
  @js.native
  def render(source: String): String = js.native
  @JSImport("swig", "render")
  @js.native
  def render(source: String, options: SwigOptions): String = js.native
  
  @JSImport("swig", "renderFile")
  @js.native
  def renderFile(pathName: String): String = js.native
  @JSImport("swig", "renderFile")
  @js.native
  def renderFile(pathName: String, locals: js.Any): String = js.native
  @JSImport("swig", "renderFile")
  @js.native
  def renderFile(pathName: String, locals: js.Any, cb: js.Function2[/* err */ Error, /* output */ String, Unit]): Unit = js.native
  
  @JSImport("swig", "run")
  @js.native
  def run(templateFn: js.Function): String = js.native
  @JSImport("swig", "run")
  @js.native
  def run(templateFn: js.Function, locals: js.UndefOr[scala.Nothing], filePath: String): String = js.native
  @JSImport("swig", "run")
  @js.native
  def run(templateFn: js.Function, locals: js.Any): String = js.native
  @JSImport("swig", "run")
  @js.native
  def run(templateFn: js.Function, locals: js.Any, filePath: String): String = js.native
  
  @JSImport("swig", "setDefaultTZOffset")
  @js.native
  def setDefaultTZOffset(offset: Double): Unit = js.native
  
  @JSImport("swig", "setDefaults")
  @js.native
  def setDefaults(options: SwigOptions): Unit = js.native
  
  @JSImport("swig", "setExtension")
  @js.native
  def setExtension(name: String, `object`: js.Any): Unit = js.native
  
  @JSImport("swig", "setFilter")
  @js.native
  def setFilter(name: String, method: js.Function2[/* input */ js.Any, /* repeated */ js.Any, String]): Unit = js.native
  
  @JSImport("swig", "setTag")
  @js.native
  def setTag(
    name: String,
    parse: js.Function7[
      /* str */ js.UndefOr[String], 
      /* line */ js.UndefOr[String], 
      /* parser */ js.UndefOr[js.Object], 
      /* types */ js.UndefOr[TYPES], 
      /* stack */ js.UndefOr[js.Any], 
      /* opts */ js.UndefOr[js.Object], 
      /* swig */ js.UndefOr[Swig], 
      Boolean
    ],
    compile: js.Function6[
      /* compiler */ js.UndefOr[
        js.Function4[
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          /* blockName */ js.UndefOr[String], 
          String
        ]
      ], 
      /* args */ js.UndefOr[js.Array[_]], 
      /* content */ js.UndefOr[String], 
      /* parents */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* blockName */ js.UndefOr[String], 
      String
    ]
  ): Unit = js.native
  @JSImport("swig", "setTag")
  @js.native
  def setTag(
    name: String,
    parse: js.Function7[
      /* str */ js.UndefOr[String], 
      /* line */ js.UndefOr[String], 
      /* parser */ js.UndefOr[js.Object], 
      /* types */ js.UndefOr[TYPES], 
      /* stack */ js.UndefOr[js.Any], 
      /* opts */ js.UndefOr[js.Object], 
      /* swig */ js.UndefOr[Swig], 
      Boolean
    ],
    compile: js.Function6[
      /* compiler */ js.UndefOr[
        js.Function4[
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          /* blockName */ js.UndefOr[String], 
          String
        ]
      ], 
      /* args */ js.UndefOr[js.Array[_]], 
      /* content */ js.UndefOr[String], 
      /* parents */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* blockName */ js.UndefOr[String], 
      String
    ],
    ends: js.UndefOr[scala.Nothing],
    blockLevel: Boolean
  ): Unit = js.native
  @JSImport("swig", "setTag")
  @js.native
  def setTag(
    name: String,
    parse: js.Function7[
      /* str */ js.UndefOr[String], 
      /* line */ js.UndefOr[String], 
      /* parser */ js.UndefOr[js.Object], 
      /* types */ js.UndefOr[TYPES], 
      /* stack */ js.UndefOr[js.Any], 
      /* opts */ js.UndefOr[js.Object], 
      /* swig */ js.UndefOr[Swig], 
      Boolean
    ],
    compile: js.Function6[
      /* compiler */ js.UndefOr[
        js.Function4[
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          /* blockName */ js.UndefOr[String], 
          String
        ]
      ], 
      /* args */ js.UndefOr[js.Array[_]], 
      /* content */ js.UndefOr[String], 
      /* parents */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* blockName */ js.UndefOr[String], 
      String
    ],
    ends: Boolean
  ): Unit = js.native
  @JSImport("swig", "setTag")
  @js.native
  def setTag(
    name: String,
    parse: js.Function7[
      /* str */ js.UndefOr[String], 
      /* line */ js.UndefOr[String], 
      /* parser */ js.UndefOr[js.Object], 
      /* types */ js.UndefOr[TYPES], 
      /* stack */ js.UndefOr[js.Any], 
      /* opts */ js.UndefOr[js.Object], 
      /* swig */ js.UndefOr[Swig], 
      Boolean
    ],
    compile: js.Function6[
      /* compiler */ js.UndefOr[
        js.Function4[
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          /* blockName */ js.UndefOr[String], 
          String
        ]
      ], 
      /* args */ js.UndefOr[js.Array[_]], 
      /* content */ js.UndefOr[String], 
      /* parents */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* blockName */ js.UndefOr[String], 
      String
    ],
    ends: Boolean,
    blockLevel: Boolean
  ): Unit = js.native
  
  @JSImport("swig", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait SwigOptions extends StObject {
    
    var autoescape: js.UndefOr[Boolean] = js.native
    
    var cache: js.UndefOr[js.Any] = js.native
    
    var cmtControls: js.UndefOr[js.Array[String]] = js.native
    
    var loader: js.UndefOr[TemplateLoader] = js.native
    
    var locals: js.UndefOr[js.Any] = js.native
    
    var tagControls: js.UndefOr[js.Array[String]] = js.native
    
    var varControls: js.UndefOr[js.Array[String]] = js.native
  }
  object SwigOptions {
    
    @scala.inline
    def apply(): SwigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwigOptions]
    }
    
    @scala.inline
    implicit class SwigOptionsMutableBuilder[Self <: SwigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoescape(value: Boolean): Self = StObject.set(x, "autoescape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoescapeUndefined: Self = StObject.set(x, "autoescape", js.undefined)
      
      @scala.inline
      def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCmtControls(value: js.Array[String]): Self = StObject.set(x, "cmtControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCmtControlsUndefined: Self = StObject.set(x, "cmtControls", js.undefined)
      
      @scala.inline
      def setCmtControlsVarargs(value: String*): Self = StObject.set(x, "cmtControls", js.Array(value :_*))
      
      @scala.inline
      def setLoader(value: TemplateLoader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      @scala.inline
      def setLocals(value: js.Any): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      @scala.inline
      def setTagControls(value: js.Array[String]): Self = StObject.set(x, "tagControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagControlsUndefined: Self = StObject.set(x, "tagControls", js.undefined)
      
      @scala.inline
      def setTagControlsVarargs(value: String*): Self = StObject.set(x, "tagControls", js.Array(value :_*))
      
      @scala.inline
      def setVarControls(value: js.Array[String]): Self = StObject.set(x, "varControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarControlsUndefined: Self = StObject.set(x, "varControls", js.undefined)
      
      @scala.inline
      def setVarControlsVarargs(value: String*): Self = StObject.set(x, "varControls", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TemplateLoader extends StObject {
    
    def load(identifier: String): js.Any = js.native
    def load(identifier: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
    @JSName("load")
    def load_Unit(identifier: String): Unit = js.native
    
    def resolve(to: String, from: String): String = js.native
  }
  
  object parser {
    
    @js.native
    trait ParseReturn extends StObject {
      
      var blocks: js.Any = js.native
      
      var name: String = js.native
      
      var parent: js.Any = js.native
      
      var tokens: js.Array[_] = js.native
    }
    object ParseReturn {
      
      @scala.inline
      def apply(blocks: js.Any, name: String, parent: js.Any, tokens: js.Array[_]): ParseReturn = {
        val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
        __obj.asInstanceOf[ParseReturn]
      }
      
      @scala.inline
      implicit class ParseReturnMutableBuilder[Self <: ParseReturn] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlocks(value: js.Any): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTokens(value: js.Array[_]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTokensVarargs(value: js.Any*): Self = StObject.set(x, "tokens", js.Array(value :_*))
      }
    }
  }
}
