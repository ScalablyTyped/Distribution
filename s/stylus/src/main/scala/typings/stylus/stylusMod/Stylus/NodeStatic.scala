package typings.stylus.stylusMod.Stylus

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.stylus.TypeofClassHSLA
import typings.stylus.TypeofClassRGBA
import typings.stylus.stylusMod.Stylus.Nodes.Arguments
import typings.stylus.stylusMod.Stylus.Nodes.Atblock
import typings.stylus.stylusMod.Stylus.Nodes.Atrule
import typings.stylus.stylusMod.Stylus.Nodes.BinOp
import typings.stylus.stylusMod.Stylus.Nodes.Block
import typings.stylus.stylusMod.Stylus.Nodes.Call
import typings.stylus.stylusMod.Stylus.Nodes.Charset
import typings.stylus.stylusMod.Stylus.Nodes.Comment
import typings.stylus.stylusMod.Stylus.Nodes.Each
import typings.stylus.stylusMod.Stylus.Nodes.Expression
import typings.stylus.stylusMod.Stylus.Nodes.Extend
import typings.stylus.stylusMod.Stylus.Nodes.Function
import typings.stylus.stylusMod.Stylus.Nodes.Group
import typings.stylus.stylusMod.Stylus.Nodes.Ident
import typings.stylus.stylusMod.Stylus.Nodes.If
import typings.stylus.stylusMod.Stylus.Nodes.Import
import typings.stylus.stylusMod.Stylus.Nodes.Keyframes
import typings.stylus.stylusMod.Stylus.Nodes.Literal
import typings.stylus.stylusMod.Stylus.Nodes.Media
import typings.stylus.stylusMod.Stylus.Nodes.Member
import typings.stylus.stylusMod.Stylus.Nodes.Namespace
import typings.stylus.stylusMod.Stylus.Nodes.Node
import typings.stylus.stylusMod.Stylus.Nodes.Null
import typings.stylus.stylusMod.Stylus.Nodes.Object
import typings.stylus.stylusMod.Stylus.Nodes.Params
import typings.stylus.stylusMod.Stylus.Nodes.Property
import typings.stylus.stylusMod.Stylus.Nodes.Query
import typings.stylus.stylusMod.Stylus.Nodes.QueryExpr
import typings.stylus.stylusMod.Stylus.Nodes.QueryList
import typings.stylus.stylusMod.Stylus.Nodes.Return
import typings.stylus.stylusMod.Stylus.Nodes.Root
import typings.stylus.stylusMod.Stylus.Nodes.Selector
import typings.stylus.stylusMod.Stylus.Nodes.Ternary
import typings.stylus.stylusMod.Stylus.Nodes.UnaryOp
import typings.stylus.stylusMod.Stylus.Nodes.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStatic extends js.Object {
  var Arguments: Instantiable0[typings.stylus.stylusMod.Stylus.Nodes.Arguments]
  var Atblock: Instantiable0[typings.stylus.stylusMod.Stylus.Nodes.Atblock]
  var Atrule: Instantiable1[/* type */ String, typings.stylus.stylusMod.Stylus.Nodes.Atrule]
  var BinOp: Instantiable3[
    /* op */ String, 
    /* left */ Expression, 
    /* right */ Expression, 
    typings.stylus.stylusMod.Stylus.Nodes.BinOp
  ]
  var Block: Instantiable1[
    /* parent */ typings.stylus.stylusMod.Stylus.Nodes.Block, 
    typings.stylus.stylusMod.Stylus.Nodes.Block
  ]
  var Boolean: Instantiable0[typings.stylus.stylusMod.Stylus.Nodes.Boolean]
  var Call: Instantiable2[/* name */ String, /* args */ Expression, typings.stylus.stylusMod.Stylus.Nodes.Call]
  var Charset: Instantiable1[/* val */ String, typings.stylus.stylusMod.Stylus.Nodes.Charset]
  var Comment: Instantiable3[
    /* str */ String, 
    /* suppress */ Boolean, 
    /* inline */ Boolean, 
    typings.stylus.stylusMod.Stylus.Nodes.Comment
  ]
  var Each: Instantiable0[typings.stylus.stylusMod.Stylus.Nodes.Each]
  var Expression: Instantiable1[/* isList */ Boolean, typings.stylus.stylusMod.Stylus.Nodes.Expression]
  var Extend: Instantiable1[/* selectors */ js.Array[Selector], typings.stylus.stylusMod.Stylus.Nodes.Extend]
  var Function: Instantiable3[
    /* name */ String, 
    /* params */ Params, 
    /* body */ Block, 
    typings.stylus.stylusMod.Stylus.Nodes.Function
  ]
  var Group: Instantiable0[typings.stylus.stylusMod.Stylus.Nodes.Group]
  var HSLA: TypeofClassHSLA
  var Ident: Instantiable2[/* name */ String, /* val */ Node, typings.stylus.stylusMod.Stylus.Nodes.Ident]
  var If: Instantiable2[
    /* cond */ Expression, 
    /* negate */ Boolean, 
    typings.stylus.stylusMod.Stylus.Nodes.If
  ]
  var Import: Instantiable1[/* path */ Expression, typings.stylus.stylusMod.Stylus.Nodes.Import]
  var Keyframes: Instantiable1[/* segs */ js.Array[Node], typings.stylus.stylusMod.Stylus.Nodes.Keyframes]
  var Literal: Instantiable1[/* str */ String, typings.stylus.stylusMod.Stylus.Nodes.Literal]
  var Media: Instantiable1[/* val */ String, typings.stylus.stylusMod.Stylus.Nodes.Media]
  var Member: Instantiable2[/* left */ Node, /* right */ Node, typings.stylus.stylusMod.Stylus.Nodes.Member]
  var Namespace: Instantiable2[
    /* val */ String, 
    /* prefix */ String, 
    typings.stylus.stylusMod.Stylus.Nodes.Namespace
  ]
  var Node: Instantiable0[typings.stylus.stylusMod.Stylus.Nodes.Node]
  var Null: Instantiable0[typings.stylus.stylusMod.Stylus.Nodes.Null]
  var Object: Instantiable0[typings.stylus.stylusMod.Stylus.Nodes.Object]
  var Params: Instantiable0[typings.stylus.stylusMod.Stylus.Nodes.Params]
  var Property: Instantiable2[
    /* segs */ js.Array[Node], 
    /* expr */ Expression, 
    typings.stylus.stylusMod.Stylus.Nodes.Property
  ]
  var Query: Instantiable0[typings.stylus.stylusMod.Stylus.Nodes.Query]
  var QueryExpr: Instantiable1[/* segs */ js.Array[Node], typings.stylus.stylusMod.Stylus.Nodes.QueryExpr]
  var QueryList: Instantiable0[typings.stylus.stylusMod.Stylus.Nodes.QueryList]
  var RGBA: TypeofClassRGBA
  var Return: Instantiable1[/* expr */ Expression, typings.stylus.stylusMod.Stylus.Nodes.Return]
  var Root: Instantiable0[typings.stylus.stylusMod.Stylus.Nodes.Root]
  var Selector: Instantiable1[/* segs */ js.Array[Node], typings.stylus.stylusMod.Stylus.Nodes.Selector]
  var String: Instantiable1[/* val */ java.lang.String, typings.stylus.stylusMod.Stylus.Nodes.String]
  var Ternary: Instantiable3[
    /* op */ String, 
    /* trueExpr */ Expression, 
    /* falseExpr */ Expression, 
    typings.stylus.stylusMod.Stylus.Nodes.Ternary
  ]
  var UnaryOp: Instantiable2[
    /* op */ String, 
    /* expr */ Expression, 
    typings.stylus.stylusMod.Stylus.Nodes.UnaryOp
  ]
  var Unit: Instantiable2[/* val */ Double, /* type */ String, typings.stylus.stylusMod.Stylus.Nodes.Unit]
  var `false`: typings.stylus.stylusMod.Stylus.Nodes.Boolean
  var `null`: Null
  var `true`: typings.stylus.stylusMod.Stylus.Nodes.Boolean
}

