package typings.wordpressCustomizeBrowser.previewerMod

import typings.jquery.JQuery
import typings.jquery.JQuery.Deferred
import typings.jquery.JQuery.Promise
import typings.std.HTMLElement
import typings.wordpressCustomizeBrowser.messengerMod.Messenger
import typings.wordpressCustomizeBrowser.valueMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/Previewer", "Previewer")
@js.native
class Previewer[T] () extends Messenger[T] {
  
  def abort(): Unit = js.native
  
  var allowedUrls: js.Array[String] = js.native
  
  def cheatin(): Unit = js.native
  
  var container: JQuery[HTMLElement] = js.native
  
  var deferred: PreviewerDeferred = js.native
  
  def initialize(params: PreviewerParams): Unit = js.native
  def initialize(params: PreviewerParams, options: js.Object): Unit = js.native
  
  def keepPreviewAlive(): Unit = js.native
  
  def login(): Promise[_, _, _] = js.native
  
  var previewUrl: Value[String] = js.native
  
  def query(): Unit = js.native
  
  def ready(data: PreviewerData): Unit = js.native
  
  def refresh(): Unit = js.native
  
  var refreshBuffer: Null | Double = js.native
  
  def refreshNonces(): Deferred[_, _, _] = js.native
}
