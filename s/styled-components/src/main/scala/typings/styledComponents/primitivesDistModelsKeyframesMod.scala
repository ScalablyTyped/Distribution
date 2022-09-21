package typings.styledComponents

import typings.styledComponents.primitivesDistTypesMod.Stringifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivesDistModelsKeyframesMod {
  
  @JSImport("styled-components/primitives/dist/models/Keyframes", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Keyframes {
    def this(name: String, rules: String) = this()
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var rules: String = js.native
  }
  
  @js.native
  trait Keyframes
    extends StObject
       with typings.styledComponents.primitivesDistTypesMod.Keyframes {
    
    def getName(): String = js.native
    def getName(stylisInstance: Stringifier): String = js.native
    
    def inject(styleSheet: typings.styledComponents.primitivesDistSheetMod.default): Unit = js.native
    def inject(styleSheet: typings.styledComponents.primitivesDistSheetMod.default, stylisInstance: Stringifier): Unit = js.native
  }
}
