package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLScalarTypeConfig extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var parseLiteral: js.UndefOr[js.Function1[/* valueAST */ Value, _]] = js.native
  
  var parseValue: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  def serialize(value: js.Any): js.Any = js.native
}
object GraphQLScalarTypeConfig {
  
  @scala.inline
  def apply(name: String, serialize: js.Any => js.Any): GraphQLScalarTypeConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[GraphQLScalarTypeConfig]
  }
  
  @scala.inline
  implicit class GraphQLScalarTypeConfigOps[Self <: GraphQLScalarTypeConfig] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialize(value: js.Any => js.Any): Self = this.set("serialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setParseLiteral(value: /* valueAST */ Value => _): Self = this.set("parseLiteral", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParseLiteral: Self = this.set("parseLiteral", js.undefined)
    
    @scala.inline
    def setParseValue(value: /* value */ js.Any => _): Self = this.set("parseValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParseValue: Self = this.set("parseValue", js.undefined)
  }
}
