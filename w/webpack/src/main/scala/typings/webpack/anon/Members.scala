package typings.webpack.anon

import typings.estree.mod.ArrayExpression
import typings.estree.mod.ArrowFunctionExpression
import typings.estree.mod.AssignmentExpression
import typings.estree.mod.AwaitExpression
import typings.estree.mod.BigIntLiteral
import typings.estree.mod.BinaryExpression
import typings.estree.mod.ChainExpression
import typings.estree.mod.ClassExpression
import typings.estree.mod.ConditionalExpression
import typings.estree.mod.FunctionExpression
import typings.estree.mod.Identifier
import typings.estree.mod.ImportExpression
import typings.estree.mod.LogicalExpression
import typings.estree.mod.MemberExpression
import typings.estree.mod.MetaProperty
import typings.estree.mod.NewExpression
import typings.estree.mod.ObjectExpression
import typings.estree.mod.RegExpLiteral
import typings.estree.mod.SequenceExpression
import typings.estree.mod.SimpleCallExpression
import typings.estree.mod.SimpleLiteral
import typings.estree.mod.Super
import typings.estree.mod.TaggedTemplateExpression
import typings.estree.mod.TemplateLiteral
import typings.estree.mod.ThisExpression
import typings.estree.mod.UnaryExpression
import typings.estree.mod.UpdateExpression
import typings.estree.mod.YieldExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Members extends StObject {
  
  var members: js.Array[String]
  
  var membersOptionals: js.Array[Boolean]
  
  var `object`: UnaryExpression | ThisExpression | ArrayExpression | ObjectExpression | FunctionExpression | ArrowFunctionExpression | YieldExpression | SimpleLiteral | RegExpLiteral | BigIntLiteral | UpdateExpression | BinaryExpression | AssignmentExpression | LogicalExpression | MemberExpression | ConditionalExpression | SimpleCallExpression | NewExpression | SequenceExpression | TemplateLiteral | TaggedTemplateExpression | ClassExpression | MetaProperty | Identifier | AwaitExpression | ImportExpression | ChainExpression | Super
}
object Members {
  
  inline def apply(
    members: js.Array[String],
    membersOptionals: js.Array[Boolean],
    `object`: UnaryExpression | ThisExpression | ArrayExpression | ObjectExpression | FunctionExpression | ArrowFunctionExpression | YieldExpression | SimpleLiteral | RegExpLiteral | BigIntLiteral | UpdateExpression | BinaryExpression | AssignmentExpression | LogicalExpression | MemberExpression | ConditionalExpression | SimpleCallExpression | NewExpression | SequenceExpression | TemplateLiteral | TaggedTemplateExpression | ClassExpression | MetaProperty | Identifier | AwaitExpression | ImportExpression | ChainExpression | Super
  ): Members = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], membersOptionals = membersOptionals.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Members]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Members] (val x: Self) extends AnyVal {
    
    inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersOptionals(value: js.Array[Boolean]): Self = StObject.set(x, "membersOptionals", value.asInstanceOf[js.Any])
    
    inline def setMembersOptionalsVarargs(value: Boolean*): Self = StObject.set(x, "membersOptionals", js.Array(value*))
    
    inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setObject(
      value: UnaryExpression | ThisExpression | ArrayExpression | ObjectExpression | FunctionExpression | ArrowFunctionExpression | YieldExpression | SimpleLiteral | RegExpLiteral | BigIntLiteral | UpdateExpression | BinaryExpression | AssignmentExpression | LogicalExpression | MemberExpression | ConditionalExpression | SimpleCallExpression | NewExpression | SequenceExpression | TemplateLiteral | TaggedTemplateExpression | ClassExpression | MetaProperty | Identifier | AwaitExpression | ImportExpression | ChainExpression | Super
    ): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
