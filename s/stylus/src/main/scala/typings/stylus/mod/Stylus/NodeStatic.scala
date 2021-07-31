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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeStatic extends StObject {
  
  var Arguments: Instantiable0[typings.stylus.mod.Stylus.Nodes.Arguments]
  
  var Atblock: Instantiable0[typings.stylus.mod.Stylus.Nodes.Atblock]
  
  var Atrule: Instantiable1[/* type */ String, typings.stylus.mod.Stylus.Nodes.Atrule]
  
  var BinOp: Instantiable3[
    /* op */ String, 
    /* left */ Expression, 
    /* right */ Expression, 
    typings.stylus.mod.Stylus.Nodes.BinOp
  ]
  
  var Block: Instantiable1[
    /* parent */ typings.stylus.mod.Stylus.Nodes.Block, 
    typings.stylus.mod.Stylus.Nodes.Block
  ]
  
  var Boolean: Instantiable0[typings.stylus.mod.Stylus.Nodes.Boolean]
  
  var Call: Instantiable2[/* name */ String, /* args */ Expression, typings.stylus.mod.Stylus.Nodes.Call]
  
  var Charset: Instantiable1[/* val */ String, typings.stylus.mod.Stylus.Nodes.Charset]
  
  var Comment: Instantiable3[
    /* str */ String, 
    /* suppress */ Boolean, 
    /* inline */ Boolean, 
    typings.stylus.mod.Stylus.Nodes.Comment
  ]
  
  var Each: Instantiable0[typings.stylus.mod.Stylus.Nodes.Each]
  
  var Expression: Instantiable1[/* isList */ Boolean, typings.stylus.mod.Stylus.Nodes.Expression]
  
  var Extend: Instantiable1[/* selectors */ js.Array[Selector], typings.stylus.mod.Stylus.Nodes.Extend]
  
  var Function: Instantiable3[
    /* name */ String, 
    /* params */ Params, 
    /* body */ Block, 
    typings.stylus.mod.Stylus.Nodes.Function
  ]
  
  var Group: Instantiable0[typings.stylus.mod.Stylus.Nodes.Group]
  
  var HSLA: TypeofHSLA
  
  var Ident: Instantiable2[/* name */ String, /* val */ Node, typings.stylus.mod.Stylus.Nodes.Ident]
  
  var If: Instantiable2[/* cond */ Expression, /* negate */ Boolean, typings.stylus.mod.Stylus.Nodes.If]
  
  var Import: Instantiable1[/* path */ Expression, typings.stylus.mod.Stylus.Nodes.Import]
  
  var Keyframes: Instantiable1[/* segs */ js.Array[Node], typings.stylus.mod.Stylus.Nodes.Keyframes]
  
  var Literal: Instantiable1[/* str */ String, typings.stylus.mod.Stylus.Nodes.Literal]
  
  var Media: Instantiable1[/* val */ String, typings.stylus.mod.Stylus.Nodes.Media]
  
  var Member: Instantiable2[/* left */ Node, /* right */ Node, typings.stylus.mod.Stylus.Nodes.Member]
  
  var Namespace: Instantiable2[/* val */ String, /* prefix */ String, typings.stylus.mod.Stylus.Nodes.Namespace]
  
  var Node: Instantiable0[typings.stylus.mod.Stylus.Nodes.Node]
  
  var Null: Instantiable0[typings.stylus.mod.Stylus.Nodes.Null]
  
  var Object: Instantiable0[typings.stylus.mod.Stylus.Nodes.Object]
  
  var Params: Instantiable0[typings.stylus.mod.Stylus.Nodes.Params]
  
  var Property: Instantiable2[
    /* segs */ js.Array[Node], 
    /* expr */ Expression, 
    typings.stylus.mod.Stylus.Nodes.Property
  ]
  
  var Query: Instantiable0[typings.stylus.mod.Stylus.Nodes.Query]
  
  var QueryExpr: Instantiable1[/* segs */ js.Array[Node], typings.stylus.mod.Stylus.Nodes.QueryExpr]
  
  var QueryList: Instantiable0[typings.stylus.mod.Stylus.Nodes.QueryList]
  
  var RGBA: TypeofRGBA
  
  var Return: Instantiable1[/* expr */ Expression, typings.stylus.mod.Stylus.Nodes.Return]
  
  var Root: Instantiable0[typings.stylus.mod.Stylus.Nodes.Root]
  
  var Selector: Instantiable1[/* segs */ js.Array[Node], typings.stylus.mod.Stylus.Nodes.Selector]
  
  var String: Instantiable1[/* val */ java.lang.String, typings.stylus.mod.Stylus.Nodes.String]
  
  var Ternary: Instantiable3[
    /* op */ String, 
    /* trueExpr */ Expression, 
    /* falseExpr */ Expression, 
    typings.stylus.mod.Stylus.Nodes.Ternary
  ]
  
  var UnaryOp: Instantiable2[/* op */ String, /* expr */ Expression, typings.stylus.mod.Stylus.Nodes.UnaryOp]
  
  var Unit: Instantiable2[/* val */ Double, /* type */ String, typings.stylus.mod.Stylus.Nodes.Unit]
  
  var `false`: typings.stylus.mod.Stylus.Nodes.Boolean
  
  var `null`: Null
  
  var `true`: typings.stylus.mod.Stylus.Nodes.Boolean
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
  implicit class NodeStaticMutableBuilder[Self <: NodeStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: Instantiable0[Arguments]): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtblock(value: Instantiable0[Atblock]): Self = StObject.set(x, "Atblock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtrule(value: Instantiable1[/* type */ String, Atrule]): Self = StObject.set(x, "Atrule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinOp(value: Instantiable3[/* op */ String, /* left */ Expression, /* right */ Expression, BinOp]): Self = StObject.set(x, "BinOp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlock(value: Instantiable1[/* parent */ Block, Block]): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolean(value: Instantiable0[typings.stylus.mod.Stylus.Nodes.Boolean]): Self = StObject.set(x, "Boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCall(value: Instantiable2[/* name */ String, /* args */ Expression, Call]): Self = StObject.set(x, "Call", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharset(value: Instantiable1[/* val */ String, Charset]): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: Instantiable3[/* str */ String, /* suppress */ Boolean, /* inline */ Boolean, Comment]): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEach(value: Instantiable0[Each]): Self = StObject.set(x, "Each", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: Instantiable1[/* isList */ Boolean, Expression]): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtend(value: Instantiable1[/* selectors */ js.Array[Selector], Extend]): Self = StObject.set(x, "Extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalse(value: typings.stylus.mod.Stylus.Nodes.Boolean): Self = StObject.set(x, "false", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(value: Instantiable3[/* name */ String, /* params */ Params, /* body */ Block, Function]): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: Instantiable0[Group]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHSLA(value: TypeofHSLA): Self = StObject.set(x, "HSLA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdent(value: Instantiable2[/* name */ String, /* val */ Node, Ident]): Self = StObject.set(x, "Ident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIf(value: Instantiable2[/* cond */ Expression, /* negate */ Boolean, If]): Self = StObject.set(x, "If", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImport(value: Instantiable1[/* path */ Expression, Import]): Self = StObject.set(x, "Import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyframes(value: Instantiable1[/* segs */ js.Array[Node], Keyframes]): Self = StObject.set(x, "Keyframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteral(value: Instantiable1[/* str */ String, Literal]): Self = StObject.set(x, "Literal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: Instantiable1[/* val */ String, Media]): Self = StObject.set(x, "Media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMember(value: Instantiable2[/* left */ Node, /* right */ Node, Member]): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Instantiable2[/* val */ String, /* prefix */ String, Namespace]): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Instantiable0[Node]): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNull(value: Instantiable0[Null]): Self = StObject.set(x, "Null", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Instantiable0[Object]): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: Instantiable0[Params]): Self = StObject.set(x, "Params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Instantiable2[/* segs */ js.Array[Node], /* expr */ Expression, Property]): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: Instantiable0[Query]): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryExpr(value: Instantiable1[/* segs */ js.Array[Node], QueryExpr]): Self = StObject.set(x, "QueryExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryList(value: Instantiable0[QueryList]): Self = StObject.set(x, "QueryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGBA(value: TypeofRGBA): Self = StObject.set(x, "RGBA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn(value: Instantiable1[/* expr */ Expression, Return]): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: Instantiable0[Root]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: Instantiable1[/* segs */ js.Array[Node], Selector]): Self = StObject.set(x, "Selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: Instantiable1[/* val */ String, typings.stylus.mod.Stylus.Nodes.String]): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTernary(
      value: Instantiable3[/* op */ String, /* trueExpr */ Expression, /* falseExpr */ Expression, Ternary]
    ): Self = StObject.set(x, "Ternary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrue(value: typings.stylus.mod.Stylus.Nodes.Boolean): Self = StObject.set(x, "true", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnaryOp(value: Instantiable2[/* op */ String, /* expr */ Expression, UnaryOp]): Self = StObject.set(x, "UnaryOp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: Instantiable2[/* val */ Double, /* type */ String, Unit]): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
  }
}
