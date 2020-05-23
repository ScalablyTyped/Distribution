package typings.wordpressBlockEditor.mediaUploadMod.MediaUpload

import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.anon.Dictk
import typings.wordpressBlockEditor.anon.Open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@wordpress/block-editor.@wordpress/block-editor/components/media-placeholder.default.Props<T>, 'addToGallery' | 'allowedTypes' | 'multiple' | 'onSelect' | 'value'> */
trait Props[T /* <: Boolean */] extends js.Object {
  var addToGallery: js.UndefOr[Boolean] = js.undefined
  var allowedTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If `true`, the component will initiate all the states required to represent a gallery. By
    * default, the media modal opens in the gallery edit frame, but that can be changed using
    * the `addToGallery`flag.
    */
  var gallery: js.UndefOr[Boolean] = js.undefined
  /**
    * CSS class added to the media modal frame.
    */
  var modalClass: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[T] = js.undefined
  var onSelect: js.Function1[/* value */ Dictk | js.Array[Dictk], Unit]
  /**
    * Title displayed in the media modal.
    * @defaultValue "Select or Upload Media"
    */
  var title: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * A callback invoked to render the Button opening the media library.
    */
  def render(props: Open): Element
}

object Props {
  @scala.inline
  def apply[T](
    onSelect: /* value */ Dictk | js.Array[Dictk] => Unit,
    render: Open => Element,
    addToGallery: js.UndefOr[Boolean] = js.undefined,
    allowedTypes: js.Array[String] = null,
    gallery: js.UndefOr[Boolean] = js.undefined,
    modalClass: String = null,
    multiple: T = null,
    title: String = null,
    value: Double | js.Array[Double] = null
  ): Props[T] = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect), render = js.Any.fromFunction1(render))
    if (!js.isUndefined(addToGallery)) __obj.updateDynamic("addToGallery")(addToGallery.get.asInstanceOf[js.Any])
    if (allowedTypes != null) __obj.updateDynamic("allowedTypes")(allowedTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(gallery)) __obj.updateDynamic("gallery")(gallery.get.asInstanceOf[js.Any])
    if (modalClass != null) __obj.updateDynamic("modalClass")(modalClass.asInstanceOf[js.Any])
    if (multiple != null) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

