package typings.winrtUwp.Windows.UI.StartScreen

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a method to delay the display of the Pin to Start flyout, as well as methods through which you can set the visual elements of the secondary tile to be presented in that flyout as well as alternate versions of the tile that can also be presented as options. */
@js.native
trait VisualElementsRequest extends js.Object {
  /** Gets a set of objects that provide alternate logo images, background and foreground colors, and display name. These alternates are shown to the user in the Pin to Start flyout. */
  var alternateVisualElements: IVectorView[SecondaryTileVisualElements] = js.native
  /** Gets the approximate time at which the deferral will time-out. */
  var deadline: Date = js.native
  /** Gets a copy of the parent secondary tile's SecondaryTileVisualElements object. The visual elements properties can be set or read through this object. When deferral is complete (or the handler returns without a deferral), the properties in this object are verified and then reflected in the Pin to Start flyout. */
  var visualElements: SecondaryTileVisualElements = js.native
  /**
    * Retrieves a deferral object, which allows the app time to provide information and assets used in the Pin to Start flyout.
    * @return The deferral object.
    */
  def getDeferral(): VisualElementsRequestDeferral = js.native
}

object VisualElementsRequest {
  @scala.inline
  def apply(
    alternateVisualElements: IVectorView[SecondaryTileVisualElements],
    deadline: Date,
    getDeferral: () => VisualElementsRequestDeferral,
    visualElements: SecondaryTileVisualElements
  ): VisualElementsRequest = {
    val __obj = js.Dynamic.literal(alternateVisualElements = alternateVisualElements.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), visualElements = visualElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualElementsRequest]
  }
  @scala.inline
  implicit class VisualElementsRequestOps[Self <: VisualElementsRequest] (val x: Self) extends AnyVal {
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
    def setAlternateVisualElements(value: IVectorView[SecondaryTileVisualElements]): Self = this.set("alternateVisualElements", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeadline(value: Date): Self = this.set("deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeferral(value: () => VisualElementsRequestDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setVisualElements(value: SecondaryTileVisualElements): Self = this.set("visualElements", value.asInstanceOf[js.Any])
  }
  
}

