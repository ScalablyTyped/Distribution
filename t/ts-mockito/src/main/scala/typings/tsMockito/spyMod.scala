package typings.tsMockito

import typings.tsMockito.mockMod.Mocker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spyMod {
  
  @JSImport("ts-mockito/lib/Spy", "Spy")
  @js.native
  class Spy protected () extends Mocker {
    def this(instance: js.Any) = this()
    
    var realMethods: js.Any = js.native
  }
}
