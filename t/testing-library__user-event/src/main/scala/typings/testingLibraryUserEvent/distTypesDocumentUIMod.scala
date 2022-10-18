package typings.testingLibraryUserEvent

import typings.std.HTMLTextAreaElement
import typings.std.Number
import typings.testingLibraryUserEvent.anon.AnchorOffset
import typings.testingLibraryUserEvent.distTypesUtilsEditSetFilesMod.global.HTMLInputElement
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.modify
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDocumentUIMod {
  
  @JSImport("@testing-library/user-event/dist/types/document/UI", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearInitialValue(element: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInitialValue")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearInitialValue(element: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInitialValue")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getInitialValue(element: HTMLTextAreaElement): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialValue")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def getInitialValue(element: HTMLInputElement): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialValue")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getUISelection(element: HTMLTextAreaElement): UISelectionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("getUISelection")(element.asInstanceOf[js.Any]).asInstanceOf[UISelectionRange]
  inline def getUISelection(element: HTMLInputElement): UISelectionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("getUISelection")(element.asInstanceOf[js.Any]).asInstanceOf[UISelectionRange]
  
  inline def getUIValue(element: HTMLTextAreaElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUIValue")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getUIValue(element: HTMLInputElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUIValue")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hasUISelection(element: HTMLTextAreaElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasUISelection")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasUISelection(element: HTMLInputElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasUISelection")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUISelectionStart(): /* is @testing-library/user-event.@testing-library/user-event/dist/types/document/UI.UISelectionStart */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUISelectionStart")().asInstanceOf[/* is @testing-library/user-event.@testing-library/user-event/dist/types/document/UI.UISelectionStart */ Boolean]
  inline def isUISelectionStart(start: Double): /* is @testing-library/user-event.@testing-library/user-event/dist/types/document/UI.UISelectionStart */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUISelectionStart")(start.asInstanceOf[js.Any]).asInstanceOf[/* is @testing-library/user-event.@testing-library/user-event/dist/types/document/UI.UISelectionStart */ Boolean]
  inline def isUISelectionStart(start: UISelectionStart): /* is @testing-library/user-event.@testing-library/user-event/dist/types/document/UI.UISelectionStart */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUISelectionStart")(start.asInstanceOf[js.Any]).asInstanceOf[/* is @testing-library/user-event.@testing-library/user-event/dist/types/document/UI.UISelectionStart */ Boolean]
  
  inline def isUIValue(value: String): /* is @testing-library/user-event.@testing-library/user-event/dist/types/document/UI.UIValueString */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUIValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @testing-library/user-event.@testing-library/user-event/dist/types/document/UI.UIValueString */ Boolean]
  inline def isUIValue(value: UIValueString): /* is @testing-library/user-event.@testing-library/user-event/dist/types/document/UI.UIValueString */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUIValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @testing-library/user-event.@testing-library/user-event/dist/types/document/UI.UIValueString */ Boolean]
  
  inline def setUISelection(element: HTMLTextAreaElement, hasFocusOffsetParamAnchorOffsetParam: AnchorOffset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUISelection")(element.asInstanceOf[js.Any], hasFocusOffsetParamAnchorOffsetParam.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUISelection(
    element: HTMLTextAreaElement,
    hasFocusOffsetParamAnchorOffsetParam: AnchorOffset,
    mode: replace | modify
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUISelection")(element.asInstanceOf[js.Any], hasFocusOffsetParamAnchorOffsetParam.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUISelection(element: HTMLInputElement, hasFocusOffsetParamAnchorOffsetParam: AnchorOffset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUISelection")(element.asInstanceOf[js.Any], hasFocusOffsetParamAnchorOffsetParam.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUISelection(
    element: HTMLInputElement,
    hasFocusOffsetParamAnchorOffsetParam: AnchorOffset,
    mode: replace | modify
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUISelection")(element.asInstanceOf[js.Any], hasFocusOffsetParamAnchorOffsetParam.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUISelectionClean(element: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUISelectionClean")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setUISelectionClean(element: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUISelectionClean")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUISelectionRaw(element: HTMLTextAreaElement, selection: UISelection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUISelectionRaw")(element.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUISelectionRaw(element: HTMLInputElement, selection: UISelection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUISelectionRaw")(element.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUIValue(element: HTMLTextAreaElement, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUIValue")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUIValue(element: HTMLInputElement, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUIValue")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUIValueClean(element: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUIValueClean")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setUIValueClean(element: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUIValueClean")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait UISelection extends StObject {
    
    var anchorOffset: Double
    
    var focusOffset: Double
  }
  object UISelection {
    
    inline def apply(anchorOffset: Double, focusOffset: Double): UISelection = {
      val __obj = js.Dynamic.literal(anchorOffset = anchorOffset.asInstanceOf[js.Any], focusOffset = focusOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[UISelection]
    }
    
    extension [Self <: UISelection](x: Self) {
      
      inline def setAnchorOffset(value: Double): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
      
      inline def setFocusOffset(value: Double): Self = StObject.set(x, "focusOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait UISelectionRange
    extends StObject
       with UISelection {
    
    var endOffset: Double
    
    var startOffset: Double
  }
  object UISelectionRange {
    
    inline def apply(anchorOffset: Double, endOffset: Double, focusOffset: Double, startOffset: Double): UISelectionRange = {
      val __obj = js.Dynamic.literal(anchorOffset = anchorOffset.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], focusOffset = focusOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[UISelectionRange]
    }
    
    extension [Self <: UISelectionRange](x: Self) {
      
      inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
      
      inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UISelectionStart
    extends StObject
       with Number
  
  @js.native
  trait UIValueString
    extends StObject
       with typings.std.String
  
  object global {
    
    @js.native
    trait Element extends StObject
  }
}
