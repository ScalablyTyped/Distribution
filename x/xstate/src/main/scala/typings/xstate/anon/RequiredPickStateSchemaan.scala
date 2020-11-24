package typings.xstate.anon

import org.scalablytyped.runtime.StringDictionary
import typings.xstate.typesMod.StateSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<xstate.xstate/lib/types.StateSchema<any>, 'states'>> */
@js.native
trait RequiredPickStateSchemaan extends js.Object {
  
  var states: StringDictionary[StateSchema[_]] = js.native
}
object RequiredPickStateSchemaan {
  
  @scala.inline
  def apply(states: StringDictionary[StateSchema[_]]): RequiredPickStateSchemaan = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickStateSchemaan]
  }
  
  @scala.inline
  implicit class RequiredPickStateSchemaanOps[Self <: RequiredPickStateSchemaan] (val x: Self) extends AnyVal {
    
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
    def setStates(value: StringDictionary[StateSchema[_]]): Self = this.set("states", value.asInstanceOf[js.Any])
  }
}
