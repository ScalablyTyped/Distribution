package typings.stylus.mod.Stylus

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.stylus.anon.TypeofHSLA
import typings.stylus.anon.TypeofRGBA
import typings.stylus.mod.Stylus.Nodes.Arguments
import typings.stylus.mod.Stylus.Nodes.Atblock
import typings.stylus.mod.Stylus.Nodes.Atrule
import typings.stylus.mod.Stylus.Nodes.BinOp
import typings.stylus.mod.Stylus.Nodes.Block
import typings.stylus.mod.Stylus.Nodes.Call
import typings.stylus.mod.Stylus.Nodes.Charset
import typings.stylus.mod.Stylus.Nodes.Comment
import typings.stylus.mod.Stylus.Nodes.Each
import typings.stylus.mod.Stylus.Nodes.Expression
import typings.stylus.mod.Stylus.Nodes.Extend
import typings.stylus.mod.Stylus.Nodes.Function
import typings.stylus.mod.Stylus.Nodes.Group
import typings.stylus.mod.Stylus.Nodes.Ident
import typings.stylus.mod.Stylus.Nodes.If
import typings.stylus.mod.Stylus.Nodes.Import
import typings.stylus.mod.Stylus.Nodes.Keyframes
import typings.stylus.mod.Stylus.Nodes.Literal
import typings.stylus.mod.Stylus.Nodes.Media
import typings.stylus.mod.Stylus.Nodes.Member
import typings.stylus.mod.Stylus.Nodes.Namespace
import typings.stylus.mod.Stylus.Nodes.Node
import typings.stylus.mod.Stylus.Nodes.Null
import typings.stylus.mod.Stylus.Nodes.Object
import typings.stylus.mod.Stylus.Nodes.Params
import typings.stylus.mod.Stylus.Nodes.Property
import typings.stylus.mod.Stylus.Nodes.Query
import typings.stylus.mod.Stylus.Nodes.QueryExpr
import typings.stylus.mod.Stylus.Nodes.QueryList
import typings.stylus.mod.Stylus.Nodes.Return
import typings.stylus.mod.Stylus.Nodes.Root
import typings.stylus.mod.Stylus.Nodes.Selector
import typings.stylus.mod.Stylus.Nodes.Ternary
import typings.stylus.mod.Stylus.Nodes.UnaryOp
import typings.stylus.mod.Stylus.Nodes.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeStatic extends js.Object {
  var Arguments: Instantiable0[typings.stylus.mod.Stylus.Nodes.Arguments] = js.native
  var Atblock: Instantiable0[typings.stylus.mod.Stylus.Nodes.Atblock] = js.native
  var Atrule: Instantiable1[/* type */ String, typings.stylus.mod.Stylus.Nodes.Atrule] = js.native
  var BinOp: Instantiable3[
    /* op */ String, 
    /* left */ Expression, 
    /* right */ Expression, 
    typings.stylus.mod.Stylus.Nodes.BinOp
  ] = js.native
  var Block: Instantiable1[
    /* parent */ typings.stylus.mod.Stylus.Nodes.Block, 
    typings.stylus.mod.Stylus.Nodes.Block
  ] = js.native
  var Boolean: Instantiable0[typings.stylus.mod.Stylus.Nodes.Boolean] = js.native
  var Call: Instantiable2[/* name */ String, /* args */ Expression, typings.stylus.mod.Stylus.Nodes.Call] = js.native
  var Charset: Instantiable1[/* val */ String, typings.stylus.mod.Stylus.Nodes.Charset] = js.native
  var Comment: Instantiable3[
    /* str */ String, 
    /* suppress */ Boolean, 
    /* inline */ Boolean, 
    typings.stylus.mod.Stylus.Nodes.Comment
  ] = js.native
  var Each: Instantiable0[typings.stylus.mod.Stylus.Nodes.Each] = js.native
  var Expression: Instantiable1[/* isList */ Boolean, typings.stylus.mod.Stylus.Nodes.Expression] = js.native
  var Extend: Instantiable1[/* selectors */ js.Array[Selector], typings.stylus.mod.Stylus.Nodes.Extend] = js.native
  var Function: Instantiable3[
    /* name */ String, 
    /* params */ Params, 
    /* body */ Block, 
    typings.stylus.mod.Stylus.Nodes.Function
  ] = js.native
  var Group: Instantiable0[typings.stylus.mod.Stylus.Nodes.Group] = js.native
  var HSLA: TypeofHSLA = js.native
  var Ident: Instantiable2[/* name */ String, /* val */ Node, typings.stylus.mod.Stylus.Nodes.Ident] = js.native
  var If: Instantiable2[/* cond */ Expression, /* negate */ Boolean, typings.stylus.mod.Stylus.Nodes.If] = js.native
  var Import: Instantiable1[/* path */ Expression, typings.stylus.mod.Stylus.Nodes.Import] = js.native
  var Keyframes: Instantiable1[/* segs */ js.Array[Node], typings.stylus.mod.Stylus.Nodes.Keyframes] = js.native
  var Literal: Instantiable1[/* str */ String, typings.stylus.mod.Stylus.Nodes.Literal] = js.native
  var Media: Instantiable1[/* val */ String, typings.stylus.mod.Stylus.Nodes.Media] = js.native
  var Member: Instantiable2[/* left */ Node, /* right */ Node, typings.stylus.mod.Stylus.Nodes.Member] = js.native
  var Namespace: Instantiable2[/* val */ String, /* prefix */ String, typings.stylus.mod.Stylus.Nodes.Namespace] = js.native
  var Node: Instantiable0[typings.stylus.mod.Stylus.Nodes.Node] = js.native
  var Null: Instantiable0[typings.stylus.mod.Stylus.Nodes.Null] = js.native
  var Object: Instantiable0[typings.stylus.mod.Stylus.Nodes.Object] = js.native
  var Params: Instantiable0[typings.stylus.mod.Stylus.Nodes.Params] = js.native
  var Property: Instantiable2[
    /* segs */ js.Array[Node], 
    /* expr */ Expression, 
    typings.stylus.mod.Stylus.Nodes.Property
  ] = js.native
  var Query: Instantiable0[typings.stylus.mod.Stylus.Nodes.Query] = js.native
  var QueryExpr: Instantiable1[/* segs */ js.Array[Node], typings.stylus.mod.Stylus.Nodes.QueryExpr] = js.native
  var QueryList: Instantiable0[typings.stylus.mod.Stylus.Nodes.QueryList] = js.native
  var RGBA: TypeofRGBA = js.native
  var Return: Instantiable1[/* expr */ Expression, typings.stylus.mod.Stylus.Nodes.Return] = js.native
  var Root: Instantiable0[typings.stylus.mod.Stylus.Nodes.Root] = js.native
  var Selector: Instantiable1[/* segs */ js.Array[Node], typings.stylus.mod.Stylus.Nodes.Selector] = js.native
  var String: Instantiable1[/* val */ java.lang.String, typings.stylus.mod.Stylus.Nodes.String] = js.native
  var Ternary: Instantiable3[
    /* op */ String, 
    /* trueExpr */ Expression, 
    /* falseExpr */ Expression, 
    typings.stylus.mod.Stylus.Nodes.Ternary
  ] = js.native
  var UnaryOp: Instantiable2[/* op */ String, /* expr */ Expression, typings.stylus.mod.Stylus.Nodes.UnaryOp] = js.native
  var Unit: Instantiable2[/* val */ Double, /* type */ String, typings.stylus.mod.Stylus.Nodes.Unit] = js.native
  var `false`: typings.stylus.mod.Stylus.Nodes.Boolean = js.native
  var `null`: Null = js.native
  var `true`: typings.stylus.mod.Stylus.Nodes.Boolean = js.native
}

