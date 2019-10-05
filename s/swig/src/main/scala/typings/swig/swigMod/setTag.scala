package typings.swig.swigMod

import typings.swig.swigMod.lexer.TYPES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swig", "setTag")
@js.native
object setTag extends js.Object {
  def apply(
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
  def apply(
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
  def apply(
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
}

