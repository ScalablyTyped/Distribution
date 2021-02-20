package typings.wordpressComponents.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{}> & std.Readonly<react.anon.Children> */
@js.native
trait ReadonlyReadonlyChildren extends StObject {
  
  val children: js.UndefOr[ReactNode] = js.native
}
object ReadonlyReadonlyChildren {
  
  @scala.inline
  def apply(): ReadonlyReadonlyChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyReadonlyChildren]
  }
  
  @scala.inline
  implicit class ReadonlyReadonlyChildrenMutableBuilder[Self <: ReadonlyReadonlyChildren] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
