package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  selected :boolean}> */
trait Partialselectedboolean extends StObject {
  
  var selected: js.UndefOr[Boolean] = js.undefined
}
object Partialselectedboolean {
  
  @scala.inline
  def apply(): Partialselectedboolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialselectedboolean]
  }
  
  @scala.inline
  implicit class PartialselectedbooleanMutableBuilder[Self <: Partialselectedboolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
