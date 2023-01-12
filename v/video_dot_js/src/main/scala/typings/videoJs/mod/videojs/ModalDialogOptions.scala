package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for this class
  *
  * @param [content=undefined]
  *        Provide customized content for this modal.
  *
  * @param [description]
  *        A text description for the modal, primarily for accessibility.
  *
  * @param [fillAlways=false]
  *        Normally, modals are automatically filled only the first time
  *        they open. This tells the modal to refresh its content
  *        every time it opens.
  *
  * @param [label]
  *        A text label for the modal, primarily for accessibility.
  *
  * @param [temporary=true]
  *        If `true`, the modal can only be opened once; it will be
  *        disposed as soon as it's closed.
  *
  * @param [uncloseable=false]
  *        If `true`, the user will not be able to close the modal
  *        through the UI in the normal ways. Programmatic closing is
  *        still possible.
  */
trait ModalDialogOptions
  extends StObject
     with ComponentOptions {
  
  var content: js.UndefOr[Any] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var fillAlways: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var temporary: js.UndefOr[Boolean] = js.undefined
  
  var uncloseable: js.UndefOr[Boolean] = js.undefined
}
object ModalDialogOptions {
  
  inline def apply(): ModalDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModalDialogOptions] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFillAlways(value: Boolean): Self = StObject.set(x, "fillAlways", value.asInstanceOf[js.Any])
    
    inline def setFillAlwaysUndefined: Self = StObject.set(x, "fillAlways", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
    
    inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    
    inline def setUncloseable(value: Boolean): Self = StObject.set(x, "uncloseable", value.asInstanceOf[js.Any])
    
    inline def setUncloseableUndefined: Self = StObject.set(x, "uncloseable", js.undefined)
  }
}
