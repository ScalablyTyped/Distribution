package typings
package swigLib.swigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swig", "Swig")
@js.native
class Swig () extends js.Object {
  def this(options: SwigOptions) = this()
  var loaders: swigLib.Typeofloaders = js.native
  def compile(source: java.lang.String): js.Function1[/* locals */ js.UndefOr[js.Any], java.lang.String] = js.native
  def compile(source: java.lang.String, options: SwigOptions): js.Function1[/* locals */ js.UndefOr[js.Any], java.lang.String] = js.native
  def compileFile(pathname: java.lang.String): js.Function1[/* locals */ js.UndefOr[js.Any], java.lang.String] = js.native
  def compileFile(pathname: java.lang.String, options: SwigOptions): js.Function1[/* locals */ js.UndefOr[js.Any], java.lang.String] = js.native
  def compileFile(
    pathname: java.lang.String,
    options: SwigOptions,
    cb: js.Function2[
      /* err */ stdLib.Error, 
      /* compiledRender */ js.Function1[/* locals */ js.UndefOr[js.Any], java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def invalidateCache(): scala.Unit = js.native
  def parseFile(pathName: java.lang.String): swigLib.swigMod.parserNs.ParseReturn = js.native
  def parseFile(pathName: java.lang.String, options: js.Any): swigLib.swigMod.parserNs.ParseReturn = js.native
  def precompile(source: java.lang.String): js.Any = js.native
  def precompile(source: java.lang.String, options: SwigOptions): js.Any = js.native
  def render(source: java.lang.String): java.lang.String = js.native
  def render(source: java.lang.String, options: SwigOptions): java.lang.String = js.native
  def renderFile(pathName: java.lang.String): java.lang.String = js.native
  def renderFile(pathName: java.lang.String, locals: js.Any): java.lang.String = js.native
  def renderFile(
    pathName: java.lang.String,
    locals: js.Any,
    cb: js.Function2[/* err */ stdLib.Error, /* output */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def run(templateFn: js.Function): java.lang.String = js.native
  def run(templateFn: js.Function, locals: js.Any): java.lang.String = js.native
  def run(templateFn: js.Function, locals: js.Any, filePath: java.lang.String): java.lang.String = js.native
  def setExtension(name: java.lang.String, `object`: js.Any): scala.Unit = js.native
  def setFilter(
    name: java.lang.String,
    method: js.Function2[/* input */ js.Any, /* repeated */ js.Any, java.lang.String]
  ): scala.Unit = js.native
  def setTag(
    name: java.lang.String,
    parse: js.Function7[
      /* str */ js.UndefOr[java.lang.String], 
      /* line */ js.UndefOr[java.lang.String], 
      /* parser */ js.UndefOr[js.Object], 
      /* types */ js.UndefOr[swigLib.swigMod.lexerNs.TYPES], 
      /* stack */ js.UndefOr[js.Any], 
      /* opts */ js.UndefOr[js.Object], 
      /* swig */ js.UndefOr[this.type], 
      scala.Boolean
    ],
    compile: js.Function6[
      /* compiler */ js.UndefOr[
        js.Function4[
          /* content */ js.UndefOr[java.lang.String], 
          /* parents */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          /* blockName */ js.UndefOr[java.lang.String], 
          java.lang.String
        ]
      ], 
      /* args */ js.UndefOr[js.Array[_]], 
      /* content */ js.UndefOr[java.lang.String], 
      /* parents */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* blockName */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ): scala.Unit = js.native
  def setTag(
    name: java.lang.String,
    parse: js.Function7[
      /* str */ js.UndefOr[java.lang.String], 
      /* line */ js.UndefOr[java.lang.String], 
      /* parser */ js.UndefOr[js.Object], 
      /* types */ js.UndefOr[swigLib.swigMod.lexerNs.TYPES], 
      /* stack */ js.UndefOr[js.Any], 
      /* opts */ js.UndefOr[js.Object], 
      /* swig */ js.UndefOr[this.type], 
      scala.Boolean
    ],
    compile: js.Function6[
      /* compiler */ js.UndefOr[
        js.Function4[
          /* content */ js.UndefOr[java.lang.String], 
          /* parents */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          /* blockName */ js.UndefOr[java.lang.String], 
          java.lang.String
        ]
      ], 
      /* args */ js.UndefOr[js.Array[_]], 
      /* content */ js.UndefOr[java.lang.String], 
      /* parents */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* blockName */ js.UndefOr[java.lang.String], 
      java.lang.String
    ],
    ends: scala.Boolean
  ): scala.Unit = js.native
  def setTag(
    name: java.lang.String,
    parse: js.Function7[
      /* str */ js.UndefOr[java.lang.String], 
      /* line */ js.UndefOr[java.lang.String], 
      /* parser */ js.UndefOr[js.Object], 
      /* types */ js.UndefOr[swigLib.swigMod.lexerNs.TYPES], 
      /* stack */ js.UndefOr[js.Any], 
      /* opts */ js.UndefOr[js.Object], 
      /* swig */ js.UndefOr[this.type], 
      scala.Boolean
    ],
    compile: js.Function6[
      /* compiler */ js.UndefOr[
        js.Function4[
          /* content */ js.UndefOr[java.lang.String], 
          /* parents */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          /* blockName */ js.UndefOr[java.lang.String], 
          java.lang.String
        ]
      ], 
      /* args */ js.UndefOr[js.Array[_]], 
      /* content */ js.UndefOr[java.lang.String], 
      /* parents */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* blockName */ js.UndefOr[java.lang.String], 
      java.lang.String
    ],
    ends: scala.Boolean,
    blockLevel: scala.Boolean
  ): scala.Unit = js.native
}

