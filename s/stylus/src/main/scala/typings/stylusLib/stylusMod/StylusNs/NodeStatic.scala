package typings
package stylusLib.stylusMod.StylusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStatic extends js.Object {
  var Arguments: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Arguments]
  var Atblock: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Atblock]
  var Atrule: org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.Atrule]
  var BinOp: org.scalablytyped.runtime.Instantiable3[
    /* op */ java.lang.String, 
    /* left */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    /* right */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    stylusLib.stylusMod.StylusNs.NodesNs.BinOp
  ]
  var Block: org.scalablytyped.runtime.Instantiable1[
    /* parent */ stylusLib.stylusMod.StylusNs.NodesNs.Block, 
    stylusLib.stylusMod.StylusNs.NodesNs.Block
  ]
  var Boolean: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Boolean]
  var Call: org.scalablytyped.runtime.Instantiable2[
    /* name */ java.lang.String, 
    /* args */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    stylusLib.stylusMod.StylusNs.NodesNs.Call
  ]
  var Charset: org.scalablytyped.runtime.Instantiable1[/* val */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.Charset]
  var Comment: org.scalablytyped.runtime.Instantiable3[
    /* str */ java.lang.String, 
    /* suppress */ scala.Boolean, 
    /* inline */ scala.Boolean, 
    stylusLib.stylusMod.StylusNs.NodesNs.Comment
  ]
  var Each: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Each]
  var Expression: org.scalablytyped.runtime.Instantiable1[/* isList */ scala.Boolean, stylusLib.stylusMod.StylusNs.NodesNs.Expression]
  var Extend: org.scalablytyped.runtime.Instantiable1[
    /* selectors */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Selector], 
    stylusLib.stylusMod.StylusNs.NodesNs.Extend
  ]
  var Function: org.scalablytyped.runtime.Instantiable3[
    /* name */ java.lang.String, 
    /* params */ stylusLib.stylusMod.StylusNs.NodesNs.Params, 
    /* body */ stylusLib.stylusMod.StylusNs.NodesNs.Block, 
    stylusLib.stylusMod.StylusNs.NodesNs.Function
  ]
  var Group: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Group]
  var HSLA: stylusLib.Anon_A
  var Ident: org.scalablytyped.runtime.Instantiable2[
    /* name */ java.lang.String, 
    /* val */ stylusLib.stylusMod.StylusNs.NodesNs.Node, 
    stylusLib.stylusMod.StylusNs.NodesNs.Ident
  ]
  var If: org.scalablytyped.runtime.Instantiable2[
    /* cond */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    /* negate */ scala.Boolean, 
    stylusLib.stylusMod.StylusNs.NodesNs.If
  ]
  var Import: org.scalablytyped.runtime.Instantiable1[
    /* path */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    stylusLib.stylusMod.StylusNs.NodesNs.Import
  ]
  var Keyframes: org.scalablytyped.runtime.Instantiable1[
    /* segs */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node], 
    stylusLib.stylusMod.StylusNs.NodesNs.Keyframes
  ]
  var Literal: org.scalablytyped.runtime.Instantiable1[/* str */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.Literal]
  var Media: org.scalablytyped.runtime.Instantiable1[/* val */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.Media]
  var Member: org.scalablytyped.runtime.Instantiable2[
    /* left */ stylusLib.stylusMod.StylusNs.NodesNs.Node, 
    /* right */ stylusLib.stylusMod.StylusNs.NodesNs.Node, 
    stylusLib.stylusMod.StylusNs.NodesNs.Member
  ]
  var Namespace: org.scalablytyped.runtime.Instantiable2[
    /* val */ java.lang.String, 
    /* prefix */ java.lang.String, 
    stylusLib.stylusMod.StylusNs.NodesNs.Namespace
  ]
  var Node: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Node]
  var Null: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Null]
  var Object: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Object]
  var Params: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Params]
  var Property: org.scalablytyped.runtime.Instantiable2[
    /* segs */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node], 
    /* expr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    stylusLib.stylusMod.StylusNs.NodesNs.Property
  ]
  var Query: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Query]
  var QueryExpr: org.scalablytyped.runtime.Instantiable1[
    /* segs */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node], 
    stylusLib.stylusMod.StylusNs.NodesNs.QueryExpr
  ]
  var QueryList: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.QueryList]
  var RGBA: stylusLib.Anon_AB
  var Return: org.scalablytyped.runtime.Instantiable1[
    /* expr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    stylusLib.stylusMod.StylusNs.NodesNs.Return
  ]
  var Root: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Root]
  var Selector: org.scalablytyped.runtime.Instantiable1[
    /* segs */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node], 
    stylusLib.stylusMod.StylusNs.NodesNs.Selector
  ]
  var String: org.scalablytyped.runtime.Instantiable1[/* val */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.String]
  var Ternary: org.scalablytyped.runtime.Instantiable3[
    /* op */ java.lang.String, 
    /* trueExpr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    /* falseExpr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    stylusLib.stylusMod.StylusNs.NodesNs.Ternary
  ]
  var UnaryOp: org.scalablytyped.runtime.Instantiable2[
    /* op */ java.lang.String, 
    /* expr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    stylusLib.stylusMod.StylusNs.NodesNs.UnaryOp
  ]
  var Unit: org.scalablytyped.runtime.Instantiable2[
    /* val */ scala.Double, 
    /* type */ java.lang.String, 
    stylusLib.stylusMod.StylusNs.NodesNs.Unit
  ]
  var `false`: stylusLib.stylusMod.StylusNs.NodesNs.Boolean
  var `null`: stylusLib.stylusMod.StylusNs.NodesNs.Null
  var `true`: stylusLib.stylusMod.StylusNs.NodesNs.Boolean
}

