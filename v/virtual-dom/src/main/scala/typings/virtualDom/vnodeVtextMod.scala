package typings.virtualDom

import org.scalablytyped.runtime.Shortcut
import typings.virtualDom.VirtualDOM.VText
import typings.virtualDom.VirtualDOM.VTextConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vnodeVtextMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("virtual-dom/vnode/vtext", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with VText {
    def this(text: String) = this()
    
    /* CompleteClass */
    var text: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var version: String = js.native
  }
  @JSImport("virtual-dom/vnode/vtext", JSImport.Namespace)
  @js.native
  val ^ : VTextConstructor = js.native
  
  type _To = VTextConstructor
  
  /* This means you don't have to write `^`, but can instead just say `vnodeVtextMod.foo` */
  override def _to: VTextConstructor = ^
}
