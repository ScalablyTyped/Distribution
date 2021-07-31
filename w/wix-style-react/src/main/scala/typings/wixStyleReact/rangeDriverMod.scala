package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.inputDriverMod.InputDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeDriverMod {
  
  @js.native
  trait RangeDriver
    extends StObject
       with InputDriver {
    
    def getInput(): HTMLElement = js.native
    
    def getLabel(): HTMLElement = js.native
    
    def hasInput(): Boolean = js.native
    
    def hasLabel(): Boolean = js.native
  }
}
