package typings.victory.anon

import typings.victory.mod.VictoryStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<victory.victory.VictoryStyleInterface, 'parent'> */
trait PickVictoryStyleInterface extends StObject {
  
  var parent: js.UndefOr[VictoryStyleObject] = js.undefined
}
object PickVictoryStyleInterface {
  
  @scala.inline
  def apply(): PickVictoryStyleInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickVictoryStyleInterface]
  }
  
  @scala.inline
  implicit class PickVictoryStyleInterfaceMutableBuilder[Self <: PickVictoryStyleInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: VictoryStyleObject): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
