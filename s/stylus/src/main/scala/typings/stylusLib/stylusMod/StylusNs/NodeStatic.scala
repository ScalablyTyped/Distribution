package typings
package stylusLib.stylusMod.StylusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodeStatic extends js.Object {
  var Arguments: ScalablyTyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Arguments]
  var Atblock: ScalablyTyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Atblock]
  var Atrule: ScalablyTyped.runtime.Instantiable1[/* type */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.Atrule]
  var BinOp: ScalablyTyped.runtime.Instantiable3[
    /* op */ java.lang.String, 
    /* left */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    /* right */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    stylusLib.stylusMod.StylusNs.NodesNs.BinOp
  ]
  var Block: ScalablyTyped.runtime.Instantiable1[
    /* parent */ stylusLib.stylusMod.StylusNs.NodesNs.Block, 
    stylusLib.stylusMod.StylusNs.NodesNs.Block
  ]
  var Boolean: ScalablyTyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Boolean]
  var Call: ScalablyTyped.runtime.Instantiable2[
    /* name */ java.lang.String, 
    /* args */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    stylusLib.stylusMod.StylusNs.NodesNs.Call
  ]
  var Charset: ScalablyTyped.runtime.Instantiable1[/* val */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.Charset]
  var Comment: ScalablyTyped.runtime.Instantiable3[
    /* str */ java.lang.String, 
    /* suppress */ scala.Boolean, 
    /* inline */ scala.Boolean, 
    stylusLib.stylusMod.StylusNs.NodesNs.Comment
  ]
  var Each: ScalablyTyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Each]
  var Expression: ScalablyTyped.runtime.Instantiable1[/* isList */ scala.Boolean, stylusLib.stylusMod.StylusNs.NodesNs.Expression]
  var Extend: ScalablyTyped.runtime.Instantiable1[
    /* selectors */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Selector], 
    stylusLib.stylusMod.StylusNs.NodesNs.Extend
  ]
  var Function: ScalablyTyped.runtime.Instantiable3[
    /* name */ java.lang.String, 
    /* params */ stylusLib.stylusMod.StylusNs.NodesNs.Params, 
    /* body */ stylusLib.stylusMod.StylusNs.NodesNs.Block, 
    stylusLib.stylusMod.StylusNs.NodesNs.Function
  ]
  var Group: ScalablyTyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Group]
  var HSLA: ScalablyTyped.runtime.Instantiable4[
    /* h */ scala.Double, 
    /* s */ scala.Double, 
    /* l */ scala.Double, 
    /* a */ scala.Double, 
    stylusLib.stylusMod.StylusNs.NodesNs.HSLA
  ]
  var Ident: ScalablyTyped.runtime.Instantiable2[
    /* name */ java.lang.String, 
    /* val */ stylusLib.stylusMod.StylusNs.NodesNs.Node, 
    stylusLib.stylusMod.StylusNs.NodesNs.Ident
  ]
  var If: ScalablyTyped.runtime.Instantiable2[
    /* cond */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    /* negate */ scala.Boolean, 
    stylusLib.stylusMod.StylusNs.NodesNs.If
  ]
  var Import: ScalablyTyped.runtime.Instantiable1[
    /* path */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    stylusLib.stylusMod.StylusNs.NodesNs.Import
  ]
  var Keyframes: ScalablyTyped.runtime.Instantiable1[
    /* segs */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node], 
    stylusLib.stylusMod.StylusNs.NodesNs.Keyframes
  ]
  var Literal: ScalablyTyped.runtime.Instantiable1[/* str */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.Literal]
  var Media: ScalablyTyped.runtime.Instantiable1[/* val */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.Media]
  var Member: ScalablyTyped.runtime.Instantiable2[
    /* left */ stylusLib.stylusMod.StylusNs.NodesNs.Node, 
    /* right */ stylusLib.stylusMod.StylusNs.NodesNs.Node, 
    stylusLib.stylusMod.StylusNs.NodesNs.Member
  ]
  var Namespace: ScalablyTyped.runtime.Instantiable2[
    /* val */ java.lang.String, 
    /* prefix */ java.lang.String, 
    stylusLib.stylusMod.StylusNs.NodesNs.Namespace
  ]
  var Node: ScalablyTyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Node]
  var Null: ScalablyTyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Null]
  var Object: ScalablyTyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Object]
  var Params: ScalablyTyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Params]
  var Property: ScalablyTyped.runtime.Instantiable2[
    /* segs */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node], 
    /* expr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    stylusLib.stylusMod.StylusNs.NodesNs.Property
  ]
  var Query: ScalablyTyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Query]
  var QueryExpr: ScalablyTyped.runtime.Instantiable1[
    /* segs */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node], 
    stylusLib.stylusMod.StylusNs.NodesNs.QueryExpr
  ]
  var QueryList: ScalablyTyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.QueryList]
  var RGBA: ScalablyTyped.runtime.Instantiable4[
    /* r */ scala.Double, 
    /* g */ scala.Double, 
    /* b */ scala.Double, 
    /* a */ scala.Double, 
    stylusLib.stylusMod.StylusNs.NodesNs.RGBA
  ]
  var Return: ScalablyTyped.runtime.Instantiable1[
    /* expr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    stylusLib.stylusMod.StylusNs.NodesNs.Return
  ]
  var Root: ScalablyTyped.runtime.Instantiable0[stylusLib.stylusMod.StylusNs.NodesNs.Root]
  var Selector: ScalablyTyped.runtime.Instantiable1[
    /* segs */ js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node], 
    stylusLib.stylusMod.StylusNs.NodesNs.Selector
  ]
  var String: ScalablyTyped.runtime.Instantiable1[/* val */ java.lang.String, stylusLib.stylusMod.StylusNs.NodesNs.String]
  var Ternary: ScalablyTyped.runtime.Instantiable3[
    /* op */ java.lang.String, 
    /* trueExpr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    /* falseExpr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    stylusLib.stylusMod.StylusNs.NodesNs.Ternary
  ]
  var UnaryOp: ScalablyTyped.runtime.Instantiable2[
    /* op */ java.lang.String, 
    /* expr */ stylusLib.stylusMod.StylusNs.NodesNs.Expression, 
    stylusLib.stylusMod.StylusNs.NodesNs.UnaryOp
  ]
  var Unit: ScalablyTyped.runtime.Instantiable2[
    /* val */ scala.Double, 
    /* type */ java.lang.String, 
    stylusLib.stylusMod.StylusNs.NodesNs.Unit
  ]
  var `false`: stylusLib.stylusMod.StylusNs.NodesNs.Boolean
  var `null`: stylusLib.stylusMod.StylusNs.NodesNs.Null
  var `true`: stylusLib.stylusMod.StylusNs.NodesNs.Boolean
}

