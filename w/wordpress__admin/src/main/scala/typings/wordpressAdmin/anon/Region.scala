package typings.wordpressAdmin.anon

import typings.wordpressAdmin.componentsMediaViewsMod.State
import typings.wordpressAdmin.componentsMediaViewsMod.StateMachine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  var Region: typings.wordpressAdmin.componentsMediaViewsMod.Region
  
  var State: typings.wordpressAdmin.componentsMediaViewsMod.State
  
  def StateMachine(): Extend
  @JSName("StateMachine")
  var StateMachine_Original: StateMachine
}
object Region {
  
  inline def apply(
    Region: typings.wordpressAdmin.componentsMediaViewsMod.Region,
    State: State,
    StateMachine: StateMachine
  ): Region = {
    val __obj = js.Dynamic.literal(Region = Region.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], StateMachine = StateMachine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  extension [Self <: Region](x: Self) {
    
    inline def setRegion(value: typings.wordpressAdmin.componentsMediaViewsMod.Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateMachine(value: StateMachine): Self = StObject.set(x, "StateMachine", value.asInstanceOf[js.Any])
  }
}
