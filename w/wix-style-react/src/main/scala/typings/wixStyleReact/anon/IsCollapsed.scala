package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsCollapsed extends StObject {
  
  def isCollapsed(): Boolean
  
  def isExpandable(): Boolean
}
object IsCollapsed {
  
  @scala.inline
  def apply(isCollapsed: () => Boolean, isExpandable: () => Boolean): IsCollapsed = {
    val __obj = js.Dynamic.literal(isCollapsed = js.Any.fromFunction0(isCollapsed), isExpandable = js.Any.fromFunction0(isExpandable))
    __obj.asInstanceOf[IsCollapsed]
  }
  
  @scala.inline
  implicit class IsCollapsedMutableBuilder[Self <: IsCollapsed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCollapsed(value: () => Boolean): Self = StObject.set(x, "isCollapsed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsExpandable(value: () => Boolean): Self = StObject.set(x, "isExpandable", js.Any.fromFunction0(value))
  }
}
