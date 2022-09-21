package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.anon.ConsumedLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readNextDescriptorMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/keyDef/readNextDescriptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readNextDescriptor(text: String, context: Context): ConsumedLength = (^.asInstanceOf[js.Dynamic].applyDynamic("readNextDescriptor")(text.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ConsumedLength]
  
  /* Rewritten from type alias, can be one of: 
    - typings.testingLibraryUserEvent.testingLibraryUserEventStrings.pointer
    - typings.testingLibraryUserEvent.testingLibraryUserEventStrings.keyboard
  */
  trait Context extends StObject
  object Context {
    
    inline def keyboard: typings.testingLibraryUserEvent.testingLibraryUserEventStrings.keyboard = "keyboard".asInstanceOf[typings.testingLibraryUserEvent.testingLibraryUserEventStrings.keyboard]
    
    inline def pointer: typings.testingLibraryUserEvent.testingLibraryUserEventStrings.pointer = "pointer".asInstanceOf[typings.testingLibraryUserEvent.testingLibraryUserEventStrings.pointer]
  }
}
