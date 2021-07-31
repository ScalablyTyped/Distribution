package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of one or more available refactoring actions, grouped under a parent refactoring.
  */
trait ApplicableRefactorInfo extends StObject {
  
  var actions: js.Array[RefactorActionInfo]
  
  /**
    * A description of this refactoring category to show to the user.
    * If the refactoring gets inlined (see below), this text will not be visible.
    */
  var description: java.lang.String
  
  /**
    * Inlineable refactorings can have their actions hoisted out to the top level
    * of a context menu. Non-inlineanable refactorings should always be shown inside
    * their parent grouping.
    *
    * If not specified, this value is assumed to be 'true'
    */
  var inlineable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The programmatic name of the refactoring
    */
  var name: java.lang.String
}
object ApplicableRefactorInfo {
  
  @scala.inline
  def apply(actions: js.Array[RefactorActionInfo], description: java.lang.String, name: java.lang.String): ApplicableRefactorInfo = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicableRefactorInfo]
  }
  
  @scala.inline
  implicit class ApplicableRefactorInfoMutableBuilder[Self <: ApplicableRefactorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[RefactorActionInfo]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: RefactorActionInfo*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: java.lang.String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineable(value: Boolean): Self = StObject.set(x, "inlineable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineableUndefined: Self = StObject.set(x, "inlineable", js.undefined)
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
