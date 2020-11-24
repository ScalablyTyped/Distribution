package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.View
import typings.titanium.titaniumStrings.peek
import typings.titanium.titaniumStrings.pop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PreviewContext provides options to configure the iOS 9 3D-Touch "Peek and Pop" feature.
  */
@js.native
trait PreviewContext extends Proxy {
  
  /**
    * The preview actions and preview action groups.
    */
  var actions: js.Array[PreviewAction] = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_peek(
    name: peek,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ PreviewContextPeekEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pop(
    name: pop,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ PreviewContextPopEvent, Unit]
  ): Unit = js.native
  
  /**
    * The height of the preview.
    */
  var contentHeight: Double = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_peek(name: peek): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_peek(name: peek, event: PreviewContextPeekEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pop(name: pop): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pop(name: pop, event: PreviewContextPopEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.PreviewContext.actions> property.
    * @deprecated Access <Titanium.UI.iOS.PreviewContext.actions> instead.
    */
  def getActions(): js.Array[PreviewAction] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.PreviewContext.contentHeight> property.
    * @deprecated Access <Titanium.UI.iOS.PreviewContext.contentHeight> instead.
    */
  def getContentHeight(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.PreviewContext.preview> property.
    * @deprecated Access <Titanium.UI.iOS.PreviewContext.preview> instead.
    */
  def getPreview(): View = js.native
  
  /**
    * The preview view.
    */
  var preview: View = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_peek(
    name: peek,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ PreviewContextPeekEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pop(
    name: pop,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ PreviewContextPopEvent, Unit]
  ): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.PreviewContext.actions> property.
    * @deprecated Set the value using <Titanium.UI.iOS.PreviewContext.actions> instead.
    */
  def setActions(actions: js.Array[PreviewAction]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.PreviewContext.contentHeight> property.
    * @deprecated Set the value using <Titanium.UI.iOS.PreviewContext.contentHeight> instead.
    */
  def setContentHeight(contentHeight: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.PreviewContext.preview> property.
    * @deprecated Set the value using <Titanium.UI.iOS.PreviewContext.preview> instead.
    */
  def setPreview(preview: View): Unit = js.native
}
