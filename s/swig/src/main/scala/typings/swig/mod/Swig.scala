package typings.swig.mod

import typings.std.Error
import typings.swig.anon.Typeofloaders
import typings.swig.mod.lexer.TYPES
import typings.swig.mod.parser.ParseReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swig", "Swig")
@js.native
class Swig () extends js.Object {
  def this(options: SwigOptions) = this()
  var loaders: Typeofloaders = js.native
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

