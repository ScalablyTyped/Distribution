package typings.xmlbuilder.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlbuilder", "begin")
@js.native
object begin extends js.Object {
  /**
    * Creates a new XML document and returns the document node.
    * This function creates an empty document without the XML prolog or
    * a root element.
    * 
    * @param options - create options
    */
  def apply(): XMLDocument = js.native
  def apply(options: BeginOptions): XMLDocument = js.native
  def apply(options: BeginOptions, onData: OnDataCallback): XMLDocumentCB = js.native
  def apply(options: BeginOptions, onData: OnDataCallback, onEnd: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: BeginOptions, onData: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: BeginOptions, onData: OnEndCallback, onEnd: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: OnDataCallback): XMLDocumentCB = js.native
  def apply(options: OnDataCallback, onData: OnDataCallback): XMLDocumentCB = js.native
  def apply(options: OnDataCallback, onData: OnDataCallback, onEnd: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: OnDataCallback, onData: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: OnDataCallback, onData: OnEndCallback, onEnd: OnEndCallback): XMLDocumentCB = js.native
}

