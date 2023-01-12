package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.distTypesDocumentPrepareDocumentMod.global.Node
import typings.testingLibraryUserEvent.distTypesEventTypesMod.PointerCoords
import typings.testingLibraryUserEvent.distTypesSystemPointerSharedMod.pointerKey
import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPointerMod {
  
  @JSImport("@testing-library/user-event/dist/types/pointer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pointer(input: PointerInput): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointer")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.testingLibraryUserEvent.distTypesPointerMod.PointerPressAction
    - typings.testingLibraryUserEvent.distTypesPointerMod.PointerMoveAction
  */
  trait PointerAction
    extends StObject
       with _PointerActionInput
  object PointerAction {
    
    inline def PointerMoveAction(): typings.testingLibraryUserEvent.distTypesPointerMod.PointerMoveAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.testingLibraryUserEvent.distTypesPointerMod.PointerMoveAction]
    }
    
    inline def PointerPressAction(keyDef: pointerKey, releasePrevious: Boolean, releaseSelf: Boolean): typings.testingLibraryUserEvent.distTypesPointerMod.PointerPressAction = {
      val __obj = js.Dynamic.literal(keyDef = keyDef.asInstanceOf[js.Any], releasePrevious = releasePrevious.asInstanceOf[js.Any], releaseSelf = releaseSelf.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.testingLibraryUserEvent.distTypesPointerMod.PointerPressAction]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.testingLibraryUserEvent.anon.keysstringPointerActionPo
    - typings.testingLibraryUserEvent.distTypesPointerMod.PointerAction
  */
  type PointerActionInput = _PointerActionInput | String
  
  trait PointerActionPosition extends StObject {
    
    var coords: js.UndefOr[PointerCoords] = js.undefined
    
    var node: js.UndefOr[Node] = js.undefined
    
    /**
      * If `node` is set, this is the DOM offset.
      * Otherwise this is the `textContent`/`value` offset on the `target`.
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
  }
  object PointerActionPosition {
    
    inline def apply(): PointerActionPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointerActionPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointerActionPosition] (val x: Self) extends AnyVal {
      
      inline def setCoords(value: PointerCoords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type PointerInput = PointerActionInput | js.Array[PointerActionInput]
  
  trait PointerMoveAction
    extends StObject
       with PointerActionPosition
       with PointerAction {
    
    var pointerName: js.UndefOr[String] = js.undefined
  }
  object PointerMoveAction {
    
    inline def apply(): PointerMoveAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointerMoveAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointerMoveAction] (val x: Self) extends AnyVal {
      
      inline def setPointerName(value: String): Self = StObject.set(x, "pointerName", value.asInstanceOf[js.Any])
      
      inline def setPointerNameUndefined: Self = StObject.set(x, "pointerName", js.undefined)
    }
  }
  
  trait PointerPressAction
    extends StObject
       with PointerActionPosition
       with PointerAction {
    
    var keyDef: pointerKey
    
    var releasePrevious: Boolean
    
    var releaseSelf: Boolean
  }
  object PointerPressAction {
    
    inline def apply(keyDef: pointerKey, releasePrevious: Boolean, releaseSelf: Boolean): PointerPressAction = {
      val __obj = js.Dynamic.literal(keyDef = keyDef.asInstanceOf[js.Any], releasePrevious = releasePrevious.asInstanceOf[js.Any], releaseSelf = releaseSelf.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerPressAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointerPressAction] (val x: Self) extends AnyVal {
      
      inline def setKeyDef(value: pointerKey): Self = StObject.set(x, "keyDef", value.asInstanceOf[js.Any])
      
      inline def setReleasePrevious(value: Boolean): Self = StObject.set(x, "releasePrevious", value.asInstanceOf[js.Any])
      
      inline def setReleaseSelf(value: Boolean): Self = StObject.set(x, "releaseSelf", value.asInstanceOf[js.Any])
    }
  }
  
  trait _PointerActionInput extends StObject
  object _PointerActionInput {
    
    inline def PointerMoveAction(): typings.testingLibraryUserEvent.distTypesPointerMod.PointerMoveAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.testingLibraryUserEvent.distTypesPointerMod.PointerMoveAction]
    }
    
    inline def PointerPressAction(keyDef: pointerKey, releasePrevious: Boolean, releaseSelf: Boolean): typings.testingLibraryUserEvent.distTypesPointerMod.PointerPressAction = {
      val __obj = js.Dynamic.literal(keyDef = keyDef.asInstanceOf[js.Any], releasePrevious = releasePrevious.asInstanceOf[js.Any], releaseSelf = releaseSelf.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.testingLibraryUserEvent.distTypesPointerMod.PointerPressAction]
    }
    
    inline def keysstringPointerActionPo(keys: String): typings.testingLibraryUserEvent.anon.keysstringPointerActionPo = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.testingLibraryUserEvent.anon.keysstringPointerActionPo]
    }
  }
}
