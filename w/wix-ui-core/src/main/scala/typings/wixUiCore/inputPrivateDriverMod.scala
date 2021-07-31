package typings.wixUiCore

import typings.std.ChildNode
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Node
import typings.wixUiCore.inputInputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputPrivateDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/input/Input.private.driver", "InputDriver")
  @js.native
  class InputDriver protected () extends StObject {
    def this(root: HTMLElement, instance: Input) = this()
    
    def getAttribute(attr: String): String = js.native
    
    def input: HTMLInputElement = js.native
    
    var instance: Input = js.native
    
    def prefix: Node = js.native
    
    var root: HTMLElement = js.native
    
    def suffix: ChildNode = js.native
  }
}