object NodeStatic {
  @scala.inline
  def apply(
    Arguments: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Arguments],
    Atblock: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Atblock],
    Atrule: org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.Atrule],
    BinOp: org.scalablytyped.runtime.Instantiable3[
      /* op */ java.lang.String, 
      /* left */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
      /* right */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
      stylusLib.stylusMod.StylusNs.NodesNs.BinOp
    ],
    Block: org.scalablytyped.runtime.Instantiable1[
      /* parent */ stylusLib.stylusMod.StylusNs.NodesNs.Block, 
      stylusLib.stylusMod.StylusNs.NodesNs.Block
    ],
    Boolean: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Boolean],
    Call: org.scalablytyped.runtime.Instantiable2[
      /* name */ java.lang.String, 
      /* args */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
      stylusLib.stylusMod.StylusNs.NodesNs.Call
    ],
    Charset: org.scalablytyped.runtime.Instantiable1[/* val */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.Charset],
    Comment: org.scalablytyped.runtime.Instantiable3[
      /* str */ java.lang.String, 
      /* suppress */ scala.Boolean, 
      /* inline */ scala.Boolean, 
      stylusLib.stylusMod.StylusNs.NodesNs.Comment
    ],
    Each: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Each],
    Expression: org.scalablytyped.runtime.Instantiable1[/* isList */ scala.Boolean, stylusLib.stylusMod.StylusNs.NodesNs.Expression],
    Extend: org.scalablytyped.runtime.Instantiable1[
      /* selectors */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Selector], 
      stylusLib.stylusMod.StylusNs.NodesNs.Extend
    ],
    Function: org.scalablytyped.runtime.Instantiable3[
      /* name */ java.lang.String, 
      /* params */ stylusLib.stylusMod.StylusNs.NodesNs.Params, 
      /* body */ stylusLib.stylusMod.StylusNs.NodesNs.Block, 
      stylusLib.stylusMod.StylusNs.NodesNs.Function
    ],
    Group: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Group],
    HSLA: stylusLib.Anon_A,
    Ident: org.scalablytyped.runtime.Instantiable2[
      /* name */ java.lang.String, 
      /* val */ stylusLib.stylusMod.StylusNs.NodesNs.Node, 
      stylusLib.stylusMod.StylusNs.NodesNs.Ident
    ],
    If: org.scalablytyped.runtime.Instantiable2[
      /* cond */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
      /* negate */ scala.Boolean, 
      stylusLib.stylusMod.StylusNs.NodesNs.If
    ],
    Import: org.scalablytyped.runtime.Instantiable1[
      /* path */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
      stylusLib.stylusMod.StylusNs.NodesNs.Import
    ],
    Keyframes: org.scalablytyped.runtime.Instantiable1[
      /* segs */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node], 
      stylusLib.stylusMod.StylusNs.NodesNs.Keyframes
    ],
    Literal: org.scalablytyped.runtime.Instantiable1[/* str */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.Literal],
    Media: org.scalablytyped.runtime.Instantiable1[/* val */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.Media],
    Member: org.scalablytyped.runtime.Instantiable2[
      /* left */ stylusLib.stylusMod.StylusNs.NodesNs.Node, 
      /* right */ stylusLib.stylusMod.StylusNs.NodesNs.Node, 
      stylusLib.stylusMod.StylusNs.NodesNs.Member
    ],
    Namespace: org.scalablytyped.runtime.Instantiable2[
      /* val */ java.lang.String, 
      /* prefix */ java.lang.String, 
      stylusLib.stylusMod.StylusNs.NodesNs.Namespace
    ],
    Node: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Node],
    Null: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Null],
    Object: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Object],
    Params: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Params],
    Property: org.scalablytyped.runtime.Instantiable2[
      /* segs */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node], 
      /* expr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
      stylusLib.stylusMod.StylusNs.NodesNs.Property
    ],
    Query: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Query],
    QueryExpr: org.scalablytyped.runtime.Instantiable1[
      /* segs */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node], 
      stylusLib.stylusMod.StylusNs.NodesNs.QueryExpr
    ],
    QueryList: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.QueryList],
    RGBA: stylusLib.Anon_AB,
    Return: org.scalablytyped.runtime.Instantiable1[
      /* expr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
      stylusLib.stylusMod.StylusNs.NodesNs.Return
    ],
    Root: org.scalablytyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Root],
    Selector: org.scalablytyped.runtime.Instantiable1[
      /* segs */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node], 
      stylusLib.stylusMod.StylusNs.NodesNs.Selector
    ],
    String: org.scalablytyped.runtime.Instantiable1[/* val */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.String],
    Ternary: org.scalablytyped.runtime.Instantiable3[
      /* op */ java.lang.String, 
      /* trueExpr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
      /* falseExpr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
      stylusLib.stylusMod.StylusNs.NodesNs.Ternary
    ],
    UnaryOp: org.scalablytyped.runtime.Instantiable2[
      /* op */ java.lang.String, 
      /* expr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
      stylusLib.stylusMod.StylusNs.NodesNs.UnaryOp
    ],
    Unit: org.scalablytyped.runtime.Instantiable2[
      /* val */ scala.Double, 
      /* type */ java.lang.String, 
      stylusLib.stylusMod.StylusNs.NodesNs.Unit
    ],
    `false`: stylusLib.stylusMod.StylusNs.NodesNs.Boolean,
    `null`: stylusLib.stylusMod.StylusNs.NodesNs.Null,
    `true`: stylusLib.stylusMod.StylusNs.NodesNs.Boolean
  ): NodeStatic = {
    val __obj = js.Dynamic.literal(`false` = `false`, `null` = `null`, `true` = `true`)
    __obj.updateDynamic("Arguments")(Arguments)
    __obj.updateDynamic("Atblock")(Atblock)
    __obj.updateDynamic("Atrule")(Atrule)
    __obj.updateDynamic("BinOp")(BinOp)
    __obj.updateDynamic("Block")(Block)
    __obj.updateDynamic("Boolean")(Boolean)
    __obj.updateDynamic("Call")(Call)
    __obj.updateDynamic("Charset")(Charset)
    __obj.updateDynamic("Comment")(Comment)
    __obj.updateDynamic("Each")(Each)
    __obj.updateDynamic("Expression")(Expression)
    __obj.updateDynamic("Extend")(Extend)
    __obj.updateDynamic("Function")(Function)
    __obj.updateDynamic("Group")(Group)
    __obj.updateDynamic("HSLA")(HSLA)
    __obj.updateDynamic("Ident")(Ident)
    __obj.updateDynamic("If")(If)
    __obj.updateDynamic("Import")(Import)
    __obj.updateDynamic("Keyframes")(Keyframes)
    __obj.updateDynamic("Literal")(Literal)
    __obj.updateDynamic("Media")(Media)
    __obj.updateDynamic("Member")(Member)
    __obj.updateDynamic("Namespace")(Namespace)
    __obj.updateDynamic("Node")(Node)
    __obj.updateDynamic("Null")(Null)
    __obj.updateDynamic("Object")(Object)
    __obj.updateDynamic("Params")(Params)
    __obj.updateDynamic("Property")(Property)
    __obj.updateDynamic("Query")(Query)
    __obj.updateDynamic("QueryExpr")(QueryExpr)
    __obj.updateDynamic("QueryList")(QueryList)
    __obj.updateDynamic("RGBA")(RGBA)
    __obj.updateDynamic("Return")(Return)
    __obj.updateDynamic("Root")(Root)
    __obj.updateDynamic("Selector")(Selector)
    __obj.updateDynamic("String")(String)
    __obj.updateDynamic("Ternary")(Ternary)
    __obj.updateDynamic("UnaryOp")(UnaryOp)
    __obj.updateDynamic("Unit")(Unit)
    __obj.asInstanceOf[NodeStatic]
  }
}