object NodeStatic {
  @scala.inline
  def apply(
    Arguments: Instantiable0[Arguments],
    Atblock: Instantiable0[Atblock],
    Atrule: Instantiable1[/* type */ String, Atrule],
    BinOp: Instantiable3[/* op */ String, /* left */ Expression, /* right */ Expression, BinOp],
    Block: Instantiable1[/* parent */ Block, Block],
    Boolean: Instantiable0[typings.stylus.mod.Stylus.Nodes.Boolean],
    Call: Instantiable2[/* name */ String, /* args */ Expression, Call],
    Charset: Instantiable1[/* val */ String, Charset],
    Comment: Instantiable3[/* str */ String, /* suppress */ Boolean, /* inline */ Boolean, Comment],
    Each: Instantiable0[Each],
    Expression: Instantiable1[/* isList */ Boolean, Expression],
    Extend: Instantiable1[/* selectors */ js.Array[Selector], Extend],
    Function: Instantiable3[/* name */ String, /* params */ Params, /* body */ Block, Function],
    Group: Instantiable0[Group],
    HSLA: TypeofHSLA,
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
    RGBA: TypeofRGBA,
    Return: Instantiable1[/* expr */ Expression, Return],
    Root: Instantiable0[Root],
    Selector: Instantiable1[/* segs */ js.Array[Node], Selector],
    String: Instantiable1[/* val */ String, typings.stylus.mod.Stylus.Nodes.String],
    Ternary: Instantiable3[/* op */ String, /* trueExpr */ Expression, /* falseExpr */ Expression, Ternary],
    UnaryOp: Instantiable2[/* op */ String, /* expr */ Expression, UnaryOp],
    Unit: Instantiable2[/* val */ Double, /* type */ String, Unit],
    `false`: typings.stylus.mod.Stylus.Nodes.Boolean,
    `null`: Null,
    `true`: typings.stylus.mod.Stylus.Nodes.Boolean
  ): NodeStatic = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Atblock = Atblock.asInstanceOf[js.Any], Atrule = Atrule.asInstanceOf[js.Any], BinOp = BinOp.asInstanceOf[js.Any], Block = Block.asInstanceOf[js.Any], Boolean = Boolean.asInstanceOf[js.Any], Call = Call.asInstanceOf[js.Any], Charset = Charset.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Each = Each.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], Extend = Extend.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], HSLA = HSLA.asInstanceOf[js.Any], Ident = Ident.asInstanceOf[js.Any], If = If.asInstanceOf[js.Any], Import = Import.asInstanceOf[js.Any], Keyframes = Keyframes.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], Member = Member.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], Null = Null.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], Params = Params.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], QueryExpr = QueryExpr.asInstanceOf[js.Any], QueryList = QueryList.asInstanceOf[js.Any], RGBA = RGBA.asInstanceOf[js.Any], Return = Return.asInstanceOf[js.Any], Root = Root.asInstanceOf[js.Any], Selector = Selector.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], Ternary = Ternary.asInstanceOf[js.Any], UnaryOp = UnaryOp.asInstanceOf[js.Any], Unit = Unit.asInstanceOf[js.Any])
    __obj.updateDynamic("false")(`false`.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeStatic]
  }
  @scala.inline
  implicit class NodeStaticOps[Self <: NodeStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArguments(value: Instantiable0[Arguments]): Self = this.set("Arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setAtblock(value: Instantiable0[Atblock]): Self = this.set("Atblock", value.asInstanceOf[js.Any])
    @scala.inline
    def setAtrule(value: Instantiable1[/* type */ String, Atrule]): Self = this.set("Atrule", value.asInstanceOf[js.Any])
    @scala.inline
    def setBinOp(value: Instantiable3[/* op */ String, /* left */ Expression, /* right */ Expression, BinOp]): Self = this.set("BinOp", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlock(value: Instantiable1[/* parent */ Block, Block]): Self = this.set("Block", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoolean(value: Instantiable0[typings.stylus.mod.Stylus.Nodes.Boolean]): Self = this.set("Boolean", value.asInstanceOf[js.Any])
    @scala.inline
    def setCall(value: Instantiable2[/* name */ String, /* args */ Expression, Call]): Self = this.set("Call", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharset(value: Instantiable1[/* val */ String, Charset]): Self = this.set("Charset", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: Instantiable3[/* str */ String, /* suppress */ Boolean, /* inline */ Boolean, Comment]): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setEach(value: Instantiable0[Each]): Self = this.set("Each", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpression(value: Instantiable1[/* isList */ Boolean, Expression]): Self = this.set("Expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtend(value: Instantiable1[/* selectors */ js.Array[Selector], Extend]): Self = this.set("Extend", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunction(value: Instantiable3[/* name */ String, /* params */ Params, /* body */ Block, Function]): Self = this.set("Function", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup(value: Instantiable0[Group]): Self = this.set("Group", value.asInstanceOf[js.Any])
    @scala.inline
    def setHSLA(value: TypeofHSLA): Self = this.set("HSLA", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdent(value: Instantiable2[/* name */ String, /* val */ Node, Ident]): Self = this.set("Ident", value.asInstanceOf[js.Any])
    @scala.inline
    def setIf(value: Instantiable2[/* cond */ Expression, /* negate */ Boolean, If]): Self = this.set("If", value.asInstanceOf[js.Any])
    @scala.inline
    def setImport(value: Instantiable1[/* path */ Expression, Import]): Self = this.set("Import", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyframes(value: Instantiable1[/* segs */ js.Array[Node], Keyframes]): Self = this.set("Keyframes", value.asInstanceOf[js.Any])
    @scala.inline
    def setLiteral(value: Instantiable1[/* str */ String, Literal]): Self = this.set("Literal", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedia(value: Instantiable1[/* val */ String, Media]): Self = this.set("Media", value.asInstanceOf[js.Any])
    @scala.inline
    def setMember(value: Instantiable2[/* left */ Node, /* right */ Node, Member]): Self = this.set("Member", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: Instantiable2[/* val */ String, /* prefix */ String, Namespace]): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: Instantiable0[Node]): Self = this.set("Node", value.asInstanceOf[js.Any])
    @scala.inline
    def setNull(value: Instantiable0[Null]): Self = this.set("Null", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: Instantiable0[Object]): Self = this.set("Object", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: Instantiable0[Params]): Self = this.set("Params", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: Instantiable2[/* segs */ js.Array[Node], /* expr */ Expression, Property]): Self = this.set("Property", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: Instantiable0[Query]): Self = this.set("Query", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryExpr(value: Instantiable1[/* segs */ js.Array[Node], QueryExpr]): Self = this.set("QueryExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryList(value: Instantiable0[QueryList]): Self = this.set("QueryList", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGBA(value: TypeofRGBA): Self = this.set("RGBA", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturn(value: Instantiable1[/* expr */ Expression, Return]): Self = this.set("Return", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: Instantiable0[Root]): Self = this.set("Root", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: Instantiable1[/* segs */ js.Array[Node], Selector]): Self = this.set("Selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: Instantiable1[/* val */ String, typings.stylus.mod.Stylus.Nodes.String]): Self = this.set("String", value.asInstanceOf[js.Any])
    @scala.inline
    def setTernary(
      value: Instantiable3[/* op */ String, /* trueExpr */ Expression, /* falseExpr */ Expression, Ternary]
    ): Self = this.set("Ternary", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnaryOp(value: Instantiable2[/* op */ String, /* expr */ Expression, UnaryOp]): Self = this.set("UnaryOp", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnit(value: Instantiable2[/* val */ Double, /* type */ String, Unit]): Self = this.set("Unit", value.asInstanceOf[js.Any])
    @scala.inline
    def setFalse(value: typings.stylus.mod.Stylus.Nodes.Boolean): Self = this.set("false", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrue(value: typings.stylus.mod.Stylus.Nodes.Boolean): Self = this.set("true", value.asInstanceOf[js.Any])
  }
  
}

