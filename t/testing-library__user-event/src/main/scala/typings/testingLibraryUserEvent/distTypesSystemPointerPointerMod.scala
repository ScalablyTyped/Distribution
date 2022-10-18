package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.anon.Enter
import typings.testingLibraryUserEvent.distTypesSetupSetupMod.Instance
import typings.testingLibraryUserEvent.distTypesSystemPointerSharedMod.PointerPosition
import typings.testingLibraryUserEvent.distTypesSystemPointerSharedMod.pointerKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemPointerPointerMod {
  
  @JSImport("@testing-library/user-event/dist/types/system/pointer/pointer", "Pointer")
  @js.native
  open class Pointer protected () extends StObject {
    def this(hasPointerIdPointerTypeIsPrimary: PointerInit) = this()
    
    def down(instance: Instance, _keyDef: pointerKey): Unit = js.native
    
    /* private */ var getEventInit: Any = js.native
    
    /* private */ var getTarget: Any = js.native
    
    def init(instance: Instance, position: PointerPosition): this.type = js.native
    
    var isCancelled: Boolean = js.native
    
    var isDown: Boolean = js.native
    
    var isMultitouch: Boolean = js.native
    
    var isPrevented: Boolean = js.native
    
    val isPrimary: Boolean = js.native
    
    def move(instance: Instance, position: PointerPosition): js.UndefOr[Enter] = js.native
    
    val pointerId: Double = js.native
    
    val pointerType: String = js.native
    
    var position: PointerPosition = js.native
    
    def release(instance: Instance): Unit = js.native
    
    def up(instance: Instance, _keyDef: pointerKey): Unit = js.native
  }
  
  trait PointerInit extends StObject {
    
    var isPrimary: Boolean
    
    var pointerId: Double
    
    var pointerType: String
  }
  object PointerInit {
    
    inline def apply(isPrimary: Boolean, pointerId: Double, pointerType: String): PointerInit = {
      val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerInit]
    }
    
    extension [Self <: PointerInit](x: Self) {
      
      inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
      
      inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
      
      inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    }
  }
}
