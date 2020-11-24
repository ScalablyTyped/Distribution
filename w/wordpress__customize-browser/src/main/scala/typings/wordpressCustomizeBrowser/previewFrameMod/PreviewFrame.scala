package typings.wordpressCustomizeBrowser.previewFrameMod

import typings.jquery.JQuery.Deferred
import typings.wordpressCustomizeBrowser.messengerMod.Messenger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/PreviewFrame", "PreviewFrame")
@js.native
class PreviewFrame[T] () extends Messenger[T] {
  
  def initialize(params: PreviewFrameParams): Unit = js.native
  def initialize(params: PreviewFrameParams, options: js.Object): Unit = js.native
  
  def login(deferred: Deferred[_, _, _]): Unit = js.native
  
  def run(deferred: Deferred[_, _, _]): Unit = js.native
  
  var sensitivity: Double | Null = js.native
}
/* static members */
@JSImport("@wordpress/customize-browser/PreviewFrame", "PreviewFrame")
@js.native
object PreviewFrame extends js.Object {
  
  def uuid(): String = js.native
}
