package typings.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlbuilder", "begin")
@js.native
object begin extends js.Object {
  /**
    * Creates a new XML document in callback mode and returns the document
    * node.
    * 
    * @param options - create options
    * @param onData - the function to be called when a new chunk of XML is
    * output. The string containing the XML chunk is passed to `onData` as
    * its first argument and the current depth of the tree is passed as its
    * second argument.
    * @param onEnd - the function to be called when the XML document is 
    * completed with `end`. `onEnd` does not receive any arguments.
    */
  def apply(): XMLDocumentCB = js.native
  def apply(options: js.UndefOr[scala.Nothing], onData: js.UndefOr[scala.Nothing], onEnd: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: js.UndefOr[scala.Nothing], onData: OnDataCallback): XMLDocumentCB = js.native
  def apply(options: js.UndefOr[scala.Nothing], onData: OnDataCallback, onEnd: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: js.UndefOr[scala.Nothing], onData: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: js.UndefOr[scala.Nothing], onData: OnEndCallback, onEnd: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: BeginOptions): XMLDocumentCB = js.native
  def apply(options: BeginOptions, onData: js.UndefOr[scala.Nothing], onEnd: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: BeginOptions, onData: OnDataCallback): XMLDocumentCB = js.native
  def apply(options: BeginOptions, onData: OnDataCallback, onEnd: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: BeginOptions, onData: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: BeginOptions, onData: OnEndCallback, onEnd: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: OnDataCallback): XMLDocumentCB = js.native
  def apply(options: OnDataCallback, onData: js.UndefOr[scala.Nothing], onEnd: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: OnDataCallback, onData: OnDataCallback): XMLDocumentCB = js.native
  def apply(options: OnDataCallback, onData: OnDataCallback, onEnd: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: OnDataCallback, onData: OnEndCallback): XMLDocumentCB = js.native
  def apply(options: OnDataCallback, onData: OnEndCallback, onEnd: OnEndCallback): XMLDocumentCB = js.native
}