object NodeStatic {
  @scala.inline
  def apply(
    Arguments: Instantiable0[Arguments],
    Atblock: Instantiable0[Atblock],
    Atrule: Instantiable1[/* type */ String, Atrule],
    BinOp: Instantiable3[/* op */ String, /* left */ Expression, /* right */ Expression, BinOp],
    Block: Instantiable1[/* parent */ Block, Block],
    Boolean: Instantiable0[typings.stylus.stylusMod.Stylus.Nodes.Boolean],
    Call: Instantiable2[/* name */ String, /* args */ Expression, Call],
    Charset: Instantiable1[/* val */ String, Charset],
    Comment: Instantiable3[/* str */ String, /* suppress */ Boolean, /* inline */ Boolean, Comment],
    Each: Instantiable0[Each],
    Expression: Instantiable1[/* isList */ Boolean, Expression],
    Extend: Instantiable1[/* selectors */ js.Array[Selector], Extend],
    Function: Instantiable3[/* name */ String, /* params */ Params, /* body */ Block, Function],
    Group: Instantiable0[Group],
    HSLA: TypeofClassHSLA,
    Ident: Instantiable2[/* name */ String, /* val */ Node, Ident],
    If: Instantiable2[/* cond */ Expression, /* negate */ Boolean, If],
    Import: Instantiable1[/* path */ Expression, Import],
    Keyframes: Instantiable1[/* segs */ js.Array[Node], Keyframes],
    Literal: Instantiable1[/* str */ String, Literal],
    Media: Instantiable1[/* val */ String, Media],
    Member: Instantiable2[/* left */ Node, /* right */ Node, Member],
    Namespace: Instantiable2[/* val */ String, /* prefix */ String, Namespace],
    Node: Instantiable0[Node],
    Null: Instantiable0[Null],
    Object: Instantiable0[Object],
    Params: Instantiable0[Params],
    Property: Instantiable2[/* segs */ js.Array[Node], /* expr */ Expression, Property],
    Query: Instantiable0[Query],
    QueryExpr: Instantiable1[/* segs */ js.Array[Node], QueryExpr],
    QueryList: Instantiable0[QueryList],
    RGBA: TypeofClassRGBA,
    Return: Instantiable1[/* expr */ Expression, Return],
    Root: Instantiable0[Root],
    Selector: Instantiable1[/* segs */ js.Array[Node], Selector],
    String: Instantiable1[/* val */ String, typings.stylus.stylusMod.Stylus.Nodes.String],
    Ternary: Instantiable3[/* op */ String, /* trueExpr */ Expression, /* falseExpr */ Expression, Ternary],
    UnaryOp: Instantiable2[/* op */ String, /* expr */ Expression, UnaryOp],
    Unit: Instantiable2[/* val */ Double, /* type */ String, Unit],
    `false`: typings.stylus.stylusMod.Stylus.Nodes.Boolean,
    `null`: Null,
    `true`: typings.stylus.stylusMod.Stylus.Nodes.Boolean
  ): NodeStatic = {
    val __obj = js.Dynamic.literal(Arguments = Arguments, Atblock = Atblock, Atrule = Atrule, BinOp = BinOp, Block = Block, Boolean = Boolean, Call = Call, Charset = Charset, Comment = Comment, Each = Each, Expression = Expression, Extend = Extend, Function = Function, Group = Group, HSLA = HSLA, Ident = Ident, If = If, Import = Import, Keyframes = Keyframes, Literal = Literal, Media = Media, Member = Member, Namespace = Namespace, Node = Node, Null = Null, Object = Object, Params = Params, Property = Property, Query = Query, QueryExpr = QueryExpr, QueryList = QueryList, RGBA = RGBA, Return = Return, Root = Root, Selector = Selector, String = String, Ternary = Ternary, UnaryOp = UnaryOp, Unit = Unit)
    __obj.updateDynamic("false")(`false`)
    __obj.updateDynamic("null")(`null`)
    __obj.updateDynamic("true")(`true`)
    __obj.asInstanceOf[NodeStatic]
  }
}

