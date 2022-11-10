package typings.testingLibraryUserEvent

import typings.std.HTMLTextAreaElement
import typings.testingLibraryUserEvent.anon.HTMLInputElementtypeedita
import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsEditIsEditableMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/edit/isEditable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait editableInputTypes extends StObject
  @JSImport("@testing-library/user-event/dist/types/utils/edit/isEditable", "editableInputTypes")
  @js.native
  object editableInputTypes extends StObject {
    
    @js.native
    sealed trait date
      extends StObject
         with editableInputTypes
    
    @js.native
    sealed trait `datetime-local`
      extends StObject
         with editableInputTypes
    
    @js.native
    sealed trait email
      extends StObject
         with editableInputTypes
    
    @js.native
    sealed trait month
      extends StObject
         with editableInputTypes
    
    @js.native
    sealed trait number
      extends StObject
         with editableInputTypes
    
    @js.native
    sealed trait password
      extends StObject
         with editableInputTypes
    
    @js.native
    sealed trait search
      extends StObject
         with editableInputTypes
    
    @js.native
    sealed trait tel
      extends StObject
         with editableInputTypes
    
    @js.native
    sealed trait text
      extends StObject
         with editableInputTypes
    
    @js.native
    sealed trait time
      extends StObject
         with editableInputTypes
    
    @js.native
    sealed trait url
      extends StObject
         with editableInputTypes
    
    @js.native
    sealed trait week
      extends StObject
         with editableInputTypes
  }
  
  inline def isEditable(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditable")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEditableInputOrTextArea(element: Element): /* is @testing-library/user-event.@testing-library/user-event/dist/types/utils/edit/isEditable.EditableInputOrTextarea */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditableInputOrTextArea")(element.asInstanceOf[js.Any]).asInstanceOf[/* is @testing-library/user-event.@testing-library/user-event/dist/types/utils/edit/isEditable.EditableInputOrTextarea */ Boolean]
  
  type EditableInputOrTextarea = HTMLTextAreaElement | HTMLInputElementtypeedita
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends (x : any): x is infer R ? R : never
    }}}
    */
  @js.native
  trait GuardedType[T] extends StObject
}
