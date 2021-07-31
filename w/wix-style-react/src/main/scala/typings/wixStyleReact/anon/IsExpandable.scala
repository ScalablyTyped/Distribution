package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsExpandable extends StObject {
  
  def isCollapsed(): js.Promise[Boolean]
  
  def isExpandable(): js.Promise[Boolean]
}
object IsExpandable {
  
  @scala.inline
  def apply(isCollapsed: () => js.Promise[Boolean], isExpandable: () => js.Promise[Boolean]): IsExpandable = {
    val __obj = js.Dynamic.literal(isCollapsed = js.Any.fromFunction0(isCollapsed), isExpandable = js.Any.fromFunction0(isExpandable))
    __obj.asInstanceOf[IsExpandable]
  }
  
  @scala.inline
  implicit class IsExpandableMutableBuilder[Self <: IsExpandable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCollapsed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCollapsed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsExpandable(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isExpandable", js.Any.fromFunction0(value))
  }
}
