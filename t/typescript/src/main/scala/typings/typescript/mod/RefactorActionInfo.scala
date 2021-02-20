package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single refactoring action - for example, the "Extract Method..." refactor might
  * offer several actions, each corresponding to a surround class or closure to extract into.
  */
@js.native
trait RefactorActionInfo extends StObject {
  
  /**
    * A description of this refactoring action to show to the user.
    * If the parent refactoring is inlined away, this will be the only text shown,
    * so this description should make sense by itself if the parent is inlineable=true
    */
  var description: java.lang.String = js.native
  
  /**
    * The programmatic name of the refactoring action
    */
  var name: java.lang.String = js.native
  
  /**
    * A message to show to the user if the refactoring cannot be applied in
    * the current context.
    */
  var notApplicableReason: js.UndefOr[java.lang.String] = js.native
}
object RefactorActionInfo {
  
  @scala.inline
  def apply(description: java.lang.String, name: java.lang.String): RefactorActionInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefactorActionInfo]
  }
  
  @scala.inline
  implicit class RefactorActionInfoMutableBuilder[Self <: RefactorActionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: java.lang.String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotApplicableReason(value: java.lang.String): Self = StObject.set(x, "notApplicableReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotApplicableReasonUndefined: Self = StObject.set(x, "notApplicableReason", js.undefined)
  }
}
