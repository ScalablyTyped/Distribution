package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// utilities/Typeinfo.js
@js.native
trait TypeInfo extends js.Object {
  
  def enter(node: Node): Unit = js.native
  
  def getArgument(): GraphQLArgument = js.native
  
  def getDirective(): GraphQLDirective = js.native
  
  def getFieldDef(): GraphQLFieldDefinition = js.native
  
  def getInputType(): GraphQLInputType = js.native
  
  def getParentType(): GraphQLCompositeType = js.native
  
  def getType(): GraphQLOutputType = js.native
  
  def leave(node: Node): Unit = js.native
}
object TypeInfo {
  
  @scala.inline
  def apply(
    enter: Node => Unit,
    getArgument: () => GraphQLArgument,
    getDirective: () => GraphQLDirective,
    getFieldDef: () => GraphQLFieldDefinition,
    getInputType: () => GraphQLInputType,
    getParentType: () => GraphQLCompositeType,
    getType: () => GraphQLOutputType,
    leave: Node => Unit
  ): TypeInfo = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), getArgument = js.Any.fromFunction0(getArgument), getDirective = js.Any.fromFunction0(getDirective), getFieldDef = js.Any.fromFunction0(getFieldDef), getInputType = js.Any.fromFunction0(getInputType), getParentType = js.Any.fromFunction0(getParentType), getType = js.Any.fromFunction0(getType), leave = js.Any.fromFunction1(leave))
    __obj.asInstanceOf[TypeInfo]
  }
  
  @scala.inline
  implicit class TypeInfoOps[Self <: TypeInfo] (val x: Self) extends AnyVal {
    
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
    def setEnter(value: Node => Unit): Self = this.set("enter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetArgument(value: () => GraphQLArgument): Self = this.set("getArgument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDirective(value: () => GraphQLDirective): Self = this.set("getDirective", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFieldDef(value: () => GraphQLFieldDefinition): Self = this.set("getFieldDef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputType(value: () => GraphQLInputType): Self = this.set("getInputType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParentType(value: () => GraphQLCompositeType): Self = this.set("getParentType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => GraphQLOutputType): Self = this.set("getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeave(value: Node => Unit): Self = this.set("leave", js.Any.fromFunction1(value))
  }
}
