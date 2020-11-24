package typings.wordpressBlockEditor.mediaUploadMod.MediaUpload

import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.anon.Dictk
import typings.wordpressBlockEditor.anon.Open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<@wordpress/block-editor.@wordpress/block-editor/components/media-placeholder.default.Props<T>, 'addToGallery' | 'allowedTypes' | 'multiple' | 'onSelect' | 'value'> */
@js.native
trait Props[T /* <: Boolean */] extends js.Object {
  
  var addToGallery: js.UndefOr[Boolean] = js.native
  
  var allowedTypes: js.UndefOr[js.Array[String]] = js.native
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * If `true`, the component will initiate all the states required to represent a gallery. By
    * default, the media modal opens in the gallery edit frame, but that can be changed using
    * the `addToGallery`flag.
    */
  var gallery: js.UndefOr[Boolean] = js.native
  
  /**
    * CSS class added to the media modal frame.
    */
  var modalClass: js.UndefOr[String] = js.native
  
  var multiple: js.UndefOr[T] = js.native
  
  var onSelect: js.Function1[/* value */ Dictk | js.Array[Dictk], Unit] = js.native
  
  /**
    * A callback invoked to render the Button opening the media library.
    */
  def render(props: Open): Element = js.native
  
  /**
    * Title displayed in the media modal.
    * @defaultValue "Select or Upload Media"
    */
  var title: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double | js.Array[Double]] = js.native
}
object Props {
  
  @scala.inline
  def apply[T /* <: Boolean */](onSelect: /* value */ Dictk | js.Array[Dictk] => Unit, render: Open => Element): Props[T] = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[Props[T]]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props[_], T /* <: Boolean */] (val x: Self with Props[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnSelect(value: /* value */ Dictk | js.Array[Dictk] => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRender(value: Open => Element): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddToGallery(value: Boolean): Self = this.set("addToGallery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddToGallery: Self = this.set("addToGallery", js.undefined)
    
    @scala.inline
    def setAllowedTypesVarargs(value: String*): Self = this.set("allowedTypes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedTypes(value: js.Array[String]): Self = this.set("allowedTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedTypes: Self = this.set("allowedTypes", js.undefined)
    
    @scala.inline
    def setGallery(value: Boolean): Self = this.set("gallery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGallery: Self = this.set("gallery", js.undefined)
    
    @scala.inline
    def setModalClass(value: String): Self = this.set("modalClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalClass: Self = this.set("modalClass", js.undefined)
    
    @scala.inline
    def setMultiple(value: T): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Double | js.Array[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
