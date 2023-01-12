package typings.swig

import typings.swig.anon.Typeofloaders
import typings.swig.mod.lexer.TYPES
import typings.swig.mod.parser.ParseReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("swig", "Swig")
  @js.native
  open class Swig () extends StObject {
    def this(options: SwigOptions) = this()
    
    def compile(source: String): js.Function1[/* locals */ js.UndefOr[Any], String] = js.native
    def compile(source: String, options: SwigOptions): js.Function1[/* locals */ js.UndefOr[Any], String] = js.native
    
    def compileFile(pathname: String): js.Function1[/* locals */ js.UndefOr[Any], String] = js.native
    def compileFile(pathname: String, options: SwigOptions): js.Function1[/* locals */ js.UndefOr[Any], String] = js.native
    def compileFile(
      pathname: String,
      options: SwigOptions,
      cb: js.Function2[
          /* err */ js.Error, 
          /* compiledRender */ js.Function1[/* locals */ js.UndefOr[Any], String], 
          Unit
        ]
    ): Unit = js.native
    
    def invalidateCache(): Unit = js.native
    
    var loaders: Typeofloaders = js.native
    
    def parseFile(pathName: String): ParseReturn = js.native
    def parseFile(pathName: String, options: Any): ParseReturn = js.native
    
    def precompile(source: String): Any = js.native
    def precompile(source: String, options: SwigOptions): Any = js.native
    
    def render(source: String): String = js.native
    def render(source: String, options: SwigOptions): String = js.native
    
    def renderFile(pathName: String): String = js.native
    def renderFile(pathName: String, locals: Any): String = js.native
    def renderFile(pathName: String, locals: Any, cb: js.Function2[/* err */ js.Error, /* output */ String, Unit]): Unit = js.native
    
    def run(templateFn: js.Function): String = js.native
    def run(templateFn: js.Function, locals: Any): String = js.native
    def run(templateFn: js.Function, locals: Any, filePath: String): String = js.native
    def run(templateFn: js.Function, locals: Unit, filePath: String): String = js.native
    
    def setExtension(name: String, `object`: Any): Unit = js.native
    
    def setFilter(name: String, method: js.Function2[/* input */ Any, /* repeated */ Any, String]): Unit = js.native
    
    def setTag(
      name: String,
      parse: js.Function7[
          /* str */ js.UndefOr[String], 
          /* line */ js.UndefOr[String], 
          /* parser */ js.UndefOr[js.Object], 
          /* types */ js.UndefOr[TYPES], 
          /* stack */ js.UndefOr[Any], 
          /* opts */ js.UndefOr[js.Object], 
          /* swig */ js.UndefOr[this.type], 
          Boolean
        ],
      compile: js.Function6[
          /* compiler */ js.UndefOr[
            js.Function4[
              /* content */ js.UndefOr[String], 
              /* parents */ js.UndefOr[Any], 
              /* options */ js.UndefOr[Any], 
              /* blockName */ js.UndefOr[String], 
              String
            ]
          ], 
          /* args */ js.UndefOr[js.Array[Any]], 
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
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
          /* stack */ js.UndefOr[Any], 
          /* opts */ js.UndefOr[js.Object], 
          /* swig */ js.UndefOr[this.type], 
          Boolean
        ],
      compile: js.Function6[
          /* compiler */ js.UndefOr[
            js.Function4[
              /* content */ js.UndefOr[String], 
              /* parents */ js.UndefOr[Any], 
              /* options */ js.UndefOr[Any], 
              /* blockName */ js.UndefOr[String], 
              String
            ]
          ], 
          /* args */ js.UndefOr[js.Array[Any]], 
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
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
          /* stack */ js.UndefOr[Any], 
          /* opts */ js.UndefOr[js.Object], 
          /* swig */ js.UndefOr[this.type], 
          Boolean
        ],
      compile: js.Function6[
          /* compiler */ js.UndefOr[
            js.Function4[
              /* content */ js.UndefOr[String], 
              /* parents */ js.UndefOr[Any], 
              /* options */ js.UndefOr[Any], 
              /* blockName */ js.UndefOr[String], 
              String
            ]
          ], 
          /* args */ js.UndefOr[js.Array[Any]], 
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          /* blockName */ js.UndefOr[String], 
          String
        ],
      ends: Boolean,
      blockLevel: Boolean
    ): Unit = js.native
    def setTag(
      name: String,
      parse: js.Function7[
          /* str */ js.UndefOr[String], 
          /* line */ js.UndefOr[String], 
          /* parser */ js.UndefOr[js.Object], 
          /* types */ js.UndefOr[TYPES], 
          /* stack */ js.UndefOr[Any], 
          /* opts */ js.UndefOr[js.Object], 
          /* swig */ js.UndefOr[this.type], 
          Boolean
        ],
      compile: js.Function6[
          /* compiler */ js.UndefOr[
            js.Function4[
              /* content */ js.UndefOr[String], 
              /* parents */ js.UndefOr[Any], 
              /* options */ js.UndefOr[Any], 
              /* blockName */ js.UndefOr[String], 
              String
            ]
          ], 
          /* args */ js.UndefOr[js.Array[Any]], 
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          /* blockName */ js.UndefOr[String], 
          String
        ],
      ends: Unit,
      blockLevel: Boolean
    ): Unit = js.native
  }
  
  inline def compile(source: String): js.Function1[/* locals */ js.UndefOr[Any], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(source.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* locals */ js.UndefOr[Any], String]]
  inline def compile(source: String, options: SwigOptions): js.Function1[/* locals */ js.UndefOr[Any], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* locals */ js.UndefOr[Any], String]]
  
  inline def compileFile(pathname: String): js.Function1[/* locals */ js.UndefOr[Any], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(pathname.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* locals */ js.UndefOr[Any], String]]
  inline def compileFile(pathname: String, options: SwigOptions): js.Function1[/* locals */ js.UndefOr[Any], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(pathname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* locals */ js.UndefOr[Any], String]]
  inline def compileFile(
    pathname: String,
    options: SwigOptions,
    cb: js.Function2[
      /* err */ js.Error, 
      /* compiledRender */ js.Function1[/* locals */ js.UndefOr[Any], String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(pathname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def invalidateCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateCache")().asInstanceOf[Unit]
  
  object lexer {
    
    @JSImport("swig", "lexer")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait TYPES extends StObject
    @JSImport("swig", "lexer.TYPES")
    @js.native
    object TYPES extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[TYPES & Double] = js.native
      
      /** Start of an array */
      @js.native
      sealed trait ARRAYOPEN
        extends StObject
           with TYPES
      /* 15 */ val ARRAYOPEN: typings.swig.mod.lexer.TYPES.ARRAYOPEN & Double = js.native
      
      /** Variable assignment */
      @js.native
      sealed trait ASSIGNMENT
        extends StObject
           with TYPES
      /* 24 */ val ASSIGNMENT: typings.swig.mod.lexer.TYPES.ASSIGNMENT & Double = js.native
      
      /** true or false */
      @js.native
      sealed trait BOOL
        extends StObject
           with TYPES
      /* 23 */ val BOOL: typings.swig.mod.lexer.TYPES.BOOL & Double = js.native
      
      /** Close square bracket */
      @js.native
      sealed trait BRACKETCLOSE
        extends StObject
           with TYPES
      /* 13 */ val BRACKETCLOSE: typings.swig.mod.lexer.TYPES.BRACKETCLOSE & Double = js.native
      
      /** Open square bracket */
      @js.native
      sealed trait BRACKETOPEN
        extends StObject
           with TYPES
      /* 12 */ val BRACKETOPEN: typings.swig.mod.lexer.TYPES.BRACKETOPEN & Double = js.native
      
      /** Colon (:) */
      @js.native
      sealed trait COLON
        extends StObject
           with TYPES
      /* 19 */ val COLON: typings.swig.mod.lexer.TYPES.COLON & Double = js.native
      
      /** Comma */
      @js.native
      sealed trait COMMA
        extends StObject
           with TYPES
      /* 8 */ val COMMA: typings.swig.mod.lexer.TYPES.COMMA & Double = js.native
      
      /** JavaScript-valid comparator */
      @js.native
      sealed trait COMPARATOR
        extends StObject
           with TYPES
      /* 20 */ val COMPARATOR: typings.swig.mod.lexer.TYPES.COMPARATOR & Double = js.native
      
      /** Close curly brace */
      @js.native
      sealed trait CURLYCLOSE
        extends StObject
           with TYPES
      /* 18 */ val CURLYCLOSE: typings.swig.mod.lexer.TYPES.CURLYCLOSE & Double = js.native
      
      /** End of an array
        * Currently unused
        ARRAYCLOSE = 16, */
      /** Open curly brace */
      @js.native
      sealed trait CURLYOPEN
        extends StObject
           with TYPES
      /* 17 */ val CURLYOPEN: typings.swig.mod.lexer.TYPES.CURLYOPEN & Double = js.native
      
      /** Key on an object using dot-notation */
      @js.native
      sealed trait DOTKEY
        extends StObject
           with TYPES
      /* 14 */ val DOTKEY: typings.swig.mod.lexer.TYPES.DOTKEY & Double = js.native
      
      /** Variable filter */
      @js.native
      sealed trait FILTER
        extends StObject
           with TYPES
      /* 2 */ val FILTER: typings.swig.mod.lexer.TYPES.FILTER & Double = js.native
      
      /** Empty variable filter */
      @js.native
      sealed trait FILTEREMPTY
        extends StObject
           with TYPES
      /* 3 */ val FILTEREMPTY: typings.swig.mod.lexer.TYPES.FILTEREMPTY & Double = js.native
      
      /** Function */
      @js.native
      sealed trait FUNCTION
        extends StObject
           with TYPES
      /* 4 */ val FUNCTION: typings.swig.mod.lexer.TYPES.FUNCTION & Double = js.native
      
      /** Function with no arguments */
      @js.native
      sealed trait FUNCTIONEMPTY
        extends StObject
           with TYPES
      /* 5 */ val FUNCTIONEMPTY: typings.swig.mod.lexer.TYPES.FUNCTIONEMPTY & Double = js.native
      
      /** Boolean logic */
      @js.native
      sealed trait LOGIC
        extends StObject
           with TYPES
      /* 21 */ val LOGIC: typings.swig.mod.lexer.TYPES.LOGIC & Double = js.native
      
      /** Start of a method */
      @js.native
      sealed trait METHODOPEN
        extends StObject
           with TYPES
      /* 25 */ val METHODOPEN: typings.swig.mod.lexer.TYPES.METHODOPEN & Double = js.native
      
      /** Boolean logic "not" */
      @js.native
      sealed trait NOT
        extends StObject
           with TYPES
      /* 22 */ val NOT: typings.swig.mod.lexer.TYPES.NOT & Double = js.native
      
      /** Number */
      @js.native
      sealed trait NUMBER
        extends StObject
           with TYPES
      /* 10 */ val NUMBER: typings.swig.mod.lexer.TYPES.NUMBER & Double = js.native
      
      /** Math operator */
      @js.native
      sealed trait OPERATOR
        extends StObject
           with TYPES
      /* 11 */ val OPERATOR: typings.swig.mod.lexer.TYPES.OPERATOR & Double = js.native
      
      /** Close parenthesis */
      @js.native
      sealed trait PARENCLOSE
        extends StObject
           with TYPES
      /* 7 */ val PARENCLOSE: typings.swig.mod.lexer.TYPES.PARENCLOSE & Double = js.native
      
      /** Open parenthesis */
      @js.native
      sealed trait PARENOPEN
        extends StObject
           with TYPES
      /* 6 */ val PARENOPEN: typings.swig.mod.lexer.TYPES.PARENOPEN & Double = js.native
      
      /** Plain string */
      @js.native
      sealed trait STRING
        extends StObject
           with TYPES
      /* 1 */ val STRING: typings.swig.mod.lexer.TYPES.STRING & Double = js.native
      
      /** End of a method
        * Currently unused
        METHODEND = 26, */
      /** Unknown type */
      @js.native
      sealed trait UNKNOWN
        extends StObject
           with TYPES
      /* 100 */ val UNKNOWN: typings.swig.mod.lexer.TYPES.UNKNOWN & Double = js.native
      
      /** Variable */
      @js.native
      sealed trait VAR
        extends StObject
           with TYPES
      /* 9 */ val VAR: typings.swig.mod.lexer.TYPES.VAR & Double = js.native
      
      /** Whitespace */
      @js.native
      sealed trait WHITESPACE
        extends StObject
           with TYPES
      /* 0 */ val WHITESPACE: typings.swig.mod.lexer.TYPES.WHITESPACE & Double = js.native
    }
    
    inline def read(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  object loaders {
    
    @JSImport("swig", "loaders")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fs(): TemplateLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("fs")().asInstanceOf[TemplateLoader]
    inline def fs(basepath: String): TemplateLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("fs")(basepath.asInstanceOf[js.Any]).asInstanceOf[TemplateLoader]
    inline def fs(basepath: String, encoding: String): TemplateLoader = (^.asInstanceOf[js.Dynamic].applyDynamic("fs")(basepath.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[TemplateLoader]
    inline def fs(basepath: Unit, encoding: String): TemplateLoader = (^.asInstanceOf[js.Dynamic].applyDynamic("fs")(basepath.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[TemplateLoader]
    
    inline def memory(mapping: Any): TemplateLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("memory")(mapping.asInstanceOf[js.Any]).asInstanceOf[TemplateLoader]
    inline def memory(mapping: Any, basepath: String): TemplateLoader = (^.asInstanceOf[js.Dynamic].applyDynamic("memory")(mapping.asInstanceOf[js.Any], basepath.asInstanceOf[js.Any])).asInstanceOf[TemplateLoader]
  }
  
  inline def parseFile(pathName: String): ParseReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(pathName.asInstanceOf[js.Any]).asInstanceOf[ParseReturn]
  inline def parseFile(pathName: String, options: Any): ParseReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(pathName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseReturn]
  
  inline def precompile(source: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("precompile")(source.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def precompile(source: String, options: SwigOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("precompile")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def render(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def render(source: String, options: SwigOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def renderFile(pathName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(pathName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def renderFile(pathName: String, locals: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(pathName.asInstanceOf[js.Any], locals.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def renderFile(pathName: String, locals: Any, cb: js.Function2[/* err */ js.Error, /* output */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(pathName.asInstanceOf[js.Any], locals.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def run(templateFn: js.Function): String = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(templateFn.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def run(templateFn: js.Function, locals: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(templateFn.asInstanceOf[js.Any], locals.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def run(templateFn: js.Function, locals: Any, filePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(templateFn.asInstanceOf[js.Any], locals.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def run(templateFn: js.Function, locals: Unit, filePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(templateFn.asInstanceOf[js.Any], locals.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setDefaultTZOffset(offset: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultTZOffset")(offset.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setDefaults(options: SwigOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setExtension(name: String, `object`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtension")(name.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setFilter(name: String, method: js.Function2[/* input */ Any, /* repeated */ Any, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFilter")(name.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTag(
    name: String,
    parse: js.Function7[
      /* str */ js.UndefOr[String], 
      /* line */ js.UndefOr[String], 
      /* parser */ js.UndefOr[js.Object], 
      /* types */ js.UndefOr[TYPES], 
      /* stack */ js.UndefOr[Any], 
      /* opts */ js.UndefOr[js.Object], 
      /* swig */ js.UndefOr[Swig], 
      Boolean
    ],
    compile: js.Function6[
      /* compiler */ js.UndefOr[
        js.Function4[
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          /* blockName */ js.UndefOr[String], 
          String
        ]
      ], 
      /* args */ js.UndefOr[js.Array[Any]], 
      /* content */ js.UndefOr[String], 
      /* parents */ js.UndefOr[Any], 
      /* options */ js.UndefOr[Any], 
      /* blockName */ js.UndefOr[String], 
      String
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTag")(name.asInstanceOf[js.Any], parse.asInstanceOf[js.Any], compile.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTag(
    name: String,
    parse: js.Function7[
      /* str */ js.UndefOr[String], 
      /* line */ js.UndefOr[String], 
      /* parser */ js.UndefOr[js.Object], 
      /* types */ js.UndefOr[TYPES], 
      /* stack */ js.UndefOr[Any], 
      /* opts */ js.UndefOr[js.Object], 
      /* swig */ js.UndefOr[Swig], 
      Boolean
    ],
    compile: js.Function6[
      /* compiler */ js.UndefOr[
        js.Function4[
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          /* blockName */ js.UndefOr[String], 
          String
        ]
      ], 
      /* args */ js.UndefOr[js.Array[Any]], 
      /* content */ js.UndefOr[String], 
      /* parents */ js.UndefOr[Any], 
      /* options */ js.UndefOr[Any], 
      /* blockName */ js.UndefOr[String], 
      String
    ],
    ends: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTag")(name.asInstanceOf[js.Any], parse.asInstanceOf[js.Any], compile.asInstanceOf[js.Any], ends.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTag(
    name: String,
    parse: js.Function7[
      /* str */ js.UndefOr[String], 
      /* line */ js.UndefOr[String], 
      /* parser */ js.UndefOr[js.Object], 
      /* types */ js.UndefOr[TYPES], 
      /* stack */ js.UndefOr[Any], 
      /* opts */ js.UndefOr[js.Object], 
      /* swig */ js.UndefOr[Swig], 
      Boolean
    ],
    compile: js.Function6[
      /* compiler */ js.UndefOr[
        js.Function4[
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          /* blockName */ js.UndefOr[String], 
          String
        ]
      ], 
      /* args */ js.UndefOr[js.Array[Any]], 
      /* content */ js.UndefOr[String], 
      /* parents */ js.UndefOr[Any], 
      /* options */ js.UndefOr[Any], 
      /* blockName */ js.UndefOr[String], 
      String
    ],
    ends: Boolean,
    blockLevel: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTag")(name.asInstanceOf[js.Any], parse.asInstanceOf[js.Any], compile.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], blockLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTag(
    name: String,
    parse: js.Function7[
      /* str */ js.UndefOr[String], 
      /* line */ js.UndefOr[String], 
      /* parser */ js.UndefOr[js.Object], 
      /* types */ js.UndefOr[TYPES], 
      /* stack */ js.UndefOr[Any], 
      /* opts */ js.UndefOr[js.Object], 
      /* swig */ js.UndefOr[Swig], 
      Boolean
    ],
    compile: js.Function6[
      /* compiler */ js.UndefOr[
        js.Function4[
          /* content */ js.UndefOr[String], 
          /* parents */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          /* blockName */ js.UndefOr[String], 
          String
        ]
      ], 
      /* args */ js.UndefOr[js.Array[Any]], 
      /* content */ js.UndefOr[String], 
      /* parents */ js.UndefOr[Any], 
      /* options */ js.UndefOr[Any], 
      /* blockName */ js.UndefOr[String], 
      String
    ],
    ends: Unit,
    blockLevel: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTag")(name.asInstanceOf[js.Any], parse.asInstanceOf[js.Any], compile.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], blockLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("swig", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  trait SwigOptions extends StObject {
    
    var autoescape: js.UndefOr[Boolean] = js.undefined
    
    var cache: js.UndefOr[Any] = js.undefined
    
    var cmtControls: js.UndefOr[js.Array[String]] = js.undefined
    
    var loader: js.UndefOr[TemplateLoader] = js.undefined
    
    var locals: js.UndefOr[Any] = js.undefined
    
    var tagControls: js.UndefOr[js.Array[String]] = js.undefined
    
    var varControls: js.UndefOr[js.Array[String]] = js.undefined
  }
  object SwigOptions {
    
    inline def apply(): SwigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwigOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoescape(value: Boolean): Self = StObject.set(x, "autoescape", value.asInstanceOf[js.Any])
      
      inline def setAutoescapeUndefined: Self = StObject.set(x, "autoescape", js.undefined)
      
      inline def setCache(value: Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCmtControls(value: js.Array[String]): Self = StObject.set(x, "cmtControls", value.asInstanceOf[js.Any])
      
      inline def setCmtControlsUndefined: Self = StObject.set(x, "cmtControls", js.undefined)
      
      inline def setCmtControlsVarargs(value: String*): Self = StObject.set(x, "cmtControls", js.Array(value*))
      
      inline def setLoader(value: TemplateLoader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setLocals(value: Any): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      inline def setTagControls(value: js.Array[String]): Self = StObject.set(x, "tagControls", value.asInstanceOf[js.Any])
      
      inline def setTagControlsUndefined: Self = StObject.set(x, "tagControls", js.undefined)
      
      inline def setTagControlsVarargs(value: String*): Self = StObject.set(x, "tagControls", js.Array(value*))
      
      inline def setVarControls(value: js.Array[String]): Self = StObject.set(x, "varControls", value.asInstanceOf[js.Any])
      
      inline def setVarControlsUndefined: Self = StObject.set(x, "varControls", js.undefined)
      
      inline def setVarControlsVarargs(value: String*): Self = StObject.set(x, "varControls", js.Array(value*))
    }
  }
  
  @js.native
  trait TemplateLoader extends StObject {
    
    def load(identifier: String): Any = js.native
    def load(identifier: String, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    @JSName("load")
    def load_Unit(identifier: String): Unit = js.native
    
    def resolve(to: String, from: String): String = js.native
  }
  
  object parser {
    
    trait ParseReturn extends StObject {
      
      var blocks: Any
      
      var name: String
      
      var parent: Any
      
      var tokens: js.Array[Any]
    }
    object ParseReturn {
      
      inline def apply(blocks: Any, name: String, parent: Any, tokens: js.Array[Any]): ParseReturn = {
        val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
        __obj.asInstanceOf[ParseReturn]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ParseReturn] (val x: Self) extends AnyVal {
        
        inline def setBlocks(value: Any): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setTokens(value: js.Array[Any]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
        
        inline def setTokensVarargs(value: Any*): Self = StObject.set(x, "tokens", js.Array(value*))
      }
    }
  }
}
