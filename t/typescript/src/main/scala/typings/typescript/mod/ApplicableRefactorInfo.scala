package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of one or more available refactoring actions, grouped under a parent refactoring.
  */
@js.native
trait ApplicableRefactorInfo extends js.Object {
  
  var actions: js.Array[RefactorActionInfo] = js.native
  
  /**
    * A description of this refactoring category to show to the user.
    * If the refactoring gets inlined (see below), this text will not be visible.
    */
  var description: java.lang.String = js.native
  
  /**
    * Inlineable refactorings can have their actions hoisted out to the top level
    * of a context menu. Non-inlineanable refactorings should always be shown inside
    * their parent grouping.
    *
    * If not specified, this value is assumed to be 'true'
    */
  var inlineable: js.UndefOr[Boolean] = js.native
  
  /**
    * The programmatic name of the refactoring
    */
  var name: java.lang.String = js.native
}
object ApplicableRefactorInfo {
  
  @scala.inline
  def apply(actions: js.Array[RefactorActionInfo], description: java.lang.String, name: java.lang.String): ApplicableRefactorInfo = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicableRefactorInfo]
  }
  
  @scala.inline
  implicit class ApplicableRefactorInfoOps[Self <: ApplicableRefactorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionsVarargs(value: RefactorActionInfo*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[RefactorActionInfo]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: java.lang.String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineable(value: Boolean): Self = this.set("inlineable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineable: Self = this.set("inlineable", js.undefined)
  }
}
