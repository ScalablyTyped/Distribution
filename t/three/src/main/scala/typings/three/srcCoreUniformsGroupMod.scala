package typings.three

import typings.three.srcConstantsMod.Usage
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreEventDispatcherMod.EventDispatcher
import typings.three.srcCoreUniformMod.Uniform
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreUniformsGroupMod {
  
  @JSImport("three/src/core/UniformsGroup", "UniformsGroup")
  @js.native
  open class UniformsGroup () extends EventDispatcher[Event] {
    
    def add(uniform: Uniform[Any]): this.type = js.native
    
    def copy(source: UniformsGroup): this.type = js.native
    
    def dispose(): this.type = js.native
    
    var id: Double = js.native
    
    val isUniformsGroup: `true` = js.native
    
    def remove(uniform: Uniform[Any]): this.type = js.native
    
    def setName(name: String): this.type = js.native
    
    def setUsage(value: Usage): this.type = js.native
    
    var uniforms: js.Array[Uniform[Any]] = js.native
    
    var usage: Usage = js.native
  }
}
