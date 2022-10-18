package typings.styledComponents

import typings.styledComponents.nativeDistTypesMod.Stringifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistModelsKeyframesMod {
  
  @JSImport("styled-components/native/dist/models/Keyframes", JSImport.Default)
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
       with typings.styledComponents.nativeDistTypesMod.Keyframes {
    
    def getName(): String = js.native
    def getName(stylisInstance: Stringifier): String = js.native
    
    def inject(styleSheet: typings.styledComponents.nativeDistSheetMod.default): Unit = js.native
    def inject(styleSheet: typings.styledComponents.nativeDistSheetMod.default, stylisInstance: Stringifier): Unit = js.native
  }
}
